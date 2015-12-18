/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.search.NotSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.NotSearchCriteriaImpl#getCriteria <em>Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotSearchCriteriaImpl<SRT> extends MinimalEObjectImpl.Container implements NotSearchCriteria<SRT> {
	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected SearchCriteria<SRT> criteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotSearchCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchPackageImpl.Literals.NOT_SEARCH_CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SearchCriteria<SRT> getCriteria() {
		if (criteria != null && ((EObject)criteria).eIsProxy()) {
			InternalEObject oldCriteria = (InternalEObject)criteria;
			criteria = (SearchCriteria<SRT>)eResolveProxy(oldCriteria);
			if (criteria != oldCriteria) {
			}
		}
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchCriteria<SRT> basicGetCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(SearchCriteria<SRT> newCriteria) {
		criteria = newCriteria;
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
			case SearchPackageImpl.NOT_SEARCH_CRITERIA__CRITERIA:
				if (resolve) return getCriteria();
				return basicGetCriteria();
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
			case SearchPackageImpl.NOT_SEARCH_CRITERIA__CRITERIA:
				setCriteria((SearchCriteria<SRT>)newValue);
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
			case SearchPackageImpl.NOT_SEARCH_CRITERIA__CRITERIA:
				setCriteria((SearchCriteria<SRT>)null);
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
			case SearchPackageImpl.NOT_SEARCH_CRITERIA__CRITERIA:
				return criteria != null;
		}
		return eDynamicIsSet(featureID);
	}

} //NotSearchCriteriaImpl
