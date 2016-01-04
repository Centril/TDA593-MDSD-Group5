/**
 */
package sechalmersmdsdgroup5.hotel.facilities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.facilities.RoomPrototype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prototype Ordering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.PrototypeOrderingImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.impl.PrototypeOrderingImpl#getPrototype <em>Prototype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrototypeOrderingImpl extends MinimalEObjectImpl.Container implements PrototypeOrdering {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrototype() <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototype()
	 * @generated
	 * @ordered
	 */
	protected RoomPrototype prototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrototypeOrderingImpl() {
		super();
	}

	protected PrototypeOrderingImpl(int order, RoomPrototype prototype) {
		super();
		this.order = order;
		this.prototype = prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackageImpl.Literals.PROTOTYPE_ORDERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		order = newOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomPrototype getPrototype() {
		if (prototype != null && ((EObject)prototype).eIsProxy()) {
			InternalEObject oldPrototype = (InternalEObject)prototype;
			prototype = (RoomPrototype)eResolveProxy(oldPrototype);
			if (prototype != oldPrototype) {
			}
		}
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomPrototype basicGetPrototype() {
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrototype(RoomPrototype newPrototype) {
		prototype = newPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING__ORDER:
				return getOrder();
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
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
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING__ORDER:
				setOrder((Integer)newValue);
				return;
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING__PROTOTYPE:
				setPrototype((RoomPrototype)newValue);
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
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING__PROTOTYPE:
				setPrototype((RoomPrototype)null);
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
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING__ORDER:
				return order != ORDER_EDEFAULT;
			case FacilitiesPackageImpl.PROTOTYPE_ORDERING__PROTOTYPE:
				return prototype != null;
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
		result.append(" (order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //PrototypeOrderingImpl
