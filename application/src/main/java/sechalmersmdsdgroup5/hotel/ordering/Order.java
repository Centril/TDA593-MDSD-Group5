/**
 */
package sechalmersmdsdgroup5.hotel.ordering;

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
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.Order#getInvoices <em>Invoices</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.Order#getBookings <em>Bookings</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Order {
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
	 * Returns the value of the '<em><b>Invoices</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.ordering.Invoice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoices</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<Invoice> getInvoices();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double calculatePrice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

} // Order
