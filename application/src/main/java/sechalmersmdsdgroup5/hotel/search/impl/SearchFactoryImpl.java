/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sechalmersmdsdgroup5.hotel.search.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchFactoryImpl extends EFactoryImpl implements SearchFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SearchFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SearchFactoryImpl init() {
		try {
			SearchFactoryImpl theSearchFactory = (SearchFactoryImpl)EPackage.Registry.INSTANCE.getEFactory(SearchPackageImpl.eNS_URI);
			if (theSearchFactory != null) {
				return theSearchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SearchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchFactoryImpl() {
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
			case SearchPackageImpl.SEARCH_QUERY: return (EObject)createSearchQuery();
			case SearchPackageImpl.CONCRETE_SEARCH_RESULT: return (EObject)createConcreteSearchResult();
			case SearchPackageImpl.AND_SEARCH_CRITERIA: return (EObject)createAndSearchCriteria();
			case SearchPackageImpl.OR_SEARCH_CRITERIA: return (EObject)createOrSearchCriteria();
			case SearchPackageImpl.NOT_SEARCH_CRITERIA: return (EObject)createNotSearchCriteria();
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA: return (EObject)createMatchesSearchCriteria();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <SRT> SearchQuery<SRT> createSearchQuery() {
		SearchQueryImpl<SRT> searchQuery = new SearchQueryImpl<SRT>();
		return searchQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <SRT> ConcreteSearchResult<SRT> createConcreteSearchResult() {
		ConcreteSearchResultImpl<SRT> concreteSearchResult = new ConcreteSearchResultImpl<SRT>();
		return concreteSearchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <SRT> AndSearchCriteria<SRT> createAndSearchCriteria() {
		AndSearchCriteriaImpl<SRT> andSearchCriteria = new AndSearchCriteriaImpl<SRT>();
		return andSearchCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <SRT> OrSearchCriteria<SRT> createOrSearchCriteria() {
		OrSearchCriteriaImpl<SRT> orSearchCriteria = new OrSearchCriteriaImpl<SRT>();
		return orSearchCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <SRT> NotSearchCriteria<SRT> createNotSearchCriteria() {
		NotSearchCriteriaImpl<SRT> notSearchCriteria = new NotSearchCriteriaImpl<SRT>();
		return notSearchCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <SRT, IN> MatchesSearchCriteria<SRT, IN> createMatchesSearchCriteria() {
		MatchesSearchCriteriaImpl<SRT, IN> matchesSearchCriteria = new MatchesSearchCriteriaImpl<SRT, IN>();
		return matchesSearchCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchPackageImpl getSearchPackage() {
		return (SearchPackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SearchPackageImpl getPackage() {
		return SearchPackageImpl.eINSTANCE;
	}

} //SearchFactoryImpl
