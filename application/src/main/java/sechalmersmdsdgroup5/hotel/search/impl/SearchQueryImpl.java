/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated NOT
 */
public class SearchQueryImpl<SRT> implements SearchQuery<SRT> {
	private final List<SearchCriteria<SRT>> criterion;

	public SearchQueryImpl( List<SearchCriteria<SRT>> criterion ) {
		this.criterion = criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * this constructor won't work...
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SearchQueryImpl() { this( null ); }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<SearchCriteria<SRT>> getCriterias() {
		return criterion;
	}
} //SearchQueryImpl
