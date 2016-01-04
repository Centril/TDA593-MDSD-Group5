package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.ordering.impl.CheckInCheckOut;
import sechalmersmdsdgroup5.hotel.search.impl.Search;

import java.util.Date;
import java.util.List;

import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readInteger;

/**
 * Created by kalior on 04/01/16.
 */
public class CheckOut implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper ioHelper, Hotel hotel) {
        ioHelper.info( "All guests:" ).newline()
                .io( () ->
                        hotel.getGuests().forEach( ioHelper::paragraph )
                );
        int guestNr = readInteger("Pick guest by number", ioHelper);
        if (guestNr >= 0 && guestNr < hotel.getGuests().size()) {
            Guest guest = hotel.getGuests().get(guestNr);

            List<RoomBooking> activeBookings = new Search(hotel).searchActiveBookings(new Date(), new Date());

            RoomBooking roomBooking = null;

            for (RoomBooking booking : activeBookings) {
                if (booking.getGuests().contains(guest)) {
                    String input = ioHelper.info(booking).newline().read("This booking? (y/n)");
                    if (input == "y") {
                        roomBooking = booking;
                    }
                }
            }
            if (roomBooking == null) {
                ioHelper.info("No booking selected");
            } else if ((new CheckInCheckOut()).checkOut(guest, roomBooking)) {
                ioHelper.info("Guest and booking successfully checked out");
            } else {
                ioHelper.info("Guest and booking failed to check out");
            }

        } else {
            ioHelper.info("Invalid number");
        }
    }

    @Override
    public String getIdentifier() {
        return "check-out-room";
    }

    @Override
    public String help() {
        return "Checks out a room with a guest";
    }
}
