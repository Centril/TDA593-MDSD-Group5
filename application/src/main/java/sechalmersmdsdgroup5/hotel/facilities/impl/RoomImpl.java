/**
 */
package sechalmersmdsdgroup5.hotel.facilities.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomAttribute;

import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl#getNr <em>Nr</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl#isUsable <em>Usable</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl#getLastCleaned <em>Last Cleaned</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl#getServicesAfforded <em>Services Afforded</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl#getPrototypes <em>Prototypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getNr() <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNr()
	 * @generated
	 * @ordered
	 */
	private static final int NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNr() <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNr()
	 * @generated
	 * @ordered
	 */
	private int nr = NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	private static final int FLOOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	private int floor = FLOOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsable() <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsable()
	 * @generated
	 * @ordered
	 */
	private static final boolean USABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsable() <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsable()
	 * @generated
	 * @ordered
	 */
	private boolean usable = USABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePrice() <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	private static final double BASE_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBasePrice() <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	private double basePrice = BASE_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastCleaned() <em>Last Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCleaned()
	 * @generated
	 * @ordered
	 */
	private static final Date LAST_CLEANED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastCleaned() <em>Last Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCleaned()
	 * @generated
	 * @ordered
	 */
	private Date lastCleaned = LAST_CLEANED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServicesAfforded() <em>Services Afforded</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesAfforded()
	 * @generated NOT
	 * @ordered
	 */
	private List<ServiceBlueprint> servicesAfforded;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated NOT
	 * @ordered
	 */
	private List<RoomAttribute> attributes;

	/**
	 * The cached value of the '{@link #getPrototypes() <em>Prototypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototypes()
	 * @generated NOT
	 * @ordered
	 */
	private List<PrototypeOrdering> prototypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoomImpl() {}

	RoomImpl( int nr, int floor, boolean usable, double basePrice, List<RoomAttribute> roomAttributes,
	          List<PrototypeOrdering> prototypeOrderings, List<ServiceBlueprint> serviceBlueprints ) {
		this.nr = nr;
		this.floor = floor;
		this.usable = usable;
		this.basePrice = basePrice;

		this.attributes = roomAttributes == null ? new ArrayList<>() : roomAttributes;
		this.prototypes = prototypeOrderings == null ? new ArrayList<>() : prototypeOrderings;

		this.servicesAfforded = serviceBlueprints == null ? new ArrayList<>() : serviceBlueprints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNr() {
		return nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNr(int newNr) {
		nr = newNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(int newFloor) {
		floor = newFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsable() {
		return usable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsable(boolean newUsable) {
		usable = newUsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBasePrice() {
		return basePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePrice(double newBasePrice) {
		basePrice = newBasePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastCleaned() {
		return lastCleaned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCleaned(Date newLastCleaned) {
		lastCleaned = newLastCleaned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ServiceBlueprint> getServicesAfforded() {
		return servicesAfforded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RoomAttribute> getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PrototypeOrdering> getPrototypes() {
		return prototypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAttribute getAttribute(String key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nr: ");
		result.append(nr);
		result.append(", floor: ");
		result.append(floor);
		result.append(", usable: ");
		result.append(usable);
		result.append(", basePrice: ");
		result.append(basePrice);
		result.append(", lastCleaned: ");
		result.append(lastCleaned);
		result.append(')');
		return result.toString();
	}
} //RoomImpl