package sechalmersmdsdgroup5.hotel.search.logic

import sechalmersmdsdgroup5.hotel.search.SearchCriteria
import sechalmersmdsdgroup5.hotel.search.impl.A
import sechalmersmdsdgroup5.hotel.search.impl.AndSearchCriteriaImpl
import sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl
import sechalmersmdsdgroup5.hotel.search.impl.SR
import sechalmersmdsdgroup5.hotel.search.impl.SearchQueryImpl
import spock.lang.Specification

class SearcherTest extends Specification {
    def s = new Searcher()

    def "no criterias => no change"() {
        given:
        def sr1 = new SR( 2, 1 )
        def sr2 = new SR( 7, 1 )
        def q = query( [] )

        expect:
        s.search( [sr1, sr2], q ) == [sr1, sr2]
        s.search( [sr1], q ) == [sr1]
        s.search( [], q ) == []
    }

    def "below 1.0 dropped"() {
        given:
        def c1 = matches( 7, { a, b -> b > a } )
        def c2 = matches( 3, { a, b -> b < a } )
        expect:
        s.searchInitFlatten( (1..10), query( [c1] ) ) == [8, 9, 10]
        s.searchInitFlatten( (1..10), query( [c1, c2] ) ) == [1, 2, 8, 9, 10]
        // todo
    }

    def query( criterion ) {
        new SearchQueryImpl<>( criterion )
    }

    def and( SearchCriteria<A> l, SearchCriteria<A> r ) {
        new AndSearchCriteriaImpl<A>( l, r )
    }

    def matches( input, predicate ) {
        new MatchesSearchCriteriaImpl<>( input, { it }, predicate )
    }
}