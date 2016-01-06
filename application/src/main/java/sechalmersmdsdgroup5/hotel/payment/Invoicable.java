/**
 */
package sechalmersmdsdgroup5.hotel.payment;

import sechalmersmdsdgroup5.hotel.ordering.Invoice;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoicable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.payment.Invoicable#getInvoice <em>Invoice</em>}</li>
 * </ul>
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Invoicable {
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

} // Invoicable
