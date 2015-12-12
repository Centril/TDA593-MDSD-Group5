/**
 */
package sechalmersmdsdgroup5.hotel.inventory;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.inventory.Inventory#getHasInStore <em>Has In Store</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Inventory {
	/**
	 * Returns the value of the '<em><b>Has In Store</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.inventory.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has In Store</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has In Store</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<Product> getHasInStore();

} // Inventory
