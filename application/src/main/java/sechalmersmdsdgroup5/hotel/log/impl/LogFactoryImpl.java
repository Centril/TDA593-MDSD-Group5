/**
 */
package sechalmersmdsdgroup5.hotel.log.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import sechalmersmdsdgroup5.hotel.log.LogFactory;
import sechalmersmdsdgroup5.hotel.log.TaskItem;
import sechalmersmdsdgroup5.hotel.log.TaskLog;
import sechalmersmdsdgroup5.hotel.log.TaskTag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogFactoryImpl extends EFactoryImpl implements LogFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LogFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogFactoryImpl init() {
		try {
			LogFactoryImpl theLogFactory = (LogFactoryImpl)EPackage.Registry.INSTANCE.getEFactory(LogPackageImpl.eNS_URI);
			if (theLogFactory != null) {
				return theLogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogPackageImpl.TASK_ITEM: return (EObject)createTaskItem();
			case LogPackageImpl.TASK_TAG: return (EObject)createTaskTag();
			case LogPackageImpl.TASK_LOG: return (EObject)createTaskLog();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskItem createTaskItem() {
		TaskItemImpl taskItem = new TaskItemImpl();
		return taskItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTag createTaskTag() {
		TaskTagImpl taskTag = new TaskTagImpl();
		return taskTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskLog createTaskLog() {
		TaskLogImpl taskLog = new TaskLogImpl();
		return taskLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogPackageImpl getLogPackage() {
		return (LogPackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogPackageImpl getPackage() {
		return LogPackageImpl.eINSTANCE;
	}

} //LogFactoryImpl
