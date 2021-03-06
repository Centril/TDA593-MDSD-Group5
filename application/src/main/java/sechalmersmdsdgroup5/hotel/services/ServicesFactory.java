/**
 */
package sechalmersmdsdgroup5.hotel.services;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface ServicesFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicesFactory INSTANCE = sechalmersmdsdgroup5.hotel.services.impl.ServicesFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Factory method for creating ServiceImpl with a price and a consumer specified
	 * @param price the price of the ServiceImpl
	 * @param consumer the ServiceConsumer of the ServiceImpl
	 * @return the created Service
	 */
	Service createService(Double price, ServiceConsumer consumer);

	/**
	 * Returns a new object of class '<em>Service Blueprint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Blueprint</em>'.
	 * @generated
	 */
	ServiceBlueprint createServiceBlueprint();

} //ServicesFactory
