/**
 */
package sechalmersmdsdgroup5.hotel.ordering;

import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.payment.Payable;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceConsumer;

import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getCheckinTime <em>Checkin Time</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getCheckoutTime <em>Checkout Time</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getBookedRoom <em>Booked Room</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getGuests <em>Guests</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getServices <em>Services</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getId <em>Id</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface RoomBooking extends Payable, ServiceConsumer {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Checkin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkin Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkin Time</em>' attribute.
	 * @see #setCheckinTime(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckinTime();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getCheckinTime <em>Checkin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkin Time</em>' attribute.
	 * @see #getCheckinTime()
	 * @generated
	 */
	void setCheckinTime(Date value);

	/**
	 * Returns the value of the '<em><b>Checkout Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkout Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkout Time</em>' attribute.
	 * @see #setCheckoutTime(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckoutTime();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getCheckoutTime <em>Checkout Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkout Time</em>' attribute.
	 * @see #getCheckoutTime()
	 * @generated
	 */
	void setCheckoutTime(Date value);

	/**
	 * Returns the value of the '<em><b>Booked Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booked Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked Room</em>' reference.
	 * @see #setBookedRoom(Room)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getBookedRoom();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getBookedRoom <em>Booked Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booked Room</em>' reference.
	 * @see #getBookedRoom()
	 * @generated
	 */
	void setBookedRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Paid</em>' attribute.
	 * @see #setIsPaid(boolean)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#isPaid <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Paid</em>' attribute.
	 * @see #isPaid()
	 * @generated
	 */
	void setIsPaid(boolean value);

	/**
	 * Returns the value of the '<em><b>Guests</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.clients.Guest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guests</em>' reference list.
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List<Guest> getGuests();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.services.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // RoomBooking
