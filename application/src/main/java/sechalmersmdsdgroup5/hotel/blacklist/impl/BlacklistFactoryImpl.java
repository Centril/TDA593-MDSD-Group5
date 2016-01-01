/**
 */
package sechalmersmdsdgroup5.hotel.blacklist.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sechalmersmdsdgroup5.hotel.blacklist.*;
import sechalmersmdsdgroup5.hotel.blacklist.Blacklist;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlacklistFactoryImpl extends EFactoryImpl implements BlacklistFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BlacklistFactoryImpl eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlacklistFactoryImpl init() {
		try {
			BlacklistFactoryImpl theBlacklistFactory = (BlacklistFactoryImpl)EPackage.Registry.INSTANCE.getEFactory(BlacklistPackageImpl.eNS_URI);
			if (theBlacklistFactory != null) {
				return theBlacklistFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlacklistFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlacklistFactoryImpl() {
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
			case BlacklistPackageImpl.BLACKLIST: return (EObject)createBlacklist();
			case BlacklistPackageImpl.BLACKLIST_ITEM: return (EObject)createBlacklistItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Blacklist createBlacklist() {
		BlacklistImpl blacklist = new BlacklistImpl();
		return blacklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlacklistItem createBlacklistItem() {
		BlacklistItemImpl blacklistItem = new BlacklistItemImpl();
		return blacklistItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlacklistPackageImpl getBlacklistPackage() {
		return (BlacklistPackageImpl)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlacklistPackageImpl getPackage() {
		return BlacklistPackageImpl.eINSTANCE;
	}

} //BlacklistFactoryImpl
