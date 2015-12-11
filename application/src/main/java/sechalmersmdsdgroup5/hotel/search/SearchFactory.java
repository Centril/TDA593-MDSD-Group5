/**
 */
package sechalmersmdsdgroup5.hotel.search;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public interface SearchFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SearchFactory INSTANCE = sechalmersmdsdgroup5.hotel.search.impl.SearchFactoryImpl.eINSTANCE;

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	<SRT> SearchQuery<SRT> createSearchQuery();

	/**
	 * Returns a new object of class '<em>Concrete Search Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Search Result</em>'.
	 * @generated
	 */
	<SRT> ConcreteSearchResult<SRT> createConcreteSearchResult();

	/**
	 * Returns a new object of class '<em>And Search Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Search Criteria</em>'.
	 * @generated
	 */
	<SRT> AndSearchCriteria<SRT> createAndSearchCriteria();

	/**
	 * Returns a new object of class '<em>Or Search Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Search Criteria</em>'.
	 * @generated
	 */
	<SRT> OrSearchCriteria<SRT> createOrSearchCriteria();

	/**
	 * Returns a new object of class '<em>Not Search Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Search Criteria</em>'.
	 * @generated
	 */
	<SRT> NotSearchCriteria<SRT> createNotSearchCriteria();

	/**
	 * Returns a new object of class '<em>Matches Search Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matches Search Criteria</em>'.
	 * @generated
	 */
	<SRT, IN> MatchesSearchCriteria<SRT, IN> createMatchesSearchCriteria();

} //SearchFactory
