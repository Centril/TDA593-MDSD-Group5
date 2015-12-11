/**
 */
package sechalmersmdsdgroup5.hotel.ordering;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface OrderingFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrderingFactory INSTANCE = sechalmersmdsdgroup5.hotel.ordering.impl.OrderingFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campaign</em>'.
	 * @generated
	 */
	Campaign createCampaign();

	/**
	 * Returns a new object of class '<em>Pre Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Booking</em>'.
	 * @generated
	 */
	PreBooking createPreBooking();

	/**
	 * Returns a new object of class '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice</em>'.
	 * @generated
	 */
	Invoice createInvoice();

	/**
	 * Returns a new object of class '<em>Ordinary Pre Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinary Pre Order</em>'.
	 * @generated
	 */
	OrdinaryPreOrder createOrdinaryPreOrder();

	/**
	 * Returns a new object of class '<em>Package Pre Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Pre Order</em>'.
	 * @generated
	 */
	PackagePreOrder createPackagePreOrder();

	/**
	 * Returns a new object of class '<em>Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Booking</em>'.
	 * @generated
	 */
	RoomBooking createRoomBooking();

} //OrderingFactory
