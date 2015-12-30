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
	 * @generated NOT
	 * @ordered
	 */
	private IN input;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated NOT
	 * @ordered
	 */
	private Function<SRT, IN> transform;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated NOT
	 * @ordered
	 */
	private BiPredicate<IN, IN> predicate;

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
	public SearchResult<SRT> apply(SearchResult<SRT> sr ) {
		return sr.withRelevance( sr.getRelevance() *
				(predicate.test( input, transform.apply( sr.getResult() ) ) ? 2 : 0.5) );
	}
} //MatchesSearchCriteriaImpl
