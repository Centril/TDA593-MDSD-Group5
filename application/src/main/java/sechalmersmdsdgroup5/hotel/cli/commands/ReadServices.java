package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.Service;

import java.util.ArrayList;
import java.util.List;

public class ReadServices implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept( IOHelper io, Hotel hotel ) {
        io.info( "Displays services..." ).newline();
        for(Service s : getUnpaidServices(hotel, io.read("booking ID: "))){
            io.info(s.toString()).newline();
        }
    }

    @Override
    public String help() {
        return "displays services given a booking.";
    }

    @Override
    public String getIdentifier() {
        return "read-services-booking";
    }

    private List<Service> getUnpaidServices(Hotel hotel, String stringid){
        ArrayList<Service> result = new ArrayList<Service>();
        int id = 0;

        try {
            id = Integer.parseInt(stringid);
        }catch (NumberFormatException e){
            return result;
        }

        for(Order o : hotel.getOrders()) {
                for (RoomBooking b : o.getBookings()) {
                    if(b.getId() == id){
                        return b.getServices();
                }
            }
        }
        return result;
    }
}