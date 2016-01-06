package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.Service;

import java.util.ArrayList;

public class SearchUnpaidServicesOrder implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept( IOHelper io, Hotel hotel ) {
        io.info( "Displays unpaid services..." ).newline();
        for(Service s : getUnpaidServices(hotel, io.read("order ID: "))){
            io.info(s.toString()).newline();
        }
    }

    @Override
    public String help() {
        return "displays unpaid services given an order.";
    }

    @Override
    public String getIdentifier() {
        return "search-unpaid-services-order";
    }

    private ArrayList<Service> getUnpaidServices(Hotel hotel, String stringid){
        ArrayList<Service> result = new ArrayList<Service>();
        int id = 0;

        try {
            id = Integer.parseInt(stringid);
        }catch (NumberFormatException e){
            return result;
        }

        for(Order o : hotel.getOrders()) {
            if (o.getId() == id) {
                for (RoomBooking b : o.getBookings()) {
                    for (Service s : b.getServices()) {
                        if (!s.isPaid()) {
                            result.add(s);
                        }
                    }
                }
            }
            return result;
        }
        return result;
    }
}