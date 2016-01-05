/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.Service;

import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getCheckinTime <em>Checkin Time</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getCheckoutTime <em>Checkout Time</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getBookedRoom <em>Booked Room</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getGuests <em>Guests</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
class RoomBookingImpl implements RoomBooking {
	private int id;

	/**
	 * Default constructor. Feel free to add another when needed.
	 * @param invoice
	 * @param startDate
	 * @param endDate
	 * @param checkinTime
	 * @param checkoutTime
	 * @param bookedRoom
	 * @param isPaid
     * @param guests
     * @param services
     */
	public RoomBookingImpl(List<Invoice> invoice, Date startDate, Date endDate, Date checkinTime, Date checkoutTime, Room bookedRoom, boolean isPaid, List<Guest> guests, List<Service> services) {
		this.invoice = invoice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.checkinTime = checkinTime;
		this.checkoutTime = checkoutTime;
		this.bookedRoom = bookedRoom;
		this.isPaid = isPaid;
		this.guests = guests;
		this.services = services;
	}
	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()

	 * @generated
	 * @ordered
	 */
	private List<Invoice> invoice = new ArrayList<>();

	/**
	 * The date the object was created.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @ordered
	 */
	private static final Date START_DATE_EDEFAULT = new Date();

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	private Date startDate = START_DATE_EDEFAULT;

	/**
	 * The end-date is automatically when the object was created.
	 * @see #getEndDate()
	 * @ordered
	 */
	private static final Date END_DATE_EDEFAULT = new Date();

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	private Date endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckinTime() <em>Checkin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckinTime()
	 * @ordered
	 */
	private static final Date CHECKIN_TIME_EDEFAULT = new Date();

	/**
	 * The cached value of the '{@link #getCheckinTime() <em>Checkin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckinTime()
	 * @generated
	 * @ordered
	 */
	private Date checkinTime = CHECKIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckoutTime() <em>Checkout Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckoutTime()
	 * @ordered
	 */
	private static final Date CHECKOUT_TIME_EDEFAULT = new Date();

	/**
	 * The cached value of the '{@link #getCheckoutTime() <em>Checkout Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckoutTime()
	 * @generated
	 * @ordered
	 */
	private Date checkoutTime = CHECKOUT_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookedRoom() <em>Booked Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedRoom()
	 * @generated
	 * @ordered
	 */
	private Room bookedRoom;

	/**
	 * The default value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	private static final boolean IS_PAID_EDEFAULT = false;

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
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	private List<Guest> guests = new ArrayList<Guest>();

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected List<Service> services = new ArrayList<Service>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoomBookingImpl() {}

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
	public Date getCheckinTime() {
		return checkinTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckinTime(Date newCheckinTime) {
		checkinTime = newCheckinTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckoutTime() {
		return checkoutTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckoutTime(Date newCheckoutTime) {
		checkoutTime = newCheckoutTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getBookedRoom() {
		return bookedRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookedRoom(Room newBookedRoom) {
		bookedRoom = newBookedRoom;
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
	public List<Guest> getGuests() {
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Service> getServices() {
		return services;
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
		double total = 0;
		//Services
		for (Service service : services) {
			total += service.totalPrice();
		}
		//Days times base price for the room
		total += bookedRoom.getBasePrice() * daysBetween(startDate,endDate);
		return total;
	}

	/**
	 * Finds the interval of the roomBooking in number of days..
	 * Converts to Java 8 library for dates, unsure whether
	 * Papyrus would have supported it natively.
	 * @param d1
	 * @param d2
     * @return
     */
	private int daysBetween(Date d1, Date d2) {
		Instant instant1 = d1.toInstant();
		Instant instant2 = d2.toInstant();
		ZonedDateTime zdt1 = instant1.atZone(ZoneId.systemDefault());
		ZonedDateTime zdt2 = instant2.atZone(ZoneId.systemDefault());
		LocalDate startDate = zdt1.toLocalDate();
		LocalDate endDate = zdt2.toLocalDate();
		return Period.between(startDate, endDate).getDays();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("RoomBooking (ID: " + getId());
		result.append(", booked room: " + getBookedRoom().toString());
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", checkinTime: ");
		result.append(checkinTime);
		result.append(", checkoutTime: ");
		result.append(checkoutTime);
		for(Guest guest : getGuests()){
			result.append(", guest: " + guest.toString());
		}
		for(Service service : getServices()){
			result.append(", service: " + service.toString());
		}
		result.append(", isPaid: ");
		result.append(isPaid);
		for(Invoice invoice : getInvoice()){
			result.append(", invoice: " + invoice.toString());
		}
		result.append(')');

		return result.toString();
	}
} //RoomBookingImpl