/**
 */
package sechalmersmdsdgroup5.hotel.ordering.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import sechalmersmdsdgroup5.hotel.ordering.Campaign;
import sechalmersmdsdgroup5.hotel.ordering.PreBooking;
import sechalmersmdsdgroup5.hotel.ordering.PreOrder;

import java.util.Collection;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreOrderImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.ordering.impl.PreOrderImpl#getCampaigns <em>Campaigns</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PreOrderImpl extends MinimalEObjectImpl.Container implements PreOrder {
	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<PreBooking> bookings;

	/**
	 * The cached value of the '{@link #getCampaigns() <em>Campaigns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaigns()
	 * @generated
	 * @ordered
	 */
	protected EList<Campaign> campaigns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderingPackageImpl.Literals.PRE_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PreBooking> getBookings() {
		if (bookings == null) {
			bookings = new BasicInternalEList<PreBooking>(PreBooking.class);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Campaign> getCampaigns() {
		if (campaigns == null) {
			campaigns = new BasicInternalEList<Campaign>(Campaign.class);
		}
		return campaigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double calculatePrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderingPackageImpl.PRE_ORDER__BOOKINGS:
				return getBookings();
			case OrderingPackageImpl.PRE_ORDER__CAMPAIGNS:
				return getCampaigns();
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
			case OrderingPackageImpl.PRE_ORDER__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends PreBooking>)newValue);
				return;
			case OrderingPackageImpl.PRE_ORDER__CAMPAIGNS:
				getCampaigns().clear();
				getCampaigns().addAll((Collection<? extends Campaign>)newValue);
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
			case OrderingPackageImpl.PRE_ORDER__BOOKINGS:
				getBookings().clear();
				return;
			case OrderingPackageImpl.PRE_ORDER__CAMPAIGNS:
				getCampaigns().clear();
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
			case OrderingPackageImpl.PRE_ORDER__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case OrderingPackageImpl.PRE_ORDER__CAMPAIGNS:
				return campaigns != null && !campaigns.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //PreOrderImpl
