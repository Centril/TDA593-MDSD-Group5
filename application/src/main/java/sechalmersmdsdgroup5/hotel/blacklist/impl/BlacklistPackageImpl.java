/**
 */
package sechalmersmdsdgroup5.hotel.blacklist.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import sechalmersmdsdgroup5.hotel.blacklist.Blacklist;
import sechalmersmdsdgroup5.hotel.blacklist.BlacklistFactory;
import sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem;
import sechalmersmdsdgroup5.hotel.blacklist.IBlacklist;

import sechalmersmdsdgroup5.hotel.clients.impl.ClientsPackageImpl;

import sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl;

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
 * @see sechalmersmdsdgroup5.hotel.blacklist.BlacklistFactory
 * @model kind="package"
 * @generated
 */
public class BlacklistPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "blacklist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///sechalmersmdsdgroup5/hotel/blacklist.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sechalmersmdsdgroup5.hotel.blacklist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BlacklistPackageImpl eINSTANCE = sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl.init();

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistImpl <em>Blacklist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistImpl
	 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl#getBlacklist()
	 * @generated
	 */
	public static final int BLACKLIST = 2;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistItemImpl
	 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl#getBlacklistItem()
	 * @generated
	 */
	public static final int BLACKLIST_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BLACKLIST_ITEM__IDENTITY = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BLACKLIST_ITEM__REASON = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BLACKLIST_ITEM__DATE = 2;

	/**
	 * The feature id for the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BLACKLIST_ITEM__EXPIRY = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BLACKLIST_ITEM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.blacklist.IBlacklist <em>IBlacklist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.blacklist.IBlacklist
	 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl#getIBlacklist()
	 * @generated
	 */
	public static final int IBLACKLIST = 1;

	/**
	 * The number of structural features of the '<em>IBlacklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IBLACKLIST_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BLACKLIST__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Blacklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BLACKLIST_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blacklistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blacklistItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBlacklistEClass = null;

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
	 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BlacklistPackageImpl() {
		super(eNS_URI, ((EFactory)BlacklistFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link BlacklistPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BlacklistPackageImpl init() {
		if (isInited) return (BlacklistPackageImpl)EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI);

		// Obtain or create and register package
		BlacklistPackageImpl theBlacklistPackage = (BlacklistPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BlacklistPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BlacklistPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelPackageImpl theHotelPackage = (HotelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) instanceof HotelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) : HotelPackageImpl.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) : FacilitiesPackageImpl.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) : ServicesPackageImpl.eINSTANCE);
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) : PaymentPackageImpl.eINSTANCE);
		ClientsPackageImpl theClientsPackage = (ClientsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) instanceof ClientsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) : ClientsPackageImpl.eINSTANCE);
		IdentitiesPackageImpl theIdentitiesPackage = (IdentitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) instanceof IdentitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) : IdentitiesPackageImpl.eINSTANCE);
		OrderingPackageImpl theOrderingPackage = (OrderingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI) instanceof OrderingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI) : OrderingPackageImpl.eINSTANCE);
		PersonnelPackageImpl thePersonnelPackage = (PersonnelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI) instanceof PersonnelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI) : PersonnelPackageImpl.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) : SchedulePackageImpl.eINSTANCE);
		LogPackageImpl theLogPackage = (LogPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) instanceof LogPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) : LogPackageImpl.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) : InventoryPackageImpl.eINSTANCE);
		SearchPackageImpl theSearchPackage = (SearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) instanceof SearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) : SearchPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theBlacklistPackage.createPackageContents();
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
		theInventoryPackage.createPackageContents();
		theSearchPackage.createPackageContents();

		// Initialize created meta-data
		theBlacklistPackage.initializePackageContents();
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
		theInventoryPackage.initializePackageContents();
		theSearchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBlacklistPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BlacklistPackageImpl.eNS_URI, theBlacklistPackage);
		return theBlacklistPackage;
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.blacklist.Blacklist <em>Blacklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blacklist</em>'.
	 * @see sechalmersmdsdgroup5.hotel.blacklist.Blacklist
	 * @generated
	 */
	public EClass getBlacklist() {
		return blacklistEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.blacklist.Blacklist#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see sechalmersmdsdgroup5.hotel.blacklist.Blacklist#getItems()
	 * @see #getBlacklist()
	 * @generated
	 */
	public EReference getBlacklist_Items() {
		return (EReference)blacklistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem
	 * @generated
	 */
	public EClass getBlacklistItem() {
		return blacklistItemEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identity</em>'.
	 * @see sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getIdentity()
	 * @see #getBlacklistItem()
	 * @generated
	 */
	public EReference getBlacklistItem_Identity() {
		return (EReference)blacklistItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getReason()
	 * @see #getBlacklistItem()
	 * @generated
	 */
	public EAttribute getBlacklistItem_Reason() {
		return (EAttribute)blacklistItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getDate()
	 * @see #getBlacklistItem()
	 * @generated
	 */
	public EAttribute getBlacklistItem_Date() {
		return (EAttribute)blacklistItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getExpiry <em>Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry</em>'.
	 * @see sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem#getExpiry()
	 * @see #getBlacklistItem()
	 * @generated
	 */
	public EAttribute getBlacklistItem_Expiry() {
		return (EAttribute)blacklistItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.blacklist.IBlacklist <em>IBlacklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBlacklist</em>'.
	 * @see sechalmersmdsdgroup5.hotel.blacklist.IBlacklist
	 * @generated
	 */
	public EClass getIBlacklist() {
		return iBlacklistEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public BlacklistFactory getBlacklistFactory() {
		return (BlacklistFactory)getEFactoryInstance();
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
		blacklistItemEClass = createEClass(BLACKLIST_ITEM);
		createEReference(blacklistItemEClass, BLACKLIST_ITEM__IDENTITY);
		createEAttribute(blacklistItemEClass, BLACKLIST_ITEM__REASON);
		createEAttribute(blacklistItemEClass, BLACKLIST_ITEM__DATE);
		createEAttribute(blacklistItemEClass, BLACKLIST_ITEM__EXPIRY);

		iBlacklistEClass = createEClass(IBLACKLIST);

		blacklistEClass = createEClass(BLACKLIST);
		createEReference(blacklistEClass, BLACKLIST__ITEMS);
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
		IdentitiesPackageImpl theIdentitiesPackage = (IdentitiesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(blacklistItemEClass, BlacklistItem.class, "BlacklistItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlacklistItem_Identity(), theIdentitiesPackage.getIdentity(), null, "identity", null, 1, 1, BlacklistItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBlacklistItem_Reason(), ecorePackage.getEString(), "reason", null, 1, 1, BlacklistItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBlacklistItem_Date(), ecorePackage.getEDate(), "date", null, 1, 1, BlacklistItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBlacklistItem_Expiry(), ecorePackage.getEDate(), "expiry", null, 1, 1, BlacklistItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBlacklistEClass, IBlacklist.class, "IBlacklist", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(iBlacklistEClass, null, "addToBlackList", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theIdentitiesPackage.getIdentity(), "identity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "reason", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBlacklistEClass, null, "removeFromBlackList", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theIdentitiesPackage.getIdentity(), "identity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iBlacklistEClass, ecorePackage.getEString(), "getBlacklistReason", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theIdentitiesPackage.getIdentity(), "identity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(blacklistEClass, Blacklist.class, "Blacklist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlacklist_Items(), this.getBlacklistItem(), null, "items", null, 0, -1, Blacklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistImpl <em>Blacklist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistImpl
		 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl#getBlacklist()
		 * @generated
		 */
		public static final EClass BLACKLIST = eINSTANCE.getBlacklist();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BLACKLIST__ITEMS = eINSTANCE.getBlacklist_Items();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistItemImpl
		 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl#getBlacklistItem()
		 * @generated
		 */
		public static final EClass BLACKLIST_ITEM = eINSTANCE.getBlacklistItem();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BLACKLIST_ITEM__IDENTITY = eINSTANCE.getBlacklistItem_Identity();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BLACKLIST_ITEM__REASON = eINSTANCE.getBlacklistItem_Reason();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BLACKLIST_ITEM__DATE = eINSTANCE.getBlacklistItem_Date();

		/**
		 * The meta object literal for the '<em><b>Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BLACKLIST_ITEM__EXPIRY = eINSTANCE.getBlacklistItem_Expiry();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.blacklist.IBlacklist <em>IBlacklist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.blacklist.IBlacklist
		 * @see sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl#getIBlacklist()
		 * @generated
		 */
		public static final EClass IBLACKLIST = eINSTANCE.getIBlacklist();

	}

} //BlacklistPackageImpl
