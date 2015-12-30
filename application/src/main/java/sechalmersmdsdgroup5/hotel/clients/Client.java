/**
 */
package sechalmersmdsdgroup5.hotel.clients;

import java.util.List;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.Client#getInvoices <em>Invoices</em>}</li>
 * </ul>
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Client {
	/**
	 * Returns the value of the '<em><b>Invoices</b></em>' reference list.
	 * The list contents are of type {@link sechalmersmdsdgroup5.hotel.ordering.Invoice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoices</em>' reference list.
	 * @model ordered="false"
	 * @generated
	 */
	List<Invoice> getInvoices();

} // Client
