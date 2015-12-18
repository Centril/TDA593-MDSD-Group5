/**
 */
package sechalmersmdsdgroup5.hotel.search.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.search.OrSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Search Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.OrSearchCriteriaImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.search.impl.OrSearchCriteriaImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrSearchCriteriaImpl<SRT> extends MinimalEObjectImpl.Container implements OrSearchCriteria<SRT> {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected SearchCriteria<SRT> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected SearchCriteria<SRT> right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrSearchCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchPackageImpl.Literals.OR_SEARCH_CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SearchCriteria<SRT> getLeft() {
		if (left != null && ((EObject)left).eIsProxy()) {
			InternalEObject oldLeft = (InternalEObject)left;
			left = (SearchCriteria<SRT>)eResolveProxy(oldLeft);
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
	public SearchCriteria<SRT> basicGetLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(SearchCriteria<SRT> newLeft) {
		left = newLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public SearchCriteria<SRT> getRight() {
		if (right != null && ((EObject)right).eIsProxy()) {
			InternalEObject oldRight = (InternalEObject)right;
			right = (SearchCriteria<SRT>)eResolveProxy(oldRight);
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
	public SearchCriteria<SRT> basicGetRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(SearchCriteria<SRT> newRight) {
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
			case SearchPackageImpl.OR_SEARCH_CRITERIA__LEFT:
				if (resolve) return getLeft();
				return basicGetLeft();
			case SearchPackageImpl.OR_SEARCH_CRITERIA__RIGHT:
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
			case SearchPackageImpl.OR_SEARCH_CRITERIA__LEFT:
				setLeft((SearchCriteria<SRT>)newValue);
				return;
			case SearchPackageImpl.OR_SEARCH_CRITERIA__RIGHT:
				setRight((SearchCriteria<SRT>)newValue);
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
			case SearchPackageImpl.OR_SEARCH_CRITERIA__LEFT:
				setLeft((SearchCriteria<SRT>)null);
				return;
			case SearchPackageImpl.OR_SEARCH_CRITERIA__RIGHT:
				setRight((SearchCriteria<SRT>)null);
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
			case SearchPackageImpl.OR_SEARCH_CRITERIA__LEFT:
				return left != null;
			case SearchPackageImpl.OR_SEARCH_CRITERIA__RIGHT:
				return right != null;
		}
		return eDynamicIsSet(featureID);
	}

} //OrSearchCriteriaImpl
