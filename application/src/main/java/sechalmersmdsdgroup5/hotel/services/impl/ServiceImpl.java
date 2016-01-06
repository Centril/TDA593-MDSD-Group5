/**
 */
package sechalmersmdsdgroup5.hotel.services.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;
import sechalmersmdsdgroup5.hotel.services.ServiceConsumer;
import java.util.Collection;
import java.util.Date;
import java.util.List;

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
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.impl.ServiceImpl#getBlueprint <em>Blueprint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service{
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
	 * The cached value of the '{@link #getBlueprint() <em>Blueprint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueprint()
	 * @generated
	 * @ordered
	 */
	protected ServiceBlueprint blueprint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * Creates a ServiceImpl with price and consumer
	 * @param price the price of the ServiceImpl
	 * @param consumer the ServiceConsumer of the ServiceImpl
     */
	protected ServiceImpl(Double price, ServiceConsumer consumer) {
		super();
		this.setPrice(price);
		this.setConsumer(consumer);
		this.setCreationDate(new Date());
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
	public ServiceBlueprint getBlueprint() {
		if (blueprint != null && ((EObject)blueprint).eIsProxy()) {
			InternalEObject oldBlueprint = (InternalEObject)blueprint;
			blueprint = (ServiceBlueprint)eResolveProxy(oldBlueprint);
			if (blueprint != oldBlueprint) {
			}
		}
		return blueprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBlueprint basicGetBlueprint() {
		return blueprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlueprint(ServiceBlueprint newBlueprint) {
		blueprint = newBlueprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double totalPrice() {
		return price;
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
			case ServicesPackageImpl.SERVICE__ID:
				return getId();
			case ServicesPackageImpl.SERVICE__NAME:
				return getName();
			case ServicesPackageImpl.SERVICE__BLUEPRINT:
				if (resolve) return getBlueprint();
				return basicGetBlueprint();
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
			case ServicesPackageImpl.SERVICE__ID:
				setId((Integer)newValue);
				return;
			case ServicesPackageImpl.SERVICE__NAME:
				setName((String)newValue);
				return;
			case ServicesPackageImpl.SERVICE__BLUEPRINT:
				setBlueprint((ServiceBlueprint)newValue);
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
			case ServicesPackageImpl.SERVICE__ID:
				setId(ID_EDEFAULT);
				return;
			case ServicesPackageImpl.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicesPackageImpl.SERVICE__BLUEPRINT:
				setBlueprint((ServiceBlueprint)null);
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
			case ServicesPackageImpl.SERVICE__ID:
				return id != ID_EDEFAULT;
			case ServicesPackageImpl.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicesPackageImpl.SERVICE__BLUEPRINT:
				return blueprint != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
