/**
 */
package sechalmersmdsdgroup5.hotel.facilities;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Log Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getWhen <em>When</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getAccessed <em>Accessed</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface AccessLogItem {
	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getWhen();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Date value);

	/**
	 * Returns the value of the '<em><b>Accessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessor</em>' reference.
	 * @see #setAccessor(Key)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Key getAccessor();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getAccessor <em>Accessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessor</em>' reference.
	 * @see #getAccessor()
	 * @generated
	 */
	void setAccessor(Key value);

	/**
	 * Returns the value of the '<em><b>Accessed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed</em>' reference.
	 * @see #setAccessed(Door)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Door getAccessed();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getAccessed <em>Accessed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessed</em>' reference.
	 * @see #getAccessed()
	 * @generated
	 */
	void setAccessed(Door value);

} // AccessLogItem
