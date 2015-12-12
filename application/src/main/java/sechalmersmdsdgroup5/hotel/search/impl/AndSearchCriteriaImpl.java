/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.search.AndSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.AndSearchCriteriaImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.AndSearchCriteriaImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndSearchCriteriaImpl<SRT> extends MinimalEObjectImpl.Container implements AndSearchCriteria<SRT> {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected SearchCriteria<? extends SRT> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected SearchCriteria<? extends SRT> right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndSearchCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchPackageImpl.Literals.AND_SEARCH_CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SearchCriteria<? extends SRT> getLeft() {
		if (left != null && ((EObject)left).eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (SearchCriteria<? extends SRT>)eResolveProxy(oldLeft);
			if (left != oldLeft) {
			}
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchCriteria<? extends SRT> basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(SearchCriteria<? extends SRT> newLeft) {
		left = newLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SearchCriteria<? extends SRT> getRight() {
		if (right != null && ((EObject)right).eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (SearchCriteria<? extends SRT>)eResolveProxy(oldRight);
			if (right != oldRight) {
			}
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchCriteria<? extends SRT> basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(SearchCriteria<? extends SRT> newRight) {
		right = newRight;
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
			case SearchPackageImpl.AND_SEARCH_CRITERIA__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case SearchPackageImpl.AND_SEARCH_CRITERIA__RIGHT:
				if (resolve) return getRight();
				return basicGetRight();
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
			case SearchPackageImpl.AND_SEARCH_CRITERIA__LEFT:
				setLeft((SearchCriteria<? extends SRT>)newValue);
				return;
			case SearchPackageImpl.AND_SEARCH_CRITERIA__RIGHT:
				setRight((SearchCriteria<? extends SRT>)newValue);
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
			case SearchPackageImpl.AND_SEARCH_CRITERIA__LEFT:
				setLeft((SearchCriteria<? extends SRT>)null);
				return;
			case SearchPackageImpl.AND_SEARCH_CRITERIA__RIGHT:
				setRight((SearchCriteria<? extends SRT>)null);
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
			case SearchPackageImpl.AND_SEARCH_CRITERIA__LEFT:
				return left != null;
			case SearchPackageImpl.AND_SEARCH_CRITERIA__RIGHT:
				return right != null;
		}
		return eDynamicIsSet(featureID);
	}

} //AndSearchCriteriaImpl
