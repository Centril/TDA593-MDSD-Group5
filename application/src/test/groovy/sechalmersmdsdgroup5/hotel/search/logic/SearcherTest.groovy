package sechalmersmdsdgroup5.hotel.search.logic

import sechalmersmdsdgroup5.hotel.search.SearchCriteria
import sechalmersmdsdgroup5.hotel.search.impl.*
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

    def "below 1.0 dropped, sorted by relevance, test overlapping"() {
        given:
        def eq = { a, b -> b == a }
        def gt = { a, b -> b > a }
        def lt = { a, b -> b < a }
        def c1 = matches( 7, gt )
        def c2 = matches( 3, lt )
        expect:
        searchIF( [c1] ) == [8, 9, 10]
        searchIF( [c1, c2] ) == [1, 2, 8, 9, 10]
        searchIF( [c1, c2, c1] ) == [8, 9, 10, 1, 2]
        searchIF( [matches( 2, eq ), matches( 5, eq ), matches( 9, eq )] ) == [2, 5, 9]
        searchIF( [matches( 5, gt ), matches( 8, gt ), matches( 9, gt )] ) == [10, 9, 6, 7, 8]
    }

    def searchIF( criterion ) {
        s.searchInitFlatten( (1..10), query( criterion ) )
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