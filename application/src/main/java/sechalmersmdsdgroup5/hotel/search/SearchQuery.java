/**
 */
package sechalmersmdsdgroup5.hotel.search;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model
 * @generated
 */
public interface SearchQuery<SRT> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	List<SearchCriteria<SRT>> getCriterias();

} // SearchQuery
