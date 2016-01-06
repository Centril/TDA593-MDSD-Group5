/**
 */
package sechalmersmdsdgroup5.hotel.log.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import sechalmersmdsdgroup5.hotel.log.TaskTag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskTagImpl#getWhat <em>What</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskTagImpl extends MinimalEObjectImpl.Container implements TaskTag {
	/**
	 * The default value of the '{@link #getWhat() <em>What</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected static final String WHAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhat() <em>What</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected String what = WHAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackageImpl.Literals.TASK_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhat() {
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhat(String newWhat) {
		what = newWhat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackageImpl.TASK_TAG__WHAT:
				return getWhat();
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
			case LogPackageImpl.TASK_TAG__WHAT:
				setWhat((String)newValue);
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
			case LogPackageImpl.TASK_TAG__WHAT:
				setWhat(WHAT_EDEFAULT);
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
			case LogPackageImpl.TASK_TAG__WHAT:
				return WHAT_EDEFAULT == null ? what != null : !WHAT_EDEFAULT.equals(what);
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
		result.append(" (what: ");
		result.append(what);
		result.append(')');
		return result.toString();
	}

} //TaskTagImpl
