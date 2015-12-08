/**
 */
package sechalmersmdsdgroup5.hotel.facilities;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.AccessLog#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface AccessLog {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.AccessLogItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<AccessLogItem> getItems();

} // AccessLog
