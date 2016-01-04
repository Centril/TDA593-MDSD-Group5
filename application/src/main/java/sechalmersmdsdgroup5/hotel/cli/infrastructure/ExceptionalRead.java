package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.Optional;
import java.util.function.Function;

import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;

/**
 * Reader that fails on exception, any exception.
 */
public interface ExceptionalRead<T> extends Read<T> {
	@Override
	default Optional<T> read( String input ) {
		try {
			return ofNullable( readE( input ) );
		} catch ( RuntimeException ignored ) {
			return empty();
		}
	}

	/**
	 * Exceptionally reads input into T.
	 * Any exception results in Optional.empty().
	 *
	 * @param input the input.
	 * @return T.
	 */
	T readE( String input );

	/**
	 * Composes this reader with a function.
	 *
	 * @param mapper the mapping function.
	 * @param <U> the resulting type.
	 * @return the new Read.
	 */
	default <U> ExceptionalRead<U> andThen( Function<? super T, ? extends U> mapper ) {
		return input -> this.read( input ).map( mapper ).get();
	}
}