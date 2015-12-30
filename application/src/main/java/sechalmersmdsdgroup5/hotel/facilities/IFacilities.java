/**
 */
package sechalmersmdsdgroup5.hotel.facilities;

import java.util.List;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

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
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false" unlocksMany="true" unlocksOrdered="false"
	 * @generated
	 */
	Key createKey(int id, List<Door> unlocks);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nrRequired="true" nrOrdered="false" floorRequired="true" floorOrdered="false" usableRequired="true" usableOrdered="false" basePriceRequired="true" basePriceOrdered="false" prototypeOrderingMany="true" prototypeOrderingOrdered="false" roomAttributesMany="true" roomAttributesOrdered="false" serviceBlueprintsMany="true" serviceBlueprintsOrdered="false"
	 * @generated
	 */
	Room createRoom(int nr, int floor, boolean usable, double basePrice, List<PrototypeOrdering> prototypeOrdering, List<RoomAttribute> roomAttributes, List<ServiceBlueprint> serviceBlueprints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" basePriceRequired="true" basePriceOrdered="false" roomAttributesMany="true" roomAttributesOrdered="false"
	 * @generated
	 */
	RoomPrototype createRoomPrototype(String name, double basePrice, List<RoomAttribute> roomAttributes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" valueRequired="true" valueOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	RoomAttribute createRoomAttribute(String name, Object value, double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false" areasMany="true" areasOrdered="false"
	 * @generated
	 */
	Door createDoor(int id, List<Area> areas);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idRequired="true" idOrdered="false" floorRequired="true" floorOrdered="false"
	 * @generated
	 */
	EmployeeArea createEmployeeArea(int id, int floor);

} // IFacilities
