/**
 */
package sechalmersmdsdgroup5.hotel.search;

import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.PreBooking;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISearch</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISearch {

    /**
     * Returns a list of current orders associated with a client.
     * @param clientName
     * @return
     */
	List<Order> searchActiveOrders(String clientName);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" queryRequired="true" queryOrdered="false"
	 * @generated
	 */
	List<SearchResult<PreBooking>> searchAvailableBookings(Date from, Date to, SearchQuery<PreBooking> query);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" availableFromRequired="true" availableFromOrdered="false" availableToRequired="true" availableToOrdered="false"
	 * @generated
	 */
	List<Room> searchAvailableRooms(Date availableFrom, Date availableTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" occupiedFromRequired="true" occupiedFromOrdered="false" occupiedToRequired="true" occupiedToOrdered="false"
	 * @generated
	 */
	List<Room> searchOccupiedRooms(Date occupiedFrom, Date occupiedTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" activeFromRequired="true" activeFromOrdered="false" activeToRequired="true" activeToOrdered="false"
	 * @generated
	 */
	List<RoomBooking> searchActiveBookings(Date activeFrom, Date activeTo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	List<Service> searchUsedServices(RoomBooking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" orderRequired="true" orderOrdered="false"
	 * @generated
	 */
	List<Service> searchUsedServices(Order order);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	List<ServiceBlueprint> searchServicesFor(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" queryRequired="true" queryOrdered="false"
	 * @generated
	 */
	List<SearchResult<RoomBooking>> searchBookingsNotCheckedIn(SearchQuery<RoomBooking> query);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" queryRequired="true" queryOrdered="false"
	 * @generated
	 */
	List<SearchResult<Key>> searchKey(SearchQuery<Key> query);
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" queryRequired="true" queryOrdered="false"
	 * @generated
	 */
	List<SearchResult<Customer>> searchCustomer(SearchQuery<Customer> query);

} // ISearch
