package sechalmersmdsdgroup5.hotel.search.impl

import sechalmersmdsdgroup5.hotel.search.SearchCriteria
import spock.lang.Specification

class OrSearchCriteriaImplTest extends Specification {
    def "apply"() {
        given:
        def sr = new SR( new A(), 1.0 )
        def cl = { it.withRelevance( 0.5 ) }
        def cr = { it.withRelevance( 2.0 ) }
        def c2 = { it.withRelevance( 3.0 ) }
        expect: "at least most of (cl, cr) applied"
        or( sr, cl, cr ) >= 2
        and: "commutative property"
        or( sr, cr, cl ) <= 2
        and: "when both are equal and higher (same), that relevance is chosen"
        or( sr, cr, cr ) == 2
        and: "most is still chosen when both are higher but not equal"
        or( sr, c2, cr ) == 3
        or( sr, cr, c2 ) == 3
    }

    def or( SR<A> sr, SearchCriteria<A> l, SearchCriteria<A> r ) {
        new OrSearchCriteriaImpl<A>( l, r ).apply( sr ).getRelevance()
    }

    def "constructor( x, null ), getLeft() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new OrSearchCriteriaImpl( x, null )
        expect:
        c.getLeft() == x
    }

    def "setLeft(x), getLeft() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new OrSearchCriteriaImpl( null, null )
        when:
        c.setLeft( x )
        then:
        c.getLeft() == x
    }

    def "constructor( null, x ), getRight() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new OrSearchCriteriaImpl( null, x )
        expect:
        c.getRight() == x
    }

    def "setRight(x), getRight() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new OrSearchCriteriaImpl( null, null )
        when:
        c.setRight( x )
        then:
        c.getRight() == x
    }
}