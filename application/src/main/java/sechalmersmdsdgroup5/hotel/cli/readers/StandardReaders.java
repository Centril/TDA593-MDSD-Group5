package sechalmersmdsdgroup5.hotel.cli.readers;

import sechalmersmdsdgroup5.hotel.cli.infrastructure.ExceptionalRead;
import sechalmersmdsdgroup5.hotel.utils.Dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * StandardReaders provide a bunch of standard readers.
 */
public class StandardReaders {
	public static ExceptionalRead<Date> date() {
		return input -> Dates.toDate( LocalDate.parse( input, DateTimeFormatter.ISO_DATE ) );
	}
}