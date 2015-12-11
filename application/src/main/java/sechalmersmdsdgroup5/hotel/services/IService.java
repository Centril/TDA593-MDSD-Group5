/**
 */
package sechalmersmdsdgroup5.hotel.services;

import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IService</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false" serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	boolean addServiceToBooking(RoomBooking booking, Service service);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false" wantedServiceRequired="true" wantedServiceOrdered="false"
	 * @generated
	 */
	boolean bookService(RoomBooking booking, ServiceBlueprint wantedService);

} // IService
