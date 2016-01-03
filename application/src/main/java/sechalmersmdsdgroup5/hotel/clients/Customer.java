/**
 */
package sechalmersmdsdgroup5.hotel.clients;

import sechalmersmdsdgroup5.hotel.identities.Identity;
import sechalmersmdsdgroup5.hotel.payment.CreditCard;
import sechalmersmdsdgroup5.hotel.payment.PaymentMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.Customer#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.Customer#getCard <em>Card</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.Customer#getAssociatedAdress <em>Associated Adress</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.Customer#getIdentity <em>Identity</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.Customer#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Customer extends Client {
	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' attribute.
	 * The literals are from the enumeration {@link sechalmersmdsdgroup5.hotel.payment.PaymentMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' attribute.
	 * @see sechalmersmdsdgroup5.hotel.payment.PaymentMethod
	 * @see #setPaymentMethod(PaymentMethod)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.clients.Customer#getPaymentMethod <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' attribute.
	 * @see sechalmersmdsdgroup5.hotel.payment.PaymentMethod
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference.
	 * @see #setCard(CreditCard)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CreditCard getCard();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.clients.Customer#getCard <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(CreditCard value);

	/**
	 * Returns the value of the '<em><b>Associated Adress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Adress</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Adress</em>' reference.
	 * @see #setAssociatedAdress(Address)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Address getAssociatedAdress();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.clients.Customer#getAssociatedAdress <em>Associated Adress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Adress</em>' reference.
	 * @see #getAssociatedAdress()
	 * @generated
	 */
	void setAssociatedAdress(Address value);

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
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.clients.Customer#getIdentity <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(Identity value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.clients.Customer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // Customer
