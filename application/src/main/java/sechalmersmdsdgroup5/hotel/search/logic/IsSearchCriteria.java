package sechalmersmdsdgroup5.hotel.search.logic;

import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl;

import java.util.function.Function;

public class IsSearchCriteria<SRT, IN> extends MatchesSearchCriteriaImpl<SRT, IN> implements SearchCriteria<SRT> {
	IsSearchCriteria( IN input, Function<SRT, IN> transform ) {
		super( input, transform, IN::equals );
	}
}
