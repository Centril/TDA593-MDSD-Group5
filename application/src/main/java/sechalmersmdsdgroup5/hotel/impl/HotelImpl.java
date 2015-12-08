/**
 */
package sechalmersmdsdgroup5.hotel.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import sechalmersmdsdgroup5.hotel.Hotel;

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
 * @generated
 */
public class HotelImpl extends MinimalEObjectImpl.Container implements Hotel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getCampaigns() <em>Campaigns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Campaign> campaigns;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<Key> keys;

	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected EList<Door> doors;

	/**
	 * The cached value of the '{@link #getEmployeeAreas() <em>Employee Areas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeAreas()
	 * @generated
	 * @ordered
	 */
	protected EList<EmployeeArea> employeeAreas;

	/**
	 * The cached value of the '{@link #getSubcontractors() <em>Subcontractors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcontractors()
	 * @generated
	 * @ordered
	 */
	protected EList<Subcontractor> subcontractors;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	protected EList<Guest> guests;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getServiceBlueprints() <em>Service Blueprints</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBlueprints()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBlueprint> serviceBlueprints;

	/**
	 * The cached value of the '{@link #getRoomPrototypes() <em>Room Prototypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomPrototypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomPrototype> roomPrototypes;

	/**
	 * The cached value of the '{@link #getAccessLog() <em>Access Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLog()
	 * @generated
	 * @ordered
	 */
	protected AccessLog accessLog;

	/**
	 * The cached value of the '{@link #getTaskLog() <em>Task Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskLog()
	 * @generated
	 * @ordered
	 */
	protected TaskLog taskLog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelPackageImpl.Literals.HOTEL;
	}

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
		if (orders == null) {
			orders = new BasicInternalEList<Order>(Order.class);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Room> getRooms() {
		if (rooms == null) {
			rooms = new BasicInternalEList<Room>(Room.class);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Campaign> getCampaigns() {
		if (campaigns == null) {
			campaigns = new BasicInternalEList<Campaign>(Campaign.class);
		}
		return campaigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Key> getKeys() {
		if (keys == null) {
			keys = new BasicInternalEList<Key>(Key.class);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Door> getDoors() {
		if (doors == null) {
			doors = new BasicInternalEList<Door>(Door.class);
		}
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<EmployeeArea> getEmployeeAreas() {
		if (employeeAreas == null) {
			employeeAreas = new BasicInternalEList<EmployeeArea>(EmployeeArea.class);
		}
		return employeeAreas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Subcontractor> getSubcontractors() {
		if (subcontractors == null) {
			subcontractors = new BasicInternalEList<Subcontractor>(Subcontractor.class);
		}
		return subcontractors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Customer> getCustomers() {
		if (customers == null) {
			customers = new BasicInternalEList<Customer>(Customer.class);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Guest> getGuests() {
		if (guests == null) {
			guests = new BasicInternalEList<Guest>(Guest.class);
		}
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Employee> getEmployees() {
		if (employees == null) {
			employees = new BasicInternalEList<Employee>(Employee.class);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ServiceBlueprint> getServiceBlueprints() {
		if (serviceBlueprints == null) {
			serviceBlueprints = new BasicInternalEList<ServiceBlueprint>(ServiceBlueprint.class);
		}
		return serviceBlueprints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RoomPrototype> getRoomPrototypes() {
		if (roomPrototypes == null) {
			roomPrototypes = new BasicInternalEList<RoomPrototype>(RoomPrototype.class);
		}
		return roomPrototypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLog getAccessLog() {
		if (accessLog != null && ((EObject)accessLog).eIsProxy()) {
			InternalEObject oldAccessLog = (InternalEObject)accessLog;
			accessLog = (AccessLog)eResolveProxy(oldAccessLog);
			if (accessLog != oldAccessLog) {
			}
		}
		return accessLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLog basicGetAccessLog() {
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
		if (taskLog != null && ((EObject)taskLog).eIsProxy()) {
			InternalEObject oldTaskLog = (InternalEObject)taskLog;
			taskLog = (TaskLog)eResolveProxy(oldTaskLog);
			if (taskLog != oldTaskLog) {
			}
		}
		return taskLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskLog basicGetTaskLog() {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelPackageImpl.HOTEL__NAME:
				return getName();
			case HotelPackageImpl.HOTEL__LOCATION:
				return getLocation();
			case HotelPackageImpl.HOTEL__ORDERS:
				return getOrders();
			case HotelPackageImpl.HOTEL__ROOMS:
				return getRooms();
			case HotelPackageImpl.HOTEL__CAMPAIGNS:
				return getCampaigns();
			case HotelPackageImpl.HOTEL__KEYS:
				return getKeys();
			case HotelPackageImpl.HOTEL__DOORS:
				return getDoors();
			case HotelPackageImpl.HOTEL__EMPLOYEE_AREAS:
				return getEmployeeAreas();
			case HotelPackageImpl.HOTEL__SUBCONTRACTORS:
				return getSubcontractors();
			case HotelPackageImpl.HOTEL__CUSTOMERS:
				return getCustomers();
			case HotelPackageImpl.HOTEL__GUESTS:
				return getGuests();
			case HotelPackageImpl.HOTEL__EMPLOYEES:
				return getEmployees();
			case HotelPackageImpl.HOTEL__SERVICE_BLUEPRINTS:
				return getServiceBlueprints();
			case HotelPackageImpl.HOTEL__ROOM_PROTOTYPES:
				return getRoomPrototypes();
			case HotelPackageImpl.HOTEL__ACCESS_LOG:
				if (resolve) return getAccessLog();
				return basicGetAccessLog();
			case HotelPackageImpl.HOTEL__TASK_LOG:
				if (resolve) return getTaskLog();
				return basicGetTaskLog();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HotelPackageImpl.HOTEL__NAME:
				setName((String)newValue);
				return;
			case HotelPackageImpl.HOTEL__LOCATION:
				setLocation((String)newValue);
				return;
			case HotelPackageImpl.HOTEL__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case HotelPackageImpl.HOTEL__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case HotelPackageImpl.HOTEL__CAMPAIGNS:
				getCampaigns().clear();
				getCampaigns().addAll((Collection<? extends Campaign>)newValue);
				return;
			case HotelPackageImpl.HOTEL__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends Key>)newValue);
				return;
			case HotelPackageImpl.HOTEL__DOORS:
				getDoors().clear();
				getDoors().addAll((Collection<? extends Door>)newValue);
				return;
			case HotelPackageImpl.HOTEL__EMPLOYEE_AREAS:
				getEmployeeAreas().clear();
				getEmployeeAreas().addAll((Collection<? extends EmployeeArea>)newValue);
				return;
			case HotelPackageImpl.HOTEL__SUBCONTRACTORS:
				getSubcontractors().clear();
				getSubcontractors().addAll((Collection<? extends Subcontractor>)newValue);
				return;
			case HotelPackageImpl.HOTEL__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case HotelPackageImpl.HOTEL__GUESTS:
				getGuests().clear();
				getGuests().addAll((Collection<? extends Guest>)newValue);
				return;
			case HotelPackageImpl.HOTEL__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case HotelPackageImpl.HOTEL__SERVICE_BLUEPRINTS:
				getServiceBlueprints().clear();
				getServiceBlueprints().addAll((Collection<? extends ServiceBlueprint>)newValue);
				return;
			case HotelPackageImpl.HOTEL__ROOM_PROTOTYPES:
				getRoomPrototypes().clear();
				getRoomPrototypes().addAll((Collection<? extends RoomPrototype>)newValue);
				return;
			case HotelPackageImpl.HOTEL__ACCESS_LOG:
				setAccessLog((AccessLog)newValue);
				return;
			case HotelPackageImpl.HOTEL__TASK_LOG:
				setTaskLog((TaskLog)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HotelPackageImpl.HOTEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HotelPackageImpl.HOTEL__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case HotelPackageImpl.HOTEL__ORDERS:
				getOrders().clear();
				return;
			case HotelPackageImpl.HOTEL__ROOMS:
				getRooms().clear();
				return;
			case HotelPackageImpl.HOTEL__CAMPAIGNS:
				getCampaigns().clear();
				return;
			case HotelPackageImpl.HOTEL__KEYS:
				getKeys().clear();
				return;
			case HotelPackageImpl.HOTEL__DOORS:
				getDoors().clear();
				return;
			case HotelPackageImpl.HOTEL__EMPLOYEE_AREAS:
				getEmployeeAreas().clear();
				return;
			case HotelPackageImpl.HOTEL__SUBCONTRACTORS:
				getSubcontractors().clear();
				return;
			case HotelPackageImpl.HOTEL__CUSTOMERS:
				getCustomers().clear();
				return;
			case HotelPackageImpl.HOTEL__GUESTS:
				getGuests().clear();
				return;
			case HotelPackageImpl.HOTEL__EMPLOYEES:
				getEmployees().clear();
				return;
			case HotelPackageImpl.HOTEL__SERVICE_BLUEPRINTS:
				getServiceBlueprints().clear();
				return;
			case HotelPackageImpl.HOTEL__ROOM_PROTOTYPES:
				getRoomPrototypes().clear();
				return;
			case HotelPackageImpl.HOTEL__ACCESS_LOG:
				setAccessLog((AccessLog)null);
				return;
			case HotelPackageImpl.HOTEL__TASK_LOG:
				setTaskLog((TaskLog)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HotelPackageImpl.HOTEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HotelPackageImpl.HOTEL__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case HotelPackageImpl.HOTEL__ORDERS:
				return orders != null && !orders.isEmpty();
			case HotelPackageImpl.HOTEL__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case HotelPackageImpl.HOTEL__CAMPAIGNS:
				return campaigns != null && !campaigns.isEmpty();
			case HotelPackageImpl.HOTEL__KEYS:
				return keys != null && !keys.isEmpty();
			case HotelPackageImpl.HOTEL__DOORS:
				return doors != null && !doors.isEmpty();
			case HotelPackageImpl.HOTEL__EMPLOYEE_AREAS:
				return employeeAreas != null && !employeeAreas.isEmpty();
			case HotelPackageImpl.HOTEL__SUBCONTRACTORS:
				return subcontractors != null && !subcontractors.isEmpty();
			case HotelPackageImpl.HOTEL__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case HotelPackageImpl.HOTEL__GUESTS:
				return guests != null && !guests.isEmpty();
			case HotelPackageImpl.HOTEL__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case HotelPackageImpl.HOTEL__SERVICE_BLUEPRINTS:
				return serviceBlueprints != null && !serviceBlueprints.isEmpty();
			case HotelPackageImpl.HOTEL__ROOM_PROTOTYPES:
				return roomPrototypes != null && !roomPrototypes.isEmpty();
			case HotelPackageImpl.HOTEL__ACCESS_LOG:
				return accessLog != null;
			case HotelPackageImpl.HOTEL__TASK_LOG:
				return taskLog != null;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //HotelImpl
