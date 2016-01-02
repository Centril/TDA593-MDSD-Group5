package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.search.impl.Search;

import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readDate;

public class SearchActiveBookings implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
	@Override
	public void accept( IOHelper io, Hotel hotel ) {
		io.info( "Searching for active bookings..." ).newline()
			.io( () -> new Search( hotel ).searchActiveBookings(
					readDate( "from date:", io ), readDate( "to date:", io ) ),
				bookings -> io.info( "Found bookings." ).newline().io( () -> {
					if ( bookings.isEmpty() ) io.newline( "No bookings found." );
					else bookings.forEach( io::paragraph );
				} ) );
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