/**
 */
package sechalmersmdsdgroup5.hotel.search;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matches Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getTransform <em>Transform</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface MatchesSearchCriteria<SRT> extends SearchCriteria<SRT> {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(UnaryOperator)
	 * @model type="sechalmersmdsdgroup5.hotel.search.UnaryOperator<? extends SRT>" required="true" ordered="false"
	 * @generated
	 */
	UnaryOperator<? extends SRT> getPredicate();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(UnaryOperator<? extends SRT> value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' reference.
	 * @see #setTransform(BiPredicate)
	 * @model type="sechalmersmdsdgroup5.hotel.search.BiPredicate<? extends SRT, ? extends SRT>" required="true" ordered="false"
	 * @generated
	 */
	BiPredicate<? extends SRT, ? extends SRT> getTransform();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getTransform <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(BiPredicate<? extends SRT, ? extends SRT> value);

} // MatchesSearchCriteria
