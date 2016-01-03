package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.search.impl.Search;
import sechalmersmdsdgroup5.hotel.services.Service;

import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class SearchUsedServices implements IdentifiableCommand<Hotel, List<Service>> {
	@Override
	public List<Service> apply( IOHelper io, Hotel hotel ) {
		Search s = new Search( hotel );

		/*
		Monad<Boolean> b = io.info( "Searching for all used services for an order or booking..." ).newline()
				.monadic().read( "Booking or order?", SearchUsedServices::bookingOrOrder )
				.fmap( what -> {
					io.read( "What booking #nr?", StandardReaders.intId( hotel.getOrders().get( 0 ). ) )
				} );
		*/

		return null;
	}

	private static Optional<Boolean> bookingOrOrder( String input ) {
		String str = input.toLowerCase();
		return str.equals( "booking" ) ? of( true ) : (str.equals( "order" ) ? of( false ) : empty());
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