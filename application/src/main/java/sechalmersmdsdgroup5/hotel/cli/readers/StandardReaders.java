package sechalmersmdsdgroup5.hotel.cli.readers;

import sechalmersmdsdgroup5.hotel.cli.infrastructure.ExceptionalRead;
import sechalmersmdsdgroup5.hotel.utils.Dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.function.ToIntFunction;

/**
 * StandardReaders provide a bunch of standard readers.
 */
public class StandardReaders {
	public static ExceptionalRead<Date> date() {
		return input -> Dates.toDate( LocalDate.parse( input, DateTimeFormatter.ISO_DATE ) );
	}

	public static <T> ExceptionalRead<T> choice( List<T> from ) {
		// It is natural to use 1 indexing.
		return integer().andThen( index -> from.get( index - 1 ) );
	}

	public static <T> ExceptionalRead<T> intId( List<T> from, ToIntFunction<T> idMapper ) {
		return input -> {
			int id = Integer.parseInt( input );
			return from.stream().filter( x -> idMapper.applyAsInt( x ) == id ).findFirst().get();
		};
	}

	public static <T> ExceptionalRead<Integer> intNotFound( List<T> from, ToIntFunction<T> idMapper ) {
		return input -> {
			int id = Integer.parseInt( input );
			return from.stream().noneMatch( x -> idMapper.applyAsInt( x ) == id ) ? id : null;
		};
	}

	public static ExceptionalRead<Integer> naturalInt() {
		return integer().andThen( i -> i < 1 ? null : i );
	}

	public static ExceptionalRead<Integer> nonNegativeInt() {
		return integer().andThen( i -> i < 0 ? null : i );
	}

	public static ExceptionalRead<Integer> integer() {
		return Integer::parseInt;
	}

	public static ExceptionalRead<Boolean> bool() {
		return Boolean::parseBoolean;
	}

	public static ExceptionalRead<Float> floating() {
		return Float::parseFloat;
	}

	public static ExceptionalRead<Double> doubleR() {
		return Double::parseDouble;
	}
}