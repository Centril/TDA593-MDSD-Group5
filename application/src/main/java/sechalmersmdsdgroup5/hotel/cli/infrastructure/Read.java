package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.Optional;

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
}