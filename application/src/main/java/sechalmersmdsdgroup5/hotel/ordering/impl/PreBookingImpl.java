/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import sechalmersmdsdgroup5.hotel.facilities.Room;

import sechalmersmdsdgroup5.hotel.ordering.PreBooking;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreBookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreBookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreBookingImpl#getWillBook <em>Will Book</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreBookingImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreBookingImpl extends MinimalEObjectImpl.Container implements PreBooking {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWillBook() <em>Will Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWillBook()
	 * @generated
	 * @ordered
	 */
	protected Room willBook;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBlueprint> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderingPackageImpl.Literals.PRE_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		startDate = newStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		endDate = newEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getWillBook() {
		if (willBook != null && ((EObject)willBook).eIsProxy()) {
			InternalEObject oldWillBook = (InternalEObject)willBook;
			willBook = (Room)eResolveProxy(oldWillBook);
			if (willBook != oldWillBook) {
			}
		}
		return willBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetWillBook() {
		return willBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWillBook(Room newWillBook) {
		willBook = newWillBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ServiceBlueprint> getServices() {
		if (services == null) {
			services = new BasicInternalEList<ServiceBlueprint>(ServiceBlueprint.class);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderingPackageImpl.PRE_BOOKING__START_DATE:
				return getStartDate();
			case OrderingPackageImpl.PRE_BOOKING__END_DATE:
				return getEndDate();
			case OrderingPackageImpl.PRE_BOOKING__WILL_BOOK:
				if (resolve) return getWillBook();
				return basicGetWillBook();
			case OrderingPackageImpl.PRE_BOOKING__SERVICES:
				return getServices();
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
			case OrderingPackageImpl.PRE_BOOKING__START_DATE:
				setStartDate((Date)newValue);
				return;
			case OrderingPackageImpl.PRE_BOOKING__END_DATE:
				setEndDate((Date)newValue);
				return;
			case OrderingPackageImpl.PRE_BOOKING__WILL_BOOK:
				setWillBook((Room)newValue);
				return;
			case OrderingPackageImpl.PRE_BOOKING__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends ServiceBlueprint>)newValue);
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
			case OrderingPackageImpl.PRE_BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case OrderingPackageImpl.PRE_BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case OrderingPackageImpl.PRE_BOOKING__WILL_BOOK:
				setWillBook((Room)null);
				return;
			case OrderingPackageImpl.PRE_BOOKING__SERVICES:
				getServices().clear();
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
			case OrderingPackageImpl.PRE_BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case OrderingPackageImpl.PRE_BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case OrderingPackageImpl.PRE_BOOKING__WILL_BOOK:
				return willBook != null;
			case OrderingPackageImpl.PRE_BOOKING__SERVICES:
				return services != null && !services.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("Booking (start: ");
		result.append(startDate);
		result.append(", end: ");
		result.append(endDate);
		result.append("\nroom: ");
		result.append(willBook);
		result.append(')');
		return result.toString();
	}

} //PreBookingImpl
