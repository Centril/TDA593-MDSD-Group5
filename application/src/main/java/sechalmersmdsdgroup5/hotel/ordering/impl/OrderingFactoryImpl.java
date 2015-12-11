/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sechalmersmdsdgroup5.hotel.ordering.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderingFactoryImpl extends EFactoryImpl implements OrderingFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrderingFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderingFactoryImpl init() {
		try {
			OrderingFactoryImpl theOrderingFactory = (OrderingFactoryImpl)EPackage.Registry.INSTANCE.getEFactory(OrderingPackageImpl.eNS_URI);
			if (theOrderingFactory != null) {
				return theOrderingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrderingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingFactoryImpl() {
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
			case OrderingPackageImpl.ORDER: return (EObject)createOrder();
			case OrderingPackageImpl.CAMPAIGN: return (EObject)createCampaign();
			case OrderingPackageImpl.PRE_BOOKING: return (EObject)createPreBooking();
			case OrderingPackageImpl.ROOM_BOOKING: return (EObject)createRoomBooking();
			case OrderingPackageImpl.ORDINARY_PRE_ORDER: return (EObject)createOrdinaryPreOrder();
			case OrderingPackageImpl.PACKAGE_PRE_ORDER: return (EObject)createPackagePreOrder();
			case OrderingPackageImpl.INVOICE: return (EObject)createInvoice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campaign createCampaign() {
		CampaignImpl campaign = new CampaignImpl();
		return campaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreBooking createPreBooking() {
		PreBookingImpl preBooking = new PreBookingImpl();
		return preBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinaryPreOrder createOrdinaryPreOrder() {
		OrdinaryPreOrderImpl ordinaryPreOrder = new OrdinaryPreOrderImpl();
		return ordinaryPreOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagePreOrder createPackagePreOrder() {
		PackagePreOrderImpl packagePreOrder = new PackagePreOrderImpl();
		return packagePreOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBooking createRoomBooking() {
		RoomBookingImpl roomBooking = new RoomBookingImpl();
		return roomBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingPackageImpl getOrderingPackage() {
		return (OrderingPackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrderingPackageImpl getPackage() {
		return OrderingPackageImpl.eINSTANCE;
	}

} //OrderingFactoryImpl
