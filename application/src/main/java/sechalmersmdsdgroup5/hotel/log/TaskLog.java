/**
 */
package sechalmersmdsdgroup5.hotel.log;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskLog#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface TaskLog {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.log.TaskItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<TaskItem> getTasks();

} // TaskLog
