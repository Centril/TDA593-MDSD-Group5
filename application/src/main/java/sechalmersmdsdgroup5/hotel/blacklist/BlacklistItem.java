/**
 */
package sechalmersmdsdgroup5.hotel.blacklist;

import java.util.Date;

import sechalmersmdsdgroup5.hotel.identities.Identity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getIdentity <em>Identity</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getReason <em>Reason</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getDate <em>Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getExpiry <em>Expiry</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface BlacklistItem {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' reference.
	 * @see #setIdentity(Identity)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Identity getIdentity();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getIdentity <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(Identity value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry</em>' attribute.
	 * @see #setExpiry(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getExpiry();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getExpiry <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry</em>' attribute.
	 * @see #getExpiry()
	 * @generated
	 */
	void setExpiry(Date value);

} // BlacklistItem
