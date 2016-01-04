/**
 */
package sechalmersmdsdgroup5.hotel.facilities.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl;

import sechalmersmdsdgroup5.hotel.clients.impl.ClientsPackageImpl;

import sechalmersmdsdgroup5.hotel.facilities.AccessLog;
import sechalmersmdsdgroup5.hotel.facilities.AccessLogItem;
import sechalmersmdsdgroup5.hotel.facilities.Area;
import sechalmersmdsdgroup5.hotel.facilities.Door;
import sechalmersmdsdgroup5.hotel.facilities.EmployeeArea;
import sechalmersmdsdgroup5.hotel.facilities.FacilitiesFactory;
import sechalmersmdsdgroup5.hotel.facilities.IFacilities;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomAttribute;
import sechalmersmdsdgroup5.hotel.facilities.RoomPrototype;

import sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesPackageImpl;

import sechalmersmdsdgroup5.hotel.impl.HotelPackageImpl;

import sechalmersmdsdgroup5.hotel.inventory.impl.InventoryPackageImpl;

import sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl;

import sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl;

import sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl;

import sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl;

import sechalmersmdsdgroup5.hotel.schedule.impl.SchedulePackageImpl;

import sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl;

import sechalmersmdsdgroup5.hotel.services.impl.ServicesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sechalmersmdsdgroup5.hotel.facilities.FacilitiesFactory
 * @model kind="package"
 * @generated
 */
