package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;

import java.util.Date;

/**
 * Utils for commands.
 */
public class Utils {
	public static Date readDate( String label, IOHelper io ) {
		return io.readOpt( label, StandardReaders.date() ).orElseGet( Date::new );
	}

	public static Integer readInteger( String label, IOHelper io ) {
		return io.read( label, StandardReaders.integer() );
	}

	public static Boolean readBool( String label, IOHelper io ) {
		return io.read( label, StandardReaders.bool() );
	}
}