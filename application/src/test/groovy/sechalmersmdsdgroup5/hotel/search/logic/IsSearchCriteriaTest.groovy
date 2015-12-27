package sechalmersmdsdgroup5.hotel.search.logic

import sechalmersmdsdgroup5.hotel.search.impl.SR
import spock.lang.Specification

class IsSearchCriteriaTest extends Specification {
    def "apply"() {
        given:
        def map = { it + 7 }
        def sr1 = new SR<Integer>( 1, 1.0 )
        def sr2 = new SR<Integer>( 2, 1.0 )

        expect:
        tc( sr1, 7, map ) < sr1.relevance
        tc( sr1, 8, map ) > sr1.relevance
        tc( sr1, 9, map ) < sr1.relevance

        tc( sr2, 8, map ) < sr2.relevance
        tc( sr2, 9, map ) > sr2.relevance
        tc( sr2, 10, map ) < sr2.relevance
    }

    def tc( sr, input, transform ) {
        new IsSearchCriteria( input, transform ).apply( sr ).getRelevance()
    }
}