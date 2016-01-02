package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.Optional;

/**
 * VerifiableRead extends Read with an easier implementable interface.
 * It first maps the input to an intermediate type, then verifies that type.
 * It then either returns "Nothing" or the mapped type mapped to the resulting type.
 *
 * @param <U> The intermediate type.
 * @param <T> The resulting type.
 */
public interface VerifiableRead<U, T> extends Read<T> {
	default Optional<T> read( String input ) {
		U before = mapBefore( input );
		return Optional.ofNullable( validate( before ) ? mapAfter( before ) : null );
	}

	/**
	 * Maps the input string to an intermediate type U.
	 *
	 * @param input the input string.
	 * @return the intermediate object of type U.
	 */
	U mapBefore( String input );

	/**
	 * Determine if the intermediate type U is valid.
	 *
	 * @param input the intermediate input.
	 * @return true if valid.
	 */
	boolean validate( U input );

	/**
	 *Maps the validated input to the resulting type T.
	 *
	 * @param input the intermediate input.
	 * @return the resulting input.
	 */
	T mapAfter( U input );
}