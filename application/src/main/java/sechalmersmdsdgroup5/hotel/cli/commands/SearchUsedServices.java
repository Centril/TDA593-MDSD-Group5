package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.cli.readers.OrderingReaders;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.search.impl.Search;
import sechalmersmdsdgroup5.hotel.services.Service;

import java.util.List;

import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.intId;
import static sechalmersmdsdgroup5.hotel.utils.Functional.concatMap;

public class SearchUsedServices implements IdentifiableCommand<Hotel, List<Service>> {
	@Override
	public List<Service> apply( IOHelper io, Hotel hotel ) {
		Search s = new Search( hotel );

		return io.info( "Searching for all used services for an order or booking..." ).newline()
			.monadic().read( "Booking or order?", OrderingReaders::bookingOrOrder )
			.fmap( useBooking -> useBooking ?
				  s.searchUsedServices( io.read( "What booking id?",
					intId( concatMap( hotel.getOrders(), Order::getBookings ), RoomBooking::getId ) ) )
				: s.searchUsedServices( io.read( "What order id?",
					intId( hotel.getOrders(), Order::getId ) ) ) )
			.get();
	}

	@Override
	public String help() {
		return "searches for used services for an order or booking.";
	}

	@Override
	public String getIdentifier() {
		return "search-used-services";
	}
}