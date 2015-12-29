package sechalmersmdsdgroup5.hotel.search.logic;

import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

import java.util.function.Predicate;

public class PredicatedSearchCriteria<SRT> implements SearchCriteria<SRT> {
	private final Predicate<SRT> predicate;

	PredicatedSearchCriteria( Predicate<SRT> predicate ) {
		this.predicate = predicate;
	}

	public SearchResult<? extends SRT> apply( SearchResult<? extends SRT> sr ) {
		return sr.withRelevance( sr.getRelevance() * (predicate.test( sr.getResult( ) ) ? 2 : 0.5 ) );
	}
}