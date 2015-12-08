/**
 */
package sechalmersmdsdgroup5.hotel.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.OrSearchCriteria#getLeft <em>Left</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.OrSearchCriteria#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface OrSearchCriteria<SRT> extends SearchCriteria<SRT> {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(SearchCriteria)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SearchCriteria<? extends SRT> getLeft();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.search.OrSearchCriteria#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(SearchCriteria<? extends SRT> value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(SearchCriteria)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SearchCriteria<? extends SRT> getRight();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.search.OrSearchCriteria#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(SearchCriteria<? extends SRT> value);

} // OrSearchCriteria
