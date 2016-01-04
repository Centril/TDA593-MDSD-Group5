/**
 */
package sechalmersmdsdgroup5.hotel.payment;

import java.util.List;

import sechalmersmdsdgroup5.hotel.ordering.Invoice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.Payable#getInvoice <em>Invoice</em>}</li>
 * </ul>
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Payable {

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' containment reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.ordering.Invoice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice</em>' containment reference list.
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	List<Invoice> getInvoice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double totalPrice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

	void setIsPaid(boolean value);
} // Payable
