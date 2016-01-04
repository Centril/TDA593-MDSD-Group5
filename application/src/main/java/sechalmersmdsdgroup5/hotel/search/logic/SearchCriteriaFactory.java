package sechalmersmdsdgroup5.hotel.search.logic;

import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;
import sechalmersmdsdgroup5.hotel.search.impl.*;
import sechalmersmdsdgroup5.hotel.utils.Functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class SearchCriteriaFactory {
	@SafeVarargs
	public static <SRT> SearchQuery<SRT> query( SearchCriteria<SRT>... criterion ) {
		return query( Arrays.asList( criterion ) );
	}

	public static <SRT> SearchQuery<SRT> query( List<SearchCriteria<SRT>> criterion ) {
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

	public static <SRT> SearchCriteria<SRT> matches( Predicate<SRT> predicate ) {
		return new PredicatedSearchCriteria<>( predicate );
	}

	public static <SRT, IN> SearchCriteria<SRT> eq( IN input, Function<SRT, IN> transform ) {
		return new IsSearchCriteria<>( input, transform );
	}

	public static <SRT, IN> SearchCriteria<SRT> within( IN left, IN right,
	                                                    Function<SRT, IN> transform, Comparator<IN> cmp ) {
		return and( matches( left,  transform, (l, r) -> cmp.compare( l, r ) <= 0 ),
					matches( right, transform, (l, r) -> cmp.compare( l, r ) >= 0 ) );
	}

	public static <SRT, IN> SearchCriteria<SRT> between( IN left, IN right,
	                                                     Function<SRT, IN> transform, Comparator<IN> cmp ) {
		return and( matches( left,  transform, (l, r) -> cmp.compare( l, r ) < 0 ),
					matches( right, transform, (l, r) -> cmp.compare( l, r ) > 0 ) );
	}
}