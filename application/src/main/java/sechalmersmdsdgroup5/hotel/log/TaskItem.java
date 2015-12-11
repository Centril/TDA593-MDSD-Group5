/**
 */
package sechalmersmdsdgroup5.hotel.log;

import java.util.Date;
import java.util.List;

import sechalmersmdsdgroup5.hotel.personnel.Employee;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getDescription <em>Description</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getCreator <em>Creator</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getPriority <em>Priority</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getTag <em>Tag</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getResolved <em>Resolved</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getTaggedAs <em>Tagged As</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getAssignees <em>Assignees</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface TaskItem {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' reference.
	 * @see #setCreator(Employee)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Employee getCreator();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getCreator <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Employee value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDeadline();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(Date value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute list.
	 * @model ordered="false"
	 * @generated
	 */
	List<String> getTag();

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getResolved();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.log.TaskItem#getResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #getResolved()
	 * @generated
	 */
	void setResolved(Date value);

	/**
	 * Returns the value of the '<em><b>Tagged As</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.log.TaskTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged As</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged As</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<TaskTag> getTaggedAs();

	/**
	 * Returns the value of the '<em><b>Assignees</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.personnel.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignees</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Employee> getAssignees();

} // TaskItem
