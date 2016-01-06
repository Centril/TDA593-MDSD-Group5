package sechalmersmdsdgroup5.hotel.clients.impl;

import sechalmersmdsdgroup5.hotel.clients.*;
import sechalmersmdsdgroup5.hotel.identities.Identity;
import sechalmersmdsdgroup5.hotel.payment.CreditCard;
import sechalmersmdsdgroup5.hotel.payment.PaymentMethod;

/**
 * Created by cb on 05/01/16.
 */
public class ClientFacade implements IClient {

    @Override
    public Customer createCustomer(Identity identity, PaymentMethod paymentMethod, String email, CreditCard card, Address address) {
        Customer customer = ClientsFactory.INSTANCE.createCustomer();
        customer.setIdentity(identity);
        customer.setPaymentMethod(paymentMethod);
        customer.setEmail(email);
        customer.setCard(card);
        customer.setAssociatedAdress(address);
        return customer;
    }

    @Override
    public Guest createGuest(String name, String ssn, int age) {
        if(name == null || ssn == null || age < 0) {
            throw new IllegalArgumentException("Illegal age or null argument in createGuest");
        }
        ClientsFactory factory = ClientsFactory.INSTANCE;
        Guest newGuest = factory.createGuest();
        newGuest.setName(name);
        newGuest.setAge(age);
        newGuest.setIdNumber(ssn);

        return newGuest;
    }

    @Override
    public Address createAddress(String street, int zipCode, String zipArea, String country, String region, String municipality, String careOf) {
        if (street == null || zipArea == null || country == null || region == null || municipality == null || careOf
                == null) {
            throw new IllegalArgumentException("Illegal age or null argument in createAdress");
        }
        ClientsFactory factory = ClientsFactory.INSTANCE;
        Address address = factory.createAddress();

        address.setStreet(street);
        address.setZipCode(zipCode);
        address.setZipArea(zipArea);
        address.setCountry(country);
        address.setRegion(region);
        address.setMunicipality(municipality);
        address.setCareOf(careOf);

        return address;
    }
}

