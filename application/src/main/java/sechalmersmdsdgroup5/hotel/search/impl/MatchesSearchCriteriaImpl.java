/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matches Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl#getInput <em>Input</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class MatchesSearchCriteriaImpl<SRT, IN> implements MatchesSearchCriteria<SRT, IN> {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected IN input;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Function<SRT, IN> transform;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected BiPredicate<IN, IN> predicate;

	public MatchesSearchCriteriaImpl( IN input, Function<SRT, IN> transform, BiPredicate<IN, IN> predicate ) {
		this.input = input;
		this.transform = transform;
		this.predicate = predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchesSearchCriteriaImpl() {}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(IN newInput) {
		input = newInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiPredicate<IN, IN> getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(BiPredicate<IN, IN> newPredicate) {
		predicate = newPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function<SRT, IN> getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Function<SRT, IN> newTransform) {
		transform = newTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchResult<? extends SRT> apply(SearchResult<? extends SRT> sr ) {
		double r = sr.getRelevance();
		return sr.withRelevance( predicate.test( input, transform.apply( sr.getResult() ) )
							   ? r * 2
							   : r / 2 );
	}
} //MatchesSearchCriteriaImpl
