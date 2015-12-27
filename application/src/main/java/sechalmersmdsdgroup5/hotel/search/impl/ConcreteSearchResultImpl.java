/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import sechalmersmdsdgroup5.hotel.search.ConcreteSearchResult;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Search Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated NOT
 */
public class ConcreteSearchResultImpl<SRT> implements ConcreteSearchResult<SRT> {
	SRT result;
	double relevance;

	public ConcreteSearchResultImpl( SRT result, double relevance ) {
		this.result = result;
		this.relevance = relevance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteSearchResultImpl() {}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRT getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelevance() {
		return relevance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchResult<? extends SRT> withRelevance( double relevance ) {
		return new ConcreteSearchResultImpl<>( this.result, relevance );
	}
} //ConcreteSearchResultImpl
