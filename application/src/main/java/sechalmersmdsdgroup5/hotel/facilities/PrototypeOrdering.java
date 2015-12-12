/**
 */
package sechalmersmdsdgroup5.hotel.facilities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prototype Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering#getOrder <em>Order</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering#getPrototype <em>Prototype</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface PrototypeOrdering {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototype</em>' reference.
	 * @see #setPrototype(RoomPrototype)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomPrototype getPrototype();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering#getPrototype <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prototype</em>' reference.
	 * @see #getPrototype()
	 * @generated
	 */
	void setPrototype(RoomPrototype value);

} // PrototypeOrdering