public class FacilitiesPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "facilities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///sechalmersmdsdgroup5/hotel/facilities.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sechalmersmdsdgroup5.hotel.facilities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FacilitiesPackageImpl eINSTANCE = sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.Area <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.Area
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getArea()
	 * @generated
	 */
	public static final int AREA = 1;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AREA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getRoom()
	 * @generated
	 */
	public static final int ROOM = 0;

	/**
	 * The feature id for the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM__NR = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM__FLOOR = AREA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM__USABLE = AREA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM__BASE_PRICE = AREA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM__LAST_CLEANED = AREA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Services Afforded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM__SERVICES_AFFORDED = AREA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM__ATTRIBUTES = AREA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM__PROTOTYPES = AREA_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_FEATURE_COUNT = AREA_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.KeyImpl
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getKey()
	 * @generated
	 */
	public static final int KEY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KEY__ID = 0;

	/**
	 * The feature id for the '<em><b>Unlocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KEY__UNLOCKS = 1;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KEY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.DoorImpl
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getDoor()
	 * @generated
	 */
	public static final int DOOR = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOOR__AREAS = 1;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DOOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl <em>Room Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getRoomAttribute()
	 * @generated
	 */
	public static final int ROOM_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_ATTRIBUTE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_ATTRIBUTE__PRICE = 2;

	/**
	 * The number of structural features of the '<em>Room Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.PrototypeOrderingImpl <em>Prototype Ordering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.PrototypeOrderingImpl
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getPrototypeOrdering()
	 * @generated
	 */
	public static final int PROTOTYPE_ORDERING = 5;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTOTYPE_ORDERING__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTOTYPE_ORDERING__PROTOTYPE = 1;

	/**
	 * The number of structural features of the '<em>Prototype Ordering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTOTYPE_ORDERING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomPrototypeImpl <em>Room Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.RoomPrototypeImpl
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getRoomPrototype()
	 * @generated
	 */
	public static final int ROOM_PROTOTYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_PROTOTYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_PROTOTYPE__BASE_PRICE = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_PROTOTYPE__STATES = 2;

	/**
	 * The feature id for the '<em><b>Services Afforded</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_PROTOTYPE__SERVICES_AFFORDED = 3;

	/**
	 * The number of structural features of the '<em>Room Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_PROTOTYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.EmployeeAreaImpl <em>Employee Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.EmployeeAreaImpl
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getEmployeeArea()
	 * @generated
	 */
	public static final int EMPLOYEE_AREA = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_AREA__ID = AREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_AREA__FLOOR = AREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employee Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_AREA_FEATURE_COUNT = AREA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogImpl <em>Access Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogImpl
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getAccessLog()
	 * @generated
	 */
	public static final int ACCESS_LOG = 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_LOG__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Access Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_LOG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogItemImpl <em>Access Log Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogItemImpl
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getAccessLogItem()
	 * @generated
	 */
	public static final int ACCESS_LOG_ITEM = 9;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_LOG_ITEM__WHEN = 0;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_LOG_ITEM__ACCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Accessed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_LOG_ITEM__ACCESSED = 2;

	/**
	 * The number of structural features of the '<em>Access Log Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_LOG_ITEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.facilities.IFacilities <em>IFacilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.facilities.IFacilities
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getIFacilities()
	 * @generated
	 */
	public static final int IFACILITIES = 10;

	/**
	 * The number of structural features of the '<em>IFacilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IFACILITIES_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prototypeOrderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessLogItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFacilitiesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FacilitiesPackageImpl() {
		super(eNS_URI, ((EFactory)FacilitiesFactory.INSTANCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FacilitiesPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FacilitiesPackageImpl init() {
		if (isInited) return (FacilitiesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI);

		// Obtain or create and register package
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FacilitiesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelPackageImpl theHotelPackage = (HotelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) instanceof HotelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) : HotelPackageImpl.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) : ServicesPackageImpl.eINSTANCE);
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) : PaymentPackageImpl.eINSTANCE);
		ClientsPackageImpl theClientsPackage = (ClientsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) instanceof ClientsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) : ClientsPackageImpl.eINSTANCE);
		IdentitiesPackageImpl theIdentitiesPackage = (IdentitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) instanceof IdentitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) : IdentitiesPackageImpl.eINSTANCE);
		OrderingPackageImpl theOrderingPackage = (OrderingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI) instanceof OrderingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI) : OrderingPackageImpl.eINSTANCE);
		PersonnelPackageImpl thePersonnelPackage = (PersonnelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI) instanceof PersonnelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI) : PersonnelPackageImpl.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) : SchedulePackageImpl.eINSTANCE);
		LogPackageImpl theLogPackage = (LogPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) instanceof LogPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) : LogPackageImpl.eINSTANCE);
		BlacklistPackageImpl theBlacklistPackage = (BlacklistPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) instanceof BlacklistPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) : BlacklistPackageImpl.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) : InventoryPackageImpl.eINSTANCE);
		SearchPackageImpl theSearchPackage = (SearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) instanceof SearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) : SearchPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theFacilitiesPackage.createPackageContents();
		theHotelPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theClientsPackage.createPackageContents();
		theIdentitiesPackage.createPackageContents();
		theOrderingPackage.createPackageContents();
		thePersonnelPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theLogPackage.createPackageContents();
		theBlacklistPackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theSearchPackage.createPackageContents();

		// Initialize created meta-data
		theFacilitiesPackage.initializePackageContents();
		theHotelPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theClientsPackage.initializePackageContents();
		theIdentitiesPackage.initializePackageContents();
		theOrderingPackage.initializePackageContents();
		thePersonnelPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theLogPackage.initializePackageContents();
		theBlacklistPackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theSearchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFacilitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FacilitiesPackageImpl.eNS_URI, theFacilitiesPackage);
		return theFacilitiesPackage;
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getNr <em>Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room#getNr()
	 * @see #getRoom()
	 * @generated
	 */
	public EAttribute getRoom_Nr() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floor</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room#getFloor()
	 * @see #getRoom()
	 * @generated
	 */
	public EAttribute getRoom_Floor() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.Room#isUsable <em>Usable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usable</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room#isUsable()
	 * @see #getRoom()
	 * @generated
	 */
	public EAttribute getRoom_Usable() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getBasePrice <em>Base Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Price</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room#getBasePrice()
	 * @see #getRoom()
	 * @generated
	 */
	public EAttribute getRoom_BasePrice() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getLastCleaned <em>Last Cleaned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Cleaned</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room#getLastCleaned()
	 * @see #getRoom()
	 * @generated
	 */
	public EAttribute getRoom_LastCleaned() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getServicesAfforded <em>Services Afforded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services Afforded</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room#getServicesAfforded()
	 * @see #getRoom()
	 * @generated
	 */
	public EReference getRoom_ServicesAfforded() {
		return (EReference)roomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room#getAttributes()
	 * @see #getRoom()
	 * @generated
	 */
	public EReference getRoom_Attributes() {
		return (EReference)roomEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getPrototypes <em>Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prototypes</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room#getPrototypes()
	 * @see #getRoom()
	 * @generated
	 */
	public EReference getRoom_Prototypes() {
		return (EReference)roomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Area
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Key
	 * @generated
	 */
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.Key#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Key#getId()
	 * @see #getKey()
	 * @generated
	 */
	public EAttribute getKey_Id() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.facilities.Key#getUnlocks <em>Unlocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unlocks</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Key#getUnlocks()
	 * @see #getKey()
	 * @generated
	 */
	public EReference getKey_Unlocks() {
		return (EReference)keyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Door
	 * @generated
	 */
	public EClass getDoor() {
		return doorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.Door#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Door#getId()
	 * @see #getDoor()
	 * @generated
	 */
	public EAttribute getDoor_Id() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.facilities.Door#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Areas</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Door#getAreas()
	 * @see #getDoor()
	 * @generated
	 */
	public EReference getDoor_Areas() {
		return (EReference)doorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.RoomAttribute <em>Room Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Attribute</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomAttribute
	 * @generated
	 */
	public EClass getRoomAttribute() {
		return roomAttributeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.RoomAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomAttribute#getName()
	 * @see #getRoomAttribute()
	 * @generated
	 */
	public EAttribute getRoomAttribute_Name() {
		return (EAttribute)roomAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.RoomAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomAttribute#getValue()
	 * @see #getRoomAttribute()
	 * @generated
	 */
	public EAttribute getRoomAttribute_Value() {
		return (EAttribute)roomAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.RoomAttribute#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomAttribute#getPrice()
	 * @see #getRoomAttribute()
	 * @generated
	 */
	public EAttribute getRoomAttribute_Price() {
		return (EAttribute)roomAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering <em>Prototype Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prototype Ordering</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering
	 * @generated
	 */
	public EClass getPrototypeOrdering() {
		return prototypeOrderingEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering#getOrder()
	 * @see #getPrototypeOrdering()
	 * @generated
	 */
	public EAttribute getPrototypeOrdering_Order() {
		return (EAttribute)prototypeOrderingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prototype</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering#getPrototype()
	 * @see #getPrototypeOrdering()
	 * @generated
	 */
	public EReference getPrototypeOrdering_Prototype() {
		return (EReference)prototypeOrderingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype <em>Room Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Prototype</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomPrototype
	 * @generated
	 */
	public EClass getRoomPrototype() {
		return roomPrototypeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getName()
	 * @see #getRoomPrototype()
	 * @generated
	 */
	public EAttribute getRoomPrototype_Name() {
		return (EAttribute)roomPrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getBasePrice <em>Base Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Price</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getBasePrice()
	 * @see #getRoomPrototype()
	 * @generated
	 */
	public EAttribute getRoomPrototype_BasePrice() {
		return (EAttribute)roomPrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getStates()
	 * @see #getRoomPrototype()
	 * @generated
	 */
	public EReference getRoomPrototype_States() {
		return (EReference)roomPrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getServicesAfforded <em>Services Afforded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services Afforded</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getServicesAfforded()
	 * @see #getRoomPrototype()
	 * @generated
	 */
	public EReference getRoomPrototype_ServicesAfforded() {
		return (EReference)roomPrototypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.EmployeeArea <em>Employee Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Area</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.EmployeeArea
	 * @generated
	 */
	public EClass getEmployeeArea() {
		return employeeAreaEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.EmployeeArea#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.EmployeeArea#getId()
	 * @see #getEmployeeArea()
	 * @generated
	 */
	public EAttribute getEmployeeArea_Id() {
		return (EAttribute)employeeAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.EmployeeArea#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floor</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.EmployeeArea#getFloor()
	 * @see #getEmployeeArea()
	 * @generated
	 */
	public EAttribute getEmployeeArea_Floor() {
		return (EAttribute)employeeAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLog <em>Access Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Log</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.AccessLog
	 * @generated
	 */
	public EClass getAccessLog() {
		return accessLogEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLog#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.AccessLog#getItems()
	 * @see #getAccessLog()
	 * @generated
	 */
	public EReference getAccessLog_Items() {
		return (EReference)accessLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem <em>Access Log Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Log Item</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.AccessLogItem
	 * @generated
	 */
	public EClass getAccessLogItem() {
		return accessLogItemEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getWhen()
	 * @see #getAccessLogItem()
	 * @generated
	 */
	public EAttribute getAccessLogItem_When() {
		return (EAttribute)accessLogItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accessor</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getAccessor()
	 * @see #getAccessLogItem()
	 * @generated
	 */
	public EReference getAccessLogItem_Accessor() {
		return (EReference)accessLogItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getAccessed <em>Accessed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accessed</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.AccessLogItem#getAccessed()
	 * @see #getAccessLogItem()
	 * @generated
	 */
	public EReference getAccessLogItem_Accessed() {
		return (EReference)accessLogItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.facilities.IFacilities <em>IFacilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFacilities</em>'.
	 * @see sechalmersmdsdgroup5.hotel.facilities.IFacilities
	 * @generated
	 */
	public EClass getIFacilities() {
		return iFacilitiesEClass;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public FacilitiesFactory getFacilitiesFactory() {
		return (FacilitiesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NR);
		createEAttribute(roomEClass, ROOM__FLOOR);
		createEAttribute(roomEClass, ROOM__USABLE);
		createEAttribute(roomEClass, ROOM__BASE_PRICE);
		createEAttribute(roomEClass, ROOM__LAST_CLEANED);
		createEReference(roomEClass, ROOM__SERVICES_AFFORDED);
		createEReference(roomEClass, ROOM__ATTRIBUTES);
		createEReference(roomEClass, ROOM__PROTOTYPES);

		areaEClass = createEClass(AREA);

		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__ID);
		createEReference(keyEClass, KEY__UNLOCKS);

		doorEClass = createEClass(DOOR);
		createEAttribute(doorEClass, DOOR__ID);
		createEReference(doorEClass, DOOR__AREAS);

		roomAttributeEClass = createEClass(ROOM_ATTRIBUTE);
		createEAttribute(roomAttributeEClass, ROOM_ATTRIBUTE__NAME);
		createEAttribute(roomAttributeEClass, ROOM_ATTRIBUTE__VALUE);
		createEAttribute(roomAttributeEClass, ROOM_ATTRIBUTE__PRICE);

		prototypeOrderingEClass = createEClass(PROTOTYPE_ORDERING);
		createEAttribute(prototypeOrderingEClass, PROTOTYPE_ORDERING__ORDER);
		createEReference(prototypeOrderingEClass, PROTOTYPE_ORDERING__PROTOTYPE);

		roomPrototypeEClass = createEClass(ROOM_PROTOTYPE);
		createEAttribute(roomPrototypeEClass, ROOM_PROTOTYPE__NAME);
		createEAttribute(roomPrototypeEClass, ROOM_PROTOTYPE__BASE_PRICE);
		createEReference(roomPrototypeEClass, ROOM_PROTOTYPE__STATES);
		createEReference(roomPrototypeEClass, ROOM_PROTOTYPE__SERVICES_AFFORDED);

		employeeAreaEClass = createEClass(EMPLOYEE_AREA);
		createEAttribute(employeeAreaEClass, EMPLOYEE_AREA__ID);
		createEAttribute(employeeAreaEClass, EMPLOYEE_AREA__FLOOR);

		accessLogEClass = createEClass(ACCESS_LOG);
		createEReference(accessLogEClass, ACCESS_LOG__ITEMS);

		accessLogItemEClass = createEClass(ACCESS_LOG_ITEM);
		createEAttribute(accessLogItemEClass, ACCESS_LOG_ITEM__WHEN);
		createEReference(accessLogItemEClass, ACCESS_LOG_ITEM__ACCESSOR);
		createEReference(accessLogItemEClass, ACCESS_LOG_ITEM__ACCESSED);

		iFacilitiesEClass = createEClass(IFACILITIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roomEClass.getESuperTypes().add(this.getArea());
		employeeAreaEClass.getESuperTypes().add(this.getArea());

		// Initialize classes and features; add operations and parameters
		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Nr(), ecorePackage.getEInt(), "nr", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Floor(), ecorePackage.getEInt(), "floor", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Usable(), ecorePackage.getEBoolean(), "usable", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_BasePrice(), ecorePackage.getEDouble(), "basePrice", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_LastCleaned(), ecorePackage.getEDate(), "lastCleaned", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_ServicesAfforded(), theServicesPackage.getServiceBlueprint(), null, "servicesAfforded", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Attributes(), this.getRoomAttribute(), null, "attributes", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Prototypes(), this.getPrototypeOrdering(), null, "prototypes", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(roomEClass, this.getRoomAttribute(), "getAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(roomEClass, this.getRoomAttribute(), "getLocalAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getKey_Unlocks(), this.getDoor(), null, "unlocks", null, 0, -1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(doorEClass, Door.class, "Door", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoor_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDoor_Areas(), this.getArea(), null, "areas", null, 1, -1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomAttributeEClass, RoomAttribute.class, "RoomAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomAttribute_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, RoomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomAttribute_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, RoomAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(prototypeOrderingEClass, PrototypeOrdering.class, "PrototypeOrdering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrototypeOrdering_Order(), ecorePackage.getEInt(), "order", null, 1, 1, PrototypeOrdering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrototypeOrdering_Prototype(), this.getRoomPrototype(), null, "prototype", null, 1, 1, PrototypeOrdering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomPrototypeEClass, RoomPrototype.class, "RoomPrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomPrototype_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomPrototype_BasePrice(), ecorePackage.getEDouble(), "basePrice", null, 1, 1, RoomPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomPrototype_States(), this.getRoomAttribute(), null, "states", null, 0, -1, RoomPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomPrototype_ServicesAfforded(), theServicesPackage.getServiceBlueprint(), null, "servicesAfforded", null, 0, -1, RoomPrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(employeeAreaEClass, EmployeeArea.class, "EmployeeArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployeeArea_Id(), ecorePackage.getEInt(), "id", null, 1, 1, EmployeeArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmployeeArea_Floor(), ecorePackage.getEInt(), "floor", null, 1, 1, EmployeeArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(accessLogEClass, AccessLog.class, "AccessLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessLog_Items(), this.getAccessLogItem(), null, "items", null, 0, -1, AccessLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(accessLogItemEClass, AccessLogItem.class, "AccessLogItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessLogItem_When(), ecorePackage.getEDate(), "when", null, 1, 1, AccessLogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessLogItem_Accessor(), this.getKey(), null, "accessor", null, 1, 1, AccessLogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessLogItem_Accessed(), this.getDoor(), null, "accessed", null, 1, 1, AccessLogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iFacilitiesEClass, IFacilities.class, "IFacilities", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iFacilitiesEClass, this.getKey(), "createKey", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getDoor(), "unlocks", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iFacilitiesEClass, this.getRoom(), "createRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nr", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "floor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "usable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "basePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPrototypeOrdering(), "prototypeOrdering", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAttribute(), "roomAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theServicesPackage.getServiceBlueprint(), "serviceBlueprints", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iFacilitiesEClass, this.getRoomPrototype(), "createRoomPrototype", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "basePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAttribute(), "roomAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iFacilitiesEClass, this.getRoomAttribute(), "createRoomAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iFacilitiesEClass, this.getDoor(), "createDoor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getArea(), "areas", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iFacilitiesEClass, this.getEmployeeArea(), "createEmployeeArea", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "floor", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iFacilitiesEClass, this.getPrototypeOrdering(), "createPrototypeOrdering", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "order", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomPrototype(), "prototype", 1, 1, IS_UNIQUE, !IS_ORDERED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getRoom()
		 * @generated
		 */
		public static final EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM__NR = eINSTANCE.getRoom_Nr();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM__FLOOR = eINSTANCE.getRoom_Floor();

		/**
		 * The meta object literal for the '<em><b>Usable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM__USABLE = eINSTANCE.getRoom_Usable();

		/**
		 * The meta object literal for the '<em><b>Base Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM__BASE_PRICE = eINSTANCE.getRoom_BasePrice();

		/**
		 * The meta object literal for the '<em><b>Last Cleaned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM__LAST_CLEANED = eINSTANCE.getRoom_LastCleaned();

		/**
		 * The meta object literal for the '<em><b>Services Afforded</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOM__SERVICES_AFFORDED = eINSTANCE.getRoom_ServicesAfforded();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOM__ATTRIBUTES = eINSTANCE.getRoom_Attributes();

		/**
		 * The meta object literal for the '<em><b>Prototypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOM__PROTOTYPES = eINSTANCE.getRoom_Prototypes();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.Area <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.Area
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getArea()
		 * @generated
		 */
		public static final EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.KeyImpl
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getKey()
		 * @generated
		 */
		public static final EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute KEY__ID = eINSTANCE.getKey_Id();

		/**
		 * The meta object literal for the '<em><b>Unlocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference KEY__UNLOCKS = eINSTANCE.getKey_Unlocks();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.DoorImpl
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getDoor()
		 * @generated
		 */
		public static final EClass DOOR = eINSTANCE.getDoor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DOOR__ID = eINSTANCE.getDoor_Id();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DOOR__AREAS = eINSTANCE.getDoor_Areas();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl <em>Room Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getRoomAttribute()
		 * @generated
		 */
		public static final EClass ROOM_ATTRIBUTE = eINSTANCE.getRoomAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_ATTRIBUTE__NAME = eINSTANCE.getRoomAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_ATTRIBUTE__VALUE = eINSTANCE.getRoomAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_ATTRIBUTE__PRICE = eINSTANCE.getRoomAttribute_Price();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.PrototypeOrderingImpl <em>Prototype Ordering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.PrototypeOrderingImpl
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getPrototypeOrdering()
		 * @generated
		 */
		public static final EClass PROTOTYPE_ORDERING = eINSTANCE.getPrototypeOrdering();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROTOTYPE_ORDERING__ORDER = eINSTANCE.getPrototypeOrdering_Order();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROTOTYPE_ORDERING__PROTOTYPE = eINSTANCE.getPrototypeOrdering_Prototype();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomPrototypeImpl <em>Room Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.RoomPrototypeImpl
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getRoomPrototype()
		 * @generated
		 */
		public static final EClass ROOM_PROTOTYPE = eINSTANCE.getRoomPrototype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_PROTOTYPE__NAME = eINSTANCE.getRoomPrototype_Name();

		/**
		 * The meta object literal for the '<em><b>Base Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_PROTOTYPE__BASE_PRICE = eINSTANCE.getRoomPrototype_BasePrice();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOM_PROTOTYPE__STATES = eINSTANCE.getRoomPrototype_States();

		/**
		 * The meta object literal for the '<em><b>Services Afforded</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOM_PROTOTYPE__SERVICES_AFFORDED = eINSTANCE.getRoomPrototype_ServicesAfforded();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.EmployeeAreaImpl <em>Employee Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.EmployeeAreaImpl
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getEmployeeArea()
		 * @generated
		 */
		public static final EClass EMPLOYEE_AREA = eINSTANCE.getEmployeeArea();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMPLOYEE_AREA__ID = eINSTANCE.getEmployeeArea_Id();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMPLOYEE_AREA__FLOOR = eINSTANCE.getEmployeeArea_Floor();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogImpl <em>Access Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogImpl
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getAccessLog()
		 * @generated
		 */
		public static final EClass ACCESS_LOG = eINSTANCE.getAccessLog();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCESS_LOG__ITEMS = eINSTANCE.getAccessLog_Items();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogItemImpl <em>Access Log Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogItemImpl
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getAccessLogItem()
		 * @generated
		 */
		public static final EClass ACCESS_LOG_ITEM = eINSTANCE.getAccessLogItem();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ACCESS_LOG_ITEM__WHEN = eINSTANCE.getAccessLogItem_When();

		/**
		 * The meta object literal for the '<em><b>Accessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCESS_LOG_ITEM__ACCESSOR = eINSTANCE.getAccessLogItem_Accessor();

		/**
		 * The meta object literal for the '<em><b>Accessed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ACCESS_LOG_ITEM__ACCESSED = eINSTANCE.getAccessLogItem_Accessed();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.facilities.IFacilities <em>IFacilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.facilities.IFacilities
		 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl#getIFacilities()
		 * @generated
		 */
		public static final EClass IFACILITIES = eINSTANCE.getIFacilities();

	}

} //FacilitiesPackageImpl
