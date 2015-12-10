/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import java.util.function.BiPredicate;
import java.util.function.Function;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.search.MatchesSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matches Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl#getInput <em>Input</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchesSearchCriteriaImpl<SRT, IN> extends MinimalEObjectImpl.Container implements MatchesSearchCriteria<SRT, IN> {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected IN input;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Function<? extends SRT, ? extends IN> transform;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected BiPredicate<? extends IN, ? extends IN> predicate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchesSearchCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchPackageImpl.Literals.MATCHES_SEARCH_CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public IN getInput() {
		if (input != null && ((EObject)input).eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = (IN)eResolveProxy(oldInput);
			if (input != oldInput) {
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(IN newInput) {
		input = newInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BiPredicate<? extends IN, ? extends IN> getPredicate() {
		if (predicate != null && ((EObject)predicate).eIsProxy()) {
			InternalEObject oldPredicate = (InternalEObject)predicate;
			predicate = (BiPredicate<? extends IN, ? extends IN>)eResolveProxy(oldPredicate);
			if (predicate != oldPredicate) {
			}
		}
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiPredicate<? extends IN, ? extends IN> basicGetPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(BiPredicate<? extends IN, ? extends IN> newPredicate) {
		predicate = newPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Function<? extends SRT, ? extends IN> getTransform() {
		if (transform != null && ((EObject)transform).eIsProxy()) {
			InternalEObject oldTransform = (InternalEObject)transform;
			transform = (Function<? extends SRT, ? extends IN>)eResolveProxy(oldTransform);
			if (transform != oldTransform) {
			}
		}
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function<? extends SRT, ? extends IN> basicGetTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Function<? extends SRT, ? extends IN> newTransform) {
		transform = newTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchResult<? extends SRT> apply(SearchResult<? extends SRT> results) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__TRANSFORM:
				if (resolve) return getTransform();
				return basicGetTransform();
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__INPUT:
				setInput((IN)newValue);
				return;
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__TRANSFORM:
				setTransform((Function<? extends SRT, ? extends IN>)newValue);
				return;
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__PREDICATE:
				setPredicate((BiPredicate<? extends IN, ? extends IN>)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__INPUT:
				setInput((IN)null);
				return;
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__TRANSFORM:
				setTransform((Function<? extends SRT, ? extends IN>)null);
				return;
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__PREDICATE:
				setPredicate((BiPredicate<? extends IN, ? extends IN>)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__INPUT:
				return input != null;
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__TRANSFORM:
				return transform != null;
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__PREDICATE:
				return predicate != null;
		}
		return eDynamicIsSet(featureID);
	}

} //MatchesSearchCriteriaImpl
