package sechalmersmdsdgroup5.hotel.utils;

import java.util.function.BiFunction;
import java.util.stream.Stream;

/**
 * Provides utilities for functional programming.
 */
public class Functional {
	/**
	 * Performs a left associative fold on a given iterable starting with identity using accumulator.
	 *
	 * @param iter an iterable of elements of type E.
	 * @param identity an identity to start/seed the fold with.
	 * @param accumulator the accumulator function: accumulator :: U -> E -> U
	 * @param <U> the return type and the type of identity.
	 * @param <E> the element type of the iterable.
	 * @return the accumulated result.
	 */
	public static <U, E> U foldl( Iterable<E> iter, U identity, BiFunction<U, ? super E, U> accumulator ) {
		U result = identity;
		for ( E element : iter )
			result = accumulator.apply( result, element );
		return result;
	}

	/**
	 * Performs a left associative fold on a given stream starting with identity using accumulator.
	 *
	 * @param stream a stream of elements of type E.
	 * @param identity an identity to start/seed the fold with.
	 * @param accumulator the accumulator function: accumulator :: U -> E -> U
	 * @param <U> the return type and the type of identity.
	 * @param <E> the element type of the stream.
	 * @return the accumulated result.
	 */
	public static <U, E> U foldl( Stream<E> stream, U identity, BiFunction<U, ? super E, U> accumulator ) {
		return foldl( stream::iterator, identity, accumulator );
	}
}