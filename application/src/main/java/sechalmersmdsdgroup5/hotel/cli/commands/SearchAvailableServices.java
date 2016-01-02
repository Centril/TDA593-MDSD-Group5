package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.search.impl.Search;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.List;

import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.intId;

public class SearchAvailableServices implements IdentifiableCommand<Hotel, List<ServiceBlueprint>> {
	@Override
	public List<ServiceBlueprint> apply( IOHelper io, Hotel hotel ) {
		return io.info( "Searching for available services for a room..." ).newline()
			.monadic().read( "Room #nr:", intId( hotel.getRooms(), Room::getNr ) )
			.fmap( room -> new Search( hotel ).searchServicesFor( room ) )
			.fmap( sbs -> { sbs.forEach( io::paragraph ); return sbs; } ).get();
	}

	@Override
	public String help() {
		return "searches for available services for a room.";
	}

	@Override
	public String getIdentifier() {
		return "search-available-services";
	}
}