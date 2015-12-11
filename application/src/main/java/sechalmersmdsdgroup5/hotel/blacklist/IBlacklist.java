/**
 */
package sechalmersmdsdgroup5.hotel.blacklist;

import sechalmersmdsdgroup5.hotel.identities.Identity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBlacklist</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBlacklist {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model identityRequired="true" identityOrdered="false"
	 * @generated
	 */
	void addToBlackList(Identity identity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model identityRequired="true" identityOrdered="false"
	 * @generated
	 */
	void removeFromBlackList(Identity identity);

} // IBlacklist
