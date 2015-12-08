/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import java.util.List;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

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

import sechalmersmdsdgroup5.hotel.personnel.impl.PersonnelPackageImpl;

import sechalmersmdsdgroup5.hotel.schedule.impl.SchedulePackageImpl;

import sechalmersmdsdgroup5.hotel.search.AndSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.ConcreteSearchResult;
import sechalmersmdsdgroup5.hotel.search.ISearch;
import sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.NotSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.OrSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchFactory;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

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
 * @see sechalmersmdsdgroup5.hotel.search.SearchFactory
 * @model kind="package"
 * @generated
 */
public class SearchPackageImpl extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "search";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///sechalmersmdsdgroup5/hotel/search.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "sechalmersmdsdgroup5.hotel.search";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SearchPackageImpl eINSTANCE = sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl.init();

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.search.ISearch <em>ISearch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.search.ISearch
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getISearch()
	 * @generated
	 */
	public static final int ISEARCH = 0;

	/**
	 * The number of structural features of the '<em>ISearch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ISEARCH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.search.SearchResult <em>Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.search.SearchResult
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getSearchResult()
	 * @generated
	 */
	public static final int SEARCH_RESULT = 1;

	/**
	 * The number of structural features of the '<em>Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_RESULT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.search.impl.SearchQueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchQueryImpl
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getSearchQuery()
	 * @generated
	 */
	public static final int SEARCH_QUERY = 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_QUERY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.List <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getList()
	 * @generated
	 */
	public static final int LIST = 3;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.search.SearchCriteria <em>Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.search.SearchCriteria
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getSearchCriteria()
	 * @generated
	 */
	public static final int SEARCH_CRITERIA = 4;

	/**
	 * The number of structural features of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_CRITERIA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.search.impl.ConcreteSearchResultImpl <em>Concrete Search Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.search.impl.ConcreteSearchResultImpl
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getConcreteSearchResult()
	 * @generated
	 */
	public static final int CONCRETE_SEARCH_RESULT = 5;

	/**
	 * The number of structural features of the '<em>Concrete Search Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCRETE_SEARCH_RESULT_FEATURE_COUNT = SEARCH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.search.impl.AndSearchCriteriaImpl <em>And Search Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.search.impl.AndSearchCriteriaImpl
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getAndSearchCriteria()
	 * @generated
	 */
	public static final int AND_SEARCH_CRITERIA = 6;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AND_SEARCH_CRITERIA__LEFT = SEARCH_CRITERIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AND_SEARCH_CRITERIA__RIGHT = SEARCH_CRITERIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Search Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int AND_SEARCH_CRITERIA_FEATURE_COUNT = SEARCH_CRITERIA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.search.impl.OrSearchCriteriaImpl <em>Or Search Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.search.impl.OrSearchCriteriaImpl
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getOrSearchCriteria()
	 * @generated
	 */
	public static final int OR_SEARCH_CRITERIA = 7;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OR_SEARCH_CRITERIA__LEFT = SEARCH_CRITERIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OR_SEARCH_CRITERIA__RIGHT = SEARCH_CRITERIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Or Search Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OR_SEARCH_CRITERIA_FEATURE_COUNT = SEARCH_CRITERIA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.search.impl.NotSearchCriteriaImpl <em>Not Search Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.search.impl.NotSearchCriteriaImpl
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getNotSearchCriteria()
	 * @generated
	 */
	public static final int NOT_SEARCH_CRITERIA = 8;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SEARCH_CRITERIA__CRITERIA = SEARCH_CRITERIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Search Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SEARCH_CRITERIA_FEATURE_COUNT = SEARCH_CRITERIA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl <em>Matches Search Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getMatchesSearchCriteria()
	 * @generated
	 */
	public static final int MATCHES_SEARCH_CRITERIA = 9;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATCHES_SEARCH_CRITERIA__PREDICATE = SEARCH_CRITERIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATCHES_SEARCH_CRITERIA__TRANSFORM = SEARCH_CRITERIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matches Search Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MATCHES_SEARCH_CRITERIA_FEATURE_COUNT = SEARCH_CRITERIA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link java.util.function.UnaryOperator <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.UnaryOperator
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getUnaryOperator()
	 * @generated
	 */
	public static final int UNARY_OPERATOR = 10;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.function.BiPredicate <em>Bi Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.BiPredicate
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getBiPredicate()
	 * @generated
	 */
	public static final int BI_PREDICATE = 11;

	/**
	 * The number of structural features of the '<em>Bi Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BI_PREDICATE_FEATURE_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteSearchResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andSearchCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orSearchCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notSearchCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchesSearchCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biPredicateEClass = null;

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
	 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SearchPackageImpl() {
		super(eNS_URI, ((EFactory)SearchFactory.INSTANCE));
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
	 * <p>This method is used to initialize {@link SearchPackageImpl#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SearchPackageImpl init() {
		if (isInited) return (SearchPackageImpl)EPackage.Registry.INSTANCE.getEPackage(SearchPackageImpl.eNS_URI);

		// Obtain or create and register package
		SearchPackageImpl theSearchPackage = (SearchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SearchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SearchPackageImpl());

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
		LogPackageImpl theLogPackage = (LogPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) instanceof LogPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogPackageImpl.eNS_URI) : LogPackageImpl.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackageImpl.eNS_URI) : InventoryPackageImpl.eINSTANCE);
		BlacklistPackageImpl theBlacklistPackage = (BlacklistPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) instanceof BlacklistPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BlacklistPackageImpl.eNS_URI) : BlacklistPackageImpl.eINSTANCE);

		// Create package meta-data objects
		theSearchPackage.createPackageContents();
		theHotelPackage.createPackageContents();
		theFacilitiesPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theOrderingPackage.createPackageContents();
		theClientsPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theIdentitiesPackage.createPackageContents();
		thePersonnelPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theLogPackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theBlacklistPackage.createPackageContents();

		// Initialize created meta-data
		theSearchPackage.initializePackageContents();
		theHotelPackage.initializePackageContents();
		theFacilitiesPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theOrderingPackage.initializePackageContents();
		theClientsPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theIdentitiesPackage.initializePackageContents();
		thePersonnelPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theLogPackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theBlacklistPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSearchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SearchPackageImpl.eNS_URI, theSearchPackage);
		return theSearchPackage;
	}


	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.search.ISearch <em>ISearch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISearch</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.ISearch
	 * @generated
	 */
	public EClass getISearch() {
		return iSearchEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.search.SearchResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.SearchResult
	 * @generated
	 */
	public EClass getSearchResult() {
		return searchResultEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.search.SearchQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.SearchQuery
	 * @generated
	 */
	public EClass getSearchQuery() {
		return searchQueryEClass;
	}

	/**
	 * Returns the meta object for class '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="LT"
	 * @generated
	 */
	public EClass getList() {
		return listEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.search.SearchCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.SearchCriteria
	 * @generated
	 */
	public EClass getSearchCriteria() {
		return searchCriteriaEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.search.ConcreteSearchResult <em>Concrete Search Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Search Result</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.ConcreteSearchResult
	 * @generated
	 */
	public EClass getConcreteSearchResult() {
		return concreteSearchResultEClass;
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.search.AndSearchCriteria <em>And Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Search Criteria</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.AndSearchCriteria
	 * @generated
	 */
	public EClass getAndSearchCriteria() {
		return andSearchCriteriaEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.search.AndSearchCriteria#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.AndSearchCriteria#getLeft()
	 * @see #getAndSearchCriteria()
	 * @generated
	 */
	public EReference getAndSearchCriteria_Left() {
		return (EReference)andSearchCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.search.AndSearchCriteria#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.AndSearchCriteria#getRight()
	 * @see #getAndSearchCriteria()
	 * @generated
	 */
	public EReference getAndSearchCriteria_Right() {
		return (EReference)andSearchCriteriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.search.OrSearchCriteria <em>Or Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Search Criteria</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.OrSearchCriteria
	 * @generated
	 */
	public EClass getOrSearchCriteria() {
		return orSearchCriteriaEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.search.OrSearchCriteria#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.OrSearchCriteria#getLeft()
	 * @see #getOrSearchCriteria()
	 * @generated
	 */
	public EReference getOrSearchCriteria_Left() {
		return (EReference)orSearchCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.search.OrSearchCriteria#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.OrSearchCriteria#getRight()
	 * @see #getOrSearchCriteria()
	 * @generated
	 */
	public EReference getOrSearchCriteria_Right() {
		return (EReference)orSearchCriteriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.search.NotSearchCriteria <em>Not Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Search Criteria</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.NotSearchCriteria
	 * @generated
	 */
	public EClass getNotSearchCriteria() {
		return notSearchCriteriaEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.search.NotSearchCriteria#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteria</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.NotSearchCriteria#getCriteria()
	 * @see #getNotSearchCriteria()
	 * @generated
	 */
	public EReference getNotSearchCriteria_Criteria() {
		return (EReference)notSearchCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria <em>Matches Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matches Search Criteria</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria
	 * @generated
	 */
	public EClass getMatchesSearchCriteria() {
		return matchesSearchCriteriaEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predicate</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getPredicate()
	 * @see #getMatchesSearchCriteria()
	 * @generated
	 */
	public EReference getMatchesSearchCriteria_Predicate() {
		return (EReference)matchesSearchCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform</em>'.
	 * @see sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria#getTransform()
	 * @see #getMatchesSearchCriteria()
	 * @generated
	 */
	public EReference getMatchesSearchCriteria_Transform() {
		return (EReference)matchesSearchCriteriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link java.util.function.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see java.util.function.UnaryOperator
	 * @model instanceClass="java.util.function.UnaryOperator" typeParameters="UOT"
	 * @generated
	 */
	public EClass getUnaryOperator() {
		return unaryOperatorEClass;
	}

	/**
	 * Returns the meta object for class '{@link java.util.function.BiPredicate <em>Bi Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bi Predicate</em>'.
	 * @see java.util.function.BiPredicate
	 * @model instanceClass="java.util.function.BiPredicate" typeParameters="BPT1 BPT2"
	 * @generated
	 */
	public EClass getBiPredicate() {
		return biPredicateEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SearchFactory getSearchFactory() {
		return (SearchFactory)getEFactoryInstance();
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
		iSearchEClass = createEClass(ISEARCH);

		searchResultEClass = createEClass(SEARCH_RESULT);

		searchQueryEClass = createEClass(SEARCH_QUERY);

		listEClass = createEClass(LIST);

		searchCriteriaEClass = createEClass(SEARCH_CRITERIA);

		concreteSearchResultEClass = createEClass(CONCRETE_SEARCH_RESULT);

		andSearchCriteriaEClass = createEClass(AND_SEARCH_CRITERIA);
		createEReference(andSearchCriteriaEClass, AND_SEARCH_CRITERIA__LEFT);
		createEReference(andSearchCriteriaEClass, AND_SEARCH_CRITERIA__RIGHT);

		orSearchCriteriaEClass = createEClass(OR_SEARCH_CRITERIA);
		createEReference(orSearchCriteriaEClass, OR_SEARCH_CRITERIA__LEFT);
		createEReference(orSearchCriteriaEClass, OR_SEARCH_CRITERIA__RIGHT);

		notSearchCriteriaEClass = createEClass(NOT_SEARCH_CRITERIA);
		createEReference(notSearchCriteriaEClass, NOT_SEARCH_CRITERIA__CRITERIA);

		matchesSearchCriteriaEClass = createEClass(MATCHES_SEARCH_CRITERIA);
		createEReference(matchesSearchCriteriaEClass, MATCHES_SEARCH_CRITERIA__PREDICATE);
		createEReference(matchesSearchCriteriaEClass, MATCHES_SEARCH_CRITERIA__TRANSFORM);

		unaryOperatorEClass = createEClass(UNARY_OPERATOR);

		biPredicateEClass = createEClass(BI_PREDICATE);
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
		OrderingPackageImpl theOrderingPackage = (OrderingPackageImpl)EPackage.Registry.INSTANCE.getEPackage(OrderingPackageImpl.eNS_URI);
		FacilitiesPackageImpl theFacilitiesPackage = (FacilitiesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(FacilitiesPackageImpl.eNS_URI);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ServicesPackageImpl.eNS_URI);

		// Create type parameters
		ETypeParameter searchResultEClass_SRT = addETypeParameter(searchResultEClass, "SRT");
		addETypeParameter(searchQueryEClass, "SRT");
		addETypeParameter(listEClass, "LT");
		addETypeParameter(searchCriteriaEClass, "SRT");
		addETypeParameter(concreteSearchResultEClass, "SRT");
		addETypeParameter(andSearchCriteriaEClass, "SRT");
		addETypeParameter(orSearchCriteriaEClass, "SRT");
		addETypeParameter(notSearchCriteriaEClass, "SRT");
		addETypeParameter(matchesSearchCriteriaEClass, "SRT");
		addETypeParameter(unaryOperatorEClass, "UOT");
		addETypeParameter(biPredicateEClass, "BPT1");
		addETypeParameter(biPredicateEClass, "BPT2");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getSearchResult());
		EGenericType g2 = createEGenericType(searchResultEClass_SRT);
		g1.getETypeArguments().add(g2);
		concreteSearchResultEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSearchCriteria());
//		g2 = createEGenericType(searchCriteriaEClass_SRT);
		g1.getETypeArguments().add(g2);
		andSearchCriteriaEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSearchCriteria());
//		g2 = createEGenericType(searchCriteriaEClass_SRT);
		g1.getETypeArguments().add(g2);
		orSearchCriteriaEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSearchCriteria());
//		g2 = createEGenericType(searchCriteriaEClass_SRT);
		g1.getETypeArguments().add(g2);
		notSearchCriteriaEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSearchCriteria());
//		g2 = createEGenericType(searchCriteriaEClass_SRT);
		g1.getETypeArguments().add(g2);
		matchesSearchCriteriaEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(iSearchEClass, ISearch.class, "ISearch", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(iSearchEClass, null, "searchAvailableOrders", 0, -1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchQuery());
		g2 = createEGenericType(theOrderingPackage.getPreOrder());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "query", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchResult());
		g2 = createEGenericType(theOrderingPackage.getPreOrder());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iSearchEClass, theFacilitiesPackage.getRoom(), "searchAvailableRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "availableFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "availableTo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iSearchEClass, theFacilitiesPackage.getRoom(), "searchOccupiedRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "occupiedFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "occupiedTo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iSearchEClass, theOrderingPackage.getRoomBooking(), "searchActiveBookings", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "activeFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "activeTo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iSearchEClass, theServicesPackage.getService(), "searchUsedServices", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theOrderingPackage.getRoomBooking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iSearchEClass, theServicesPackage.getService(), "searchUsedServices", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theOrderingPackage.getOrder(), "order", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iSearchEClass, theServicesPackage.getServiceBlueprint(), "searchServicesFor", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theFacilitiesPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(iSearchEClass, null, "searchBookingsNotCheckedIn", 0, -1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchQuery());
		g2 = createEGenericType(theOrderingPackage.getRoomBooking());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "query", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchResult());
		g2 = createEGenericType(theOrderingPackage.getRoomBooking());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(iSearchEClass, null, "searchKeycard", 0, -1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchQuery());
		g2 = createEGenericType(theFacilitiesPackage.getKey());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "query", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchResult());
		g2 = createEGenericType(theFacilitiesPackage.getKey());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(searchResultEClass, SearchResult.class, "SearchResult", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(searchResultEClass, null, "getResult", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(searchResultEClass_SRT);
		initEOperation(op, g1);

		addEOperation(searchResultEClass, ecorePackage.getEDouble(), "getRelevance", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(searchResultEClass, null, "withRelevance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "relevance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchResult());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		initEClass(searchQueryEClass, SearchQuery.class, "SearchQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(searchQueryEClass, null, "getCriterias", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getSearchCriteria());
		g2.setEUpperBound(g3);
		EGenericType g4 = createEGenericType();
		g3.getETypeArguments().add(g4);
		EGenericType g5 = createEGenericType(searchResultEClass_SRT);
		g4.setEUpperBound(g5);
		initEOperation(op, g1);

		initEClass(listEClass, List.class, "List", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(searchCriteriaEClass, SearchCriteria.class, "SearchCriteria", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(searchCriteriaEClass, null, "apply", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchResult());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "results", 1, 1, IS_UNIQUE, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchResult());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		initEOperation(op, g1);

		initEClass(concreteSearchResultEClass, ConcreteSearchResult.class, "ConcreteSearchResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andSearchCriteriaEClass, AndSearchCriteria.class, "AndSearchCriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getSearchCriteria());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		initEReference(getAndSearchCriteria_Left(), g1, null, "left", null, 1, 1, AndSearchCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchCriteria());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		initEReference(getAndSearchCriteria_Right(), g1, null, "right", null, 1, 1, AndSearchCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(orSearchCriteriaEClass, OrSearchCriteria.class, "OrSearchCriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getSearchCriteria());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		initEReference(getOrSearchCriteria_Left(), g1, null, "left", null, 1, 1, OrSearchCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(this.getSearchCriteria());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		initEReference(getOrSearchCriteria_Right(), g1, null, "right", null, 1, 1, OrSearchCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notSearchCriteriaEClass, NotSearchCriteria.class, "NotSearchCriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getSearchCriteria());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		initEReference(getNotSearchCriteria_Criteria(), g1, null, "criteria", null, 1, 1, NotSearchCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(matchesSearchCriteriaEClass, MatchesSearchCriteria.class, "MatchesSearchCriteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getUnaryOperator());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		initEReference(getMatchesSearchCriteria_Predicate(), g1, null, "predicate", null, 1, 1, MatchesSearchCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		g1 = createEGenericType(this.getBiPredicate());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(searchResultEClass_SRT);
		g2.setEUpperBound(g3);
		initEReference(getMatchesSearchCriteria_Transform(), g1, null, "transform", null, 1, 1, MatchesSearchCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(biPredicateEClass, BiPredicate.class, "BiPredicate", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
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
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.search.ISearch <em>ISearch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.search.ISearch
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getISearch()
		 * @generated
		 */
		public static final EClass ISEARCH = eINSTANCE.getISearch();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.search.SearchResult <em>Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.search.SearchResult
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getSearchResult()
		 * @generated
		 */
		public static final EClass SEARCH_RESULT = eINSTANCE.getSearchResult();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.search.impl.SearchQueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchQueryImpl
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getSearchQuery()
		 * @generated
		 */
		public static final EClass SEARCH_QUERY = eINSTANCE.getSearchQuery();

		/**
		 * The meta object literal for the '{@link java.util.List <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getList()
		 * @generated
		 */
		public static final EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.search.SearchCriteria <em>Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.search.SearchCriteria
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getSearchCriteria()
		 * @generated
		 */
		public static final EClass SEARCH_CRITERIA = eINSTANCE.getSearchCriteria();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.search.impl.ConcreteSearchResultImpl <em>Concrete Search Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.search.impl.ConcreteSearchResultImpl
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getConcreteSearchResult()
		 * @generated
		 */
		public static final EClass CONCRETE_SEARCH_RESULT = eINSTANCE.getConcreteSearchResult();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.search.impl.AndSearchCriteriaImpl <em>And Search Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.search.impl.AndSearchCriteriaImpl
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getAndSearchCriteria()
		 * @generated
		 */
		public static final EClass AND_SEARCH_CRITERIA = eINSTANCE.getAndSearchCriteria();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AND_SEARCH_CRITERIA__LEFT = eINSTANCE.getAndSearchCriteria_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference AND_SEARCH_CRITERIA__RIGHT = eINSTANCE.getAndSearchCriteria_Right();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.search.impl.OrSearchCriteriaImpl <em>Or Search Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.search.impl.OrSearchCriteriaImpl
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getOrSearchCriteria()
		 * @generated
		 */
		public static final EClass OR_SEARCH_CRITERIA = eINSTANCE.getOrSearchCriteria();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OR_SEARCH_CRITERIA__LEFT = eINSTANCE.getOrSearchCriteria_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference OR_SEARCH_CRITERIA__RIGHT = eINSTANCE.getOrSearchCriteria_Right();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.search.impl.NotSearchCriteriaImpl <em>Not Search Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.search.impl.NotSearchCriteriaImpl
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getNotSearchCriteria()
		 * @generated
		 */
		public static final EClass NOT_SEARCH_CRITERIA = eINSTANCE.getNotSearchCriteria();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NOT_SEARCH_CRITERIA__CRITERIA = eINSTANCE.getNotSearchCriteria_Criteria();

		/**
		 * The meta object literal for the '{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl <em>Matches Search Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getMatchesSearchCriteria()
		 * @generated
		 */
		public static final EClass MATCHES_SEARCH_CRITERIA = eINSTANCE.getMatchesSearchCriteria();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATCHES_SEARCH_CRITERIA__PREDICATE = eINSTANCE.getMatchesSearchCriteria_Predicate();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MATCHES_SEARCH_CRITERIA__TRANSFORM = eINSTANCE.getMatchesSearchCriteria_Transform();

		/**
		 * The meta object literal for the '{@link java.util.function.UnaryOperator <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.UnaryOperator
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getUnaryOperator()
		 * @generated
		 */
		public static final EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link java.util.function.BiPredicate <em>Bi Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.BiPredicate
		 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl#getBiPredicate()
		 * @generated
		 */
		public static final EClass BI_PREDICATE = eINSTANCE.getBiPredicate();

	}

} //SearchPackageImpl
