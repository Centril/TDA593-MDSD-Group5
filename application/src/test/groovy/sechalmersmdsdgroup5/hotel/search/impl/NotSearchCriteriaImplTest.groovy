package sechalmersmdsdgroup5.hotel.search.impl

import sechalmersmdsdgroup5.hotel.search.SearchCriteria
import spock.lang.Specification

class NotSearchCriteriaImplTest extends Specification {
    def "apply"() {
        given:
        def sr = new SR( new A(), 1.0 )
        def c1 = { it.withRelevance( 0.5 ) }
        def c2 = { it.withRelevance( 2.0 ) }
        def c3 = { it.withRelevance( 1.0 ) }
        expect:
        not( sr, c1 ) > sr.relevance
        not( sr, c2 ) < sr.relevance
        not( sr, c3 ) == sr.relevance
    }

    def not( SR<A> sr, SearchCriteria<A> c ) {
        new NotSearchCriteriaImpl<A>( c ).apply( sr ).getRelevance()
    }

    def "constructor( x, null ), getCriteria() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new NotSearchCriteriaImpl( x )
        expect:
        c.getCriteria() == x
    }

    def "setCriteria(x), getCriteria() == x"() {
        given:
        def x = Mock( SearchCriteria )
        def c = new NotSearchCriteriaImpl( null )
        when:
        c.setCriteria( x )
        then:
        c.getCriteria() == x
    }
}