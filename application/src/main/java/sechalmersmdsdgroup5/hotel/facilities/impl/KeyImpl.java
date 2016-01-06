/**
 */
package sechalmersmdsdgroup5.hotel.facilities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import sechalmersmdsdgroup5.hotel.facilities.Door;
import sechalmersmdsdgroup5.hotel.facilities.Key;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.KeyImpl#getId <em>Id</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.KeyImpl#getUnlocks <em>Unlocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyImpl extends MinimalEObjectImpl.Container implements Key {
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
	 * The cached value of the '{@link #getUnlocks() <em>Unlocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlocks()
	 * @generated NOT
	 * @ordered
	 */
	protected List<Door> unlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyImpl() {
		super();
	}

	protected KeyImpl(int id, List<Door> unlocks) {
		super();

		this.id = id;
		if(unlocks == null) {
			this.unlocks = new ArrayList<>();
		} else {
			this.unlocks = unlocks;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackageImpl.Literals.KEY;
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
	public List<Door> getUnlocks() {
		if (unlocks == null) {
			unlocks = new BasicInternalEList<Door>(Door.class);
		}
		return unlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackageImpl.KEY__ID:
				return getId();
			case FacilitiesPackageImpl.KEY__UNLOCKS:
				return getUnlocks();
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
			case FacilitiesPackageImpl.KEY__ID:
				setId((Integer)newValue);
				return;
			case FacilitiesPackageImpl.KEY__UNLOCKS:
				getUnlocks().clear();
				getUnlocks().addAll((Collection<? extends Door>)newValue);
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
			case FacilitiesPackageImpl.KEY__ID:
				setId(ID_EDEFAULT);
				return;
			case FacilitiesPackageImpl.KEY__UNLOCKS:
				getUnlocks().clear();
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
			case FacilitiesPackageImpl.KEY__ID:
				return id != ID_EDEFAULT;
			case FacilitiesPackageImpl.KEY__UNLOCKS:
				return unlocks != null && !unlocks.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //KeyImpl
