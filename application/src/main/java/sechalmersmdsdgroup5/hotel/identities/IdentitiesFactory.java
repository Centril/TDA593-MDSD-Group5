/**
 */
package sechalmersmdsdgroup5.hotel.identities;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface IdentitiesFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdentitiesFactory INSTANCE = sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Real Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Person</em>'.
	 * @generated
	 */
	RealPerson createRealPerson();

	/**
	 * Returns a new object of class '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organisation</em>'.
	 * @generated
	 */
	Organisation createOrganisation();

} //IdentitiesFactory
