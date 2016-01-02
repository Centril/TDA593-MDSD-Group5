package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.search.impl.Search;

import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readDate;

public class SearchAvailableRooms implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
	@Override
	public void accept( IOHelper io, Hotel hotel ) {
		io.info( "Searching for available rooms..." ).newline()
			.io( () -> new Search( hotel ).searchAvailableRooms(
					readDate( "from date:", io ), readDate( "to date:", io ) ),
				rooms -> io.info( "Found rooms." ).newline().io( () -> {
					if ( rooms.isEmpty() ) io.newline( "No rooms found." );
					else rooms.forEach( io::paragraph );
				} ) );
	}

	@Override
	public String help() {
		return "searches for available rooms in hotel.";
	}

	@Override
	public String getIdentifier() {
		return "search-available-rooms";
	}
}