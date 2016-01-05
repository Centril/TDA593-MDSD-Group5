package sechalmersmdsdgroup5.hotel.clients.impl;

import sechalmersmdsdgroup5.hotel.clients.Address;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.clients.IClient;
import sechalmersmdsdgroup5.hotel.identities.Identity;
import sechalmersmdsdgroup5.hotel.payment.PaymentMethod;

/**
 * Created by cb on 05/01/16.
 */
public class CustomerFacade implements IClient {
    @Override
    public Customer createCustomer(Identity identity, PaymentMethod paymentMethod, String email) {
            Customer customer = new ClientsFactoryImpl().createCustomer();
            customer.setPaymentMethod(paymentMethod);
            customer.setIdentity(identity);
            customer.setEmail(email);
            return customer;
        }

    @Override
    public Guest createGuest(String name, String ssn, String age) {
        return null;
    }

    @Override
    public Address createAddress(String street, String zipCode, String zipArea, String country, String region, String municipality, String careOf) {
        return null;
    }
}

