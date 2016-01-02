package sechalmersmdsdgroup5.hotel.utils;

import java.util.function.BooleanSupplier;
import java.util.stream.Stream;

import static java.util.Spliterator.ORDERED;
import static java.util.Spliterators.spliteratorUnknownSize;
import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.generate;
import static java.util.stream.StreamSupport.stream;

/**
 * Utilities for Stream:s.
 */
public class Streams {
	/**
	 * Repeating stream of at least min of element, optionally more.
	 *
	 * @param min the minimum amount of elements.
	 * @param elem the element to repeat.
	 * @param more the BooleanSupplier determining if element should be repeated more.
	 * @param <T> the type of the element.
	 * @return the resulting stream.
	 */
	public static <T> Stream<T> atLeast( int min, T elem, BooleanSupplier more ) {
		return concat( repeat( elem ).limit( min ), growingInfinite( elem, more ) );
	}

	/**
	 * Repeating stream that grows infinitely, until more yields false.
	 *
	 * @param elem the element to repeat.
	 * @param more the BooleanSupplier determining if element should be repeated more.
	 * @param <T> the type of the element.
	 * @return the resulting stream.
	 */
	public static <T> Stream<T> growingInfinite( T elem, BooleanSupplier more ) {
		return stream( spliteratorUnknownSize( Iterators.of( elem, more ), ORDERED ), false );
	}

	public static <T> Stream<T> repeat( T x, int count ) {
		return repeat( x ).limit( count );
	}

	public static <T> Stream<T> repeat( T x ) {
		return generate( () -> x );
	}
}