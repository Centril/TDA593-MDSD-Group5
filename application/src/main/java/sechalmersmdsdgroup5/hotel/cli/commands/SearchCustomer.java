package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.clients.Customer;

import java.util.ArrayList;
import java.util.List;

import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.intId;

public class SearchCustomer  implements IdentifiableCommand<Hotel, List<Customer>> {
    @Override
    public List<Customer> apply( IOHelper io, Hotel hotel ) {
        io.info("Searching for customer...").newline();
        return search(hotel, io.read("Customer ID: "));
    }

    @Override
    public String help() {
        return "searches for a customer.";
    }

    @Override
    public String getIdentifier() {
        return "search-customer";
    }


    private List<Customer> search(Hotel hotel, String id){
        List<Customer> customers = hotel.getCustomers();
        List<Customer> result = new ArrayList<Customer>();

        for(Customer c : customers){
            if(c.getIdentity().getIdNumber().equals(id)){
                result.add(c);
            }
        }
        return result;
    }
}