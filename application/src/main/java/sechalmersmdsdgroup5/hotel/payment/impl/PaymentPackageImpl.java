/**
 */
package sechalmersmdsdgroup5.hotel.payment.impl;

import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistPackageImpl;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientsPackageImpl;
import sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl;
import sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesPackageImpl;
import sechalmersmdsdgroup5.hotel.impl.HotelPackageImpl;
import sechalmersmdsdgroup5.hotel.inventory.impl.InventoryPackageImpl;
import sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl;
import sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl;
import sechalmersmdsdgroup5.hotel.payment.*;
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
 * @see sechalmersmdsdgroup5.hotel.payment.PaymentFactory
 * @model kind="package"
 * @generated
 */
public class PaymentPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "payment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///sechalmersmdsdgroup5/hotel/payment.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sechalmersmdsdgroup5.hotel.payment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PaymentPackageImpl eINSTANCE = sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.payment.impl.CreditCardImpl <em>Credit Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.payment.impl.CreditCardImpl
	 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl#getCreditCard()
	 * @generated
	 */
	public static final int CREDIT_CARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_CARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_CARD__EXPIRY_MONTH = 1;

	/**
	 * The feature id for the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_CARD__EXPIRY_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_CARD__NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_CARD__CCV = 4;

	/**
	 * The number of structural features of the '<em>Credit Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_CARD_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.payment.IPayment <em>IPayment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.payment.IPayment
	 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl#getIPayment()
	 * @generated
	 */
	public static final int IPAYMENT = 1;

	/**
	 * The number of structural features of the '<em>IPayment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IPAYMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.payment.Payable <em>Payable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.payment.Payable
	 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl#getPayable()
	 * @generated
	 */
	public static final int PAYABLE = 2;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PAYABLE__INVOICE = 0;

	/**
	 * The number of structural features of the '<em>Payable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PAYABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.payment.PaymentMethod <em>Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.payment.PaymentMethod
	 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl#getPaymentMethod()
	 * @generated
	 */
	public static final int PAYMENT_METHOD = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPaymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentMethodEEnum = null;

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
	 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaymentPackageImpl() {
		super(eNS_URI, ((EFactory)PaymentFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link PaymentPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PaymentPackageImpl init() {
		if (isInited) return (PaymentPackageImpl)EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI);

		// Obtain or create and register package
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PaymentPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelPackageImpl theHotelPackage = (HotelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) instanceof HotelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) : HotelPackageImpl.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) : FacilitiesPackageImpl.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) : ServicesPackageImpl.eINSTANCE);
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
		thePaymentPackage.createPackageContents();
		theHotelPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theServicesPackage.createPackageContents();
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
		thePaymentPackage.initializePackageContents();
		theHotelPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
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
		thePaymentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaymentPackageImpl.eNS_URI, thePaymentPackage);
		return thePaymentPackage;
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.CreditCard
	 * @generated
	 */
	public EClass getCreditCard() {
		return creditCardEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.CreditCard#getName()
	 * @see #getCreditCard()
	 * @generated
	 */
	public EAttribute getCreditCard_Name() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getExpiryMonth <em>Expiry Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Month</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.CreditCard#getExpiryMonth()
	 * @see #getCreditCard()
	 * @generated
	 */
	public EAttribute getCreditCard_ExpiryMonth() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getExpiryYear <em>Expiry Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Year</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.CreditCard#getExpiryYear()
	 * @see #getCreditCard()
	 * @generated
	 */
	public EAttribute getCreditCard_ExpiryYear() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.CreditCard#getNumber()
	 * @see #getCreditCard()
	 * @generated
	 */
	public EAttribute getCreditCard_Number() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.CreditCard#getCcv()
	 * @see #getCreditCard()
	 * @generated
	 */
	public EAttribute getCreditCard_Ccv() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.payment.IPayment <em>IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPayment</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.IPayment
	 * @generated
	 */
	public EClass getIPayment() {
		return iPaymentEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.payment.Payable <em>Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payable</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.Payable
	 * @generated
	 */
	public EClass getPayable() {
		return payableEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link sechalmersmdsdgroup5.hotel.payment.Payable#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoice</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.Payable#getInvoice()
	 * @see #getPayable()
	 * @generated
	 */
	public EReference getPayable_Invoice() {
		return (EReference)payableEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for enum '{@link sechalmersmdsdgroup5.hotel.payment.PaymentMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method</em>'.
	 * @see sechalmersmdsdgroup5.hotel.payment.PaymentMethod
	 * @generated
	 */
	public EEnum getPaymentMethod() {
		return paymentMethodEEnum;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PaymentFactory getPaymentFactory() {
		return (PaymentFactory)getEFactoryInstance();
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
		creditCardEClass = createEClass(CREDIT_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__NAME);
		createEAttribute(creditCardEClass, CREDIT_CARD__EXPIRY_MONTH);
		createEAttribute(creditCardEClass, CREDIT_CARD__EXPIRY_YEAR);
		createEAttribute(creditCardEClass, CREDIT_CARD__NUMBER);
		createEAttribute(creditCardEClass, CREDIT_CARD__CCV);

		iPaymentEClass = createEClass(IPAYMENT);

		payableEClass = createEClass(PAYABLE);
		createEReference(payableEClass, PAYABLE__INVOICE);

		// Create enums
		paymentMethodEEnum = createEEnum(PAYMENT_METHOD);
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
		ClientsPackageImpl theClientsPackage = (ClientsPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI);
		OrderingPackageImpl theOrderingPackage = (OrderingPackageImpl)EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(creditCardEClass, CreditCard.class, "CreditCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditCard_Name(), ecorePackage.getEString(), "name", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_ExpiryMonth(), ecorePackage.getEInt(), "expiryMonth", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_ExpiryYear(), ecorePackage.getEInt(), "expiryYear", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_Number(), ecorePackage.getEString(), "number", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_Ccv(), ecorePackage.getEInt(), "ccv", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iPaymentEClass, IPayment.class, "IPayment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(iPaymentEClass, ecorePackage.getEBoolean(), "verifyPaymentInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCreditCard(), "paymentInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iPaymentEClass, null, "debit", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPayable(), "invoicable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iPaymentEClass, null, "debit", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPayable(), "invoicable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theClientsPackage.getClient(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iPaymentEClass, null, "printReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPayable(), "invoicable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(payableEClass, Payable.class, "Payable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPayable_Invoice(), theOrderingPackage.getInvoice(), null, "invoice", null, 0, -1, Payable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(payableEClass, ecorePackage.getEDouble(), "totalPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(payableEClass, ecorePackage.getEBoolean(), "isPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(paymentMethodEEnum, PaymentMethod.class, "PaymentMethod");
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
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.payment.impl.CreditCardImpl <em>Credit Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.payment.impl.CreditCardImpl
		 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl#getCreditCard()
		 * @generated
		 */
		public static final EClass CREDIT_CARD = eINSTANCE.getCreditCard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CREDIT_CARD__NAME = eINSTANCE.getCreditCard_Name();

		/**
		 * The meta object literal for the '<em><b>Expiry Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CREDIT_CARD__EXPIRY_MONTH = eINSTANCE.getCreditCard_ExpiryMonth();

		/**
		 * The meta object literal for the '<em><b>Expiry Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CREDIT_CARD__EXPIRY_YEAR = eINSTANCE.getCreditCard_ExpiryYear();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CREDIT_CARD__NUMBER = eINSTANCE.getCreditCard_Number();

		/**
		 * The meta object literal for the '<em><b>Ccv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CREDIT_CARD__CCV = eINSTANCE.getCreditCard_Ccv();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.payment.IPayment <em>IPayment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.payment.IPayment
		 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl#getIPayment()
		 * @generated
		 */
		public static final EClass IPAYMENT = eINSTANCE.getIPayment();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.payment.Payable <em>Payable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.payment.Payable
		 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl#getPayable()
		 * @generated
		 */
		public static final EClass PAYABLE = eINSTANCE.getPayable();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PAYABLE__INVOICE = eINSTANCE.getPayable_Invoice();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.payment.PaymentMethod <em>Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.payment.PaymentMethod
		 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl#getPaymentMethod()
		 * @generated
		 */
		public static final EEnum PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

	}

} //PaymentPackageImpl
