package sechalmersmdsdgroup5.hotel.search.logic;

import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;
import sechalmersmdsdgroup5.hotel.search.impl.*;
import sechalmersmdsdgroup5.hotel.utils.Functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class SearchCriteriaFactory {
	public static <SRT>SearchQuery<SRT> query( List<SearchCriteria<SRT>> criterion ) {
		return new SearchQueryImpl<>( criterion );
	}

	public static <SRT> SearchCriteria<SRT> id() {
		return result -> result;
	}

	@SafeVarargs
	public static <SRT> SearchCriteria<SRT> and( SearchCriteria<SRT> l, SearchCriteria<SRT> r,
	                                             SearchCriteria<SRT>... cs ) {
		return Functional.foldl( Arrays.asList( cs ), new AndSearchCriteriaImpl<>( l, r ), AndSearchCriteriaImpl::new );
	}

	@SafeVarargs
	public static <SRT> SearchCriteria<SRT> or( SearchCriteria<SRT> l, SearchCriteria<SRT> r,
	                                            SearchCriteria<SRT>... cs ) {
		return Functional.foldl( Arrays.asList( cs ), new OrSearchCriteriaImpl<>( l, r ), OrSearchCriteriaImpl::new );
	}

	public static <SRT> SearchCriteria<SRT> not( SearchCriteria<SRT> c ) {
		return new NotSearchCriteriaImpl<>( c );
	}

	public static <SRT, IN> SearchCriteria<SRT> matches( IN input, Function<SRT, IN> transform,
	                                                     BiPredicate<IN, IN> predicate ) {
		return new MatchesSearchCriteriaImpl<>( input, transform, predicate );
	}

	public static <SRT, IN> SearchCriteria<SRT> eq( IN input, Function<SRT, IN> transform ) {
		return new IsSearchCriteria<>( input, transform );
	}
}