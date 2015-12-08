/**
 */
package sechalmersmdsdgroup5.hotel.inventory.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import sechalmersmdsdgroup5.hotel.inventory.Inventory;
import sechalmersmdsdgroup5.hotel.inventory.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.inventory.impl.InventoryImpl#getHasInStore <em>Has In Store</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryImpl extends MinimalEObjectImpl.Container implements Inventory {
	/**
	 * The cached value of the '{@link #getHasInStore() <em>Has In Store</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInStore()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> hasInStore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackageImpl.Literals.INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Product> getHasInStore() {
		if (hasInStore == null) {
			hasInStore = new BasicInternalEList<Product>(Product.class);
		}
		return hasInStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackageImpl.INVENTORY__HAS_IN_STORE:
				return getHasInStore();
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
			case InventoryPackageImpl.INVENTORY__HAS_IN_STORE:
				getHasInStore().clear();
				getHasInStore().addAll((Collection<? extends Product>)newValue);
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
			case InventoryPackageImpl.INVENTORY__HAS_IN_STORE:
				getHasInStore().clear();
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
			case InventoryPackageImpl.INVENTORY__HAS_IN_STORE:
				return hasInStore != null && !hasInStore.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //InventoryImpl
