package sechalmersmdsdgroup5.hotel.utils;

import java.util.Iterator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/**
 * Utilities for Iterator:s.
 */
public class Iterators {
	/**
	 * Creates an iterator repeating next forever.
	 *
	 * @param next the element to repeat.
	 * @param <T> the type of the element.
	 * @return the iterator.
	 */
	public static <T> Iterator<T> of( T next ) {
		return of( next, () -> true );
	}

	/**
	 * Creates an infinite iterator with next as its element source.
	 *
	 * @param next the element source.
	 * @param <T> the type of the element.
	 * @return the iterator.
	 */
	public static <T> Iterator<T> of( Supplier<T> next ) {
		return of( next, () -> true );
	}

	/**
	 * Creates an iterator repeating next until hasNext yields false.
	 *
	 * @param next the element to repeat.
	 * @param hasNext the determinant of whether to stop or not.
	 * @param <T> the type of the element.
	 * @return the iterator.
	 */
	public static <T> Iterator<T> of( T next, BooleanSupplier hasNext ) {
		return of( () -> next, hasNext );
	}

	/**
	 * Creates an iterator with next as its element source and until hasNext yields false.
	 * Provides a functional way of writing iterators.
	 *
	 * @param next the element source.
	 * @param hasNext the determinant of whether to stop or not.
	 * @param <T> the type of the element.
	 * @return the iterator.
	 */
	public static <T> Iterator<T> of( Supplier<T> next, BooleanSupplier hasNext ) {
		return new Iterator<T>() {
			@Override
			public boolean hasNext() { return hasNext.getAsBoolean(); }

			@Override
			public T next() { return next.get(); }
		};
	}
}