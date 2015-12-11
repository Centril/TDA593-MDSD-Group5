/**
 */
package sechalmersmdsdgroup5.hotel.payment;

import sechalmersmdsdgroup5.hotel.clients.Client;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPayment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IPayment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" paymentInformationRequired="true" paymentInformationOrdered="false"
	 * @generated
	 */
	boolean verifyPaymentInformation(CreditCard paymentInformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model invoicableRequired="true" invoicableOrdered="false"
	 * @generated
	 */
	void debit(Invoicable invoicable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model invoicableRequired="true" invoicableOrdered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void debit(Invoicable invoicable, Client customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model invoicableRequired="true" invoicableOrdered="false"
	 * @generated
	 */
	void printReceipt(Invoicable invoicable);

} // IPayment
