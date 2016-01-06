/**
 */
package sechalmersmdsdgroup5.hotel.log.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import sechalmersmdsdgroup5.hotel.log.TaskItem;
import sechalmersmdsdgroup5.hotel.log.TaskTag;
import sechalmersmdsdgroup5.hotel.personnel.Employee;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl#getResolved <em>Resolved</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl#getTaggedAs <em>Tagged As</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.log.impl.TaskItemImpl#getAssignees <em>Assignees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskItemImpl extends MinimalEObjectImpl.Container implements TaskItem {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Employee creator;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected Date deadline = DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tag;

	/**
	 * The default value of the '{@link #getResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESOLVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected Date resolved = RESOLVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaggedAs() <em>Tagged As</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedAs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskTag> taggedAs;

	/**
	 * The cached value of the '{@link #getAssignees() <em>Assignees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> assignees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackageImpl.Literals.TASK_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getCreator() {
		if (creator != null && ((EObject)creator).eIsProxy()) {
			InternalEObject oldCreator = (InternalEObject)creator;
			creator = (Employee)eResolveProxy(oldCreator);
			if (creator != oldCreator) {
			}
		}
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Employee newCreator) {
		creator = newCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(Date newDeadline) {
		deadline = newDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(Date newCreatedAt) {
		createdAt = newCreatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		priority = newPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getTag() {
		if (tag == null) {
			tag = new BasicInternalEList<String>(String.class);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolved(Date newResolved) {
		resolved = newResolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TaskTag> getTaggedAs() {
		if (taggedAs == null) {
			taggedAs = new BasicInternalEList<TaskTag>(TaskTag.class);
		}
		return taggedAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Employee> getAssignees() {
		if (assignees == null) {
			assignees = new BasicInternalEList<Employee>(Employee.class);
		}
		return assignees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackageImpl.TASK_ITEM__DESCRIPTION:
				return getDescription();
			case LogPackageImpl.TASK_ITEM__CREATOR:
				if (resolve) return getCreator();
				return basicGetCreator();
			case LogPackageImpl.TASK_ITEM__DEADLINE:
				return getDeadline();
			case LogPackageImpl.TASK_ITEM__CREATED_AT:
				return getCreatedAt();
			case LogPackageImpl.TASK_ITEM__PRIORITY:
				return getPriority();
			case LogPackageImpl.TASK_ITEM__TAG:
				return getTag();
			case LogPackageImpl.TASK_ITEM__RESOLVED:
				return getResolved();
			case LogPackageImpl.TASK_ITEM__TAGGED_AS:
				return getTaggedAs();
			case LogPackageImpl.TASK_ITEM__ASSIGNEES:
				return getAssignees();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogPackageImpl.TASK_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LogPackageImpl.TASK_ITEM__CREATOR:
				setCreator((Employee)newValue);
				return;
			case LogPackageImpl.TASK_ITEM__DEADLINE:
				setDeadline((Date)newValue);
				return;
			case LogPackageImpl.TASK_ITEM__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case LogPackageImpl.TASK_ITEM__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case LogPackageImpl.TASK_ITEM__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
				return;
			case LogPackageImpl.TASK_ITEM__RESOLVED:
				setResolved((Date)newValue);
				return;
			case LogPackageImpl.TASK_ITEM__TAGGED_AS:
				getTaggedAs().clear();
				getTaggedAs().addAll((Collection<? extends TaskTag>)newValue);
				return;
			case LogPackageImpl.TASK_ITEM__ASSIGNEES:
				getAssignees().clear();
				getAssignees().addAll((Collection<? extends Employee>)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogPackageImpl.TASK_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LogPackageImpl.TASK_ITEM__CREATOR:
				setCreator((Employee)null);
				return;
			case LogPackageImpl.TASK_ITEM__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case LogPackageImpl.TASK_ITEM__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case LogPackageImpl.TASK_ITEM__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case LogPackageImpl.TASK_ITEM__TAG:
				getTag().clear();
				return;
			case LogPackageImpl.TASK_ITEM__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case LogPackageImpl.TASK_ITEM__TAGGED_AS:
				getTaggedAs().clear();
				return;
			case LogPackageImpl.TASK_ITEM__ASSIGNEES:
				getAssignees().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogPackageImpl.TASK_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LogPackageImpl.TASK_ITEM__CREATOR:
				return creator != null;
			case LogPackageImpl.TASK_ITEM__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
			case LogPackageImpl.TASK_ITEM__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
			case LogPackageImpl.TASK_ITEM__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case LogPackageImpl.TASK_ITEM__TAG:
				return tag != null && !tag.isEmpty();
			case LogPackageImpl.TASK_ITEM__RESOLVED:
				return RESOLVED_EDEFAULT == null ? resolved != null : !RESOLVED_EDEFAULT.equals(resolved);
			case LogPackageImpl.TASK_ITEM__TAGGED_AS:
				return taggedAs != null && !taggedAs.isEmpty();
			case LogPackageImpl.TASK_ITEM__ASSIGNEES:
				return assignees != null && !assignees.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(", priority: ");
		result.append(priority);
		result.append(", tag: ");
		result.append(tag);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(')');
		return result.toString();
	}

} //TaskItemImpl
