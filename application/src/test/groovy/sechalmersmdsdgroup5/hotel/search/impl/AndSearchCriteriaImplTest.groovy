package sechalmersmdsdgroup5.hotel.search.impl

import sechalmersmdsdgroup5.hotel.search.SearchCriteria
import spock.lang.Specification

class AndSearchCriteriaImplTest extends Specification {
    def "apply"() {
        given:
        def sr = new SR( new A(), 1.0 )
        def cl = { it.withRelevance( 0.5 ) }
        def cr = { it.withRelevance( 2.0 ) }
        def c2 = { it.withRelevance( 3.0 ) }
        expect: "not more than least of (cl, cr) applied"
        and( sr, cl, cr ) <= 0.5
        and: "commutative property"
        and( sr, cr, cl ) <= 0.5
        and: "when both are equal and higher (same), that relevance is chosen"
        and( sr, cr, cr ) == 2
        and: "least is still chosen when both are higher but not equal"
        and( sr, c2, cr ) == 2
        and( sr, cr, c2 ) == 2
    }

    def and( SR<A> sr, SearchCriteria<A> l, SearchCriteria<A> r ) {
        new AndSearchCriteriaImpl<A>( l, r ).apply( sr ).getRelevance()
    }

    def "constructor( x, null ), getLeft() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new AndSearchCriteriaImpl( x, null )
        expect:
        c.getLeft() == x
    }

    def "setLeft(x), getLeft() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new AndSearchCriteriaImpl( null, null )
        when:
        c.setLeft( x )
        then:
        c.getLeft() == x
    }

    def "constructor( null, x ), getRight() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new AndSearchCriteriaImpl( null, x )
        expect:
        c.getRight() == x
    }

    def "setRight(x), getRight() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new AndSearchCriteriaImpl( null, null )
        when:
        c.setRight( x )
        then:
        c.getRight() == x
    }
}