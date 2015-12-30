/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import sechalmersmdsdgroup5.hotel.search.OrSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.OrSearchCriteriaImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.OrSearchCriteriaImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class OrSearchCriteriaImpl<SRT> implements OrSearchCriteria<SRT> {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated NOT
	 * @ordered
	 */
	private SearchCriteria<SRT> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated NOT
	 * @ordered
	 */
	private SearchCriteria<SRT> right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OrSearchCriteriaImpl( SearchCriteria<SRT> left, SearchCriteria<SRT> right ) {
		this.left = left;
		this.right = right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected OrSearchCriteriaImpl() {}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SearchResult<SRT> apply(SearchResult<SRT> result ) {
		double rl = left.apply( result ).getRelevance();
		double rr = right.apply( result ).getRelevance();
		return result.withRelevance( Math.max( rl, rr ) );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SearchCriteria<SRT> getLeft() {
		return left;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRight(SearchCriteria<SRT> newRight) {
		right = newRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setLeft(SearchCriteria<SRT> newLeft) {
		left = newLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SearchCriteria<SRT> getRight() {
		return right;
	}
} //OrSearchCriteriaImpl