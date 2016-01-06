/**
 */
package sechalmersmdsdgroup5.hotel.personnel;

import sechalmersmdsdgroup5.hotel.facilities.Key;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcontractor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getName <em>Name</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getWorkBeeingDone <em>Work Beeing Done</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getEndDate <em>End Date</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Subcontractor {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Work Beeing Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Beeing Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Beeing Done</em>' attribute.
	 * @see #setWorkBeeingDone(String)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getWorkBeeingDone();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getWorkBeeingDone <em>Work Beeing Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Beeing Done</em>' attribute.
	 * @see #getWorkBeeingDone()
	 * @generated
	 */
	void setWorkBeeingDone(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Key)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.personnel.Subcontractor#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

} // Subcontractor
