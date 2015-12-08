/**
 */
package sechalmersmdsdgroup5.hotel.facilities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sechalmersmdsdgroup5.hotel.facilities.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacilitiesFactoryImpl extends EFactoryImpl implements FacilitiesFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FacilitiesFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FacilitiesFactoryImpl init() {
		try {
			FacilitiesFactoryImpl theFacilitiesFactory = (FacilitiesFactoryImpl)EPackage.Registry.INSTANCE.getEFactory(FacilitiesPackageImpl.eNS_URI);
			if (theFacilitiesFactory != null) {
				return theFacilitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FacilitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FacilitiesPackageImpl.ROOM: return (EObject)createRoom();
			case FacilitiesPackageImpl.KEY: return (EObject)createKey();
			case FacilitiesPackageImpl.DOOR: return (EObject)createDoor();
			case FacilitiesPackageImpl.ROOM_ATTRIBUTE: return (EObject)createRoomAttribute();
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING: return (EObject)createPrototypeOrdering();
			case FacilitiesPackageImpl.ROOM_PROTOTYPE: return (EObject)createRoomPrototype();
			case FacilitiesPackageImpl.EMPLOYEE_AREA: return (EObject)createEmployeeArea();
			case FacilitiesPackageImpl.ACCESS_LOG: return (EObject)createAccessLog();
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM: return (EObject)createAccessLogItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAttribute createRoomAttribute() {
		RoomAttributeImpl roomAttribute = new RoomAttributeImpl();
		return roomAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrototypeOrdering createPrototypeOrdering() {
		PrototypeOrderingImpl prototypeOrdering = new PrototypeOrderingImpl();
		return prototypeOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomPrototype createRoomPrototype() {
		RoomPrototypeImpl roomPrototype = new RoomPrototypeImpl();
		return roomPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeArea createEmployeeArea() {
		EmployeeAreaImpl employeeArea = new EmployeeAreaImpl();
		return employeeArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLog createAccessLog() {
		AccessLogImpl accessLog = new AccessLogImpl();
		return accessLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLogItem createAccessLogItem() {
		AccessLogItemImpl accessLogItem = new AccessLogItemImpl();
		return accessLogItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesPackageImpl getFacilitiesPackage() {
		return (FacilitiesPackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FacilitiesPackageImpl getPackage() {
		return FacilitiesPackageImpl.eINSTANCE;
	}

} //FacilitiesFactoryImpl
