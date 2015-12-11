/**
 */
package sechalmersmdsdgroup5.hotel.blacklist.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import sechalmersmdsdgroup5.hotel.blacklist.Blacklist;
import sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blacklist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlacklistImpl extends MinimalEObjectImpl.Container implements Blacklist {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<BlacklistItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlacklistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlacklistPackageImpl.Literals.BLACKLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BlacklistItem> getItems() {
		if (items == null) {
			items = new BasicInternalEList<BlacklistItem>(BlacklistItem.class);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BlacklistPackageImpl.BLACKLIST__ITEMS:
				return getItems();
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
			case BlacklistPackageImpl.BLACKLIST__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends BlacklistItem>)newValue);
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
			case BlacklistPackageImpl.BLACKLIST__ITEMS:
				getItems().clear();
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
			case BlacklistPackageImpl.BLACKLIST__ITEMS:
				return items != null && !items.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //BlacklistImpl
