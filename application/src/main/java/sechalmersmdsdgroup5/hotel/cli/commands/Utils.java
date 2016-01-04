package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;

import java.time.LocalDateTime;
import java.util.Date;
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
}