/**
 */
package sechalmersmdsdgroup5.hotel.log.impl;

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

import sechalmersmdsdgroup5.hotel.log.LogFactory;
import sechalmersmdsdgroup5.hotel.log.TaskItem;
import sechalmersmdsdgroup5.hotel.log.TaskLog;
import sechalmersmdsdgroup5.hotel.log.TaskTag;

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
 * @see sechalmersmdsdgroup5.hotel.log.LogFactory
 * @model kind="package"
 * @generated
 */
public class LogPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "log";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///sechalmersmdsdgroup5/hotel/log.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sechalmersmdsdgroup5.hotel.log";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LogPackageImpl eINSTANCE = sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl.init();

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl <em>Task Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl
	 * @see sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl#getTaskItem()
	 * @generated
	 */
	public static final int TASK_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM__CREATOR = 1;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM__DEADLINE = 2;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM__CREATED_AT = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM__PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM__TAG = 5;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM__RESOLVED = 6;

	/**
	 * The feature id for the '<em><b>Tagged As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM__TAGGED_AS = 7;

	/**
	 * The feature id for the '<em><b>Assignees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM__ASSIGNEES = 8;

	/**
	 * The number of structural features of the '<em>Task Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_ITEM_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.log.impl.TaskTagImpl <em>Task Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.log.impl.TaskTagImpl
	 * @see sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl#getTaskTag()
	 * @generated
	 */
	public static final int TASK_TAG = 1;

	/**
	 * The feature id for the '<em><b>What</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TAG__WHAT = 0;

	/**
	 * The number of structural features of the '<em>Task Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_TAG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.log.impl.TaskLogImpl <em>Task Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.log.impl.TaskLogImpl
	 * @see sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl#getTaskLog()
	 * @generated
	 */
	public static final int TASK_LOG = 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_LOG__TASKS = 0;

	/**
	 * The number of structural features of the '<em>Task Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TASK_LOG_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskLogEClass = null;

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
	 * @see sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogPackageImpl() {
		super(eNS_URI, ((EFactory)LogFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link LogPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogPackageImpl init() {
		if (isInited) return (LogPackageImpl)EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI);

		// Obtain or create and register package
		LogPackageImpl theLogPackage = (LogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HotelPackageImpl theHotelPackage = (HotelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) instanceof HotelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HotelPackageImpl.eNS_URI) : HotelPackageImpl.eINSTANCE);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) instanceof FacilitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI) : FacilitiesPackageImpl.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI) : ServicesPackageImpl.eINSTANCE);
		OrderingPackageImpl theOrderingPackage = (OrderingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI) instanceof OrderingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI) : OrderingPackageImpl.eINSTANCE);
		ClientsPackageImpl theClientsPackage = (ClientsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) instanceof ClientsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClientsPackageImpl.eNS_URI) : ClientsPackageImpl.eINSTANCE);
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackageImpl.eNS_URI) : PaymentPackageImpl.eINSTANCE);
		IdentitiesPackageImpl theIdentitiesPackage = (IdentitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) instanceof IdentitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdentitiesPackageImpl.eNS_URI) : IdentitiesPackageImpl.eINSTANCE);
		PersonnelPackageImpl thePersonnelPackage = (PersonnelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI) instanceof PersonnelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI) : PersonnelPackageImpl.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackageImpl.eNS_URI) : SchedulePackageImpl.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) : InventoryPackageImpl.eINSTANCE);
		SearchPackageImpl theSearchPackage = (SearchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) instanceof SearchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI) : SearchPackageImpl.eINSTANCE);
		BlacklistPackageImpl theBlacklistPackage = (BlacklistPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) instanceof BlacklistPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) : BlacklistPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theLogPackage.createPackageContents();
		theHotelPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theOrderingPackage.createPackageContents();
		theClientsPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theIdentitiesPackage.createPackageContents();
		thePersonnelPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theSearchPackage.createPackageContents();
		theBlacklistPackage.createPackageContents();

		// Initialize created meta-data
		theLogPackage.initializePackageContents();
		theHotelPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theOrderingPackage.initializePackageContents();
		theClientsPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theIdentitiesPackage.initializePackageContents();
		thePersonnelPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theSearchPackage.initializePackageContents();
		theBlacklistPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogPackageImpl.eNS_URI, theLogPackage);
		return theLogPackage;
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.log.TaskItem <em>Task Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Item</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem
	 * @generated
	 */
	public EClass getTaskItem() {
		return taskItemEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem#getDescription()
	 * @see #getTaskItem()
	 * @generated
	 */
	public EAttribute getTaskItem_Description() {
		return (EAttribute)taskItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creator</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem#getCreator()
	 * @see #getTaskItem()
	 * @generated
	 */
	public EReference getTaskItem_Creator() {
		return (EReference)taskItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem#getDeadline()
	 * @see #getTaskItem()
	 * @generated
	 */
	public EAttribute getTaskItem_Deadline() {
		return (EAttribute)taskItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem#getCreatedAt()
	 * @see #getTaskItem()
	 * @generated
	 */
	public EAttribute getTaskItem_CreatedAt() {
		return (EAttribute)taskItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem#getPriority()
	 * @see #getTaskItem()
	 * @generated
	 */
	public EAttribute getTaskItem_Priority() {
		return (EAttribute)taskItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute list '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem#getTag()
	 * @see #getTaskItem()
	 * @generated
	 */
	public EAttribute getTaskItem_Tag() {
		return (EAttribute)taskItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem#getResolved()
	 * @see #getTaskItem()
	 * @generated
	 */
	public EAttribute getTaskItem_Resolved() {
		return (EAttribute)taskItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getTaggedAs <em>Tagged As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged As</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem#getTaggedAs()
	 * @see #getTaskItem()
	 * @generated
	 */
	public EReference getTaskItem_TaggedAs() {
		return (EReference)taskItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the reference list '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getAssignees <em>Assignees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignees</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskItem#getAssignees()
	 * @see #getTaskItem()
	 * @generated
	 */
	public EReference getTaskItem_Assignees() {
		return (EReference)taskItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.log.TaskTag <em>Task Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Tag</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskTag
	 * @generated
	 */
	public EClass getTaskTag() {
		return taskTagEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link sechalmersmdsdgroup5.hotel.log.TaskTag#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>What</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskTag#getWhat()
	 * @see #getTaskTag()
	 * @generated
	 */
	public EAttribute getTaskTag_What() {
		return (EAttribute)taskTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.log.TaskLog <em>Task Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Log</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskLog
	 * @generated
	 */
	public EClass getTaskLog() {
		return taskLogEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link sechalmersmdsdgroup5.hotel.log.TaskLog#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see sechalmersmdsdgroup5.hotel.log.TaskLog#getTasks()
	 * @see #getTaskLog()
	 * @generated
	 */
	public EReference getTaskLog_Tasks() {
		return (EReference)taskLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public LogFactory getLogFactory() {
		return (LogFactory)getEFactoryInstance();
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
		taskItemEClass = createEClass(TASK_ITEM);
		createEAttribute(taskItemEClass, TASK_ITEM__DESCRIPTION);
		createEReference(taskItemEClass, TASK_ITEM__CREATOR);
		createEAttribute(taskItemEClass, TASK_ITEM__DEADLINE);
		createEAttribute(taskItemEClass, TASK_ITEM__CREATED_AT);
		createEAttribute(taskItemEClass, TASK_ITEM__PRIORITY);
		createEAttribute(taskItemEClass, TASK_ITEM__TAG);
		createEAttribute(taskItemEClass, TASK_ITEM__RESOLVED);
		createEReference(taskItemEClass, TASK_ITEM__TAGGED_AS);
		createEReference(taskItemEClass, TASK_ITEM__ASSIGNEES);

		taskTagEClass = createEClass(TASK_TAG);
		createEAttribute(taskTagEClass, TASK_TAG__WHAT);

		taskLogEClass = createEClass(TASK_LOG);
		createEReference(taskLogEClass, TASK_LOG__TASKS);
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
		PersonnelPackageImpl thePersonnelPackage = (PersonnelPackageImpl)EPackage.Registry.INSTANCE.getEPackage(PersonnelPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(taskItemEClass, TaskItem.class, "TaskItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskItem_Description(), ecorePackage.getEString(), "description", null, 1, 1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTaskItem_Creator(), thePersonnelPackage.getEmployee(), null, "creator", null, 1, 1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTaskItem_Deadline(), ecorePackage.getEDate(), "deadline", null, 1, 1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTaskItem_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 1, 1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTaskItem_Priority(), ecorePackage.getEInt(), "priority", null, 1, 1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTaskItem_Tag(), ecorePackage.getEString(), "tag", null, 0, -1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTaskItem_Resolved(), ecorePackage.getEDate(), "resolved", null, 1, 1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTaskItem_TaggedAs(), this.getTaskTag(), null, "taggedAs", null, 0, -1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTaskItem_Assignees(), thePersonnelPackage.getEmployee(), null, "assignees", null, 0, -1, TaskItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(taskTagEClass, TaskTag.class, "TaskTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskTag_What(), ecorePackage.getEString(), "what", null, 1, 1, TaskTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(taskLogEClass, TaskLog.class, "TaskLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskLog_Tasks(), this.getTaskItem(), null, "tasks", null, 0, -1, TaskLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl <em>Task Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl
		 * @see sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl#getTaskItem()
		 * @generated
		 */
		public static final EClass TASK_ITEM = eINSTANCE.getTaskItem();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_ITEM__DESCRIPTION = eINSTANCE.getTaskItem_Description();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_ITEM__CREATOR = eINSTANCE.getTaskItem_Creator();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_ITEM__DEADLINE = eINSTANCE.getTaskItem_Deadline();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_ITEM__CREATED_AT = eINSTANCE.getTaskItem_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_ITEM__PRIORITY = eINSTANCE.getTaskItem_Priority();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_ITEM__TAG = eINSTANCE.getTaskItem_Tag();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_ITEM__RESOLVED = eINSTANCE.getTaskItem_Resolved();

		/**
		 * The meta object literal for the '<em><b>Tagged As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_ITEM__TAGGED_AS = eINSTANCE.getTaskItem_TaggedAs();

		/**
		 * The meta object literal for the '<em><b>Assignees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_ITEM__ASSIGNEES = eINSTANCE.getTaskItem_Assignees();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.log.impl.TaskTagImpl <em>Task Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.log.impl.TaskTagImpl
		 * @see sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl#getTaskTag()
		 * @generated
		 */
		public static final EClass TASK_TAG = eINSTANCE.getTaskTag();

		/**
		 * The meta object literal for the '<em><b>What</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TASK_TAG__WHAT = eINSTANCE.getTaskTag_What();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.log.impl.TaskLogImpl <em>Task Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.log.impl.TaskLogImpl
		 * @see sechalmersmdsdgroup5.hotel.log.impl.LogPackageImpl#getTaskLog()
		 * @generated
		 */
		public static final EClass TASK_LOG = eINSTANCE.getTaskLog();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TASK_LOG__TASKS = eINSTANCE.getTaskLog_Tasks();

	}

} //LogPackageImpl
