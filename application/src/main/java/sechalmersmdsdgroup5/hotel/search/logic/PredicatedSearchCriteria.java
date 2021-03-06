package sechalmersmdsdgroup5.hotel.search.logic;

import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

import java.util.function.Predicate;

public class PredicatedSearchCriteria<SRT> implements SearchCriteria<SRT> {
	private final Predicate<SRT> predicate;

	public PredicatedSearchCriteria( Predicate<SRT> predicate ) {
		this.predicate = predicate;
	}

	public SearchResult<SRT> apply( SearchResult<SRT> sr ) {
		return sr.withRelevance( sr.getRelevance() * (predicate.test( sr.getResult( ) ) ? 2 : 0.5 ) );
	}
}