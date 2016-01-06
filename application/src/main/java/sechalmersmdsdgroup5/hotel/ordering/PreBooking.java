/**
 */
package sechalmersmdsdgroup5.hotel.ordering;

import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getWillBook <em>Will Book</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface PreBooking {
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
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getStartDate <em>Start Date</em>}' attribute.
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
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Will Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Will Book</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Will Book</em>' reference.
	 * @see #setWillBook(Room)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getWillBook();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.ordering.PreBooking#getWillBook <em>Will Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Will Book</em>' reference.
	 * @see #getWillBook()
	 * @generated
	 */
	void setWillBook(Room value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.services.ServiceBlueprint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<ServiceBlueprint> getServices();

} // PreBooking
