/**
 */
package sechalmersmdsdgroup5.hotel.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.NotSearchCriteria#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface NotSearchCriteria<SRT> extends SearchCriteria<SRT> {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' reference.
	 * @see #setCriteria(SearchCriteria)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SearchCriteria<? extends SRT> getCriteria();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.search.NotSearchCriteria#getCriteria <em>Criteria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' reference.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(SearchCriteria<? extends SRT> value);

} // NotSearchCriteria
