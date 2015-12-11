/**
 */
package sechalmersmdsdgroup5.hotel.clients.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sechalmersmdsdgroup5.hotel.clients.Address;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.AddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.AddressImpl#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.AddressImpl#getZipArea <em>Zip Area</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.AddressImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.AddressImpl#getMunicipality <em>Municipality</em>}</li>
 *   <li>{@link sechalmersmdsdgroup5.hotel.clients.impl.AddressImpl#getCareOf <em>Care Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends MinimalEObjectImpl.Container implements Address {
	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected static final int ZIP_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected int zipCode = ZIP_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipArea() <em>Zip Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipArea()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipArea() <em>Zip Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipArea()
	 * @generated
	 * @ordered
	 */
	protected String zipArea = ZIP_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMunicipality() <em>Municipality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunicipality()
	 * @generated
	 * @ordered
	 */
	protected static final String MUNICIPALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMunicipality() <em>Municipality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunicipality()
	 * @generated
	 * @ordered
	 */
	protected String municipality = MUNICIPALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCareOf() <em>Care Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareOf()
	 * @generated
	 * @ordered
	 */
	protected static final String CARE_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCareOf() <em>Care Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareOf()
	 * @generated
	 * @ordered
	 */
	protected String careOf = CARE_OF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientsPackageImpl.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreet(String newStreet) {
		street = newStreet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZipCode(int newZipCode) {
		zipCode = newZipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZipArea() {
		return zipArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZipArea(String newZipArea) {
		zipArea = newZipArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		country = newCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		region = newRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMunicipality() {
		return municipality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMunicipality(String newMunicipality) {
		municipality = newMunicipality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCareOf() {
		return careOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCareOf(String newCareOf) {
		careOf = newCareOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientsPackageImpl.ADDRESS__STREET:
				return getStreet();
			case ClientsPackageImpl.ADDRESS__ZIP_CODE:
				return getZipCode();
			case ClientsPackageImpl.ADDRESS__ZIP_AREA:
				return getZipArea();
			case ClientsPackageImpl.ADDRESS__COUNTRY:
				return getCountry();
			case ClientsPackageImpl.ADDRESS__REGION:
				return getRegion();
			case ClientsPackageImpl.ADDRESS__MUNICIPALITY:
				return getMunicipality();
			case ClientsPackageImpl.ADDRESS__CARE_OF:
				return getCareOf();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClientsPackageImpl.ADDRESS__STREET:
				setStreet((String)newValue);
				return;
			case ClientsPackageImpl.ADDRESS__ZIP_CODE:
				setZipCode((Integer)newValue);
				return;
			case ClientsPackageImpl.ADDRESS__ZIP_AREA:
				setZipArea((String)newValue);
				return;
			case ClientsPackageImpl.ADDRESS__COUNTRY:
				setCountry((String)newValue);
				return;
			case ClientsPackageImpl.ADDRESS__REGION:
				setRegion((String)newValue);
				return;
			case ClientsPackageImpl.ADDRESS__MUNICIPALITY:
				setMunicipality((String)newValue);
				return;
			case ClientsPackageImpl.ADDRESS__CARE_OF:
				setCareOf((String)newValue);
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
			case ClientsPackageImpl.ADDRESS__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case ClientsPackageImpl.ADDRESS__ZIP_CODE:
				setZipCode(ZIP_CODE_EDEFAULT);
				return;
			case ClientsPackageImpl.ADDRESS__ZIP_AREA:
				setZipArea(ZIP_AREA_EDEFAULT);
				return;
			case ClientsPackageImpl.ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case ClientsPackageImpl.ADDRESS__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case ClientsPackageImpl.ADDRESS__MUNICIPALITY:
				setMunicipality(MUNICIPALITY_EDEFAULT);
				return;
			case ClientsPackageImpl.ADDRESS__CARE_OF:
				setCareOf(CARE_OF_EDEFAULT);
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
			case ClientsPackageImpl.ADDRESS__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case ClientsPackageImpl.ADDRESS__ZIP_CODE:
				return zipCode != ZIP_CODE_EDEFAULT;
			case ClientsPackageImpl.ADDRESS__ZIP_AREA:
				return ZIP_AREA_EDEFAULT == null ? zipArea != null : !ZIP_AREA_EDEFAULT.equals(zipArea);
			case ClientsPackageImpl.ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case ClientsPackageImpl.ADDRESS__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case ClientsPackageImpl.ADDRESS__MUNICIPALITY:
				return MUNICIPALITY_EDEFAULT == null ? municipality != null : !MUNICIPALITY_EDEFAULT.equals(municipality);
			case ClientsPackageImpl.ADDRESS__CARE_OF:
				return CARE_OF_EDEFAULT == null ? careOf != null : !CARE_OF_EDEFAULT.equals(careOf);
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
		result.append(" (street: ");
		result.append(street);
		result.append(", zipCode: ");
		result.append(zipCode);
		result.append(", zipArea: ");
		result.append(zipArea);
		result.append(", country: ");
		result.append(country);
		result.append(", region: ");
		result.append(region);
		result.append(", municipality: ");
		result.append(municipality);
		result.append(", careOf: ");
		result.append(careOf);
		result.append(')');
		return result.toString();
	}

} //AddressImpl
