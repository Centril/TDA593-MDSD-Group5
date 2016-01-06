/**
 */
package sechalmersmdsdgroup5.hotel.facilities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import sechalmersmdsdgroup5.hotel.facilities.EmployeeArea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.EmployeeAreaImpl#getId <em>Id</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.EmployeeAreaImpl#getFloor <em>Floor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeAreaImpl extends MinimalEObjectImpl.Container implements EmployeeArea {
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
	 * The default value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected static final int FLOOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected int floor = FLOOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeAreaImpl() {
		super();
	}

	protected EmployeeAreaImpl(int id, int floor) {
		this.id = id;
		this.floor = floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackageImpl.Literals.EMPLOYEE_AREA;
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
	public int getFloor() {
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(int newFloor) {
		floor = newFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackageImpl.EMPLOYEE_AREA__ID:
				return getId();
			case FacilitiesPackageImpl.EMPLOYEE_AREA__FLOOR:
				return getFloor();
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
			case FacilitiesPackageImpl.EMPLOYEE_AREA__ID:
				setId((Integer)newValue);
				return;
			case FacilitiesPackageImpl.EMPLOYEE_AREA__FLOOR:
				setFloor((Integer)newValue);
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
			case FacilitiesPackageImpl.EMPLOYEE_AREA__ID:
				setId(ID_EDEFAULT);
				return;
			case FacilitiesPackageImpl.EMPLOYEE_AREA__FLOOR:
				setFloor(FLOOR_EDEFAULT);
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
			case FacilitiesPackageImpl.EMPLOYEE_AREA__ID:
				return id != ID_EDEFAULT;
			case FacilitiesPackageImpl.EMPLOYEE_AREA__FLOOR:
				return floor != FLOOR_EDEFAULT;
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
		result.append(", floor: ");
		result.append(floor);
		result.append(')');
		return result.toString();
	}

} //EmployeeAreaImpl
