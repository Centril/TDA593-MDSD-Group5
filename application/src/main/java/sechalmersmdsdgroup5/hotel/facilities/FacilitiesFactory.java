/**
 */
package sechalmersmdsdgroup5.hotel.facilities;


import java.util.List;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface FacilitiesFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacilitiesFactory INSTANCE = sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key</em>'.
	 * @generated
	 */
	Key createKey();

	/**
	 * Returns a new object of class '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door</em>'.
	 * @generated
	 */
	Door createDoor();

	/**
	 * Returns a new object of class '<em>Room Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Attribute</em>'.
	 * @generated
	 */
	RoomAttribute createRoomAttribute();

	/**
	 * Returns a new object of class '<em>Prototype Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prototype Ordering</em>'.
	 * @generated
	 */
	PrototypeOrdering createPrototypeOrdering();

	/**
	 * Returns a new object of class '<em>Room Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Prototype</em>'.
	 * @generated
	 */
	RoomPrototype createRoomPrototype();

	/**
	 * Returns a new object of class '<em>Employee Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee Area</em>'.
	 * @generated
	 */
	EmployeeArea createEmployeeArea();

	/**
	 * Returns a new object of class '<em>Access Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Log</em>'.
	 * @generated
	 */
	AccessLog createAccessLog();

	/**
	 * Returns a new object of class '<em>Access Log Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Log Item</em>'.
	 * @generated
	 */
	AccessLogItem createAccessLogItem();

	Room createRoom(List<PrototypeOrdering> testList);

} //FacilitiesFactory
