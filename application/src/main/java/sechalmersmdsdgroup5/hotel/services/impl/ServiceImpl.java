/**
 */
package sechalmersmdsdgroup5.hotel.services.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.ordering.OrderingFactory;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceImpl#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceImpl#getConsumer <em>Consumer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	protected EList<Invoice> invoice;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean isPaid = IS_PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected ServiceConsumer consumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() { super(); }
	protected ServiceImpl(Double price, ServiceConsumer consumer) {
		super();
		this.setPrice(price);
		this.setConsumer(consumer);
		this.setCreationDate(new Date());

		invoice = new BasicInternalEList<Invoice>(Invoice.class);
		// TODO Create a correct standard invoice for this Service
		invoice.add(OrderingFactory.INSTANCE.createInvoice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesPackageImpl.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Invoice> getInvoice() {
		if (invoice == null) {
			invoice = new BasicInternalEList<Invoice>(Invoice.class);
		}
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		price = newPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
		return isPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPaid(boolean newIsPaid) {
		isPaid = newIsPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		creationDate = newCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConsumer getConsumer() {
		if (consumer != null && ((EObject)consumer).eIsProxy()) {
			InternalEObject oldConsumer = (InternalEObject)consumer;
			consumer = (ServiceConsumer)eResolveProxy(oldConsumer);
			if (consumer != oldConsumer) {
			}
		}
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConsumer basicGetConsumer() {
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumer(ServiceConsumer newConsumer) {
		consumer = newConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double totalPrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicesPackageImpl.SERVICE__INVOICE:
				return getInvoice();
			case ServicesPackageImpl.SERVICE__PRICE:
				return getPrice();
			case ServicesPackageImpl.SERVICE__IS_PAID:
				return isPaid();
			case ServicesPackageImpl.SERVICE__CREATION_DATE:
				return getCreationDate();
			case ServicesPackageImpl.SERVICE__CONSUMER:
				if (resolve) return getConsumer();
				return basicGetConsumer();
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
			case ServicesPackageImpl.SERVICE__INVOICE:
				getInvoice().clear();
				getInvoice().addAll((Collection<? extends Invoice>)newValue);
				return;
			case ServicesPackageImpl.SERVICE__PRICE:
				setPrice((Double)newValue);
				return;
			case ServicesPackageImpl.SERVICE__IS_PAID:
				setIsPaid((Boolean)newValue);
				return;
			case ServicesPackageImpl.SERVICE__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case ServicesPackageImpl.SERVICE__CONSUMER:
				setConsumer((ServiceConsumer)newValue);
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
			case ServicesPackageImpl.SERVICE__INVOICE:
				getInvoice().clear();
				return;
			case ServicesPackageImpl.SERVICE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ServicesPackageImpl.SERVICE__IS_PAID:
				setIsPaid(IS_PAID_EDEFAULT);
				return;
			case ServicesPackageImpl.SERVICE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case ServicesPackageImpl.SERVICE__CONSUMER:
				setConsumer((ServiceConsumer)null);
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
			case ServicesPackageImpl.SERVICE__INVOICE:
				return invoice != null && !invoice.isEmpty();
			case ServicesPackageImpl.SERVICE__PRICE:
				return price != PRICE_EDEFAULT;
			case ServicesPackageImpl.SERVICE__IS_PAID:
				return isPaid != IS_PAID_EDEFAULT;
			case ServicesPackageImpl.SERVICE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case ServicesPackageImpl.SERVICE__CONSUMER:
				return consumer != null;
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
		result.append(" (price: ");
		result.append(price);
		result.append(", isPaid: ");
		result.append(isPaid);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
