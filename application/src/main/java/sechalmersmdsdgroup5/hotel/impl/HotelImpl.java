/**
 */
package sechalmersmdsdgroup5.hotel.impl;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.blacklist.Blacklist;
import sechalmersmdsdgroup5.hotel.blacklist.impl.BlacklistImpl;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.facilities.*;
import sechalmersmdsdgroup5.hotel.facilities.impl.AccessLogImpl;
import sechalmersmdsdgroup5.hotel.log.TaskLog;
import sechalmersmdsdgroup5.hotel.log.impl.TaskLogImpl;
import sechalmersmdsdgroup5.hotel.ordering.Campaign;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.personnel.Employee;
import sechalmersmdsdgroup5.hotel.personnel.Subcontractor;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getEmployeeAreas <em>Employee Areas</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getSubcontractors <em>Subcontractors</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getGuests <em>Guests</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getServiceBlueprints <em>Service Blueprints</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getRoomPrototypes <em>Room Prototypes</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getAccessLog <em>Access Log</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.impl.HotelImpl#getTaskLog <em>Task Log</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
class HotelImpl implements Hotel {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	private String name = "";

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	private String location = "";

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	private List<Order> orders = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	private List<Room> rooms = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getCampaigns() <em>Campaigns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaigns()
	 * @generated
	 * @ordered
	 */
	private List<Campaign> campaigns = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	private List<Key> keys = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	private List<Door> doors = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getEmployeeAreas() <em>Employee Areas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeAreas()
	 * @generated
	 * @ordered
	 */
	private List<EmployeeArea> employeeAreas = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getSubcontractors() <em>Subcontractors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcontractors()
	 * @generated
	 * @ordered
	 */
	private List<Subcontractor> subcontractors = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	private List<Customer> customers = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	private List<Guest> guests = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	private List<Employee> employees = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getServiceBlueprints() <em>Service Blueprints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBlueprints()
	 * @generated
	 * @ordered
	 */
	private List<ServiceBlueprint> serviceBlueprints = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getRoomPrototypes() <em>Room Prototypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomPrototypes()
	 * @generated
	 * @ordered
	 */
	private List<RoomPrototype> roomPrototypes = new ArrayList<>();

	/**
	 * The cached value of the '{@link #getAccessLog() <em>Access Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLog()
	 * @generated
	 * @ordered
	 */
	private AccessLog accessLog = new AccessLogImpl();

	/**
	 * The cached value of the '{@link #getTaskLog() <em>Task Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskLog()
	 * @generated
	 * @ordered
	 */
	private TaskLog taskLog = new TaskLogImpl();

	private Blacklist blacklist = new BlacklistImpl();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	HotelImpl() {}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		location = newLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Order> getOrders() {
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Room> getRooms() {
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Key> getKeys() {
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Door> getDoors() {
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EmployeeArea> getEmployeeAreas() {
		return employeeAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Subcontractor> getSubcontractors() {
		return subcontractors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Customer> getCustomers() {
		return customers;
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
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ServiceBlueprint> getServiceBlueprints() {
		return serviceBlueprints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RoomPrototype> getRoomPrototypes() {
		return roomPrototypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLog getAccessLog() {
		return accessLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLog(AccessLog newAccessLog) {
		accessLog = newAccessLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskLog getTaskLog() {
		return taskLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskLog(TaskLog newTaskLog) {
		taskLog = newTaskLog;
	}

	@Override
	public Blacklist getBlacklist() {
		return blacklist;
	}

	@Override
	public void setBlacklist(Blacklist value) {
		blacklist = value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}
} //HotelImpl