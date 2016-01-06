/**
 */
package sechalmersmdsdgroup5.hotel.clients.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import sechalmersmdsdgroup5.hotel.clients.Client;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.identities.impl.RealPersonImpl;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.services.ServiceConsumer;

import java.util.Collection;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.GuestImpl#getInvoices <em>Invoices</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.GuestImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuestImpl extends RealPersonImpl implements Guest {
	/**
	 * The cached value of the '{@link #getInvoices() <em>Invoices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Invoice> invoices;

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
	public List<Invoice> getInvoices() {
		if (invoices == null) {
			invoices = new BasicInternalEList<Invoice>(Invoice.class);
		}
		return invoices;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientsPackageImpl.GUEST__NAME:
				return getName();
			case ClientsPackageImpl.GUEST__ID_NUMBER:
				return getIdNumber();
			case ClientsPackageImpl.GUEST__AGE:
				return getAge();
			case ClientsPackageImpl.GUEST__CITIZENSHIP:
				return getCitizenship();
			case ClientsPackageImpl.GUEST__INVOICES:
				return getInvoices();
			case ClientsPackageImpl.GUEST__KEY:
				if (resolve) return getKey();
				return basicGetKey();
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
			case ClientsPackageImpl.GUEST__NAME:
				setName((String)newValue);
				return;
			case ClientsPackageImpl.GUEST__ID_NUMBER:
				setIdNumber((String)newValue);
				return;
			case ClientsPackageImpl.GUEST__AGE:
				setAge((Integer)newValue);
				return;
			case ClientsPackageImpl.GUEST__CITIZENSHIP:
				setCitizenship((String)newValue);
				return;
			case ClientsPackageImpl.GUEST__INVOICES:
				getInvoices().clear();
				getInvoices().addAll((Collection<? extends Invoice>)newValue);
				return;
			case ClientsPackageImpl.GUEST__KEY:
				setKey((Key)newValue);
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
			case ClientsPackageImpl.GUEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClientsPackageImpl.GUEST__ID_NUMBER:
				setIdNumber(ID_NUMBER_EDEFAULT);
				return;
			case ClientsPackageImpl.GUEST__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case ClientsPackageImpl.GUEST__CITIZENSHIP:
				setCitizenship(CITIZENSHIP_EDEFAULT);
				return;
			case ClientsPackageImpl.GUEST__INVOICES:
				getInvoices().clear();
				return;
			case ClientsPackageImpl.GUEST__KEY:
				setKey((Key)null);
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
			case ClientsPackageImpl.GUEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClientsPackageImpl.GUEST__ID_NUMBER:
				return ID_NUMBER_EDEFAULT == null ? idNumber != null : !ID_NUMBER_EDEFAULT.equals(idNumber);
			case ClientsPackageImpl.GUEST__AGE:
				return age != AGE_EDEFAULT;
			case ClientsPackageImpl.GUEST__CITIZENSHIP:
				return CITIZENSHIP_EDEFAULT == null ? citizenship != null : !CITIZENSHIP_EDEFAULT.equals(citizenship);
			case ClientsPackageImpl.GUEST__INVOICES:
				return invoices != null && !invoices.isEmpty();
			case ClientsPackageImpl.GUEST__KEY:
				return key != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Client.class) {
			switch (derivedFeatureID) {
				case ClientsPackageImpl.GUEST__INVOICES: return ClientsPackageImpl.CLIENT__INVOICES;
				default: return -1;
			}
		}
		if (baseClass == ServiceConsumer.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Client.class) {
			switch (baseFeatureID) {
				case ClientsPackageImpl.CLIENT__INVOICES: return ClientsPackageImpl.GUEST__INVOICES;
				default: return -1;
			}
		}
		if (baseClass == ServiceConsumer.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GuestImpl
