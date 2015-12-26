package sechalmersmdsdgroup5.hotel.search.logic;

import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;
import sechalmersmdsdgroup5.hotel.search.SearchResult;
import sechalmersmdsdgroup5.hotel.search.impl.ConcreteSearchResultImpl;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	List<SearchResult<? extends SRT>> search( List<SearchResult<? extends SRT>> results, SearchQuery<SRT> query ) {
		Stream<SearchResult<? extends SRT>> stream = results.stream();

		for ( SearchCriteria<SRT> criteria : query.getCriterias() ) {
			stream = stream.map( criteria );
		}

		Comparator<SearchResult<? extends SRT>> cmp = Comparator.comparingDouble(
				(ToDoubleFunction<SearchResult<? extends SRT>>) SearchResult::getRelevance ).reversed();

		return stream.filter( sr -> sr.getRelevance() >= 1 ).sorted( cmp ).collect( Collectors.toList() );
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
	List<? extends SRT> searchFlatten( List<SearchResult<? extends SRT>> results, SearchQuery<SRT> query ) {
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
	List<? extends SRT> searchInitFlatten( List<? extends SRT> data, SearchQuery<SRT> query ) {
		return this.flatten( this.search( this.init( data ), query ) );
	}

	private List<? extends SRT> flatten( List<SearchResult<? extends SRT>> results ) {
		return results.stream().map( SearchResult::getResult ).collect( Collectors.toList() );
	}

	private List<SearchResult<? extends SRT>> init( List<? extends SRT> data ) {
		return data.stream().map( d -> new ConcreteSearchResultImpl<>( d, 1.0 ) )
				   .collect( Collectors.toList() );
	}
}