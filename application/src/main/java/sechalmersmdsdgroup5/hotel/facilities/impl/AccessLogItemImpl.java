/**
 */
package sechalmersmdsdgroup5.hotel.facilities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import sechalmersmdsdgroup5.hotel.facilities.AccessLogItem;
import sechalmersmdsdgroup5.hotel.facilities.Door;
import sechalmersmdsdgroup5.hotel.facilities.Key;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Log Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogItemImpl#getWhen <em>When</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogItemImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogItemImpl#getAccessed <em>Accessed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessLogItemImpl extends MinimalEObjectImpl.Container implements AccessLogItem {
	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final Date WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Date when = WHEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessor()
	 * @generated
	 * @ordered
	 */
	protected Key accessor;

	/**
	 * The cached value of the '{@link #getAccessed() <em>Accessed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessed()
	 * @generated
	 * @ordered
	 */
	protected Door accessed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessLogItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackageImpl.Literals.ACCESS_LOG_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Date newWhen) {
		when = newWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getAccessor() {
		if (accessor != null && ((EObject)accessor).eIsProxy()) {
			InternalEObject oldAccessor = (InternalEObject)accessor;
			accessor = (Key)eResolveProxy(oldAccessor);
			if (accessor != oldAccessor) {
			}
		}
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key basicGetAccessor() {
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessor(Key newAccessor) {
		accessor = newAccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getAccessed() {
		if (accessed != null && ((EObject)accessed).eIsProxy()) {
			InternalEObject oldAccessed = (InternalEObject)accessed;
			accessed = (Door)eResolveProxy(oldAccessed);
			if (accessed != oldAccessed) {
			}
		}
		return accessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door basicGetAccessed() {
		return accessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessed(Door newAccessed) {
		accessed = newAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__WHEN:
				return getWhen();
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__ACCESSOR:
				if (resolve) return getAccessor();
				return basicGetAccessor();
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__ACCESSED:
				if (resolve) return getAccessed();
				return basicGetAccessed();
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
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__WHEN:
				setWhen((Date)newValue);
				return;
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__ACCESSOR:
				setAccessor((Key)newValue);
				return;
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__ACCESSED:
				setAccessed((Door)newValue);
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
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__WHEN:
				setWhen(WHEN_EDEFAULT);
				return;
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__ACCESSOR:
				setAccessor((Key)null);
				return;
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__ACCESSED:
				setAccessed((Door)null);
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
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__WHEN:
				return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__ACCESSOR:
				return accessor != null;
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM__ACCESSED:
				return accessed != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (when: ");
		result.append(when);
		result.append(')');
		return result.toString();
	}

} //AccessLogItemImpl
