/**
 */
package sechalmersmdsdgroup5.hotel.facilities;

import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Room#getNr <em>Nr</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Room#getFloor <em>Floor</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Room#isUsable <em>Usable</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Room#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Room#getLastCleaned <em>Last Cleaned</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Room#getServicesAfforded <em>Services Afforded</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Room#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.facilities.Room#getPrototypes <em>Prototypes</em>}</li>
 * </ul>
 *
 * @model
 * @generated
 */
public interface Room extends Area {
	/**
	 * Returns the value of the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr</em>' attribute.
	 * @see #setNr(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNr();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getNr <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr</em>' attribute.
	 * @see #getNr()
	 * @generated
	 */
	void setNr(int value);

	/**
	 * Returns the value of the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor</em>' attribute.
	 * @see #setFloor(int)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getFloor();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getFloor <em>Floor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor</em>' attribute.
	 * @see #getFloor()
	 * @generated
	 */
	void setFloor(int value);

	/**
	 * Returns the value of the '<em><b>Usable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usable</em>' attribute.
	 * @see #setUsable(boolean)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isUsable();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.Room#isUsable <em>Usable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usable</em>' attribute.
	 * @see #isUsable()
	 * @generated
	 */
	void setUsable(boolean value);

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
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getBasePrice <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Price</em>' attribute.
	 * @see #getBasePrice()
	 * @generated
	 */
	void setBasePrice(double value);

	/**
	 * Returns the value of the '<em><b>Last Cleaned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Cleaned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Cleaned</em>' attribute.
	 * @see #setLastCleaned(Date)
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getLastCleaned();

	/**
	 * Sets the value of the '{@link sechalmersmdsdgroup5.hotel.facilities.Room#getLastCleaned <em>Last Cleaned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Cleaned</em>' attribute.
	 * @see #getLastCleaned()
	 * @generated
	 */
	void setLastCleaned(Date value);

	/**
	 * Returns the value of the '<em><b>Services Afforded</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.services.ServiceBlueprint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services Afforded</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services Afforded</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<ServiceBlueprint> getServicesAfforded();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.RoomAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<RoomAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Prototypes</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototypes</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<PrototypeOrdering> getPrototypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" keyRequired="true" keyOrdered="false"
	 * @generated
	 */
	RoomAttribute getAttribute(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	List<RoomAttribute> getLocalAttributes();

} // Room
