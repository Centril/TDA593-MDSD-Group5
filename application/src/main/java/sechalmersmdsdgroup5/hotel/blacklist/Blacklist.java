/**
 */
package sechalmersmdsdgroup5.hotel.blacklist;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blacklist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.blacklist.Blacklist#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Blacklist {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<BlacklistItem> getItems();

} // Blacklist
