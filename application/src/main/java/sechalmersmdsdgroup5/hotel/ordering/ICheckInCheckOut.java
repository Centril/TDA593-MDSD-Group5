/**
 */
package sechalmersmdsdgroup5.hotel.ordering;

import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.identities.Identity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICheck In Check Out</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ICheckInCheckOut {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" guestRequired="true" guestOrdered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean checkIn(Guest guest, RoomBooking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" guestRequired="true" guestOrdered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean checkOut(Guest guest, RoomBooking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" identityRequired="true" identityOrdered="false" keyRequired="true" keyOrdered="false"
	 * @generated
	 */
	boolean giveOutKey(Identity identity, Key key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" identityRequired="true" identityOrdered="false"
	 * @generated
	 */
	boolean takeBackKey(Identity identity);

} // ICheckInCheckOut
