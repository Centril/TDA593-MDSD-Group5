/**
 */
package sechalmersmdsdgroup5.hotel.facilities.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import sechalmersmdsdgroup5.hotel.facilities.RoomAttribute;
import sechalmersmdsdgroup5.hotel.facilities.RoomPrototype;

import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Prototype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomPrototypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomPrototypeImpl#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomPrototypeImpl#getStates <em>States</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomPrototypeImpl#getServicesAfforded <em>Services Afforded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomPrototypeImpl extends MinimalEObjectImpl.Container implements RoomPrototype {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePrice() <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	protected static final double BASE_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBasePrice() <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	protected double basePrice = BASE_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomAttribute> states;

	/**
	 * The cached value of the '{@link #getServicesAfforded() <em>Services Afforded</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesAfforded()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBlueprint> servicesAfforded;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackageImpl.Literals.ROOM_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBasePrice() {
		return basePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePrice(double newBasePrice) {
		basePrice = newBasePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RoomAttribute> getStates() {
		if (states == null) {
			states = new BasicInternalEList<RoomAttribute>(RoomAttribute.class);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ServiceBlueprint> getServicesAfforded() {
		if (servicesAfforded == null) {
			servicesAfforded = new BasicInternalEList<ServiceBlueprint>(ServiceBlueprint.class);
		}
		return servicesAfforded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__NAME:
				return getName();
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__BASE_PRICE:
				return getBasePrice();
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__STATES:
				return getStates();
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__SERVICES_AFFORDED:
				return getServicesAfforded();
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
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__NAME:
				setName((String)newValue);
				return;
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__BASE_PRICE:
				setBasePrice((Double)newValue);
				return;
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends RoomAttribute>)newValue);
				return;
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__SERVICES_AFFORDED:
				getServicesAfforded().clear();
				getServicesAfforded().addAll((Collection<? extends ServiceBlueprint>)newValue);
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
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__BASE_PRICE:
				setBasePrice(BASE_PRICE_EDEFAULT);
				return;
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__STATES:
				getStates().clear();
				return;
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__SERVICES_AFFORDED:
				getServicesAfforded().clear();
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
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__BASE_PRICE:
				return basePrice != BASE_PRICE_EDEFAULT;
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__STATES:
				return states != null && !states.isEmpty();
			case FacilitiesPackageImpl.ROOM_PROTOTYPE__SERVICES_AFFORDED:
				return servicesAfforded != null && !servicesAfforded.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", basePrice: ");
		result.append(basePrice);
		result.append(')');
		return result.toString();
	}

} //RoomPrototypeImpl
