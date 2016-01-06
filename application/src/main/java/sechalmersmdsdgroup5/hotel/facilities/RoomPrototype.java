/**
 */
package sechalmersmdsdgroup5.hotel.facilities;

import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getStates <em>States</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getServicesAfforded <em>Services Afforded</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface RoomPrototype {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Price</em>' attribute.
	 * @see #setBasePrice(double)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getBasePrice();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.RoomPrototype#getBasePrice <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Price</em>' attribute.
	 * @see #getBasePrice()
	 * @generated
	 */
	void setBasePrice(double value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.RoomAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<RoomAttribute> getStates();

	/**
	 * Returns the value of the '<em><b>Services Afforded</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.services.ServiceBlueprint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services Afforded</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services Afforded</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<ServiceBlueprint> getServicesAfforded();

} // RoomPrototype
