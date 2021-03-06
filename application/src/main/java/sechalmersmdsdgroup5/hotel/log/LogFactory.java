/**
 */
package sechalmersmdsdgroup5.hotel.log;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface LogFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogFactory INSTANCE = sechalmersmdsdgroup5.hotel.log.impl.LogFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Task Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Item</em>'.
	 * @generated
	 */
	TaskItem createTaskItem();

	/**
	 * Returns a new object of class '<em>Task Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Tag</em>'.
	 * @generated
	 */
	TaskTag createTaskTag();

	/**
	 * Returns a new object of class '<em>Task Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Log</em>'.
	 * @generated
	 */
	TaskLog createTaskLog();

} //LogFactory
