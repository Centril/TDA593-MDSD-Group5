/**
 */
package sechalmersmdsdgroup5.hotel.facilities;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFacilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IFacilities {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true" idOrdered="false" unlocksRequired="true" unlocksOrdered="false"
	 * @generated
	 */
	void createKey(int id, Door unlocks);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nrRequired="true" nrOrdered="false" floorRequired="true" floorOrdered="false" usableRequired="true" usableOrdered="false" basePriceRequired="true" basePriceOrdered="false" prototypeOrderingMany="true" prototypeOrderingOrdered="false" roomAttributesMany="true" roomAttributesOrdered="false"
	 * @generated
	 */
	void createRoom(int nr, int floor, boolean usable, double basePrice, List<PrototypeOrdering> prototypeOrdering, List<RoomAttribute> roomAttributes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" basePriceRequired="true" basePriceOrdered="false" roomAttributesMany="true" roomAttributesOrdered="false"
	 * @generated
	 */
	void createRoomPrototype(String name, double basePrice, List<RoomAttribute> roomAttributes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" valueRequired="true" valueOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void createRoomAttribute(String name, Object value, double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true" idOrdered="false" areasMany="true" areasOrdered="false"
	 * @generated
	 */
	void createDoor(int id, List<Area> areas);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true" idOrdered="false" floorRequired="true" floorOrdered="false"
	 * @generated
	 */
	void createEmployeeArea(int id, int floor);

} // IFacilities
