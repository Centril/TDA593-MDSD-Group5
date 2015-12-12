/**
 */
package sechalmersmdsdgroup5.hotel.schedule;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.schedule.Schedule#getShifts <em>Shifts</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Schedule {
	/**
	 * Returns the value of the '<em><b>Shifts</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.schedule.Shift}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shifts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shifts</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<Shift> getShifts();

} // Schedule
