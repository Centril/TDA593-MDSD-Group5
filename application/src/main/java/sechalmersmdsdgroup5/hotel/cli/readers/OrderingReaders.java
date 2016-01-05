package sechalmersmdsdgroup5.hotel.cli.readers;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

public class OrderingReaders {
	public static Optional<Boolean> bookingOrOrder( String input ) {
		String str = input.toLowerCase();
		return str.equals( "booking" ) ? of( true ) : (str.equals( "order" ) ? of( false ) : empty());
	}
}