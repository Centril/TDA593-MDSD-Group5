/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.ordering.Campaign;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.utils.Functional;

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
	private  Customer customer;

	public OrderImpl(List<Invoice> invoice, Customer customer, boolean isPaid, List<Campaign> campaigns, List<RoomBooking> bookings, Date creationDate) {
		this.invoice = invoice;
		this.customer = customer;
		this.isPaid = isPaid;
		this.campaigns = campaigns;
		this.bookings = bookings;
		this.creationDate = creationDate;
	}

	private boolean isPaid;


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

	public OrderImpl(RoomBooking room, Customer customer) {
		bookings.add(room);
		this.customer = customer;
	}

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

	@Override
	public Customer getCustomer() {
		return customer;
	}

	@Override
	public void setCustomer(Customer value) {
		this.customer = value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double totalPrice() {
		return calculatePrice();
	}

	/**
	 * This calculates the price of the order, including campaigns, services and bookings.
	 */
	public double calculatePrice() {
		double total = 0;
		for (RoomBooking booking: this.getBookings()) {
			total += booking.totalPrice();
		}
		if (campaigns != null) {
			total += Functional.foldl(campaigns, total, (price, campaign) -> campaign.discount(this, price ));
		}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
		return isPaid;
	}

	@Override
	public void setIsPaid(boolean value) {
		isPaid = value;
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
		result.append(" (customer: " + customer + ")");
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