/**
 */
package sechalmersmdsdgroup5.hotel.facilities;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Key#getId <em>Id</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Key#getUnlocks <em>Unlocks</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Key {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.Key#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Unlocks</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.Door}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlocks</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Door> getUnlocks();

} // Key
