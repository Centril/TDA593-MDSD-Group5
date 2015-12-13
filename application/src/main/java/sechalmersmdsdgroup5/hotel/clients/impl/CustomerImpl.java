/**
 */
package sechalmersmdsdgroup5.hotel.clients.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.clients.Address;
import sechalmersmdsdgroup5.hotel.clients.Customer;

import sechalmersmdsdgroup5.hotel.identities.Identity;

import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.payment.CreditCard;
import sechalmersmdsdgroup5.hotel.payment.PaymentMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.CustomerImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.CustomerImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.CustomerImpl#getCard <em>Card</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.CustomerImpl#getAssociatedAdress <em>Associated Adress</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.CustomerImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.CustomerImpl#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoice;

	/**
	 * The default value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMethod PAYMENT_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMethod() <em>Payment Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethod()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethod = PAYMENT_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected CreditCard card;

	/**
	 * The cached value of the '{@link #getAssociatedAdress() <em>Associated Adress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedAdress()
	 * @generated
	 * @ordered
	 */
	protected Address associatedAdress;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected Identity identity;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientsPackageImpl.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice getInvoice() {
		if (invoice != null && ((EObject)invoice).eIsProxy()) {
			InternalEObject oldInvoice = (InternalEObject)invoice;
			invoice = (Invoice)eResolveProxy(oldInvoice);
			if (invoice != oldInvoice) {
			}
		}
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice basicGetInvoice() {
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoice(Invoice newInvoice) {
		invoice = newInvoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		paymentMethod = newPaymentMethod == null ? PAYMENT_METHOD_EDEFAULT : newPaymentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard getCard() {
		if (card != null && ((EObject)card).eIsProxy()) {
			InternalEObject oldCard = (InternalEObject)card;
			card = (CreditCard)eResolveProxy(oldCard);
			if (card != oldCard) {
			}
		}
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard basicGetCard() {
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCard(CreditCard newCard) {
		card = newCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAssociatedAdress() {
		if (associatedAdress != null && ((EObject)associatedAdress).eIsProxy()) {
			InternalEObject oldAssociatedAdress = (InternalEObject)associatedAdress;
			associatedAdress = (Address)eResolveProxy(oldAssociatedAdress);
			if (associatedAdress != oldAssociatedAdress) {
			}
		}
		return associatedAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address basicGetAssociatedAdress() {
		return associatedAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedAdress(Address newAssociatedAdress) {
		associatedAdress = newAssociatedAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getIdentity() {
		if (identity != null && ((EObject)identity).eIsProxy()) {
			InternalEObject oldIdentity = (InternalEObject)identity;
			identity = (Identity)eResolveProxy(oldIdentity);
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
	public Identity basicGetIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(Identity newIdentity) {
		identity = newIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientsPackageImpl.CUSTOMER__INVOICE:
				if (resolve) return getInvoice();
				return basicGetInvoice();
			case ClientsPackageImpl.CUSTOMER__PAYMENT_METHOD:
				return getPaymentMethod();
			case ClientsPackageImpl.CUSTOMER__CARD:
				if (resolve) return getCard();
				return basicGetCard();
			case ClientsPackageImpl.CUSTOMER__ASSOCIATED_ADRESS:
				if (resolve) return getAssociatedAdress();
				return basicGetAssociatedAdress();
			case ClientsPackageImpl.CUSTOMER__IDENTITY:
				if (resolve) return getIdentity();
				return basicGetIdentity();
			case ClientsPackageImpl.CUSTOMER__EMAIL:
				return getEmail();
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
			case ClientsPackageImpl.CUSTOMER__INVOICE:
				setInvoice((Invoice)newValue);
				return;
			case ClientsPackageImpl.CUSTOMER__PAYMENT_METHOD:
				setPaymentMethod((PaymentMethod)newValue);
				return;
			case ClientsPackageImpl.CUSTOMER__CARD:
				setCard((CreditCard)newValue);
				return;
			case ClientsPackageImpl.CUSTOMER__ASSOCIATED_ADRESS:
				setAssociatedAdress((Address)newValue);
				return;
			case ClientsPackageImpl.CUSTOMER__IDENTITY:
				setIdentity((Identity)newValue);
				return;
			case ClientsPackageImpl.CUSTOMER__EMAIL:
				setEmail((String)newValue);
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
			case ClientsPackageImpl.CUSTOMER__INVOICE:
				setInvoice((Invoice)null);
				return;
			case ClientsPackageImpl.CUSTOMER__PAYMENT_METHOD:
				setPaymentMethod(PAYMENT_METHOD_EDEFAULT);
				return;
			case ClientsPackageImpl.CUSTOMER__CARD:
				setCard((CreditCard)null);
				return;
			case ClientsPackageImpl.CUSTOMER__ASSOCIATED_ADRESS:
				setAssociatedAdress((Address)null);
				return;
			case ClientsPackageImpl.CUSTOMER__IDENTITY:
				setIdentity((Identity)null);
				return;
			case ClientsPackageImpl.CUSTOMER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
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
			case ClientsPackageImpl.CUSTOMER__INVOICE:
				return invoice != null;
			case ClientsPackageImpl.CUSTOMER__PAYMENT_METHOD:
				return paymentMethod != PAYMENT_METHOD_EDEFAULT;
			case ClientsPackageImpl.CUSTOMER__CARD:
				return card != null;
			case ClientsPackageImpl.CUSTOMER__ASSOCIATED_ADRESS:
				return associatedAdress != null;
			case ClientsPackageImpl.CUSTOMER__IDENTITY:
				return identity != null;
			case ClientsPackageImpl.CUSTOMER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
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
		result.append(" (paymentMethod: ");
		result.append(paymentMethod);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
