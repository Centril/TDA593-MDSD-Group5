/**
 */
package sechalmersmdsdgroup5.hotel.ordering.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sechalmersmdsdgroup5.hotel.ordering.*;

import sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl;
import sechalmersmdsdgroup5.hotel.payment.Invoicable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sechalmersmdsdgroup5.hotel.ordering.impl.OrderingPackageImpl
 * @generated
 */
public class OrderingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrderingPackageImpl modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingSwitch() {
		if (modelPackage == null) {
			modelPackage = OrderingPackageImpl.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OrderingPackageImpl.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = caseInvoicable(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrderingPackageImpl.CAMPAIGN: {
				Campaign campaign = (Campaign)theEObject;
				T result = caseCampaign(campaign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrderingPackageImpl.PRE_ORDER: {
				PreOrder preOrder = (PreOrder)theEObject;
				T result = casePreOrder(preOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrderingPackageImpl.PRE_BOOKING: {
				PreBooking preBooking = (PreBooking)theEObject;
				T result = casePreBooking(preBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrderingPackageImpl.ROOM_BOOKING: {
				RoomBooking roomBooking = (RoomBooking)theEObject;
				T result = caseRoomBooking(roomBooking);
				if (result == null) result = caseInvoicable(roomBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrderingPackageImpl.IORDER: {
				IOrder iOrder = (IOrder)theEObject;
				T result = caseIOrder(iOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrderingPackageImpl.ICHECK_IN_CHECK_OUT: {
				ICheckInCheckOut iCheckInCheckOut = (ICheckInCheckOut)theEObject;
				T result = caseICheckInCheckOut(iCheckInCheckOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrderingPackageImpl.ORDINARY_PRE_ORDER: {
				OrdinaryPreOrder ordinaryPreOrder = (OrdinaryPreOrder)theEObject;
				T result = caseOrdinaryPreOrder(ordinaryPreOrder);
				if (result == null) result = casePreOrder(ordinaryPreOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrderingPackageImpl.PACKAGE_PRE_ORDER: {
				PackagePreOrder packagePreOrder = (PackagePreOrder)theEObject;
				T result = casePackagePreOrder(packagePreOrder);
				if (result == null) result = casePreOrder(packagePreOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrderingPackageImpl.INVOICE: {
				Invoice invoice = (Invoice)theEObject;
				T result = caseInvoice(invoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campaign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampaign(Campaign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreOrder(PreOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreBooking(PreBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoice(Invoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoicable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoicable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoicable(Invoicable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IOrder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IOrder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOrder(IOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICheck In Check Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICheck In Check Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICheckInCheckOut(ICheckInCheckOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinary Pre Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinary Pre Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinaryPreOrder(OrdinaryPreOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Pre Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Pre Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackagePreOrder(PackagePreOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomBooking(RoomBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OrderingSwitch
