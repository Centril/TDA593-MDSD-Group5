/**
 */
package sechalmersmdsdgroup5.hotel.blacklist;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface BlacklistFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlacklistFactory INSTANCE = sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Blacklist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blacklist</em>'.
	 * @generated
	 */
	Blacklist createBlacklist();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	BlacklistItem createBlacklistItem();

} //BlacklistFactory
