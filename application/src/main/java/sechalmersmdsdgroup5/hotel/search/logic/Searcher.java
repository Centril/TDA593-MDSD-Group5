package sechalmersmdsdgroup5.hotel.search.logic;

import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;
import sechalmersmdsdgroup5.hotel.search.SearchResult;
import sechalmersmdsdgroup5.hotel.search.impl.ConcreteSearchResultImpl;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

import static sechalmersmdsdgroup5.hotel.utils.Functional.*;

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
	public List<SearchResult<? extends SRT>> search(
		List<SearchResult<? extends SRT>> results, SearchQuery<SRT> query ) {
		return results.stream()
			.map( sr -> this.applyCriterias( sr, query ) )
			.filter( sr -> sr.getRelevance() >= 1 )
			.sorted( Comparator.comparingDouble(
				(ToDoubleFunction<SearchResult<? extends SRT>>) SearchResult::getRelevance ).reversed() )
			.collect( Collectors.toList() );
	}

	private SearchResult<? extends SRT> applyCriterias( SearchResult<? extends SRT> sr, SearchQuery<SRT> q ) {
		return foldl( q.getCriterias(), sr, (SearchResult<? extends SRT> srn, SearchCriteria<SRT> criteria) ->
			srn.withRelevance( Math.max(
				// performing a fuzzy OR operation, seeding the right branch with at least 1.0,
				// but letting those that match many get higher relevance.
				srn.getRelevance(),
				criteria.apply( srn.withRelevance( Math.max( srn.getRelevance(), 1 ) ) ).getRelevance()
		) ) );
	}

	/**
	 * Performs search given initial data with query.
	 *
	 * @param data initializes the results with relevance of 1.0 each.
	 * @param query the queries to search with.
	 * @return the results, with new relevance depending on query,
	 *         and without those below relevance of 1.0
	 */
	public List<SearchResult<? extends SRT>> searchInit( List<? extends SRT> data, SearchQuery<SRT> query ) {
		return this.search( this.init( data ), query );
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
	public List<? extends SRT> searchFlatten( List<SearchResult<? extends SRT>> results, SearchQuery<SRT> query ) {
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
	public List<? extends SRT> searchInitFlatten( List<? extends SRT> data, SearchQuery<SRT> query ) {
		return this.flatten( this.search( this.init( data ), query ) );
	}

	private List<? extends SRT> flatten( List<SearchResult<? extends SRT>> results ) {
		return listify( results.stream().map( SearchResult::getResult ) );
	}

	private List<SearchResult<? extends SRT>> init( List<? extends SRT> data ) {
		return listify2( data.stream().map( d -> new ConcreteSearchResultImpl<>( d, 0 ) ) );
	}
}