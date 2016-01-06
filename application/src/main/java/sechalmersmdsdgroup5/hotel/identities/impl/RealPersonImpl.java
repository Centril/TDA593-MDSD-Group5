/**
 */
package sechalmersmdsdgroup5.hotel.identities.impl;

import org.eclipse.emf.ecore.EClass;
import sechalmersmdsdgroup5.hotel.identities.RealPerson;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.identities.impl.RealPersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.identities.impl.RealPersonImpl#getCitizenship <em>Citizenship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealPersonImpl extends IdentityImpl implements RealPerson {
	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCitizenship() <em>Citizenship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitizenship()
	 * @generated
	 * @ordered
	 */
	protected static final String CITIZENSHIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCitizenship() <em>Citizenship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitizenship()
	 * @generated
	 * @ordered
	 */
	protected String citizenship = CITIZENSHIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdentitiesPackageImpl.Literals.REAL_PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		age = newAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCitizenship() {
		return citizenship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitizenship(String newCitizenship) {
		citizenship = newCitizenship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdentitiesPackageImpl.REAL_PERSON__NAME:
				return getName();
			case IdentitiesPackageImpl.REAL_PERSON__ID_NUMBER:
				return getIdNumber();
			case IdentitiesPackageImpl.REAL_PERSON__AGE:
				return getAge();
			case IdentitiesPackageImpl.REAL_PERSON__CITIZENSHIP:
				return getCitizenship();
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
			case IdentitiesPackageImpl.REAL_PERSON__NAME:
				setName((String)newValue);
				return;
			case IdentitiesPackageImpl.REAL_PERSON__ID_NUMBER:
				setIdNumber((String)newValue);
				return;
			case IdentitiesPackageImpl.REAL_PERSON__AGE:
				setAge((Integer)newValue);
				return;
			case IdentitiesPackageImpl.REAL_PERSON__CITIZENSHIP:
				setCitizenship((String)newValue);
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
			case IdentitiesPackageImpl.REAL_PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IdentitiesPackageImpl.REAL_PERSON__ID_NUMBER:
				setIdNumber(ID_NUMBER_EDEFAULT);
				return;
			case IdentitiesPackageImpl.REAL_PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case IdentitiesPackageImpl.REAL_PERSON__CITIZENSHIP:
				setCitizenship(CITIZENSHIP_EDEFAULT);
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
			case IdentitiesPackageImpl.REAL_PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IdentitiesPackageImpl.REAL_PERSON__ID_NUMBER:
				return ID_NUMBER_EDEFAULT == null ? idNumber != null : !ID_NUMBER_EDEFAULT.equals(idNumber);
			case IdentitiesPackageImpl.REAL_PERSON__AGE:
				return age != AGE_EDEFAULT;
			case IdentitiesPackageImpl.REAL_PERSON__CITIZENSHIP:
				return CITIZENSHIP_EDEFAULT == null ? citizenship != null : !CITIZENSHIP_EDEFAULT.equals(citizenship);
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
		StringBuffer result = new StringBuffer("RealPerson");
		result.append(" (name: ");
		result.append(name);
		result.append(", idNumber: ");
		result.append(idNumber);
		result.append(", age: ");
		result.append(age);
		result.append(", citizenship: ");
		result.append(citizenship);
		result.append(')');
		return result.toString();
	}

} //RealPersonImpl
