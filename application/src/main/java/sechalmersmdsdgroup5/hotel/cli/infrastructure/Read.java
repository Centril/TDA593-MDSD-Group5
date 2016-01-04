package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.Optional;
import java.util.function.Function;

/**
 * Read: reading a string into Optional<T>.
 *
 * @param <T> the type to read to.
 */
public interface Read<T> {
	/**
	 * Optionally reads the string.
	 *
	 * @param input the input string.
	 * @return the Optional<T>
	 */
	Optional<T> read( String input );

	/**
	 * Composes this reader with a function.
	 *
	 * @param mapper the mapping function.
	 * @param <U> the resulting type.
	 * @return the new Read.
	 */
	default <U> Read<? extends U> andThen( Function<? super T, ? extends U> mapper ) {
		return input -> this.read( input ).map( mapper );
	}
}