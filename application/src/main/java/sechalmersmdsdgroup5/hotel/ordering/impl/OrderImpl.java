/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

import sechalmersmdsdgroup5.hotel.ordering.Campaign;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.OrderImpl#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class OrderImpl implements Order {
	private int id;

	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	private List<Invoice> invoice;

	/**
	 * The cached value of the '{@link #getCampaigns() <em>Campaigns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaigns()
	 * @generated
	 * @ordered
	 */
	private List<Campaign> campaigns = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	private List<RoomBooking> bookings = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	private Date creationDate = new Date();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrderImpl() {}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Invoice> getInvoice() {
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RoomBooking> getBookings() {
		return bookings;
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

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId( int value ) {
		id = value;
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
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (booking ID: " + id + ")");
		result.append(" (creationDate: " + creationDate + ")");
		for(RoomBooking booking: getBookings()) {
			result.append(" (booking: " + booking.toString());
		}
		for(Campaign campaign : getCampaigns()) {
			result.append(" (campaign: " + campaign.toString());
		}
		for(Invoice invoice : getInvoice()) {
			result.append(" (invoice: " + invoice.toString());
		}
		return result.toString();
	}
} //OrderImpl