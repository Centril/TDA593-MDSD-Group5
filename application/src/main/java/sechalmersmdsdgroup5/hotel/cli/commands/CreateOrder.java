package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.ordering.IOrder;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.PreBooking;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.ordering.impl.OrderingFacade;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Collections.singletonList;
import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.nonNegativeInt;
import static sechalmersmdsdgroup5.hotel.utils.Functional.listify;

public class CreateOrder implements IdentifiableCommand<Hotel, Order> {
    @Override
    public String getIdentifier() {
        return "create-order";
    }

    @Override
    public String help() {
        return "Create an order.";
    }

    @Override
    public Order apply( IOHelper io, Hotel hotel ) {
        io.info( "Creating an order..." ).newline();

        //int guestCount = io.read( "Amount of guests?", "Not a valid amount", naturalInt() );

        List<SearchResult<PreBooking>> resultBookings;
        while ( (resultBookings = io.execute( hotel, new SearchAvailableBookings() )).isEmpty() ) {
            io.warn( "There were no available bookings!" );
        };

        io.io( () -> {
            for ( int i = 0; i < resultBookings.size(); ++i )
                io.paragraph( i + ") " + resultBookings.get( i ) );
        } ).newline();

        List<PreBooking> bookings = listify( resultBookings.stream().map( SearchResult::getResult ) );
        Set<Integer> picked = new HashSet<>();
        List<PreBooking> selected = io.readMany(
            1,
            "Pick/add a booking from the list: ",
            "No booking with that index in list.",
            StandardReaders.integer().andThen( index -> {
                if ( picked.contains( index ) ) {
                    io.warn( "Booking already added." );
                    return null;
                }

                PreBooking booking = bookings.get( index - 1 );
                picked.add( index );
                return booking;
            } ) );

        IOrder facade = new OrderingFacade( hotel );

        List<RoomBooking> bookeds = listify( selected.stream().map( pre -> {
            Guest firstGuest = readGuest( io, hotel );
            facade.createBooking( pre, singletonList( firstGuest ) );

            return null;
        } ) );

        return null;
    }

    private Guest readGuest( IOHelper io, Hotel hotel ) {
        String name = io.read( "Guest name?" );
        // 3 month old baby...
        int age = io.read( "Guest age?", "Invalid age.", nonNegativeInt() );
        String ssn = io.read( "Guest SSN?" );
        return null;
    }
}   