package sechalmersmdsdgroup5.hotel.utils;

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
}
