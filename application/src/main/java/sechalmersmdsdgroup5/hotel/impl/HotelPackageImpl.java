/**
 */
package sechalmersmdsdgroup5.hotel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.HotelFactory;

import sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl;

import sechalmersmdsdgroup5.hotel.clients.impl.ClientsPackageImpl;

import sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl;

import sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesPackageImpl;

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
 * @see sechalmersmdsdgroup5.hotel.HotelFactory
 * @model kind="package"
 * @generated
 */
public class HotelPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "hotel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///sechalmersmdsdgroup5/hotel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sechalmersmdsdgroup5.hotel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HotelPackageImpl eINSTANCE = sechalmersmdsdgroup5.hotel.impl.HotelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl <em>Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.impl.HotelImpl
	 * @see sechalmersmdsdgroup5.hotel.impl.HotelPackageImpl#getHotel()
	 * @generated
	 */
	public static final int HOTEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__ORDERS = 2;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__ROOMS = 3;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__CAMPAIGNS = 4;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__KEYS = 5;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__DOORS = 6;

	/**
	 * The feature id for the '<em><b>Employee Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__EMPLOYEE_AREAS = 7;

	/**
	 * The feature id for the '<em><b>Subcontractors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__SUBCONTRACTORS = 8;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__CUSTOMERS = 9;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__GUESTS = 10;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__EMPLOYEES = 11;

	/**
	 * The feature id for the '<em><b>Service Blueprints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__SERVICE_BLUEPRINTS = 12;

	/**
	 * The feature id for the '<em><b>Room Prototypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__ROOM_PROTOTYPES = 13;

	/**
	 * The feature id for the '<em><b>Access Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__ACCESS_LOG = 14;

	/**
	 * The feature id for the '<em><b>Task Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__TASK_LOG = 15;

	/**
	 * The feature id for the '<em><b>Blacklist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL__BLACKLIST = 16;

	/**
	 * The number of structural features of the '<em>Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL_FEATURE_COUNT = 17;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelEClass = null;

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
	 * @see sechalmersmdsdgroup5.hotel.impl.HotelPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HotelPackageImpl() {
		super(eNS_URI, ((EFactory)HotelFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link HotelPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HotelPackageImpl init() {
		if (isInited) return (HotelPackageImpl)EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI);

		// Obtain or create and register package
		HotelPackageImpl theHotelPackage = (HotelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HotelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HotelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) : FacilitiesPackageImpl.eINSTANCE);
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
		theHotelPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
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
		theHotelPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
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
		theHotelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HotelPackageImpl.eNS_URI, theHotelPackage);
		return theHotelPackage;
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.Hotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel
	 * @generated
	 */
	public EClass getHotel() {
		return hotelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.Hotel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getName()
	 * @see #getHotel()
	 * @generated
	 */
	public EAttribute getHotel_Name() {
		return (EAttribute)hotelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.Hotel#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getLocation()
	 * @see #getHotel()
	 * @generated
	 */
	public EAttribute getHotel_Location() {
		return (EAttribute)hotelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orders</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getOrders()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Orders() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getRooms()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Rooms() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getCampaigns <em>Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Campaigns</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getCampaigns()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Campaigns() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keys</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getKeys()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Keys() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doors</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getDoors()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Doors() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getEmployeeAreas <em>Employee Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employee Areas</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getEmployeeAreas()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_EmployeeAreas() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getSubcontractors <em>Subcontractors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subcontractors</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getSubcontractors()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Subcontractors() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customers</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getCustomers()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Customers() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guests</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getGuests()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Guests() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getEmployees()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Employees() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getServiceBlueprints <em>Service Blueprints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Blueprints</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getServiceBlueprints()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_ServiceBlueprints() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.Hotel#getRoomPrototypes <em>Room Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Prototypes</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getRoomPrototypes()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_RoomPrototypes() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.Hotel#getAccessLog <em>Access Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Log</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getAccessLog()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_AccessLog() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.Hotel#getTaskLog <em>Task Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Log</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getTaskLog()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_TaskLog() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.Hotel#getBlacklist <em>Blacklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blacklist</em>'.
	 * @see sechalmersmdsdgroup5.hotel.Hotel#getBlacklist()
	 * @see #getHotel()
	 * @generated
	 */
	public EReference getHotel_Blacklist() {
		return (EReference)hotelEClass.getEStructuralFeatures().get(16);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public HotelFactory getHotelFactory() {
		return (HotelFactory)getEFactoryInstance();
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
		hotelEClass = createEClass(HOTEL);
		createEAttribute(hotelEClass, HOTEL__NAME);
		createEAttribute(hotelEClass, HOTEL__LOCATION);
		createEReference(hotelEClass, HOTEL__ORDERS);
		createEReference(hotelEClass, HOTEL__ROOMS);
		createEReference(hotelEClass, HOTEL__CAMPAIGNS);
		createEReference(hotelEClass, HOTEL__KEYS);
		createEReference(hotelEClass, HOTEL__DOORS);
		createEReference(hotelEClass, HOTEL__EMPLOYEE_AREAS);
		createEReference(hotelEClass, HOTEL__SUBCONTRACTORS);
		createEReference(hotelEClass, HOTEL__CUSTOMERS);
		createEReference(hotelEClass, HOTEL__GUESTS);
		createEReference(hotelEClass, HOTEL__EMPLOYEES);
		createEReference(hotelEClass, HOTEL__SERVICE_BLUEPRINTS);
		createEReference(hotelEClass, HOTEL__ROOM_PROTOTYPES);
		createEReference(hotelEClass, HOTEL__ACCESS_LOG);
		createEReference(hotelEClass, HOTEL__TASK_LOG);
		createEReference(hotelEClass, HOTEL__BLACKLIST);
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
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI);
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI);
		ClientsPackageImpl theClientsPackage = (ClientsPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI);
		IdentitiesPackageImpl theIdentitiesPackage = (IdentitiesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI);
		OrderingPackageImpl theOrderingPackage = (OrderingPackageImpl)EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI);
		PersonnelPackageImpl thePersonnelPackage = (PersonnelPackageImpl)EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI);
		LogPackageImpl theLogPackage = (LogPackageImpl)EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI);
		BlacklistPackageImpl theBlacklistPackage = (BlacklistPackageImpl)EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI);
		SearchPackageImpl theSearchPackage = (SearchPackageImpl)EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFacilitiesPackage);
		getESubpackages().add(theServicesPackage);
		getESubpackages().add(thePaymentPackage);
		getESubpackages().add(theClientsPackage);
		getESubpackages().add(theIdentitiesPackage);
		getESubpackages().add(theOrderingPackage);
		getESubpackages().add(thePersonnelPackage);
		getESubpackages().add(theSchedulePackage);
		getESubpackages().add(theLogPackage);
		getESubpackages().add(theBlacklistPackage);
		getESubpackages().add(theInventoryPackage);
		getESubpackages().add(theSearchPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(hotelEClass, Hotel.class, "Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Name(), ecorePackage.getEString(), "name", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Location(), ecorePackage.getEString(), "location", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Orders(), theOrderingPackage.getOrder(), null, "orders", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Rooms(), theFacilitiesPackage.getRoom(), null, "rooms", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Campaigns(), theOrderingPackage.getCampaign(), null, "campaigns", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Keys(), theFacilitiesPackage.getKey(), null, "keys", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Doors(), theFacilitiesPackage.getDoor(), null, "doors", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_EmployeeAreas(), theFacilitiesPackage.getEmployeeArea(), null, "employeeAreas", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Subcontractors(), thePersonnelPackage.getSubcontractor(), null, "subcontractors", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Customers(), theClientsPackage.getCustomer(), null, "customers", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Guests(), theClientsPackage.getGuest(), null, "guests", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Employees(), thePersonnelPackage.getEmployee(), null, "employees", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_ServiceBlueprints(), theServicesPackage.getServiceBlueprint(), null, "serviceBlueprints", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_RoomPrototypes(), theFacilitiesPackage.getRoomPrototype(), null, "roomPrototypes", null, 0, -1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_AccessLog(), theFacilitiesPackage.getAccessLog(), null, "accessLog", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_TaskLog(), theLogPackage.getTaskLog(), null, "taskLog", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Blacklist(), theBlacklistPackage.getBlacklist(), null, "blacklist", null, 1, 1, Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl <em>Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.impl.HotelImpl
		 * @see sechalmersmdsdgroup5.hotel.impl.HotelPackageImpl#getHotel()
		 * @generated
		 */
		public static final EClass HOTEL = eINSTANCE.getHotel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOTEL__NAME = eINSTANCE.getHotel_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute HOTEL__LOCATION = eINSTANCE.getHotel_Location();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__ORDERS = eINSTANCE.getHotel_Orders();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__ROOMS = eINSTANCE.getHotel_Rooms();

		/**
		 * The meta object literal for the '<em><b>Campaigns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__CAMPAIGNS = eINSTANCE.getHotel_Campaigns();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__KEYS = eINSTANCE.getHotel_Keys();

		/**
		 * The meta object literal for the '<em><b>Doors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__DOORS = eINSTANCE.getHotel_Doors();

		/**
		 * The meta object literal for the '<em><b>Employee Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__EMPLOYEE_AREAS = eINSTANCE.getHotel_EmployeeAreas();

		/**
		 * The meta object literal for the '<em><b>Subcontractors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__SUBCONTRACTORS = eINSTANCE.getHotel_Subcontractors();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__CUSTOMERS = eINSTANCE.getHotel_Customers();

		/**
		 * The meta object literal for the '<em><b>Guests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__GUESTS = eINSTANCE.getHotel_Guests();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__EMPLOYEES = eINSTANCE.getHotel_Employees();

		/**
		 * The meta object literal for the '<em><b>Service Blueprints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__SERVICE_BLUEPRINTS = eINSTANCE.getHotel_ServiceBlueprints();

		/**
		 * The meta object literal for the '<em><b>Room Prototypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__ROOM_PROTOTYPES = eINSTANCE.getHotel_RoomPrototypes();

		/**
		 * The meta object literal for the '<em><b>Access Log</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__ACCESS_LOG = eINSTANCE.getHotel_AccessLog();

		/**
		 * The meta object literal for the '<em><b>Task Log</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__TASK_LOG = eINSTANCE.getHotel_TaskLog();

		/**
		 * The meta object literal for the '<em><b>Blacklist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference HOTEL__BLACKLIST = eINSTANCE.getHotel_Blacklist();

	}

} //HotelPackageImpl
