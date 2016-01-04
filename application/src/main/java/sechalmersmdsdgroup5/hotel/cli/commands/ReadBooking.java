package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;

import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.intId;
import static sechalmersmdsdgroup5.hotel.utils.Functional.concatMap;

/**
 * Created by parke_000 on 2016-01-03.
 */
public class ReadBooking implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept( IOHelper io, Hotel hotel ) {
        io.info( "Displays booking..." ).newline()
          .info( io.read( "Booking ID:", "Booking not found!",
                intId( concatMap( hotel.getOrders(), Order::getBookings ), RoomBooking::getId ) ) );
    }

    @Override
    public String help() {
        return "displays a booking.";
    }

    @Override
    public String getIdentifier() {
        return "read-booking";
    }
}