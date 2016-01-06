/**
 */
package sechalmersmdsdgroup5.hotel.clients;

import sechalmersmdsdgroup5.hotel.identities.Identity;
import sechalmersmdsdgroup5.hotel.payment.CreditCard;
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
	 * @model required="true" ordered="false" identityRequired="true" identityOrdered="false" paymentMethodRequired="true" paymentMethodOrdered="false" emailRequired="true" emailOrdered="false" cardRequired="true" cardOrdered="false" addressRequired="true" addressOrdered="false"
	 * @generated
	 */
	Customer createCustomer(Identity identity, PaymentMethod paymentMethod, String email, CreditCard card, Address address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" ssnRequired="true" ssnOrdered="false" ageRequired="true" ageOrdered="false"
	 * @generated
	 */
	Guest createGuest(String name, String ssn, int age);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" streetRequired="true" streetOrdered="false" zipCodeRequired="true" zipCodeOrdered="false" zipAreaRequired="true" zipAreaOrdered="false" countryRequired="true" countryOrdered="false" regionRequired="true" regionOrdered="false" municipalityRequired="true" municipalityOrdered="false" careOfRequired="true" careOfOrdered="false"
	 * @generated
	 */
	Address createAddress(String street, int zipCode, String zipArea, String country, String region, String municipality, String careOf);

} // IClient
