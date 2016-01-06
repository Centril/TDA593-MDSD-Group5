package sechalmersmdsdgroup5.hotel.search.logic;

import sechalmersmdsdgroup5.hotel.search.SearchQuery;
import sechalmersmdsdgroup5.hotel.search.SearchResult;
import sechalmersmdsdgroup5.hotel.search.impl.ConcreteSearchResultImpl;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import static sechalmersmdsdgroup5.hotel.utils.Functional.foldl;
import static sechalmersmdsdgroup5.hotel.utils.Functional.listify;

/**
 * Searcher performs searching given queries and initial data.
 *
 * @param <SRT> the type to search on/for.
 */
public class Searcher<SRT> {
	/**
	 * Performs search given initial results with query.
	 *
	 * @param results the results to filter and adjust relevance for.
	 * @param query the queries to search with.
	 * @return the results, with new relevance depending on query,
	 *         and without those below relevance of 1.0
	 */
	public List<SearchResult<SRT>> search(
		List<SearchResult<SRT>> results, SearchQuery<SRT> query ) {
		return results.stream()
			.map( sr -> this.applyCriterias( sr, query ) )
			.filter( sr -> sr.getRelevance() >= 1 )
			.sorted( Comparator.comparingDouble(
				(ToDoubleFunction<SearchResult<SRT>>) SearchResult::getRelevance ).reversed() )
			.collect( Collectors.toList() );
	}

	private SearchResult<SRT> applyCriterias( SearchResult<SRT> sr, SearchQuery<SRT> q ) {
		return foldl( q.getCriterias(), sr, (srn, criteria) -> srn.withRelevance( Math.max(
			// performing a fuzzy OR operation, seeding the right branch with at least 1.0,
			// but letting those that match many get higher relevance.
			srn.getRelevance(),
			criteria.apply( srn.withRelevance( Math.max( srn.getRelevance(), 1 ) ) ).getRelevance()
		) ) );
	}

	/**
	 * Performs search given initial data with query.
	 *
	 * @param data initializes the results with relevance of 0 each unless empty query.
	 * @param query the queries to search with.
	 * @return the results, with new relevance depending on query,
	 *         and without those below relevance of 1.0
	 */
	public List<SearchResult<SRT>> searchInit( List<SRT> data, SearchQuery<SRT> query ) {
		return	query.getCriterias().isEmpty()
				?	listify( this.init( data ).stream().map( sr -> sr.withRelevance( 1 ) ) )
				:	this.search( this.init( data ), query );
	}

	/**
	 * Performs search given initial results with query
	 * and then flattens the results removing relevance.
	 *
	 * @param results the results to filter and adjust relevance for.
	 * @param query the queries to search with.
	 * @return the results, with new relevance depending on query,
	 *         and without those below relevance of 1.0
	 */
	public List<SRT> searchFlatten( List<SearchResult<SRT>> results, SearchQuery<SRT> query ) {
		return this.flatten( this.search( results, query ) );
	}

	/**
	 * Performs search given initial results with query
	 * and then flattens the results removing relevance.
	 *
	 * @param data initializes the results with relevance of 1.0 each.
	 * @param query the queries to search with.
	 * @return the results, with new relevance depending on query,
	 *         and without those below relevance of 1.0
	 */
	public List<SRT> searchInitFlatten( List<SRT> data, SearchQuery<SRT> query ) {
		return this.flatten( this.searchInit( data, query ) );
	}

	private List<SRT> flatten( List<SearchResult<SRT>> results ) {
		return listify( results.stream().map( SearchResult::getResult ) );
	}

	private List<SearchResult<SRT>> init( List<SRT> data ) {
		return listify( data.stream().map( d -> new ConcreteSearchResultImpl<>( d, 0 ) ) );
	}
}