/**
 */
package sechalmersmdsdgroup5.hotel.search.util;

import java.util.function.BiPredicate;
import java.util.function.Function;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sechalmersmdsdgroup5.hotel.search.*;

import sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl
 * @generated
 */
public class SearchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SearchPackageImpl modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SearchPackageImpl.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchSwitch<Adapter> modelSwitch =
		new SearchSwitch<Adapter>() {
			@Override
			public Adapter caseISearch(ISearch object) {
				return createISearchAdapter();
			}
			@Override
			public <SRT> Adapter caseSearchResult(SearchResult<SRT> object) {
				return createSearchResultAdapter();
			}
			@Override
			public <SRT> Adapter caseSearchQuery(SearchQuery<SRT> object) {
				return createSearchQueryAdapter();
			}
			@Override
			public <SRT> Adapter caseSearchCriteria(SearchCriteria<SRT> object) {
				return createSearchCriteriaAdapter();
			}
			@Override
			public <SRT> Adapter caseConcreteSearchResult(ConcreteSearchResult<SRT> object) {
				return createConcreteSearchResultAdapter();
			}
			@Override
			public <SRT> Adapter caseAndSearchCriteria(AndSearchCriteria<SRT> object) {
				return createAndSearchCriteriaAdapter();
			}
			@Override
			public <SRT> Adapter caseOrSearchCriteria(OrSearchCriteria<SRT> object) {
				return createOrSearchCriteriaAdapter();
			}
			@Override
			public <SRT> Adapter caseNotSearchCriteria(NotSearchCriteria<SRT> object) {
				return createNotSearchCriteriaAdapter();
			}
			@Override
			public <SRT, IN> Adapter caseMatchesSearchCriteria(MatchesSearchCriteria<SRT, IN> object) {
				return createMatchesSearchCriteriaAdapter();
			}
			@Override
			public <FI, FO> Adapter caseFunction(Function<FI, FO> object) {
				return createFunctionAdapter();
			}
			@Override
			public <BPT1, BPT2> Adapter caseBiPredicate(BiPredicate<BPT1, BPT2> object) {
				return createBiPredicateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.search.ISearch <em>ISearch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.search.ISearch
	 * @generated
	 */
	public Adapter createISearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.search.SearchResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.search.SearchResult
	 * @generated
	 */
	public Adapter createSearchResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.search.SearchQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.search.SearchQuery
	 * @generated
	 */
	public Adapter createSearchQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.search.SearchCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.search.SearchCriteria
	 * @generated
	 */
	public Adapter createSearchCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.search.ConcreteSearchResult <em>Concrete Search Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.search.ConcreteSearchResult
	 * @generated
	 */
	public Adapter createConcreteSearchResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.search.AndSearchCriteria <em>And Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.search.AndSearchCriteria
	 * @generated
	 */
	public Adapter createAndSearchCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.search.OrSearchCriteria <em>Or Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.search.OrSearchCriteria
	 * @generated
	 */
	public Adapter createOrSearchCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.search.NotSearchCriteria <em>Not Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.search.NotSearchCriteria
	 * @generated
	 */
	public Adapter createNotSearchCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria <em>Matches Search Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria
	 * @generated
	 */
	public Adapter createMatchesSearchCriteriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.function.BiPredicate <em>Bi Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.function.BiPredicate
	 * @generated
	 */
	public Adapter createBiPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.function.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.function.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SearchAdapterFactory
