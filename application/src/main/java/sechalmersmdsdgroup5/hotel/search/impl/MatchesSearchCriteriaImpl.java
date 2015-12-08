/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

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
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.MatchesSearchCriteriaImpl#getTransform <em>Transform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchesSearchCriteriaImpl<SRT> extends MinimalEObjectImpl.Container implements MatchesSearchCriteria<SRT> {
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperator<? extends SRT> predicate;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected BiPredicate<? extends SRT, ? extends SRT> transform;

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
	public UnaryOperator<? extends SRT> getPredicate() {
		if (predicate != null && ((EObject)predicate).eIsProxy()) {
			InternalEObject oldPredicate = (InternalEObject)predicate;
			predicate = (UnaryOperator<? extends SRT>)eResolveProxy(oldPredicate);
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
	public UnaryOperator<? extends SRT> basicGetPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(UnaryOperator<? extends SRT> newPredicate) {
		predicate = newPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BiPredicate<? extends SRT, ? extends SRT> getTransform() {
		if (transform != null && ((EObject)transform).eIsProxy()) {
			InternalEObject oldTransform = (InternalEObject)transform;
			transform = (BiPredicate<? extends SRT, ? extends SRT>)eResolveProxy(oldTransform);
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
	public BiPredicate<? extends SRT, ? extends SRT> basicGetTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(BiPredicate<? extends SRT, ? extends SRT> newTransform) {
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
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__TRANSFORM:
				if (resolve) return getTransform();
				return basicGetTransform();
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
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__PREDICATE:
				setPredicate((UnaryOperator<? extends SRT>)newValue);
				return;
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__TRANSFORM:
				setTransform((BiPredicate<? extends SRT, ? extends SRT>)newValue);
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
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__PREDICATE:
				setPredicate((UnaryOperator<? extends SRT>)null);
				return;
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__TRANSFORM:
				setTransform((BiPredicate<? extends SRT, ? extends SRT>)null);
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
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__PREDICATE:
				return predicate != null;
			case SearchPackageImpl.MATCHES_SEARCH_CRITERIA__TRANSFORM:
				return transform != null;
		}
		return eDynamicIsSet(featureID);
	}

} //MatchesSearchCriteriaImpl
