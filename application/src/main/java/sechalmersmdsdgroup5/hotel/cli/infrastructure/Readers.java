package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.function.Function.identity;

/**
 * Utilities for Read.
 */
public class Readers {
	public static <T> VerifiableRead<String, String> reader( Predicate<String> validate ) {
		return reader( validate, identity() );
	}

	public static <T> VerifiableRead<String, T> reader( Predicate<String> validate,
	                                                    Function<String, T> after ) {
		return reader( identity(), validate, after );
	}

	public static <U, T> VerifiableRead<U, T> reader( Function<String, U> before,
	                                                  Predicate<U> validate,
	                                                  Function<U, T> after ) {
		return new VerifiableRead<U, T>() {
			@Override
			public U mapBefore( String input ) {
				return before.apply( input );
			}

			@Override
			public boolean validate( U input ) {
				return validate.test( input );
			}

			@Override
			public T mapAfter( U input ) {
				return after.apply( input );
			}
		};
	}
}