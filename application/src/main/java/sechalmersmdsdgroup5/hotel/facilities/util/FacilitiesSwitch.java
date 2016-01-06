/**
 */
package sechalmersmdsdgroup5.hotel.facilities.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import sechalmersmdsdgroup5.hotel.facilities.*;
import sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl;

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
 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl
 * @generated
 */
public class FacilitiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FacilitiesPackageImpl modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesSwitch() {
		if (modelPackage == null) {
			modelPackage = FacilitiesPackageImpl.eINSTANCE;
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
			case FacilitiesPackageImpl.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = caseArea(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.AREA: {
				Area area = (Area)theEObject;
				T result = caseArea(area);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.KEY: {
				Key key = (Key)theEObject;
				T result = caseKey(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.DOOR: {
				Door door = (Door)theEObject;
				T result = caseDoor(door);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.ROOM_ATTRIBUTE: {
				RoomAttribute roomAttribute = (RoomAttribute)theEObject;
				T result = caseRoomAttribute(roomAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING: {
				PrototypeOrdering prototypeOrdering = (PrototypeOrdering)theEObject;
				T result = casePrototypeOrdering(prototypeOrdering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.ROOM_PROTOTYPE: {
				RoomPrototype roomPrototype = (RoomPrototype)theEObject;
				T result = caseRoomPrototype(roomPrototype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.EMPLOYEE_AREA: {
				EmployeeArea employeeArea = (EmployeeArea)theEObject;
				T result = caseEmployeeArea(employeeArea);
				if (result == null) result = caseArea(employeeArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.ACCESS_LOG: {
				AccessLog accessLog = (AccessLog)theEObject;
				T result = caseAccessLog(accessLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.ACCESS_LOG_ITEM: {
				AccessLogItem accessLogItem = (AccessLogItem)theEObject;
				T result = caseAccessLogItem(accessLogItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FacilitiesPackageImpl.IFACILITIES: {
				IFacilities iFacilities = (IFacilities)theEObject;
				T result = caseIFacilities(iFacilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKey(Key object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoor(Door object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomAttribute(RoomAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prototype Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prototype Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrototypeOrdering(PrototypeOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Prototype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Prototype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomPrototype(RoomPrototype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployeeArea(EmployeeArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessLog(AccessLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Log Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Log Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessLogItem(AccessLogItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFacilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFacilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFacilities(IFacilities object) {
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

} //FacilitiesSwitch
