/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl;

import sechalmersmdsdgroup5.hotel.clients.impl.ClientsPackageImpl;

import sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl;

import sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesPackageImpl;

import sechalmersmdsdgroup5.hotel.impl.HotelPackageImpl;

import sechalmersmdsdgroup5.hotel.inventory.impl.InventoryPackageImpl;

import sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl;

import sechalmersmdsdgroup5.hotel.ordering.Campaign;
import sechalmersmdsdgroup5.hotel.ordering.ICheckInCheckOut;
import sechalmersmdsdgroup5.hotel.ordering.IOrder;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.OrderingFactory;
import sechalmersmdsdgroup5.hotel.ordering.OrdinaryPreOrder;
import sechalmersmdsdgroup5.hotel.ordering.PackagePreOrder;
import sechalmersmdsdgroup5.hotel.ordering.PreBooking;
import sechalmersmdsdgroup5.hotel.ordering.PreOrder;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;

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
 * @see sechalmersmdsdgroup5.hotel.ordering.OrderingFactory
 * @model kind="package"
 * @generated
 */
public class OrderingPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ordering";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///sechalmersmdsdgroup5/hotel/ordering.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sechalmersmdsdgroup5.hotel.ordering";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrderingPackageImpl eINSTANCE = sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl.init();

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getOrder()
	 * @generated
	 */
	public static final int ORDER = 0;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDER__INVOICE = PaymentPackageImpl.PAYABLE__INVOICE;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDER__CAMPAIGNS = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDER__BOOKINGS = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDER__CREATION_DATE = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDER_FEATURE_COUNT = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.CampaignImpl <em>Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.CampaignImpl
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getCampaign()
	 * @generated
	 */
	public static final int CAMPAIGN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAMPAIGN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAMPAIGN__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAMPAIGN__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAMPAIGN__END_DATE = 3;

	/**
	 * The number of structural features of the '<em>Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CAMPAIGN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreOrderImpl <em>Pre Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.PreOrderImpl
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getPreOrder()
	 * @generated
	 */
	public static final int PRE_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_ORDER__BOOKINGS = 0;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_ORDER__CAMPAIGNS = 1;

	/**
	 * The number of structural features of the '<em>Pre Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_ORDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreBookingImpl <em>Pre Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.PreBookingImpl
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getPreBooking()
	 * @generated
	 */
	public static final int PRE_BOOKING = 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_BOOKING__START_DATE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_BOOKING__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Will Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_BOOKING__WILL_BOOK = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_BOOKING__SERVICES = 3;

	/**
	 * The number of structural features of the '<em>Pre Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRE_BOOKING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.InvoiceImpl
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getInvoice()
	 * @generated
	 */
	public static final int INVOICE = 9;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.IOrder <em>IOrder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.IOrder
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getIOrder()
	 * @generated
	 */
	public static final int IORDER = 5;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.ICheckInCheckOut <em>ICheck In Check Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.ICheckInCheckOut
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getICheckInCheckOut()
	 * @generated
	 */
	public static final int ICHECK_IN_CHECK_OUT = 6;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrdinaryPreOrderImpl <em>Ordinary Pre Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrdinaryPreOrderImpl
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getOrdinaryPreOrder()
	 * @generated
	 */
	public static final int ORDINARY_PRE_ORDER = 7;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.PackagePreOrderImpl <em>Package Pre Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.PackagePreOrderImpl
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getPackagePreOrder()
	 * @generated
	 */
	public static final int PACKAGE_PRE_ORDER = 8;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl <em>Room Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getRoomBooking()
	 * @generated
	 */
	public static final int ROOM_BOOKING = 4;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING__INVOICE = PaymentPackageImpl.PAYABLE__INVOICE;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING__START_DATE = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING__END_DATE = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Checkin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING__CHECKIN_TIME = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Checkout Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING__CHECKOUT_TIME = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Booked Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING__BOOKED_ROOM = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING__IS_PAID = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING__GUESTS = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING__SERVICES = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Room Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_BOOKING_FEATURE_COUNT = PaymentPackageImpl.PAYABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>IOrder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IORDER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>ICheck In Check Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ICHECK_IN_CHECK_OUT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDINARY_PRE_ORDER__BOOKINGS = PRE_ORDER__BOOKINGS;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDINARY_PRE_ORDER__CAMPAIGNS = PRE_ORDER__CAMPAIGNS;

	/**
	 * The number of structural features of the '<em>Ordinary Pre Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ORDINARY_PRE_ORDER_FEATURE_COUNT = PRE_ORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_PRE_ORDER__BOOKINGS = PRE_ORDER__BOOKINGS;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_PRE_ORDER__CAMPAIGNS = PRE_ORDER__CAMPAIGNS;

	/**
	 * The number of structural features of the '<em>Package Pre Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_PRE_ORDER_FEATURE_COUNT = PRE_ORDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INVOICE__IS_PAID = 0;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INVOICE__EXPIRY_DATE = 1;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INVOICE__TOTAL_PRICE = 2;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INVOICE_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass campaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCheckInCheckOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinaryPreOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packagePreOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomBookingEClass = null;

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
	 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrderingPackageImpl() {
		super(eNS_URI, ((EFactory)OrderingFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link OrderingPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrderingPackageImpl init() {
		if (isInited) return (OrderingPackageImpl)EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI);

		// Obtain or create and register package
		OrderingPackageImpl theOrderingPackage = (OrderingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrderingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrderingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelPackageImpl theHotelPackage = (HotelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) instanceof HotelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) : HotelPackageImpl.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) : FacilitiesPackageImpl.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) : ServicesPackageImpl.eINSTANCE);
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) : PaymentPackageImpl.eINSTANCE);
		ClientsPackageImpl theClientsPackage = (ClientsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) instanceof ClientsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) : ClientsPackageImpl.eINSTANCE);
		IdentitiesPackageImpl theIdentitiesPackage = (IdentitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) instanceof IdentitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) : IdentitiesPackageImpl.eINSTANCE);
		PersonnelPackageImpl thePersonnelPackage = (PersonnelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI) instanceof PersonnelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI) : PersonnelPackageImpl.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) : SchedulePackageImpl.eINSTANCE);
		LogPackageImpl theLogPackage = (LogPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) instanceof LogPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) : LogPackageImpl.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) : InventoryPackageImpl.eINSTANCE);
		SearchPackageImpl theSearchPackage = (SearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) instanceof SearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) : SearchPackageImpl.eINSTANCE);
		BlacklistPackageImpl theBlacklistPackage = (BlacklistPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) instanceof BlacklistPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) : BlacklistPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theOrderingPackage.createPackageContents();
		theHotelPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theClientsPackage.createPackageContents();
		theIdentitiesPackage.createPackageContents();
		thePersonnelPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theLogPackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theSearchPackage.createPackageContents();
		theBlacklistPackage.createPackageContents();

		// Initialize created meta-data
		theOrderingPackage.initializePackageContents();
		theHotelPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theClientsPackage.initializePackageContents();
		theIdentitiesPackage.initializePackageContents();
		thePersonnelPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theLogPackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theSearchPackage.initializePackageContents();
		theBlacklistPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrderingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrderingPackageImpl.eNS_URI, theOrderingPackage);
		return theOrderingPackage;
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Order
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.ordering.Order#getCampaigns <em>Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Campaigns</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Order#getCampaigns()
	 * @see #getOrder()
	 * @generated
	 */
	public EReference getOrder_Campaigns() {
		return (EReference)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.ordering.Order#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookings</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Order#getBookings()
	 * @see #getOrder()
	 * @generated
	 */
	public EReference getOrder_Bookings() {
		return (EReference)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.Order#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Order#getCreationDate()
	 * @see #getOrder()
	 * @generated
	 */
	public EAttribute getOrder_CreationDate() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.Campaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Campaign
	 * @generated
	 */
	public EClass getCampaign() {
		return campaignEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.Campaign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Campaign#getName()
	 * @see #getCampaign()
	 * @generated
	 */
	public EAttribute getCampaign_Name() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.Campaign#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Campaign#getDescription()
	 * @see #getCampaign()
	 * @generated
	 */
	public EAttribute getCampaign_Description() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.Campaign#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Campaign#getStartDate()
	 * @see #getCampaign()
	 * @generated
	 */
	public EAttribute getCampaign_StartDate() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.Campaign#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Campaign#getEndDate()
	 * @see #getCampaign()
	 * @generated
	 */
	public EAttribute getCampaign_EndDate() {
		return (EAttribute)campaignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.PreOrder <em>Pre Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Order</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.PreOrder
	 * @generated
	 */
	public EClass getPreOrder() {
		return preOrderEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link sechalmersmdsdgroup5.hotel.ordering.PreOrder#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bookings</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.PreOrder#getBookings()
	 * @see #getPreOrder()
	 * @generated
	 */
	public EReference getPreOrder_Bookings() {
		return (EReference)preOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.ordering.PreOrder#getCampaigns <em>Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Campaigns</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.PreOrder#getCampaigns()
	 * @see #getPreOrder()
	 * @generated
	 */
	public EReference getPreOrder_Campaigns() {
		return (EReference)preOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking <em>Pre Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Booking</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.PreBooking
	 * @generated
	 */
	public EClass getPreBooking() {
		return preBookingEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.PreBooking#getStartDate()
	 * @see #getPreBooking()
	 * @generated
	 */
	public EAttribute getPreBooking_StartDate() {
		return (EAttribute)preBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.PreBooking#getEndDate()
	 * @see #getPreBooking()
	 * @generated
	 */
	public EAttribute getPreBooking_EndDate() {
		return (EAttribute)preBookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getWillBook <em>Will Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Will Book</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.PreBooking#getWillBook()
	 * @see #getPreBooking()
	 * @generated
	 */
	public EReference getPreBooking_WillBook() {
		return (EReference)preBookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.PreBooking#getServices()
	 * @see #getPreBooking()
	 * @generated
	 */
	public EReference getPreBooking_Services() {
		return (EReference)preBookingEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Invoice
	 * @generated
	 */
	public EClass getInvoice() {
		return invoiceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.Invoice#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Invoice#isPaid()
	 * @see #getInvoice()
	 * @generated
	 */
	public EAttribute getInvoice_IsPaid() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.Invoice#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Invoice#getExpiryDate()
	 * @see #getInvoice()
	 * @generated
	 */
	public EAttribute getInvoice_ExpiryDate() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.Invoice#getTotalPrice <em>Total Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Price</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.Invoice#getTotalPrice()
	 * @see #getInvoice()
	 * @generated
	 */
	public EAttribute getInvoice_TotalPrice() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.IOrder <em>IOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IOrder</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.IOrder
	 * @generated
	 */
	public EClass getIOrder() {
		return iOrderEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.ICheckInCheckOut <em>ICheck In Check Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICheck In Check Out</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.ICheckInCheckOut
	 * @generated
	 */
	public EClass getICheckInCheckOut() {
		return iCheckInCheckOutEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.OrdinaryPreOrder <em>Ordinary Pre Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordinary Pre Order</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.OrdinaryPreOrder
	 * @generated
	 */
	public EClass getOrdinaryPreOrder() {
		return ordinaryPreOrderEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.PackagePreOrder <em>Package Pre Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Pre Order</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.PackagePreOrder
	 * @generated
	 */
	public EClass getPackagePreOrder() {
		return packagePreOrderEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking <em>Room Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Booking</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.RoomBooking
	 * @generated
	 */
	public EClass getRoomBooking() {
		return roomBookingEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getStartDate()
	 * @see #getRoomBooking()
	 * @generated
	 */
	public EAttribute getRoomBooking_StartDate() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getEndDate()
	 * @see #getRoomBooking()
	 * @generated
	 */
	public EAttribute getRoomBooking_EndDate() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getCheckinTime <em>Checkin Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkin Time</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getCheckinTime()
	 * @see #getRoomBooking()
	 * @generated
	 */
	public EAttribute getRoomBooking_CheckinTime() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getCheckoutTime <em>Checkout Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkout Time</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getCheckoutTime()
	 * @see #getRoomBooking()
	 * @generated
	 */
	public EAttribute getRoomBooking_CheckoutTime() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getBookedRoom <em>Booked Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booked Room</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getBookedRoom()
	 * @see #getRoomBooking()
	 * @generated
	 */
	public EReference getRoomBooking_BookedRoom() {
		return (EReference)roomBookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.RoomBooking#isPaid()
	 * @see #getRoomBooking()
	 * @generated
	 */
	public EAttribute getRoomBooking_IsPaid() {
		return (EAttribute)roomBookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guests</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getGuests()
	 * @see #getRoomBooking()
	 * @generated
	 */
	public EReference getRoomBooking_Guests() {
		return (EReference)roomBookingEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getServices()
	 * @see #getRoomBooking()
	 * @generated
	 */
	public EReference getRoomBooking_Services() {
		return (EReference)roomBookingEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public OrderingFactory getOrderingFactory() {
		return (OrderingFactory)getEFactoryInstance();
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
		orderEClass = createEClass(ORDER);
		createEReference(orderEClass, ORDER__CAMPAIGNS);
		createEReference(orderEClass, ORDER__BOOKINGS);
		createEAttribute(orderEClass, ORDER__CREATION_DATE);

		campaignEClass = createEClass(CAMPAIGN);
		createEAttribute(campaignEClass, CAMPAIGN__NAME);
		createEAttribute(campaignEClass, CAMPAIGN__DESCRIPTION);
		createEAttribute(campaignEClass, CAMPAIGN__START_DATE);
		createEAttribute(campaignEClass, CAMPAIGN__END_DATE);

		preOrderEClass = createEClass(PRE_ORDER);
		createEReference(preOrderEClass, PRE_ORDER__BOOKINGS);
		createEReference(preOrderEClass, PRE_ORDER__CAMPAIGNS);

		preBookingEClass = createEClass(PRE_BOOKING);
		createEAttribute(preBookingEClass, PRE_BOOKING__START_DATE);
		createEAttribute(preBookingEClass, PRE_BOOKING__END_DATE);
		createEReference(preBookingEClass, PRE_BOOKING__WILL_BOOK);
		createEReference(preBookingEClass, PRE_BOOKING__SERVICES);

		roomBookingEClass = createEClass(ROOM_BOOKING);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__START_DATE);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__END_DATE);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__CHECKIN_TIME);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__CHECKOUT_TIME);
		createEReference(roomBookingEClass, ROOM_BOOKING__BOOKED_ROOM);
		createEAttribute(roomBookingEClass, ROOM_BOOKING__IS_PAID);
		createEReference(roomBookingEClass, ROOM_BOOKING__GUESTS);
		createEReference(roomBookingEClass, ROOM_BOOKING__SERVICES);

		iOrderEClass = createEClass(IORDER);

		iCheckInCheckOutEClass = createEClass(ICHECK_IN_CHECK_OUT);

		ordinaryPreOrderEClass = createEClass(ORDINARY_PRE_ORDER);

		packagePreOrderEClass = createEClass(PACKAGE_PRE_ORDER);

		invoiceEClass = createEClass(INVOICE);
		createEAttribute(invoiceEClass, INVOICE__IS_PAID);
		createEAttribute(invoiceEClass, INVOICE__EXPIRY_DATE);
		createEAttribute(invoiceEClass, INVOICE__TOTAL_PRICE);
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
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI);
		ClientsPackageImpl theClientsPackage = (ClientsPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI);
		IdentitiesPackageImpl theIdentitiesPackage = (IdentitiesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		orderEClass.getESuperTypes().add(thePaymentPackage.getPayable());
		roomBookingEClass.getESuperTypes().add(thePaymentPackage.getPayable());
		roomBookingEClass.getESuperTypes().add(theServicesPackage.getServiceConsumer());
		ordinaryPreOrderEClass.getESuperTypes().add(this.getPreOrder());
		packagePreOrderEClass.getESuperTypes().add(this.getPreOrder());

		// Initialize classes and features; add operations and parameters
		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrder_Campaigns(), this.getCampaign(), null, "campaigns", null, 0, -1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrder_Bookings(), this.getRoomBooking(), null, "bookings", null, 0, -1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOrder_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(orderEClass, ecorePackage.getEDouble(), "calculatePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(campaignEClass, Campaign.class, "Campaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCampaign_Name(), ecorePackage.getEString(), "name", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_Description(), ecorePackage.getEString(), "description", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCampaign_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(campaignEClass, ecorePackage.getEDouble(), "discount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getOrder(), "order", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(campaignEClass, ecorePackage.getEBoolean(), "appliesTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPreOrder(), "order", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(campaignEClass, ecorePackage.getEBoolean(), "appliesTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "code", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(preOrderEClass, PreOrder.class, "PreOrder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreOrder_Bookings(), this.getPreBooking(), null, "bookings", null, 1, -1, PreOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPreOrder_Campaigns(), this.getCampaign(), null, "campaigns", null, 0, -1, PreOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(preOrderEClass, ecorePackage.getEDouble(), "calculatePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(preBookingEClass, PreBooking.class, "PreBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreBooking_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, PreBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPreBooking_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, PreBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPreBooking_WillBook(), theFacilitiesPackage.getRoom(), null, "willBook", null, 1, 1, PreBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPreBooking_Services(), theServicesPackage.getServiceBlueprint(), null, "services", null, 0, -1, PreBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomBookingEClass, RoomBooking.class, "RoomBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomBooking_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomBooking_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomBooking_CheckinTime(), ecorePackage.getEDate(), "checkinTime", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomBooking_CheckoutTime(), ecorePackage.getEDate(), "checkoutTime", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomBooking_BookedRoom(), theFacilitiesPackage.getRoom(), null, "bookedRoom", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomBooking_IsPaid(), ecorePackage.getEBoolean(), "isPaid", null, 1, 1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomBooking_Guests(), theClientsPackage.getGuest(), null, "guests", null, 1, -1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomBooking_Services(), theServicesPackage.getService(), null, "services", null, 0, -1, RoomBooking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iOrderEClass, IOrder.class, "IOrder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iOrderEClass, this.getRoomBooking(), "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPreBooking(), "preBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theClientsPackage.getGuest(), "guests", 1, -1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iOrderEClass, this.getOrder(), "createOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPreOrder(), "preOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theClientsPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iOrderEClass, ecorePackage.getEBoolean(), "sendConfirmationMail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getOrder(), "order", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iOrderEClass, theClientsPackage.getGuest(), "createGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "age", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iOrderEClass, null, "addGuestToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theClientsPackage.getGuest(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iOrderEClass, null, "addBookingToOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getOrder(), "order", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iOrderEClass, null, "addCustomerToOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theClientsPackage.getCustomer(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getOrder(), "order", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iOrderEClass, ecorePackage.getEBoolean(), "isValidDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCheckInCheckOutEClass, ICheckInCheckOut.class, "ICheckInCheckOut", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iCheckInCheckOutEClass, ecorePackage.getEBoolean(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theClientsPackage.getGuest(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCheckInCheckOutEClass, ecorePackage.getEBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theClientsPackage.getGuest(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCheckInCheckOutEClass, ecorePackage.getEBoolean(), "giveOutKey", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theIdentitiesPackage.getIdentity(), "identity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theFacilitiesPackage.getKey(), "key", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iCheckInCheckOutEClass, ecorePackage.getEBoolean(), "takeBackKey", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theIdentitiesPackage.getIdentity(), "identity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(ordinaryPreOrderEClass, OrdinaryPreOrder.class, "OrdinaryPreOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packagePreOrderEClass, PackagePreOrder.class, "PackagePreOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invoiceEClass, Invoice.class, "Invoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoice_IsPaid(), ecorePackage.getEBoolean(), "isPaid", null, 1, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInvoice_ExpiryDate(), ecorePackage.getEDate(), "expiryDate", null, 1, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInvoice_TotalPrice(), ecorePackage.getEDouble(), "totalPrice", null, 1, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getOrder()
		 * @generated
		 */
		public static final EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Campaigns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORDER__CAMPAIGNS = eINSTANCE.getOrder_Campaigns();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ORDER__BOOKINGS = eINSTANCE.getOrder_Bookings();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ORDER__CREATION_DATE = eINSTANCE.getOrder_CreationDate();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.CampaignImpl <em>Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.CampaignImpl
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getCampaign()
		 * @generated
		 */
		public static final EClass CAMPAIGN = eINSTANCE.getCampaign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CAMPAIGN__NAME = eINSTANCE.getCampaign_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CAMPAIGN__DESCRIPTION = eINSTANCE.getCampaign_Description();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CAMPAIGN__START_DATE = eINSTANCE.getCampaign_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CAMPAIGN__END_DATE = eINSTANCE.getCampaign_EndDate();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreOrderImpl <em>Pre Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.PreOrderImpl
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getPreOrder()
		 * @generated
		 */
		public static final EClass PRE_ORDER = eINSTANCE.getPreOrder();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PRE_ORDER__BOOKINGS = eINSTANCE.getPreOrder_Bookings();

		/**
		 * The meta object literal for the '<em><b>Campaigns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PRE_ORDER__CAMPAIGNS = eINSTANCE.getPreOrder_Campaigns();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreBookingImpl <em>Pre Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.PreBookingImpl
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getPreBooking()
		 * @generated
		 */
		public static final EClass PRE_BOOKING = eINSTANCE.getPreBooking();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRE_BOOKING__START_DATE = eINSTANCE.getPreBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRE_BOOKING__END_DATE = eINSTANCE.getPreBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Will Book</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PRE_BOOKING__WILL_BOOK = eINSTANCE.getPreBooking_WillBook();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PRE_BOOKING__SERVICES = eINSTANCE.getPreBooking_Services();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.InvoiceImpl
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getInvoice()
		 * @generated
		 */
		public static final EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INVOICE__IS_PAID = eINSTANCE.getInvoice_IsPaid();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INVOICE__EXPIRY_DATE = eINSTANCE.getInvoice_ExpiryDate();

		/**
		 * The meta object literal for the '<em><b>Total Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute INVOICE__TOTAL_PRICE = eINSTANCE.getInvoice_TotalPrice();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.IOrder <em>IOrder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.IOrder
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getIOrder()
		 * @generated
		 */
		public static final EClass IORDER = eINSTANCE.getIOrder();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.ICheckInCheckOut <em>ICheck In Check Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.ICheckInCheckOut
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getICheckInCheckOut()
		 * @generated
		 */
		public static final EClass ICHECK_IN_CHECK_OUT = eINSTANCE.getICheckInCheckOut();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrdinaryPreOrderImpl <em>Ordinary Pre Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrdinaryPreOrderImpl
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getOrdinaryPreOrder()
		 * @generated
		 */
		public static final EClass ORDINARY_PRE_ORDER = eINSTANCE.getOrdinaryPreOrder();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.PackagePreOrderImpl <em>Package Pre Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.PackagePreOrderImpl
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getPackagePreOrder()
		 * @generated
		 */
		public static final EClass PACKAGE_PRE_ORDER = eINSTANCE.getPackagePreOrder();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl <em>Room Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl
		 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl#getRoomBooking()
		 * @generated
		 */
		public static final EClass ROOM_BOOKING = eINSTANCE.getRoomBooking();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_BOOKING__START_DATE = eINSTANCE.getRoomBooking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_BOOKING__END_DATE = eINSTANCE.getRoomBooking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Checkin Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_BOOKING__CHECKIN_TIME = eINSTANCE.getRoomBooking_CheckinTime();

		/**
		 * The meta object literal for the '<em><b>Checkout Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_BOOKING__CHECKOUT_TIME = eINSTANCE.getRoomBooking_CheckoutTime();

		/**
		 * The meta object literal for the '<em><b>Booked Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOM_BOOKING__BOOKED_ROOM = eINSTANCE.getRoomBooking_BookedRoom();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROOM_BOOKING__IS_PAID = eINSTANCE.getRoomBooking_IsPaid();

		/**
		 * The meta object literal for the '<em><b>Guests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOM_BOOKING__GUESTS = eINSTANCE.getRoomBooking_Guests();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ROOM_BOOKING__SERVICES = eINSTANCE.getRoomBooking_Services();

	}

} //OrderingPackageImpl
