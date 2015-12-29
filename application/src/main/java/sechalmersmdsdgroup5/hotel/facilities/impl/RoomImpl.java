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
	protected static final int NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNr() <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNr()
	 * @generated
	 * @ordered
	 */
	protected int nr = NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected static final int FLOOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFloor() <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor()
	 * @generated
	 * @ordered
	 */
	protected int floor = FLOOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsable() <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsable() <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsable()
	 * @generated
	 * @ordered
	 */
	protected boolean usable = USABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePrice() <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	protected static final double BASE_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBasePrice() <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	protected double basePrice = BASE_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastCleaned() <em>Last Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCleaned()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_CLEANED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastCleaned() <em>Last Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCleaned()
	 * @generated
	 * @ordered
	 */
	protected Date lastCleaned = LAST_CLEANED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServicesAfforded() <em>Services Afforded</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicesAfforded()
	 * @generated NOT
	 * @ordered
	 */
	protected List<ServiceBlueprint> servicesAfforded;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated NOT
	 * @ordered
	 */
	protected List<RoomAttribute> attributes;

	/**
	 * The cached value of the '{@link #getPrototypes() <em>Prototypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototypes()
	 * @generated NOT
	 * @ordered
	 */
	protected List<PrototypeOrdering> prototypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	protected RoomImpl(int nr, int floor, boolean usable, double basePrice, List<RoomAttribute> roomAttributes,
					   List<PrototypeOrdering> prototypeOrderings, List<ServiceBlueprint> serviceBlueprints) {
		super();
		this.nr = nr;
		this.floor = floor;
		this.usable = usable;
		this.basePrice = basePrice;

		if(roomAttributes == null) {
			this.attributes = new ArrayList<>();
		} else {
			this.attributes = roomAttributes;
		}

		if(prototypeOrderings == null) {
			this.prototypes = new ArrayList<>();
		} else {
			this.prototypes = prototypeOrderings;
		}
		if(serviceBlueprints == null) {
			this.servicesAfforded = new ArrayList<>();
		} else {
			this.servicesAfforded = serviceBlueprints;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackageImpl.Literals.ROOM;
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
		if (servicesAfforded == null) {
			servicesAfforded = new BasicInternalEList<ServiceBlueprint>(ServiceBlueprint.class);
		}
		return servicesAfforded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<RoomAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new BasicInternalEList<RoomAttribute>(RoomAttribute.class);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PrototypeOrdering> getPrototypes() {
		if (prototypes == null) {
			prototypes = new BasicInternalEList<PrototypeOrdering>(PrototypeOrdering.class);
		}
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackageImpl.ROOM__NR:
				return getNr();
			case FacilitiesPackageImpl.ROOM__FLOOR:
				return getFloor();
			case FacilitiesPackageImpl.ROOM__USABLE:
				return isUsable();
			case FacilitiesPackageImpl.ROOM__BASE_PRICE:
				return getBasePrice();
			case FacilitiesPackageImpl.ROOM__LAST_CLEANED:
				return getLastCleaned();
			case FacilitiesPackageImpl.ROOM__SERVICES_AFFORDED:
				return getServicesAfforded();
			case FacilitiesPackageImpl.ROOM__ATTRIBUTES:
				return getAttributes();
			case FacilitiesPackageImpl.ROOM__PROTOTYPES:
				return getPrototypes();
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
			case FacilitiesPackageImpl.ROOM__NR:
				setNr((Integer)newValue);
				return;
			case FacilitiesPackageImpl.ROOM__FLOOR:
				setFloor((Integer)newValue);
				return;
			case FacilitiesPackageImpl.ROOM__USABLE:
				setUsable((Boolean)newValue);
				return;
			case FacilitiesPackageImpl.ROOM__BASE_PRICE:
				setBasePrice((Double)newValue);
				return;
			case FacilitiesPackageImpl.ROOM__LAST_CLEANED:
				setLastCleaned((Date)newValue);
				return;
			case FacilitiesPackageImpl.ROOM__SERVICES_AFFORDED:
				getServicesAfforded().clear();
				getServicesAfforded().addAll((Collection<? extends ServiceBlueprint>)newValue);
				return;
			case FacilitiesPackageImpl.ROOM__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends RoomAttribute>)newValue);
				return;
			case FacilitiesPackageImpl.ROOM__PROTOTYPES:
				getPrototypes().clear();
				getPrototypes().addAll((Collection<? extends PrototypeOrdering>)newValue);
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
			case FacilitiesPackageImpl.ROOM__NR:
				setNr(NR_EDEFAULT);
				return;
			case FacilitiesPackageImpl.ROOM__FLOOR:
				setFloor(FLOOR_EDEFAULT);
				return;
			case FacilitiesPackageImpl.ROOM__USABLE:
				setUsable(USABLE_EDEFAULT);
				return;
			case FacilitiesPackageImpl.ROOM__BASE_PRICE:
				setBasePrice(BASE_PRICE_EDEFAULT);
				return;
			case FacilitiesPackageImpl.ROOM__LAST_CLEANED:
				setLastCleaned(LAST_CLEANED_EDEFAULT);
				return;
			case FacilitiesPackageImpl.ROOM__SERVICES_AFFORDED:
				getServicesAfforded().clear();
				return;
			case FacilitiesPackageImpl.ROOM__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FacilitiesPackageImpl.ROOM__PROTOTYPES:
				getPrototypes().clear();
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
			case FacilitiesPackageImpl.ROOM__NR:
				return nr != NR_EDEFAULT;
			case FacilitiesPackageImpl.ROOM__FLOOR:
				return floor != FLOOR_EDEFAULT;
			case FacilitiesPackageImpl.ROOM__USABLE:
				return usable != USABLE_EDEFAULT;
			case FacilitiesPackageImpl.ROOM__BASE_PRICE:
				return basePrice != BASE_PRICE_EDEFAULT;
			case FacilitiesPackageImpl.ROOM__LAST_CLEANED:
				return LAST_CLEANED_EDEFAULT == null ? lastCleaned != null : !LAST_CLEANED_EDEFAULT.equals(lastCleaned);
			case FacilitiesPackageImpl.ROOM__SERVICES_AFFORDED:
				return servicesAfforded != null && !servicesAfforded.isEmpty();
			case FacilitiesPackageImpl.ROOM__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FacilitiesPackageImpl.ROOM__PROTOTYPES:
				return prototypes != null && !prototypes.isEmpty();
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
