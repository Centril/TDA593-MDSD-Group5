/**
 */
package sechalmersmdsdgroup5.hotel.personnel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
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

import sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl;

import sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl;

import sechalmersmdsdgroup5.hotel.personnel.Employee;
import sechalmersmdsdgroup5.hotel.personnel.PersonnelFactory;
import sechalmersmdsdgroup5.hotel.personnel.Role;
import sechalmersmdsdgroup5.hotel.personnel.Subcontractor;

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
 * @see sechalmersmdsdgroup5.hotel.personnel.PersonnelFactory
 * @model kind="package"
 * @generated
 */
public class PersonnelPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "personnel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///sechalmersmdsdgroup5/hotel/personnel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sechalmersmdsdgroup5.hotel.personnel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PersonnelPackageImpl eINSTANCE = sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl.init();

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.personnel.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.personnel.impl.EmployeeImpl
	 * @see sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl#getEmployee()
	 * @generated
	 */
	public static final int EMPLOYEE = 0;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE__SCHEDULE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE__KEY = 1;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE__IDENTITY = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE__ROLE = 3;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYEE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.personnel.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.personnel.impl.RoleImpl
	 * @see sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl#getRole()
	 * @generated
	 */
	public static final int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.personnel.impl.SubcontractorImpl <em>Subcontractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.personnel.impl.SubcontractorImpl
	 * @see sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl#getSubcontractor()
	 * @generated
	 */
	public static final int SUBCONTRACTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBCONTRACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Work Beeing Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBCONTRACTOR__WORK_BEEING_DONE = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBCONTRACTOR__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBCONTRACTOR__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBCONTRACTOR__KEY = 4;

	/**
	 * The number of structural features of the '<em>Subcontractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SUBCONTRACTOR_FEATURE_COUNT = 5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subcontractorEClass = null;

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
	 * @see sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PersonnelPackageImpl() {
		super(eNS_URI, ((EFactory)PersonnelFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link PersonnelPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PersonnelPackageImpl init() {
		if (isInited) return (PersonnelPackageImpl)EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI);

		// Obtain or create and register package
		PersonnelPackageImpl thePersonnelPackage = (PersonnelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PersonnelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PersonnelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelPackageImpl theHotelPackage = (HotelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) instanceof HotelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) : HotelPackageImpl.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) : FacilitiesPackageImpl.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) : ServicesPackageImpl.eINSTANCE);
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) : PaymentPackageImpl.eINSTANCE);
		ClientsPackageImpl theClientsPackage = (ClientsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) instanceof ClientsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) : ClientsPackageImpl.eINSTANCE);
		IdentitiesPackageImpl theIdentitiesPackage = (IdentitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) instanceof IdentitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) : IdentitiesPackageImpl.eINSTANCE);
		OrderingPackageImpl theOrderingPackage = (OrderingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI) instanceof OrderingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI) : OrderingPackageImpl.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) : SchedulePackageImpl.eINSTANCE);
		LogPackageImpl theLogPackage = (LogPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) instanceof LogPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) : LogPackageImpl.eINSTANCE);
		BlacklistPackageImpl theBlacklistPackage = (BlacklistPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) instanceof BlacklistPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) : BlacklistPackageImpl.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) : InventoryPackageImpl.eINSTANCE);
		SearchPackageImpl theSearchPackage = (SearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) instanceof SearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) : SearchPackageImpl.eINSTANCE);

		// Create package meta-data objects
		thePersonnelPackage.createPackageContents();
		theHotelPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theClientsPackage.createPackageContents();
		theIdentitiesPackage.createPackageContents();
		theOrderingPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theLogPackage.createPackageContents();
		theBlacklistPackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theSearchPackage.createPackageContents();

		// Initialize created meta-data
		thePersonnelPackage.initializePackageContents();
		theHotelPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theClientsPackage.initializePackageContents();
		theIdentitiesPackage.initializePackageContents();
		theOrderingPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theLogPackage.initializePackageContents();
		theBlacklistPackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theSearchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePersonnelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PersonnelPackageImpl.eNS_URI, thePersonnelPackage);
		return thePersonnelPackage;
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.personnel.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Employee
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.personnel.Employee#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedule</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Employee#getSchedule()
	 * @see #getEmployee()
	 * @generated
	 */
	public EReference getEmployee_Schedule() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.personnel.Employee#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Employee#getKey()
	 * @see #getEmployee()
	 * @generated
	 */
	public EReference getEmployee_Key() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.personnel.Employee#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identity</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Employee#getIdentity()
	 * @see #getEmployee()
	 * @generated
	 */
	public EReference getEmployee_Identity() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.personnel.Employee#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Employee#getRole()
	 * @see #getEmployee()
	 * @generated
	 */
	public EReference getEmployee_Role() {
		return (EReference)employeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.personnel.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Role
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.personnel.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor <em>Subcontractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcontractor</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Subcontractor
	 * @generated
	 */
	public EClass getSubcontractor() {
		return subcontractorEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getName()
	 * @see #getSubcontractor()
	 * @generated
	 */
	public EAttribute getSubcontractor_Name() {
		return (EAttribute)subcontractorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getWorkBeeingDone <em>Work Beeing Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Beeing Done</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getWorkBeeingDone()
	 * @see #getSubcontractor()
	 * @generated
	 */
	public EAttribute getSubcontractor_WorkBeeingDone() {
		return (EAttribute)subcontractorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getStartDate()
	 * @see #getSubcontractor()
	 * @generated
	 */
	public EAttribute getSubcontractor_StartDate() {
		return (EAttribute)subcontractorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getEndDate()
	 * @see #getSubcontractor()
	 * @generated
	 */
	public EAttribute getSubcontractor_EndDate() {
		return (EAttribute)subcontractorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getKey()
	 * @see #getSubcontractor()
	 * @generated
	 */
	public EReference getSubcontractor_Key() {
		return (EReference)subcontractorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public PersonnelFactory getPersonnelFactory() {
		return (PersonnelFactory)getEFactoryInstance();
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
		employeeEClass = createEClass(EMPLOYEE);
		createEReference(employeeEClass, EMPLOYEE__SCHEDULE);
		createEReference(employeeEClass, EMPLOYEE__KEY);
		createEReference(employeeEClass, EMPLOYEE__IDENTITY);
		createEReference(employeeEClass, EMPLOYEE__ROLE);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);

		subcontractorEClass = createEClass(SUBCONTRACTOR);
		createEAttribute(subcontractorEClass, SUBCONTRACTOR__NAME);
		createEAttribute(subcontractorEClass, SUBCONTRACTOR__WORK_BEEING_DONE);
		createEAttribute(subcontractorEClass, SUBCONTRACTOR__START_DATE);
		createEAttribute(subcontractorEClass, SUBCONTRACTOR__END_DATE);
		createEReference(subcontractorEClass, SUBCONTRACTOR__KEY);
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
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI);
		IdentitiesPackageImpl theIdentitiesPackage = (IdentitiesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmployee_Schedule(), theSchedulePackage.getSchedule(), null, "schedule", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmployee_Key(), theFacilitiesPackage.getKey(), null, "key", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmployee_Identity(), theIdentitiesPackage.getRealPerson(), null, "identity", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmployee_Role(), this.getRole(), null, "role", null, 1, 1, Employee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subcontractorEClass, Subcontractor.class, "Subcontractor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubcontractor_Name(), ecorePackage.getEString(), "name", null, 1, 1, Subcontractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubcontractor_WorkBeeingDone(), ecorePackage.getEString(), "workBeeingDone", null, 1, 1, Subcontractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubcontractor_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Subcontractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSubcontractor_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Subcontractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubcontractor_Key(), theFacilitiesPackage.getKey(), null, "key", null, 1, 1, Subcontractor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.personnel.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.personnel.impl.EmployeeImpl
		 * @see sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl#getEmployee()
		 * @generated
		 */
		public static final EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EMPLOYEE__SCHEDULE = eINSTANCE.getEmployee_Schedule();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EMPLOYEE__KEY = eINSTANCE.getEmployee_Key();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EMPLOYEE__IDENTITY = eINSTANCE.getEmployee_Identity();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EMPLOYEE__ROLE = eINSTANCE.getEmployee_Role();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.personnel.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.personnel.impl.RoleImpl
		 * @see sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl#getRole()
		 * @generated
		 */
		public static final EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.personnel.impl.SubcontractorImpl <em>Subcontractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.personnel.impl.SubcontractorImpl
		 * @see sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl#getSubcontractor()
		 * @generated
		 */
		public static final EClass SUBCONTRACTOR = eINSTANCE.getSubcontractor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUBCONTRACTOR__NAME = eINSTANCE.getSubcontractor_Name();

		/**
		 * The meta object literal for the '<em><b>Work Beeing Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUBCONTRACTOR__WORK_BEEING_DONE = eINSTANCE.getSubcontractor_WorkBeeingDone();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUBCONTRACTOR__START_DATE = eINSTANCE.getSubcontractor_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SUBCONTRACTOR__END_DATE = eINSTANCE.getSubcontractor_EndDate();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SUBCONTRACTOR__KEY = eINSTANCE.getSubcontractor_Key();

	}

} //PersonnelPackageImpl
