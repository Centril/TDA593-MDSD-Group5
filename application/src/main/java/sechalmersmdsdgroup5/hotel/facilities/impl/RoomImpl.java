/**
 */
package sechalmersmdsdgroup5.hotel.facilities.impl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomAttribute;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.*;

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
 * @generated NOT
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

	RoomImpl( int nr, int floor, boolean usable, List<RoomAttribute> roomAttributes,
			  List<PrototypeOrdering> prototypeOrderings, List<ServiceBlueprint> serviceBlueprints ) {
		this.nr = nr;
		this.floor = floor;
		this.usable = usable;
		this.lastCleaned = null;
		this.prototypes = prototypeOrderings == null ? new ArrayList<PrototypeOrdering>() : prototypeOrderings;
		this.attributes = roomAttributes == null ? new ArrayList<RoomAttribute>() : roomAttributes;
		this.servicesAfforded = serviceBlueprints == null ? new ArrayList<ServiceBlueprint>() : serviceBlueprints;

		updateBasePrice();
	}

	private void updateBasePrice() {
		if (prototypes != null) {
			for (PrototypeOrdering prototypeOrdering: prototypes) {
				basePrice += prototypeOrdering.getPrototype().getBasePrice();
			}
			if (attributes != null) {
				for (RoomAttribute attribute : attributes) {
					basePrice += attribute.getPrice();
				}
			}
		}
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
		return new ArrayList<>(getAttributesMap().values());
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
	 *     gets a attribute by combining all attributes from prototypes,
	 *     regarding their ordering, and the attributes in the room.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAttribute getAttribute(String key) {
		return getAttributesMap().get(key);
	}

	@Override
	public List<RoomAttribute> getLocalAttributes() {
		return attributes;
	}

	private Map<String, RoomAttribute> getAttributesMap() {
		Map<String, RoomAttribute> protAttr = getRoomAttributesFromPrototypes();
		attributes.forEach(attr -> protAttr.put(attr.getName(), attr));
		return protAttr;
	}

	/**
	 *
	 * @return map of attributes from prototypes.
	 * overlapping attributes are respected from the priority order of the prototypes
     */
	private Map<String, RoomAttribute> getRoomAttributesFromPrototypes() {
		Map<String, RoomAttribute> attributeMap = new HashMap<>();
		prototypes.stream()
				.sorted(Comparator.comparingInt(PrototypeOrdering::getOrder))
				.map(p -> p.getPrototype().getStates())
				.forEach(aList -> aList.forEach(attr -> attributeMap.put(attr.getName(), attr)));
		return attributeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("Room");
		result.append(" (nr: ");
		result.append(nr);
		result.append(", floor: ");
		result.append(floor);
		result.append(", usable: ");
		result.append(usable);
		result.append(", basePrice: ");
		result.append(basePrice);
		result.append(", lastCleaned: ");
		result.append(lastCleaned == null ? "N/A" : lastCleaned);
		result.append(",\n      attributes: ");
		getAttributes().forEach( a -> {
			result.append("\n\t");
			result.append(a);
		} );
		result.append(",\n      services available: ");
		getServicesAfforded().forEach( a -> {
			result.append("\n\t");
			result.append(a);
		} );
		result.append(')');
		return result.toString();
	}
} //RoomImpl