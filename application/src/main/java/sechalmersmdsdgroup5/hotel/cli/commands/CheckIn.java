package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.ordering.impl.CheckInCheckOut;

import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readInteger;

/**
 * Created by kalior on 04/01/16.
 */
public class CheckIn implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper ioHelper, Hotel hotel) {
        // ask for a guest and then finds the booking that should be checked in
        ioHelper.info( "All guests:" ).newline()
                .io( () ->
                        hotel.getGuests().forEach( ioHelper::paragraph )
                );
        int guestNr = readInteger("Pick guest by number", ioHelper);

        if (guestNr >= 0 && guestNr < hotel.getGuests().size()) {
            Guest guest = hotel.getGuests().get(guestNr);

            ioHelper.info("Bookings related to guest that can be checked in").newline();
            RoomBooking roomBooking = null;
            for (Order order : hotel.getOrders()) {
                for (RoomBooking booking : order.getBookings()) {
                    if ( booking.getGuests().contains(guest)) {
                        String input = ioHelper.info(booking).newline().read("This booking? (y/n)");
                        if (input == "y") {
                            roomBooking = booking;
                        }
                    }
                }
            }
            if (roomBooking == null) {
                ioHelper.info("No booking selected");
            } else if ((new CheckInCheckOut()).checkIn(guest, roomBooking)) {
                ioHelper.info("Guest and booking successfully checked in");
            } else {
                ioHelper.info("Guest and booking failed to check in");
            }

        } else {
            ioHelper.info("Invalid number");
        }
    }

    @Override
    public String getIdentifier() {
        return "check-in-room";
    }

    @Override
    public String help() {
        return "Check in a room in the hotel with the help of a guest";
    }
}
