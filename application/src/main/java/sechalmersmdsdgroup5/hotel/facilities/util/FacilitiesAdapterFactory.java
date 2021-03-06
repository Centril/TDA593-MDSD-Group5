/**
 */
package sechalmersmdsdgroup5.hotel.facilities.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import sechalmersmdsdgroup5.hotel.facilities.*;
import sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesPackageImpl
 * @generated
 */
public class FacilitiesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FacilitiesPackageImpl modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitiesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FacilitiesPackageImpl.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilitiesSwitch<Adapter> modelSwitch =
		new FacilitiesSwitch<Adapter>() {
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseArea(Area object) {
				return createAreaAdapter();
			}
			@Override
			public Adapter caseKey(Key object) {
				return createKeyAdapter();
			}
			@Override
			public Adapter caseDoor(Door object) {
				return createDoorAdapter();
			}
			@Override
			public Adapter caseRoomAttribute(RoomAttribute object) {
				return createRoomAttributeAdapter();
			}
			@Override
			public Adapter casePrototypeOrdering(PrototypeOrdering object) {
				return createPrototypeOrderingAdapter();
			}
			@Override
			public Adapter caseRoomPrototype(RoomPrototype object) {
				return createRoomPrototypeAdapter();
			}
			@Override
			public Adapter caseEmployeeArea(EmployeeArea object) {
				return createEmployeeAreaAdapter();
			}
			@Override
			public Adapter caseAccessLog(AccessLog object) {
				return createAccessLogAdapter();
			}
			@Override
			public Adapter caseAccessLogItem(AccessLogItem object) {
				return createAccessLogItemAdapter();
			}
			@Override
			public Adapter caseIFacilities(IFacilities object) {
				return createIFacilitiesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Area
	 * @generated
	 */
	public Adapter createAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Key
	 * @generated
	 */
	public Adapter createKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.Door
	 * @generated
	 */
	public Adapter createDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.RoomAttribute <em>Room Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomAttribute
	 * @generated
	 */
	public Adapter createRoomAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering <em>Prototype Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering
	 * @generated
	 */
	public Adapter createPrototypeOrderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype <em>Room Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.RoomPrototype
	 * @generated
	 */
	public Adapter createRoomPrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.EmployeeArea <em>Employee Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.EmployeeArea
	 * @generated
	 */
	public Adapter createEmployeeAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLog <em>Access Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.AccessLog
	 * @generated
	 */
	public Adapter createAccessLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem <em>Access Log Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.AccessLogItem
	 * @generated
	 */
	public Adapter createAccessLogItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.facilities.IFacilities <em>IFacilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.facilities.IFacilities
	 * @generated
	 */
	public Adapter createIFacilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FacilitiesAdapterFactory
