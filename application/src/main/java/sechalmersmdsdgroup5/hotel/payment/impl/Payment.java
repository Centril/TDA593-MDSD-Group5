package sechalmersmdsdgroup5.hotel.payment.impl;

import sechalmersmdsdgroup5.hotel.clients.Client;
import sechalmersmdsdgroup5.hotel.payment.CreditCard;
import sechalmersmdsdgroup5.hotel.payment.IPayment;
import sechalmersmdsdgroup5.hotel.payment.Payable;

public class Payment implements IPayment{

    @Override
    /**
     * Boilerplate implementation, the system does not support verifying payment information. Should call an external
     * process to verify whether the information is correct.
     */
    public boolean verifyPaymentInformation(CreditCard paymentInformation) {
        return true;
    }

    @Override
    public void debit(Payable invoicable) {

    }

    @Override
    public void debit(Payable invoicable, Client customer) {

    }

    @Override
    public void printReceipt(Payable invoicable) {

    }
}
