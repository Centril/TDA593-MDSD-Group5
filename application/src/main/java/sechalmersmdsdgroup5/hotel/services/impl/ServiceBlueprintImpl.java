/**
 */
package sechalmersmdsdgroup5.hotel.services.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Blueprint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceBlueprintImpl#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceBlueprintImpl#getId <em>Id</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceBlueprintImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceBlueprintImpl extends MinimalEObjectImpl.Container implements ServiceBlueprint {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBlueprintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesPackageImpl.Literals.SERVICE_BLUEPRINT;
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
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		id = newId;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicesPackageImpl.SERVICE_BLUEPRINT__BASE_PRICE:
				return getBasePrice();
			case ServicesPackageImpl.SERVICE_BLUEPRINT__ID:
				return getId();
			case ServicesPackageImpl.SERVICE_BLUEPRINT__NAME:
				return getName();
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
			case ServicesPackageImpl.SERVICE_BLUEPRINT__BASE_PRICE:
				setBasePrice((Double)newValue);
				return;
			case ServicesPackageImpl.SERVICE_BLUEPRINT__ID:
				setId((Integer)newValue);
				return;
			case ServicesPackageImpl.SERVICE_BLUEPRINT__NAME:
				setName((String)newValue);
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
			case ServicesPackageImpl.SERVICE_BLUEPRINT__BASE_PRICE:
				setBasePrice(BASE_PRICE_EDEFAULT);
				return;
			case ServicesPackageImpl.SERVICE_BLUEPRINT__ID:
				setId(ID_EDEFAULT);
				return;
			case ServicesPackageImpl.SERVICE_BLUEPRINT__NAME:
				setName(NAME_EDEFAULT);
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
			case ServicesPackageImpl.SERVICE_BLUEPRINT__BASE_PRICE:
				return basePrice != BASE_PRICE_EDEFAULT;
			case ServicesPackageImpl.SERVICE_BLUEPRINT__ID:
				return id != ID_EDEFAULT;
			case ServicesPackageImpl.SERVICE_BLUEPRINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer( "ServiceBlueprint" );
		result.append(" (basePrice: ");
		result.append(basePrice);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceBlueprintImpl
