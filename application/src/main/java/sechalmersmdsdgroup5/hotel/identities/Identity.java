/**
 */
package sechalmersmdsdgroup5.hotel.identities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.identities.Identity#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.identities.Identity#getIdNumber <em>Id Number</em>}</li>
 * </ul>
 *
 * @model abstract="true"
 * @generated
 */
public interface Identity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.identities.Identity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Number</em>' attribute.
	 * @see #setIdNumber(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getIdNumber();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.identities.Identity#getIdNumber <em>Id Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Number</em>' attribute.
	 * @see #getIdNumber()
	 * @generated
	 */
	void setIdNumber(String value);

} // Identity
