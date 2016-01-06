/**
 */
package sechalmersmdsdgroup5.hotel.clients.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import sechalmersmdsdgroup5.hotel.clients.*;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientsPackageImpl;
import sechalmersmdsdgroup5.hotel.identities.Identity;
import sechalmersmdsdgroup5.hotel.identities.RealPerson;
import sechalmersmdsdgroup5.hotel.services.ServiceConsumer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sechalmersmdsdgroup5.hotel.clients.impl.ClientsPackageImpl
 * @generated
 */
public class ClientsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClientsPackageImpl modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClientsPackageImpl.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientsSwitch<Adapter> modelSwitch =
		new ClientsSwitch<Adapter>() {
			@Override
			public Adapter caseGuest(Guest object) {
				return createGuestAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseIClient(IClient object) {
				return createIClientAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseIdentity(Identity object) {
				return createIdentityAdapter();
			}
			@Override
			public Adapter caseRealPerson(RealPerson object) {
				return createRealPersonAdapter();
			}
			@Override
			public Adapter caseServiceConsumer(ServiceConsumer object) {
				return createServiceConsumerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.clients.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.clients.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.clients.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.clients.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.clients.IClient <em>IClient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.clients.IClient
	 * @generated
	 */
	public Adapter createIClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.clients.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.clients.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.identities.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.identities.Identity
	 * @generated
	 */
	public Adapter createIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.identities.RealPerson <em>Real Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.identities.RealPerson
	 * @generated
	 */
	public Adapter createRealPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.services.ServiceConsumer <em>Service Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.services.ServiceConsumer
	 * @generated
	 */
	public Adapter createServiceConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.clients.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.clients.Guest
	 * @generated
	 */
	public Adapter createGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClientsAdapterFactory
