/**
 */
package sechalmersmdsdgroup5.hotel.ordering;

import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.payment.Payable;

import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.Order#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.Order#getBookings <em>Bookings</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.Order#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.Order#getId <em>Id</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.Order#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Order extends Payable {
	/**
	 * Returns the value of the '<em><b>Campaigns</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.ordering.Campaign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaigns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaigns</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Campaign> getCampaigns();

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.ordering.RoomBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<RoomBooking> getBookings();

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.Order#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

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
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.Order#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.Order#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double calculatePrice();

} // Order
