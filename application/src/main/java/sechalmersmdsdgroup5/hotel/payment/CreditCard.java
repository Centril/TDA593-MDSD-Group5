/**
 */
package sechalmersmdsdgroup5.hotel.payment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getExpiryMonth <em>Expiry Month</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getExpiryYear <em>Expiry Year</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getNumber <em>Number</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getCcv <em>Ccv</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface CreditCard {
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
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Month</em>' attribute.
	 * @see #setExpiryMonth(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExpiryMonth();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getExpiryMonth <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Month</em>' attribute.
	 * @see #getExpiryMonth()
	 * @generated
	 */
	void setExpiryMonth(int value);

	/**
	 * Returns the value of the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Year</em>' attribute.
	 * @see #setExpiryYear(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExpiryYear();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getExpiryYear <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Year</em>' attribute.
	 * @see #getExpiryYear()
	 * @generated
	 */
	void setExpiryYear(int value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ccv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccv</em>' attribute.
	 * @see #setCcv(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCcv();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getCcv <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ccv</em>' attribute.
	 * @see #getCcv()
	 * @generated
	 */
	void setCcv(int value);

} // CreditCard
