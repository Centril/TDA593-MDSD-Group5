/**
 */
package sechalmersmdsdgroup5.hotel.payment.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import sechalmersmdsdgroup5.hotel.payment.CreditCard;
import sechalmersmdsdgroup5.hotel.payment.IPayment;
import sechalmersmdsdgroup5.hotel.payment.Payable;
import sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sechalmersmdsdgroup5.hotel.payment.impl.PaymentPackageImpl
 * @generated
 */
public class PaymentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PaymentPackageImpl modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PaymentPackageImpl.eINSTANCE;
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
	protected PaymentSwitch<Adapter> modelSwitch =
		new PaymentSwitch<Adapter>() {
			@Override
			public Adapter caseCreditCard(CreditCard object) {
				return createCreditCardAdapter();
			}
			@Override
			public Adapter caseIPayment(IPayment object) {
				return createIPaymentAdapter();
			}
			@Override
			public Adapter casePayable(Payable object) {
				return createPayableAdapter();
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
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.payment.CreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.payment.CreditCard
	 * @generated
	 */
	public Adapter createCreditCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.payment.IPayment <em>IPayment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.payment.IPayment
	 * @generated
	 */
	public Adapter createIPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sechalmersmdsdgroup5.hotel.payment.Payable <em>Payable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sechalmersmdsdgroup5.hotel.payment.Payable
	 * @generated
	 */
	public Adapter createPayableAdapter() {
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

} //PaymentAdapterFactory
