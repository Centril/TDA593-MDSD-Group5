/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.facilities.Room;

import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getCheckinTime <em>Checkin Time</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getCheckoutTime <em>Checkout Time</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#getBookedRoom <em>Booked Room</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl#isPaid <em>Is Paid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomBookingImpl extends MinimalEObjectImpl.Container implements RoomBooking {
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
	 * The default value of the '{@link #getCheckinTime() <em>Checkin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckinTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECKIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckinTime() <em>Checkin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckinTime()
	 * @generated
	 * @ordered
	 */
	protected Date checkinTime = CHECKIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckoutTime() <em>Checkout Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckoutTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECKOUT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckoutTime() <em>Checkout Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckoutTime()
	 * @generated
	 * @ordered
	 */
	protected Date checkoutTime = CHECKOUT_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookedRoom() <em>Booked Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedRoom()
	 * @generated
	 * @ordered
	 */
	protected Room bookedRoom;

	/**
	 * The default value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean isPaid = IS_PAID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderingPackageImpl.Literals.ROOM_BOOKING;
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
	public Date getCheckinTime() {
		return checkinTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckinTime(Date newCheckinTime) {
		checkinTime = newCheckinTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckoutTime() {
		return checkoutTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckoutTime(Date newCheckoutTime) {
		checkoutTime = newCheckoutTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getBookedRoom() {
		if (bookedRoom != null && ((EObject)bookedRoom).eIsProxy()) {
			InternalEObject oldBookedRoom = (InternalEObject)bookedRoom;
			bookedRoom = (Room)eResolveProxy(oldBookedRoom);
			if (bookedRoom != oldBookedRoom) {
			}
		}
		return bookedRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetBookedRoom() {
		return bookedRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookedRoom(Room newBookedRoom) {
		bookedRoom = newBookedRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
		return isPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPaid(boolean newIsPaid) {
		isPaid = newIsPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderingPackageImpl.ROOM_BOOKING__START_DATE:
				return getStartDate();
			case OrderingPackageImpl.ROOM_BOOKING__END_DATE:
				return getEndDate();
			case OrderingPackageImpl.ROOM_BOOKING__CHECKIN_TIME:
				return getCheckinTime();
			case OrderingPackageImpl.ROOM_BOOKING__CHECKOUT_TIME:
				return getCheckoutTime();
			case OrderingPackageImpl.ROOM_BOOKING__BOOKED_ROOM:
				if (resolve) return getBookedRoom();
				return basicGetBookedRoom();
			case OrderingPackageImpl.ROOM_BOOKING__IS_PAID:
				return isPaid();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrderingPackageImpl.ROOM_BOOKING__START_DATE:
				setStartDate((Date)newValue);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__END_DATE:
				setEndDate((Date)newValue);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__CHECKIN_TIME:
				setCheckinTime((Date)newValue);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__CHECKOUT_TIME:
				setCheckoutTime((Date)newValue);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__BOOKED_ROOM:
				setBookedRoom((Room)newValue);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__IS_PAID:
				setIsPaid((Boolean)newValue);
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
			case OrderingPackageImpl.ROOM_BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__CHECKIN_TIME:
				setCheckinTime(CHECKIN_TIME_EDEFAULT);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__CHECKOUT_TIME:
				setCheckoutTime(CHECKOUT_TIME_EDEFAULT);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__BOOKED_ROOM:
				setBookedRoom((Room)null);
				return;
			case OrderingPackageImpl.ROOM_BOOKING__IS_PAID:
				setIsPaid(IS_PAID_EDEFAULT);
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
			case OrderingPackageImpl.ROOM_BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case OrderingPackageImpl.ROOM_BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case OrderingPackageImpl.ROOM_BOOKING__CHECKIN_TIME:
				return CHECKIN_TIME_EDEFAULT == null ? checkinTime != null : !CHECKIN_TIME_EDEFAULT.equals(checkinTime);
			case OrderingPackageImpl.ROOM_BOOKING__CHECKOUT_TIME:
				return CHECKOUT_TIME_EDEFAULT == null ? checkoutTime != null : !CHECKOUT_TIME_EDEFAULT.equals(checkoutTime);
			case OrderingPackageImpl.ROOM_BOOKING__BOOKED_ROOM:
				return bookedRoom != null;
			case OrderingPackageImpl.ROOM_BOOKING__IS_PAID:
				return isPaid != IS_PAID_EDEFAULT;
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", checkinTime: ");
		result.append(checkinTime);
		result.append(", checkoutTime: ");
		result.append(checkoutTime);
		result.append(", isPaid: ");
		result.append(isPaid);
		result.append(')');
		return result.toString();
	}

} //RoomBookingImpl