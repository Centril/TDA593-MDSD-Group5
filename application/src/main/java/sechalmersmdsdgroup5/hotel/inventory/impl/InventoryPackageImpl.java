/**
 */
package sechalmersmdsdgroup5.hotel.inventory.impl;

import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientsPackageImpl;
import sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl;
import sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesPackageImpl;
import sechalmersmdsdgroup5.hotel.impl.HotelPackageImpl;
import sechalmersmdsdgroup5.hotel.inventory.Inventory;
import sechalmersmdsdgroup5.hotel.inventory.InventoryFactory;
import sechalmersmdsdgroup5.hotel.inventory.Product;
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
 * @see sechalmersmdsdgroup5.hotel.inventory.InventoryFactory
 * @model kind="package"
 * @generated
 */
public class InventoryPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "inventory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///sechalmersmdsdgroup5/hotel/inventory.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sechalmersmdsdgroup5.hotel.inventory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InventoryPackageImpl eINSTANCE = sechalmersmdsdgroup5.hotel.inventory.impl.InventoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.inventory.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.inventory.impl.InventoryImpl
	 * @see sechalmersmdsdgroup5.hotel.inventory.impl.InventoryPackageImpl#getInventory()
	 * @generated
	 */
	public static final int INVENTORY = 0;

	/**
	 * The feature id for the '<em><b>Has In Store</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INVENTORY__HAS_IN_STORE = 0;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INVENTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.inventory.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.inventory.impl.ProductImpl
	 * @see sechalmersmdsdgroup5.hotel.inventory.impl.InventoryPackageImpl#getProduct()
	 * @generated
	 */
	public static final int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT__AMOUNT = 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

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
	 * @see sechalmersmdsdgroup5.hotel.inventory.impl.InventoryPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InventoryPackageImpl() {
		super(eNS_URI, ((EFactory)InventoryFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link InventoryPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InventoryPackageImpl init() {
		if (isInited) return (InventoryPackageImpl)EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI);

		// Obtain or create and register package
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InventoryPackageImpl());

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
		BlacklistPackageImpl theBlacklistPackage = (BlacklistPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) instanceof BlacklistPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) : BlacklistPackageImpl.eINSTANCE);
		SearchPackageImpl theSearchPackage = (SearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) instanceof SearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) : SearchPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theInventoryPackage.createPackageContents();
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
		theSearchPackage.createPackageContents();

		// Initialize created meta-data
		theInventoryPackage.initializePackageContents();
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
		theSearchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInventoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InventoryPackageImpl.eNS_URI, theInventoryPackage);
		return theInventoryPackage;
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.inventory.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see sechalmersmdsdgroup5.hotel.inventory.Inventory
	 * @generated
	 */
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link sechalmersmdsdgroup5.hotel.inventory.Inventory#getHasInStore <em>Has In Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has In Store</em>'.
	 * @see sechalmersmdsdgroup5.hotel.inventory.Inventory#getHasInStore()
	 * @see #getInventory()
	 * @generated
	 */
	public EReference getInventory_HasInStore() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.inventory.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see sechalmersmdsdgroup5.hotel.inventory.Product
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.inventory.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sechalmersmdsdgroup5.hotel.inventory.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.inventory.Product#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see sechalmersmdsdgroup5.hotel.inventory.Product#getAmount()
	 * @see #getProduct()
	 * @generated
	 */
	public EAttribute getProduct_Amount() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public InventoryFactory getInventoryFactory() {
		return (InventoryFactory)getEFactoryInstance();
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
		inventoryEClass = createEClass(INVENTORY);
		createEReference(inventoryEClass, INVENTORY__HAS_IN_STORE);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEAttribute(productEClass, PRODUCT__AMOUNT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventory_HasInStore(), this.getProduct(), null, "hasInStore", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProduct_Amount(), ecorePackage.getEString(), "amount", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.inventory.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.inventory.impl.InventoryImpl
		 * @see sechalmersmdsdgroup5.hotel.inventory.impl.InventoryPackageImpl#getInventory()
		 * @generated
		 */
		public static final EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Has In Store</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference INVENTORY__HAS_IN_STORE = eINSTANCE.getInventory_HasInStore();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.inventory.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.inventory.impl.ProductImpl
		 * @see sechalmersmdsdgroup5.hotel.inventory.impl.InventoryPackageImpl#getProduct()
		 * @generated
		 */
		public static final EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRODUCT__AMOUNT = eINSTANCE.getProduct_Amount();

	}

} //InventoryPackageImpl
