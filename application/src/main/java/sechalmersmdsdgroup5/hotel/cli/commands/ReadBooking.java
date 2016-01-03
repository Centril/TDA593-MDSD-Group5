package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parke_000 on 2016-01-03.
 */
public class ReadBooking implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept( IOHelper io, Hotel hotel ) {
        io.info( "Displays booking..." ).newline()
                .io(() -> io.info(read(hotel, io.read("Booking ID: "))));
    }

    @Override
    public String help() {
        return "displays a booking.";
    }

    @Override
    public String getIdentifier() {
        return "read-booking";
    }

    public String read (Hotel hotel, String id){
        List<Order> orders = hotel.getOrders();
        List<RoomBooking> bookings = new ArrayList<RoomBooking>();
        String returnvalue = "Booking not found!";
        int bookingID;

        for(Order order : orders){
            bookings.addAll(order.getBookings());
        }

        try {
            bookingID = Integer.parseInt(id);
        }catch (NumberFormatException e){
            return "Booking not found!";
        }

        for(RoomBooking booking : bookings){
            if(booking.getId() == bookingID){
                returnvalue = booking.toString();
            }
        }

        return returnvalue;
    }
}