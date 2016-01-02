/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

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
	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	private List<Invoice> invoice;

	public OrderImpl(List<Invoice> invoice, boolean isPaid, List<Campaign> campaigns, List<RoomBooking> bookings, Date creationDate) {
		this.invoice = invoice;
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
		return Functional.foldl(campaigns, total, (price, campaign) -> campaign.discount(this, price ));
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
		result.append(" (creationDate: ");
		result.append(creationDate);
		result.append(')');
		return result.toString();
	}
} //OrderImpl