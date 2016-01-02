package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.Optional;

import static java.util.Optional.empty;
import static java.util.Optional.of;

/**
 * Reader that fails on exception, any exception.
 */
public interface ExceptionalRead<T> extends Read<T> {
	@Override
	default Optional<T> read( String input ) {
		try {
			return of( readE( input ) );
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
}