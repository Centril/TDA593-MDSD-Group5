/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import sechalmersmdsdgroup5.hotel.search.NotSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.NotSearchCriteriaImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class NotSearchCriteriaImpl<SRT> implements NotSearchCriteria<SRT> {
	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected SearchCriteria<SRT> criteria;

	public NotSearchCriteriaImpl( SearchCriteria<SRT> criteria ) {
		this.criteria = criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotSearchCriteriaImpl() {}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchCriteria<SRT> getCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(SearchCriteria<SRT> newCriteria) {
		criteria = newCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SearchResult<? extends SRT> apply(SearchResult<? extends SRT> result) {
		return result.withRelevance( 2 * result.getRelevance() -
									 criteria.apply( result ).getRelevance() );
	}
} //NotSearchCriteriaImpl
