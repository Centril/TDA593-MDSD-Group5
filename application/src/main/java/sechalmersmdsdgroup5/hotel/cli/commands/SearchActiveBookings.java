package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;
import sechalmersmdsdgroup5.hotel.search.impl.Search;

import java.util.Date;

public class SearchActiveBookings implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
	@Override
	public void accept( IOHelper io, Hotel hotel ) {
		io.info( "Searching for active bookings..." ).newline()
			.io( () -> new Search( hotel ).searchActiveBookings( date( "from date:", io ), date( "to date:", io ) ),
				bookings -> io.info( "Found bookings." ).newline().io( () -> {
					if ( bookings.isEmpty() ) io.newline( "No bookings found." );
					else bookings.forEach( io::paragraph );
				} ) );
	}

	private Date date( String label, IOHelper io ) {
		return io.readOpt( label, StandardReaders.date() ).orElseGet( Date::new );
	}

	@Override
	public String help() {
		return "searches for active bookings in hotel.";
	}

	@Override
	public String getIdentifier() {
		return "search-active-bookings";
	}
}