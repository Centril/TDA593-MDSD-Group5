/**
 */
package sechalmersmdsdgroup5.hotel.services;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Blueprint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.services.ServiceBlueprint#getBasePrice <em>Base Price</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface ServiceBlueprint {
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
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.services.ServiceBlueprint#getBasePrice <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Price</em>' attribute.
	 * @see #getBasePrice()
	 * @generated
	 */
	void setBasePrice(double value);

} // ServiceBlueprint
