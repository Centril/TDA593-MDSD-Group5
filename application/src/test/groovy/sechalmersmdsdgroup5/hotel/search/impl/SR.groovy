package sechalmersmdsdgroup5.hotel.search.impl

import sechalmersmdsdgroup5.hotel.search.SearchResult

/**
 * Test fixture for SearchResult<SRT>
 */
class SR<SRT> implements SearchResult<SRT> {
    SRT result;
    double relevance;

    SR( SRT r, double rel ) {
        result = r;
        relevance = rel;
    }

    SearchResult<? extends SRT> withRelevance( double relevance ) {
        new SR( result, relevance )
    }
}