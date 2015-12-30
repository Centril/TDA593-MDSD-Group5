package sechalmersmdsdgroup5.hotel.payment.impl;

import sechalmersmdsdgroup5.hotel.clients.Client;
import sechalmersmdsdgroup5.hotel.ordering.Invoice;
import sechalmersmdsdgroup5.hotel.ordering.OrderingFactory;
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

    /**
     * Client pays directly through the machine.
     * @param payable
     */
    @Override
    public void debit(Payable payable) {
        //Here the customer pays externally using a card reader,
        //such that the payable's total cost is covered.
        payable.setIsPaid(true);
    }

    /**
     * Here the client is debitted through an invoice.
     * @param payable anything which a client has to pay for.
     * @param client
     */
    @Override
    public void debit(Payable payable, Client client) {
        if ( payable.isPaid() ) {
            return;
        }

        if ( payable.getInvoice() == null || payable.getInvoice().isEmpty() ) {
            // Create invoice if needed.
            Invoice invoice = OrderingFactory.INSTANCE.createInvoice();
           /*
            TODO fix this when merged changes from issue #131 and #128
            invoice.setTotalPrice(payable.totalPrice());
            client.addInvoice(invoice);F
            // The client will then get a mail or physical copy of the invoice which he or she will pay for.
            */
            //This is outside the system and therefore the invoice will simply be regarded as paid here.
            invoice.setIsPaid(true);
            payable.setIsPaid(true);
        }
        else {
            // Flag all non-paid invoices as paid and assign to client.
            for (Invoice invoice : payable.getInvoice() ) {
                if ( !invoice.isPaid() ) {
                   //TODO FIX CLIENT ADD INVOICE.
                    invoice.setIsPaid(true);
                }
            }
            //Assume the client will pay outside the system.
        }

    }

    @Override
    public void printReceipt(Payable invoicable) {

    }
}
