/**
 */
package sechalmersmdsdgroup5.hotel.personnel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.identities.impl.RealPersonImpl;
import sechalmersmdsdgroup5.hotel.personnel.Employee;
import sechalmersmdsdgroup5.hotel.personnel.Role;

import sechalmersmdsdgroup5.hotel.schedule.Schedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.EmployeeImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.EmployeeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.EmployeeImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends RealPersonImpl implements Employee {
	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Schedule schedule;

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
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonnelPackageImpl.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		if (schedule != null && ((EObject)schedule).eIsProxy()) {
			InternalEObject oldSchedule = (InternalEObject)schedule;
			schedule = (Schedule)eResolveProxy(oldSchedule);
			if (schedule != oldSchedule) {
			}
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule basicGetSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		schedule = newSchedule;
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
	public Role getRole() {
		if (role != null && ((EObject)role).eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		role = newRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersonnelPackageImpl.EMPLOYEE__NAME:
				return getName();
			case PersonnelPackageImpl.EMPLOYEE__ID_NUMBER:
				return getIdNumber();
			case PersonnelPackageImpl.EMPLOYEE__AGE:
				return getAge();
			case PersonnelPackageImpl.EMPLOYEE__CITIZENSHIP:
				return getCitizenship();
			case PersonnelPackageImpl.EMPLOYEE__SCHEDULE:
				if (resolve) return getSchedule();
				return basicGetSchedule();
			case PersonnelPackageImpl.EMPLOYEE__KEY:
				if (resolve) return getKey();
				return basicGetKey();
			case PersonnelPackageImpl.EMPLOYEE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
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
			case PersonnelPackageImpl.EMPLOYEE__NAME:
				setName((String)newValue);
				return;
			case PersonnelPackageImpl.EMPLOYEE__ID_NUMBER:
				setIdNumber((String)newValue);
				return;
			case PersonnelPackageImpl.EMPLOYEE__AGE:
				setAge((Integer)newValue);
				return;
			case PersonnelPackageImpl.EMPLOYEE__CITIZENSHIP:
				setCitizenship((String)newValue);
				return;
			case PersonnelPackageImpl.EMPLOYEE__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
			case PersonnelPackageImpl.EMPLOYEE__KEY:
				setKey((Key)newValue);
				return;
			case PersonnelPackageImpl.EMPLOYEE__ROLE:
				setRole((Role)newValue);
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
			case PersonnelPackageImpl.EMPLOYEE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PersonnelPackageImpl.EMPLOYEE__ID_NUMBER:
				setIdNumber(ID_NUMBER_EDEFAULT);
				return;
			case PersonnelPackageImpl.EMPLOYEE__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case PersonnelPackageImpl.EMPLOYEE__CITIZENSHIP:
				setCitizenship(CITIZENSHIP_EDEFAULT);
				return;
			case PersonnelPackageImpl.EMPLOYEE__SCHEDULE:
				setSchedule((Schedule)null);
				return;
			case PersonnelPackageImpl.EMPLOYEE__KEY:
				setKey((Key)null);
				return;
			case PersonnelPackageImpl.EMPLOYEE__ROLE:
				setRole((Role)null);
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
			case PersonnelPackageImpl.EMPLOYEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PersonnelPackageImpl.EMPLOYEE__ID_NUMBER:
				return ID_NUMBER_EDEFAULT == null ? idNumber != null : !ID_NUMBER_EDEFAULT.equals(idNumber);
			case PersonnelPackageImpl.EMPLOYEE__AGE:
				return age != AGE_EDEFAULT;
			case PersonnelPackageImpl.EMPLOYEE__CITIZENSHIP:
				return CITIZENSHIP_EDEFAULT == null ? citizenship != null : !CITIZENSHIP_EDEFAULT.equals(citizenship);
			case PersonnelPackageImpl.EMPLOYEE__SCHEDULE:
				return schedule != null;
			case PersonnelPackageImpl.EMPLOYEE__KEY:
				return key != null;
			case PersonnelPackageImpl.EMPLOYEE__ROLE:
				return role != null;
		}
		return eDynamicIsSet(featureID);
	}

} //EmployeeImpl
