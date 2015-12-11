/**
 */
package sechalmersmdsdgroup5.hotel.identities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.identities.RealPerson#getAge <em>Age</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.identities.RealPerson#getCitizenship <em>Citizenship</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface RealPerson extends Identity {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.identities.RealPerson#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Citizenship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Citizenship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Citizenship</em>' attribute.
	 * @see #setCitizenship(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCitizenship();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.identities.RealPerson#getCitizenship <em>Citizenship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Citizenship</em>' attribute.
	 * @see #getCitizenship()
	 * @generated
	 */
	void setCitizenship(String value);

} // RealPerson
