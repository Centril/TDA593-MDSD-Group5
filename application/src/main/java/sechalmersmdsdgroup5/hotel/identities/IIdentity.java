/**
 */
package sechalmersmdsdgroup5.hotel.identities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IIdentity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IIdentity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	Identity createIdentity(String name, String ssn);

} // IIdentity
