/**
 */
package sechalmersmdsdgroup5.hotel.clients;

import sechalmersmdsdgroup5.hotel.facilities.Key;

import sechalmersmdsdgroup5.hotel.identities.RealPerson;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.Guest#getKey <em>Key</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.Guest#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Guest {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Key)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.clients.Guest#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' reference.
	 * @see #setIdentity(RealPerson)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RealPerson getIdentity();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.clients.Guest#getIdentity <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(RealPerson value);

} // Guest