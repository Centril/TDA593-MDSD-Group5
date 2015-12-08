/**
 */
package sechalmersmdsdgroup5.hotel.search.util;

import java.util.List;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sechalmersmdsdgroup5.hotel.search.*;

import sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sechalmersmdsdgroup5.hotel.search.impl.SearchPackageImpl
 * @generated
 */
public class SearchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SearchPackageImpl modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchSwitch() {
		if (modelPackage == null) {
			modelPackage = SearchPackageImpl.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SearchPackageImpl.ISEARCH: {
				ISearch iSearch = (ISearch)theEObject;
				T result = caseISearch(iSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.SEARCH_RESULT: {
				SearchResult<?> searchResult = (SearchResult<?>)theEObject;
				T result = caseSearchResult(searchResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.SEARCH_QUERY: {
				SearchQuery<?> searchQuery = (SearchQuery<?>)theEObject;
				T result = caseSearchQuery(searchQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.LIST: {
				List<?> list = (List<?>)theEObject;
				T result = caseList(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.SEARCH_CRITERIA: {
				SearchCriteria<?> searchCriteria = (SearchCriteria<?>)theEObject;
				T result = caseSearchCriteria(searchCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.CONCRETE_SEARCH_RESULT: {
				ConcreteSearchResult<?> concreteSearchResult = (ConcreteSearchResult<?>)theEObject;
				T result = caseConcreteSearchResult(concreteSearchResult);
				if (result == null) result = caseSearchResult(concreteSearchResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.AND_SEARCH_CRITERIA: {
				AndSearchCriteria<?> andSearchCriteria = (AndSearchCriteria<?>)theEObject;
				T result = caseAndSearchCriteria(andSearchCriteria);
				if (result == null) result = caseSearchCriteria(andSearchCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.OR_SEARCH_CRITERIA: {
				OrSearchCriteria<?> orSearchCriteria = (OrSearchCriteria<?>)theEObject;
				T result = caseOrSearchCriteria(orSearchCriteria);
				if (result == null) result = caseSearchCriteria(orSearchCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.NOT_SEARCH_CRITERIA: {
				NotSearchCriteria<?> notSearchCriteria = (NotSearchCriteria<?>)theEObject;
				T result = caseNotSearchCriteria(notSearchCriteria);
				if (result == null) result = caseSearchCriteria(notSearchCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA: {
				MatchesSearchCriteria<?> matchesSearchCriteria = (MatchesSearchCriteria<?>)theEObject;
				T result = caseMatchesSearchCriteria(matchesSearchCriteria);
				if (result == null) result = caseSearchCriteria(matchesSearchCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.UNARY_OPERATOR: {
				UnaryOperator<?> unaryOperator = (UnaryOperator<?>)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchPackageImpl.BI_PREDICATE: {
				BiPredicate<?, ?> biPredicate = (BiPredicate<?, ?>)theEObject;
				T result = caseBiPredicate(biPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISearch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISearch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISearch(ISearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <SRT> T caseSearchResult(SearchResult<SRT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <SRT> T caseSearchQuery(SearchQuery<SRT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <LT> T caseList(List<LT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <SRT> T caseSearchCriteria(SearchCriteria<SRT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Search Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Search Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <SRT> T caseConcreteSearchResult(ConcreteSearchResult<SRT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Search Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Search Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <SRT> T caseAndSearchCriteria(AndSearchCriteria<SRT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Search Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Search Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <SRT> T caseOrSearchCriteria(OrSearchCriteria<SRT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Search Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Search Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <SRT> T caseNotSearchCriteria(NotSearchCriteria<SRT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matches Search Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matches Search Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <SRT> T caseMatchesSearchCriteria(MatchesSearchCriteria<SRT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <UOT> T caseUnaryOperator(UnaryOperator<UOT> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bi Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bi Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <BPT1, BPT2> T caseBiPredicate(BiPredicate<BPT1, BPT2> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SearchSwitch
