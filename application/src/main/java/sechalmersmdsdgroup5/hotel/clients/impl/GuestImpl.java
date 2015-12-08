/**
 */
package sechalmersmdsdgroup5.hotel.clients.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.clients.Guest;

import sechalmersmdsdgroup5.hotel.facilities.Key;

import sechalmersmdsdgroup5.hotel.identities.RealPerson;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.GuestImpl#getKey <em>Key</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.GuestImpl#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuestImpl extends MinimalEObjectImpl.Container implements Guest {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Key key;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected RealPerson identity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientsPackageImpl.Literals.GUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getKey() {
		if (key != null && ((EObject)key).eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (Key)eResolveProxy(oldKey);
			if (key != oldKey) {
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key basicGetKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Key newKey) {
		key = newKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealPerson getIdentity() {
		if (identity != null && ((EObject)identity).eIsProxy()) {
			InternalEObject oldIdentity = (InternalEObject)identity;
			identity = (RealPerson)eResolveProxy(oldIdentity);
			if (identity != oldIdentity) {
			}
		}
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealPerson basicGetIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(RealPerson newIdentity) {
		identity = newIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientsPackageImpl.GUEST__KEY:
				if (resolve) return getKey();
				return basicGetKey();
			case ClientsPackageImpl.GUEST__IDENTITY:
				if (resolve) return getIdentity();
				return basicGetIdentity();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClientsPackageImpl.GUEST__KEY:
				setKey((Key)newValue);
				return;
			case ClientsPackageImpl.GUEST__IDENTITY:
				setIdentity((RealPerson)newValue);
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
			case ClientsPackageImpl.GUEST__KEY:
				setKey((Key)null);
				return;
			case ClientsPackageImpl.GUEST__IDENTITY:
				setIdentity((RealPerson)null);
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
			case ClientsPackageImpl.GUEST__KEY:
				return key != null;
			case ClientsPackageImpl.GUEST__IDENTITY:
				return identity != null;
		}
		return eDynamicIsSet(featureID);
	}

} //GuestImpl
