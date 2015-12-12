/**
 */
package sechalmersmdsdgroup5.hotel.payment.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.payment.CreditCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.impl.CreditCardImpl#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.impl.CreditCardImpl#getExpiryMonth <em>Expiry Month</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.impl.CreditCardImpl#getExpiryYear <em>Expiry Year</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.impl.CreditCardImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.impl.CreditCardImpl#getCcv <em>Ccv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreditCardImpl extends MinimalEObjectImpl.Container implements CreditCard {
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
	 * The default value of the '{@link #getExpiryMonth() <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRY_MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpiryMonth() <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryMonth()
	 * @generated
	 * @ordered
	 */
	protected int expiryMonth = EXPIRY_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryYear() <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryYear()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRY_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpiryYear() <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryYear()
	 * @generated
	 * @ordered
	 */
	protected int expiryYear = EXPIRY_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected static final int CCV_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected int ccv = CCV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackageImpl.Literals.CREDIT_CARD;
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
	public int getExpiryMonth() {
		return expiryMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryMonth(int newExpiryMonth) {
		expiryMonth = newExpiryMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpiryYear() {
		return expiryYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryYear(int newExpiryYear) {
		expiryYear = newExpiryYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		number = newNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCcv() {
		return ccv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcv(int newCcv) {
		ccv = newCcv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackageImpl.CREDIT_CARD__NAME:
				return getName();
			case PaymentPackageImpl.CREDIT_CARD__EXPIRY_MONTH:
				return getExpiryMonth();
			case PaymentPackageImpl.CREDIT_CARD__EXPIRY_YEAR:
				return getExpiryYear();
			case PaymentPackageImpl.CREDIT_CARD__NUMBER:
				return getNumber();
			case PaymentPackageImpl.CREDIT_CARD__CCV:
				return getCcv();
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
			case PaymentPackageImpl.CREDIT_CARD__NAME:
				setName((String)newValue);
				return;
			case PaymentPackageImpl.CREDIT_CARD__EXPIRY_MONTH:
				setExpiryMonth((Integer)newValue);
				return;
			case PaymentPackageImpl.CREDIT_CARD__EXPIRY_YEAR:
				setExpiryYear((Integer)newValue);
				return;
			case PaymentPackageImpl.CREDIT_CARD__NUMBER:
				setNumber((String)newValue);
				return;
			case PaymentPackageImpl.CREDIT_CARD__CCV:
				setCcv((Integer)newValue);
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
			case PaymentPackageImpl.CREDIT_CARD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PaymentPackageImpl.CREDIT_CARD__EXPIRY_MONTH:
				setExpiryMonth(EXPIRY_MONTH_EDEFAULT);
				return;
			case PaymentPackageImpl.CREDIT_CARD__EXPIRY_YEAR:
				setExpiryYear(EXPIRY_YEAR_EDEFAULT);
				return;
			case PaymentPackageImpl.CREDIT_CARD__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case PaymentPackageImpl.CREDIT_CARD__CCV:
				setCcv(CCV_EDEFAULT);
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
			case PaymentPackageImpl.CREDIT_CARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PaymentPackageImpl.CREDIT_CARD__EXPIRY_MONTH:
				return expiryMonth != EXPIRY_MONTH_EDEFAULT;
			case PaymentPackageImpl.CREDIT_CARD__EXPIRY_YEAR:
				return expiryYear != EXPIRY_YEAR_EDEFAULT;
			case PaymentPackageImpl.CREDIT_CARD__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case PaymentPackageImpl.CREDIT_CARD__CCV:
				return ccv != CCV_EDEFAULT;
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
		result.append(", expiryMonth: ");
		result.append(expiryMonth);
		result.append(", expiryYear: ");
		result.append(expiryYear);
		result.append(", number: ");
		result.append(number);
		result.append(", ccv: ");
		result.append(ccv);
		result.append(')');
		return result.toString();
	}

} //CreditCardImpl
