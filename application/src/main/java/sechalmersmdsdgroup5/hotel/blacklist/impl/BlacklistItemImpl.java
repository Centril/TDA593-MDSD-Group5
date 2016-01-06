/**
 */
package sechalmersmdsdgroup5.hotel.blacklist.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem;
import sechalmersmdsdgroup5.hotel.identities.Identity;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistItemImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistItemImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistItemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistItemImpl#getExpiry <em>Expiry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlacklistItemImpl extends MinimalEObjectImpl.Container implements BlacklistItem {
	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected Identity identity;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiry() <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiry()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiry() <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiry()
	 * @generated
	 * @ordered
	 */
	protected Date expiry = EXPIRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlacklistItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlacklistPackageImpl.Literals.BLACKLIST_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getIdentity() {
		if (identity != null && ((EObject)identity).eIsProxy()) {
			InternalEObject oldIdentity = (InternalEObject)identity;
			identity = (Identity)eResolveProxy(oldIdentity);
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
	public Identity basicGetIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(Identity newIdentity) {
		identity = newIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		reason = newReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		date = newDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpiry() {
		return expiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiry(Date newExpiry) {
		expiry = newExpiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlacklistPackageImpl.BLACKLIST_ITEM__IDENTITY:
				if (resolve) return getIdentity();
				return basicGetIdentity();
			case BlacklistPackageImpl.BLACKLIST_ITEM__REASON:
				return getReason();
			case BlacklistPackageImpl.BLACKLIST_ITEM__DATE:
				return getDate();
			case BlacklistPackageImpl.BLACKLIST_ITEM__EXPIRY:
				return getExpiry();
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
			case BlacklistPackageImpl.BLACKLIST_ITEM__IDENTITY:
				setIdentity((Identity)newValue);
				return;
			case BlacklistPackageImpl.BLACKLIST_ITEM__REASON:
				setReason((String)newValue);
				return;
			case BlacklistPackageImpl.BLACKLIST_ITEM__DATE:
				setDate((Date)newValue);
				return;
			case BlacklistPackageImpl.BLACKLIST_ITEM__EXPIRY:
				setExpiry((Date)newValue);
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
			case BlacklistPackageImpl.BLACKLIST_ITEM__IDENTITY:
				setIdentity((Identity)null);
				return;
			case BlacklistPackageImpl.BLACKLIST_ITEM__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case BlacklistPackageImpl.BLACKLIST_ITEM__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case BlacklistPackageImpl.BLACKLIST_ITEM__EXPIRY:
				setExpiry(EXPIRY_EDEFAULT);
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
			case BlacklistPackageImpl.BLACKLIST_ITEM__IDENTITY:
				return identity != null;
			case BlacklistPackageImpl.BLACKLIST_ITEM__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case BlacklistPackageImpl.BLACKLIST_ITEM__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case BlacklistPackageImpl.BLACKLIST_ITEM__EXPIRY:
				return EXPIRY_EDEFAULT == null ? expiry != null : !EXPIRY_EDEFAULT.equals(expiry);
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
		result.append(" (reason: ");
		result.append(reason);
		result.append(", date: ");
		result.append(date);
		result.append(", expiry: ");
		result.append(expiry);
		result.append(')');
		return result.toString();
	}

} //BlacklistItemImpl
