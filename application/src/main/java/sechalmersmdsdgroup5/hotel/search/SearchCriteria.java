/**
 */
package sechalmersmdsdgroup5.hotel.search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SearchCriteria<SRT> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" resultRequired="true" resultOrdered="false"
	 * @generated
	 */
	SearchResult<SRT> apply(SearchResult<SRT> result);

} // SearchCriteria
