/**
 */
package sechalmersmdsdgroup5.hotel.schedule;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.schedule.Shift#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.schedule.Shift#getEndTime <em>End Time</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.schedule.Shift#isDidWork <em>Did Work</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Shift {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.schedule.Shift#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.schedule.Shift#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Did Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Did Work</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Did Work</em>' attribute.
	 * @see #setDidWork(boolean)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isDidWork();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.schedule.Shift#isDidWork <em>Did Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Did Work</em>' attribute.
	 * @see #isDidWork()
	 * @generated
	 */
	void setDidWork(boolean value);

} // Shift
