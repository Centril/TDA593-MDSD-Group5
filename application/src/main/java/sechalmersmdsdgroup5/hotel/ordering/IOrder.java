/**
 */
package sechalmersmdsdgroup5.hotel.ordering;

import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;

import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOrder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IOrder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" preBookingRequired="true" preBookingOrdered="false" guestsRequired="true" guestsMany="true" guestsOrdered="false"
	 * @generated
	 */
	RoomBooking createBooking(PreBooking preBooking, List<Guest> guests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomBookingsMany="true" roomBookingsOrdered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	Order createOrder(List<RoomBooking> roomBookings, Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" orderRequired="true" orderOrdered="false" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	boolean sendConfirmationMail(Order order, String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void addGuestToBooking(Guest guest, RoomBooking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false" orderRequired="true" orderOrdered="false"
	 * @generated
	 */
	void addBookingToOrder(RoomBooking booking, Order order);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false" orderRequired="true" orderOrdered="false"
	 * @generated
	 */
	void addCustomerToOrder(Customer customer, Order order);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	boolean isValidDate(Date from, Date to);

} // IOrder
