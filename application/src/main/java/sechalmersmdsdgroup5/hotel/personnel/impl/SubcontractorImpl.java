/**
 */
package sechalmersmdsdgroup5.hotel.personnel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.personnel.Subcontractor;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subcontractor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.SubcontractorImpl#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.SubcontractorImpl#getWorkBeeingDone <em>Work Beeing Done</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.SubcontractorImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.SubcontractorImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.impl.SubcontractorImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubcontractorImpl extends MinimalEObjectImpl.Container implements Subcontractor {
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
	 * The default value of the '{@link #getWorkBeeingDone() <em>Work Beeing Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkBeeingDone()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_BEEING_DONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkBeeingDone() <em>Work Beeing Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkBeeingDone()
	 * @generated
	 * @ordered
	 */
	protected String workBeeingDone = WORK_BEEING_DONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

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
	protected SubcontractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersonnelPackageImpl.Literals.SUBCONTRACTOR;
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
	public String getWorkBeeingDone() {
		return workBeeingDone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkBeeingDone(String newWorkBeeingDone) {
		workBeeingDone = newWorkBeeingDone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		startDate = newStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		endDate = newEndDate;
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
			case PersonnelPackageImpl.SUBCONTRACTOR__NAME:
				return getName();
			case PersonnelPackageImpl.SUBCONTRACTOR__WORK_BEEING_DONE:
				return getWorkBeeingDone();
			case PersonnelPackageImpl.SUBCONTRACTOR__START_DATE:
				return getStartDate();
			case PersonnelPackageImpl.SUBCONTRACTOR__END_DATE:
				return getEndDate();
			case PersonnelPackageImpl.SUBCONTRACTOR__KEY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersonnelPackageImpl.SUBCONTRACTOR__NAME:
				setName((String)newValue);
				return;
			case PersonnelPackageImpl.SUBCONTRACTOR__WORK_BEEING_DONE:
				setWorkBeeingDone((String)newValue);
				return;
			case PersonnelPackageImpl.SUBCONTRACTOR__START_DATE:
				setStartDate((Date)newValue);
				return;
			case PersonnelPackageImpl.SUBCONTRACTOR__END_DATE:
				setEndDate((Date)newValue);
				return;
			case PersonnelPackageImpl.SUBCONTRACTOR__KEY:
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
			case PersonnelPackageImpl.SUBCONTRACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PersonnelPackageImpl.SUBCONTRACTOR__WORK_BEEING_DONE:
				setWorkBeeingDone(WORK_BEEING_DONE_EDEFAULT);
				return;
			case PersonnelPackageImpl.SUBCONTRACTOR__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case PersonnelPackageImpl.SUBCONTRACTOR__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case PersonnelPackageImpl.SUBCONTRACTOR__KEY:
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
			case PersonnelPackageImpl.SUBCONTRACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PersonnelPackageImpl.SUBCONTRACTOR__WORK_BEEING_DONE:
				return WORK_BEEING_DONE_EDEFAULT == null ? workBeeingDone != null : !WORK_BEEING_DONE_EDEFAULT.equals(workBeeingDone);
			case PersonnelPackageImpl.SUBCONTRACTOR__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case PersonnelPackageImpl.SUBCONTRACTOR__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case PersonnelPackageImpl.SUBCONTRACTOR__KEY:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", workBeeingDone: ");
		result.append(workBeeingDone);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //SubcontractorImpl
