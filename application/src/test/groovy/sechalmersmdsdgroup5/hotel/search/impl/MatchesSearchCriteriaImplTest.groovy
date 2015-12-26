package sechalmersmdsdgroup5.hotel.search.impl

import spock.lang.Specification

import java.util.function.BiPredicate
import java.util.function.Function

class MatchesSearchCriteriaImplTest extends Specification {
    def "apply"() {
        given:
        def  eq = { a, b -> a == b }
        def neq = { a, b -> a != b }
        def geq = { a, b -> b >= a }
        def map = { it + 1 }
        def sr1 = new SR<Integer>( 1, 1.0 )
        def sr2 = new SR<Integer>( 2, 1.0 )

        expect:
        matches( sr1, 2, map, eq ) > sr1.relevance
        matches( sr1, 1, map, eq ) < sr1.relevance
        matches( sr1, 1, map, neq ) > sr1.relevance
        matches( sr1, 2, map, neq ) < sr1.relevance

        matches( sr2, 3, map, eq ) > sr2.relevance
        matches( sr2, 2, map, eq ) < sr2.relevance
        matches( sr2, 2, map, neq ) > sr2.relevance
        matches( sr2, 3, map, neq ) < sr2.relevance

        matches( sr1, 1, map, geq ) > sr1.relevance
        matches( sr2, 1, map, geq ) > sr2.relevance
        matches( sr1, 3, map, geq ) < sr1.relevance
        matches( sr2, 3, map, geq ) > sr1.relevance

        matches( sr2, 10, { it + 8 }, eq ) > sr2.relevance
    }

    def matches( sr, input, transform, predicate ) {
        new MatchesSearchCriteriaImpl( input, transform, predicate ).apply( sr ).getRelevance()
    }

    def "constructor( x, null, null ), getInput() == x"() {
        given:
        def x = new A()
        def c = new MatchesSearchCriteriaImpl( x, null, null )
        expect:
        c.getInput() == x
    }

    def "setInput(x), getInput() == x"() {
        given:
        def x = new A()
        def c = new MatchesSearchCriteriaImpl( null, null, null )
        when:
        c.setInput( x )
        then:
        c.getInput() == x
    }

    def "constructor( null, x, null ), getTransform() == x"() {
        given:
        def x = Mock( Function )
        def c = new MatchesSearchCriteriaImpl( null, x, null )
        expect:
        c.getTransform() == x
    }

    def "setTransform(x), getTransform() == x"() {
        given:
        def x = Mock( Function )
        def c = new MatchesSearchCriteriaImpl( null, null, null )
        when:
        c.setTransform( x )
        then:
        c.getTransform() == x
    }

    def "constructor( null, null, x ), getPredicate() == x"() {
        given:
        def x = Mock( BiPredicate )
        def c = new MatchesSearchCriteriaImpl( null, null, x )
        expect:
        c.getPredicate() == x
    }

    def "setPredicate(x), getPredicate() == x"() {
        given:
        def x = Mock( BiPredicate )
        def c = new MatchesSearchCriteriaImpl( null, null, null )
        when:
        c.setPredicate( x )
        then:
        c.getPredicate() == x
    }
}