/**
 */
package sechalmersmdsdgroup5.hotel;

import java.util.List;

import sechalmersmdsdgroup5.hotel.blacklist.Blacklist;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;

import sechalmersmdsdgroup5.hotel.facilities.AccessLog;
import sechalmersmdsdgroup5.hotel.facilities.Door;
import sechalmersmdsdgroup5.hotel.facilities.EmployeeArea;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomPrototype;
import sechalmersmdsdgroup5.hotel.log.TaskLog;

import sechalmersmdsdgroup5.hotel.ordering.Campaign;
import sechalmersmdsdgroup5.hotel.ordering.Order;

import sechalmersmdsdgroup5.hotel.personnel.Employee;
import sechalmersmdsdgroup5.hotel.personnel.Subcontractor;

import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getLocation <em>Location</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getOrders <em>Orders</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getRooms <em>Rooms</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getKeys <em>Keys</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getDoors <em>Doors</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getEmployeeAreas <em>Employee Areas</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getSubcontractors <em>Subcontractors</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getCustomers <em>Customers</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getGuests <em>Guests</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getEmployees <em>Employees</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getServiceBlueprints <em>Service Blueprints</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getRoomPrototypes <em>Room Prototypes</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getAccessLog <em>Access Log</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getTaskLog <em>Task Log</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.Hotel#getBlacklist <em>Blacklist</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Hotel {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.Hotel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.Hotel#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.ordering.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Room> getRooms();

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
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.Key}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Key> getKeys();

	/**
	 * Returns the value of the '<em><b>Doors</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.Door}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Door> getDoors();

	/**
	 * Returns the value of the '<em><b>Employee Areas</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.EmployeeArea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Areas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Areas</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<EmployeeArea> getEmployeeAreas();

	/**
	 * Returns the value of the '<em><b>Subcontractors</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcontractors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcontractors</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Subcontractor> getSubcontractors();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.clients.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Customer> getCustomers();

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
	 * @model ordered="false"
	 * @generated
	 */
	List<Guest> getGuests();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.personnel.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Service Blueprints</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.services.ServiceBlueprint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Blueprints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Blueprints</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<ServiceBlueprint> getServiceBlueprints();

	/**
	 * Returns the value of the '<em><b>Room Prototypes</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Prototypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Prototypes</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<RoomPrototype> getRoomPrototypes();

	/**
	 * Returns the value of the '<em><b>Access Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Log</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Log</em>' reference.
	 * @see #setAccessLog(AccessLog)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AccessLog getAccessLog();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.Hotel#getAccessLog <em>Access Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Log</em>' reference.
	 * @see #getAccessLog()
	 * @generated
	 */
	void setAccessLog(AccessLog value);

	/**
	 * Returns the value of the '<em><b>Task Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Log</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Log</em>' reference.
	 * @see #setTaskLog(TaskLog)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TaskLog getTaskLog();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.Hotel#getTaskLog <em>Task Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Log</em>' reference.
	 * @see #getTaskLog()
	 * @generated
	 */
	void setTaskLog(TaskLog value);

	/**
	 * Returns the value of the '<em><b>Blacklist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blacklist</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blacklist</em>' reference.
	 * @see #setBlacklist(Blacklist)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Blacklist getBlacklist();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.Hotel#getBlacklist <em>Blacklist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blacklist</em>' reference.
	 * @see #getBlacklist()
	 * @generated
	 */
	void setBlacklist(Blacklist value);

} // Hotel
