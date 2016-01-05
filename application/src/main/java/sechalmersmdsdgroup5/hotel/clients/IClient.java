/**
 */
package sechalmersmdsdgroup5.hotel.clients;

import sechalmersmdsdgroup5.hotel.identities.Identity;

import sechalmersmdsdgroup5.hotel.payment.PaymentMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IClient</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model identityRequired="true" identityOrdered="false" paymentMethodRequired="true" paymentMethodOrdered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	void createCustomer(Identity identity, PaymentMethod paymentMethod, String email);

} // IClient
