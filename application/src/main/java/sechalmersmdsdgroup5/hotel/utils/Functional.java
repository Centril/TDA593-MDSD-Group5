package sechalmersmdsdgroup5.hotel.utils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ObjIntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

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

	/**
	 * Converts a stream of elements to a list.
	 *
	 * @param stream the stream to convert.
	 * @param <E> the element type.
	 * @return the resulting list.
	 */
	public static <E> List<E> listify( Stream<E> stream ) {
		return stream.collect( Collectors.toList() );
	}

	/**
	 * concatMap:s (flatMap) a list of type S (Source) to type T (Target).
	 * The mapping function takes in an object of type S and must return an iterable of type T.
	 *
	 * @param outer the outer list.
	 * @param mapper the mapping function.
	 * @param <T> the target type.
	 * @param <S> the source type.
	 * @return the list with elements of type T.
	 */
	public static <T, S> List<T> concatMap( List<S> outer, Function<? super S, ? extends Iterable<T>> mapper ) {
		return listify( concatMap( outer.stream(), mapper ) );
	}

	/**
	 * concatMap:s (flatMap) a stream of type S (Source) to type T (Target).
	 * The mapping function takes in an object of type S and must return an iterable of type T.
	 *
	 * @param outer the outer stream.
	 * @param mapper the mapping function.
	 * @param <T> the target type.
	 * @param <S> the source type.
	 * @return the stream with elements of type T.
	 */
	public static <T, S> Stream<T> concatMap( Stream<S> outer, Function<? super S, ? extends Iterable<T>> mapper ) {
		return outer.flatMap( elem -> StreamSupport.stream( mapper.apply( elem ).spliterator(), false ) );
	}

	/**
	 * Performs an indexed foreach of a list.
	 *
	 * @param list the list to perform foreach of.
	 * @param consumer the consumer.
	 * @param <T> the type of list elements.
     */
	public static <T> void foreachIndexed( List<T> list, ObjIntConsumer<T> consumer ) {
		IntStream.range( 0, list.size() ).forEach( index -> consumer.accept( list.get( index ), index ) );
	}
}