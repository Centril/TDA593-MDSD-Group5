/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import sechalmersmdsdgroup5.hotel.ordering.Campaign;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl#getInvoices <em>Invoices</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl#getBookings <em>Bookings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The cached value of the '{@link #getCampaigns() <em>Campaigns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Campaign> campaigns;

	/**
	 * The cached value of the '{@link #getInvoices() <em>Invoices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoices()
	 * @generated
	 * @ordered
	 */
	protected EList<Invoice> invoices;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomBooking> bookings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderingPackageImpl.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Campaign> getCampaigns() {
		if (campaigns == null) {
			campaigns = new BasicInternalEList<Campaign>(Campaign.class);
		}
		return campaigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Invoice> getInvoices() {
		if (invoices == null) {
			invoices = new BasicInternalEList<Invoice>(Invoice.class);
		}
		return invoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RoomBooking> getBookings() {
		if (bookings == null) {
			bookings = new BasicInternalEList<RoomBooking>(RoomBooking.class);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculatePrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
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
			case OrderingPackageImpl.ORDER__CAMPAIGNS:
				return getCampaigns();
			case OrderingPackageImpl.ORDER__INVOICES:
				return getInvoices();
			case OrderingPackageImpl.ORDER__BOOKINGS:
				return getBookings();
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
			case OrderingPackageImpl.ORDER__CAMPAIGNS:
				getCampaigns().clear();
				getCampaigns().addAll((Collection<? extends Campaign>)newValue);
				return;
			case OrderingPackageImpl.ORDER__INVOICES:
				getInvoices().clear();
				getInvoices().addAll((Collection<? extends Invoice>)newValue);
				return;
			case OrderingPackageImpl.ORDER__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends RoomBooking>)newValue);
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
			case OrderingPackageImpl.ORDER__CAMPAIGNS:
				getCampaigns().clear();
				return;
			case OrderingPackageImpl.ORDER__INVOICES:
				getInvoices().clear();
				return;
			case OrderingPackageImpl.ORDER__BOOKINGS:
				getBookings().clear();
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
			case OrderingPackageImpl.ORDER__CAMPAIGNS:
				return campaigns != null && !campaigns.isEmpty();
			case OrderingPackageImpl.ORDER__INVOICES:
				return invoices != null && !invoices.isEmpty();
			case OrderingPackageImpl.ORDER__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //OrderImpl
