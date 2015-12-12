/**
 */
package sechalmersmdsdgroup5.hotel.search;

import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matches Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getInput <em>Input</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getTransform <em>Transform</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface MatchesSearchCriteria<SRT, IN> extends SearchCriteria<SRT> {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Object)
	 * @model kind="reference" required="true" ordered="false"
	 * @generated
	 */
	IN getInput();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(IN value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(BiPredicate)
	 * @model type="sechalmersmdsdgroup5.hotel.search.BiPredicate<? extends IN, ? extends IN>" required="true" ordered="false"
	 * @generated
	 */
	BiPredicate<? extends IN, ? extends IN> getPredicate();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(BiPredicate<? extends IN, ? extends IN> value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' reference.
	 * @see #setTransform(Function)
	 * @model type="sechalmersmdsdgroup5.hotel.search.Function<? extends SRT, ? extends IN>" required="true" ordered="false"
	 * @generated
	 */
	Function<? extends SRT, ? extends IN> getTransform();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getTransform <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Function<? extends SRT, ? extends IN> value);

} // MatchesSearchCriteria
