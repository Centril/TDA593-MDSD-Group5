package sechalmersmdsdgroup5.hotel.search.logic;

import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class SearchQueryBuilder<SRT> {
	List<SearchCriteria<SRT>> done;
	SearchCriteria<SRT> criteria;

	BranchMode mode;
	SearchQueryBuilder<SRT> owner;

	private enum BranchMode {
		NORMAL, AND, OR
	}

	private SearchQueryBuilder( BranchMode mode, SearchQueryBuilder<SRT> owner ) {
		this.mode = mode;
		this.owner = owner;
	}

	public static <SRT> SearchQueryBuilder<SRT> builder() {
		return new SearchQueryBuilder<>( BranchMode.NORMAL, null );
	}

	public SearchQuery<SRT> query() {
		switch ( mode ) {
			case NORMAL:
				if ( criteria != null ) {
					done.add( criteria );
				}
				return SearchCriteriaFactory.query( done );

			default:
				return end().query();
		}
	}

	public SearchQueryBuilder<SRT> wrap( SearchCriteria<SRT> wrap ) {
		switch ( mode ) {
			case NORMAL:
				if ( criteria != null ) {
					done.add( criteria );
					criteria = wrap;
				}
				break;

			case AND:
				if ( criteria != null ) {
					return and( wrap );
				} else {
					this.criteria = wrap;
				}
				break;

			case OR:
				if ( criteria != null ) {
					return or( wrap );
				} else {
					this.criteria = wrap;
				}
				break;
		}
		return this;
	}

	public <IN> SearchQueryBuilder<SRT> matches( IN input, Function<SRT, IN> transform, BiPredicate<IN, IN> pred ) {
		return wrap( SearchCriteriaFactory.matches( input, transform, pred ) );
	}

	public <IN> SearchQueryBuilder<SRT> eq( IN input, Function<SRT, IN> transform ) {
		return wrap( SearchCriteriaFactory.eq( input, transform ) );
	}

	public SearchQueryBuilder<SRT> and( SearchCriteria<SRT> r ) {
		criteria = SearchCriteriaFactory.and( criteria, r );
		return this;
	}

	public SearchQueryBuilder<SRT> or( SearchCriteria<SRT> r ) {
		criteria = SearchCriteriaFactory.or( criteria, r );
		return this;
	}

	public <IN> SearchQueryBuilder<SRT> and( IN input, Function<SRT, IN> transform, BiPredicate<IN, IN> pred ) {
		return and( SearchCriteriaFactory.matches( input, transform, pred ) );
	}

	public <IN> SearchQueryBuilder<SRT> and( IN input, Function<SRT, IN> transform ) {
		return and( SearchCriteriaFactory.eq( input, transform ) );
	}

	public <IN> SearchQueryBuilder<SRT> or( IN input, Function<SRT, IN> transform, BiPredicate<IN, IN> pred ) {
		return or( SearchCriteriaFactory.matches( input, transform, pred ) );
	}

	public <IN> SearchQueryBuilder<SRT> or( IN input, Function<SRT, IN> transform ) {
		return or( SearchCriteriaFactory.eq( input, transform ) );
	}

	public SearchQueryBuilder<SRT> and() {
		return new SearchQueryBuilder<>( BranchMode.AND, this );
	}

	public SearchQueryBuilder<SRT> or() {
		return new SearchQueryBuilder<>( BranchMode.OR, this );
	}

	public SearchQueryBuilder<SRT> end() {
		switch ( mode ) {
			case NORMAL:
				return owner;

			case AND:
				return criteria == null ? owner : owner.and( criteria );

			case OR:
				return criteria == null ? owner : owner.or( criteria );
		}

		return this;
	}
}