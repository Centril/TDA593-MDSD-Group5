/**
 */
package sechalmersmdsdgroup5.hotel.identities.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sechalmersmdsdgroup5.hotel.identities.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentitiesFactoryImpl extends EFactoryImpl implements IdentitiesFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IdentitiesFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdentitiesFactoryImpl init() {
		try {
			IdentitiesFactoryImpl theIdentitiesFactory = (IdentitiesFactoryImpl)EPackage.Registry.INSTANCE.getEFactory(IdentitiesPackageImpl.eNS_URI);
			if (theIdentitiesFactory != null) {
				return theIdentitiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdentitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentitiesFactoryImpl() {
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
			case IdentitiesPackageImpl.REAL_PERSON: return (EObject)createRealPerson();
			case IdentitiesPackageImpl.ORGANISATION: return (EObject)createOrganisation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealPerson createRealPerson() {
		RealPersonImpl realPerson = new RealPersonImpl();
		return realPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentitiesPackageImpl getIdentitiesPackage() {
		return (IdentitiesPackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdentitiesPackageImpl getPackage() {
		return IdentitiesPackageImpl.eINSTANCE;
	}

} //IdentitiesFactoryImpl
