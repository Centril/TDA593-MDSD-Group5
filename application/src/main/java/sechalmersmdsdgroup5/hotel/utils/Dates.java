package sechalmersmdsdgroup5.hotel.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Dates {
	/**
	 * Returns true iff n in [l, h].
	 *
	 * @param n the needle to test.
	 * @param l lower bound
	 * @param h higher bound
	 * @return n in [l, h].
	 */
	public static boolean within( Date n, Date l, Date h ) {
		return leq( l, n ) && leq( n, h );
	}

	/**
	 * Returns true iff a <= b.
	 *
	 * @param a the first date.
	 * @param b the second date.
	 * @return a <= b
	 */
	public static boolean leq( Date a, Date b ) {
		return a.compareTo( b ) <= 0;
	}

	/**
	 * Returns true iff a >= b.
	 *
	 * @param a the first date.
	 * @param b the second date.
	 * @return a >= b
	 */
	public static boolean geq( Date a, Date b ) {
		return a.compareTo( b ) >= 0;
	}

	/**
	 * Converts a java.util.Date to java.time.LocalDate.
	 *
	 * @param date the date source.
	 * @return the LocalDate.
	 */
	public static LocalDate localDate( Date date ) {
		return date.toInstant().atZone( ZoneId.systemDefault() ).toLocalDate();
	}

	/**
	 * Converts a java.util.Date to java.time.LocalDateTime.
	 *
	 * @param date the date source.
	 * @return the LocalDateTime.
	 */
	public static LocalDateTime localDateTime( Date date ) {
		return LocalDateTime.ofInstant( Instant.ofEpochMilli( date.getTime() ), ZoneId.systemDefault());
	}

	/**
	 * Converts a java.time.LocalDateTime to java.util.Date.
	 *
	 * @param ldt LocalDateTime
	 * @return Date.
	 */
	public static Date toDate( LocalDateTime ldt ) {
		return Date.from( ldt.atZone( ZoneId.systemDefault() ).toInstant() );
	}

	/**
	 * Converts a java.time.LocalDate to java.util.Date.
	 *
	 * @param ld LocalDate
	 * @return Date.
	 */
	public static Date toDate( LocalDate ld ) {
		return Date.from( ld.atStartOfDay().atZone( ZoneId.systemDefault() ).toInstant() );
	}
}