/**
 */
package sechalmersmdsdgroup5.hotel.personnel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.facilities.Key;

import sechalmersmdsdgroup5.hotel.identities.RealPerson;

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
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.EmployeeImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.EmployeeImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee {
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
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected RealPerson identity;

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
	public RealPerson getIdentity() {
		if (identity != null && ((EObject)identity).eIsProxy()) {
			InternalEObject oldIdentity = (InternalEObject)identity;
			identity = (RealPerson)eResolveProxy(oldIdentity);
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
	public RealPerson basicGetIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(RealPerson newIdentity) {
		identity = newIdentity;
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
			case PersonnelPackageImpl.EMPLOYEE__SCHEDULE:
				if (resolve) return getSchedule();
				return basicGetSchedule();
			case PersonnelPackageImpl.EMPLOYEE__KEY:
				if (resolve) return getKey();
				return basicGetKey();
			case PersonnelPackageImpl.EMPLOYEE__IDENTITY:
				if (resolve) return getIdentity();
				return basicGetIdentity();
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
			case PersonnelPackageImpl.EMPLOYEE__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
			case PersonnelPackageImpl.EMPLOYEE__KEY:
				setKey((Key)newValue);
				return;
			case PersonnelPackageImpl.EMPLOYEE__IDENTITY:
				setIdentity((RealPerson)newValue);
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
			case PersonnelPackageImpl.EMPLOYEE__SCHEDULE:
				setSchedule((Schedule)null);
				return;
			case PersonnelPackageImpl.EMPLOYEE__KEY:
				setKey((Key)null);
				return;
			case PersonnelPackageImpl.EMPLOYEE__IDENTITY:
				setIdentity((RealPerson)null);
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
			case PersonnelPackageImpl.EMPLOYEE__SCHEDULE:
				return schedule != null;
			case PersonnelPackageImpl.EMPLOYEE__KEY:
				return key != null;
			case PersonnelPackageImpl.EMPLOYEE__IDENTITY:
				return identity != null;
			case PersonnelPackageImpl.EMPLOYEE__ROLE:
				return role != null;
		}
		return eDynamicIsSet(featureID);
	}

} //EmployeeImpl
