package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientsFactoryImpl;
import sechalmersmdsdgroup5.hotel.facilities.FacilitiesFactory;
import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomPrototype;
import sechalmersmdsdgroup5.hotel.identities.RealPerson;
import sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesFactoryImpl;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.OrderingFactory;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.IService;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;
import sechalmersmdsdgroup5.hotel.services.ServicesFactory;
import sechalmersmdsdgroup5.hotel.services.impl.ServiceFacade;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

import static sechalmersmdsdgroup5.hotel.utils.Dates.toDate;

/**
 * Utils for commands.
 */
public class Utils {
	public static Date readOrTomorrow( String label, IOHelper io ) {
		return readDate( label, io, () -> toDate( LocalDateTime.now().plusDays( 1 ) ) );
	}

	public static Date readDate( String label, IOHelper io ) {
		return readDate( label, io, Date::new );
	}

	public static Date readDate( String label, IOHelper io, Supplier<Date> whenInvalid ) {
		return io.readOpt( label, StandardReaders.date() ).orElseGet( whenInvalid );
	}

	public static Integer readInteger( String label, IOHelper io ) {
		return io.read( label, StandardReaders.integer() );
	}

	public static Boolean readBool( String label, IOHelper io ) {
		return io.read( label, StandardReaders.bool() );
	}

	/**
	 * returns -1 if the parsing was unsuccessful.
	 * @param msg
	 * @return
	 */
	public static int parseInteger(String msg) {
		int nbr = -1;
		try {
			nbr = Integer.parseInt(msg);
		} catch (NumberFormatException e) {
		}
		return nbr;
	}
}