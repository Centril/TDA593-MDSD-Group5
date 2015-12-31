package sechalmersmdsdgroup5.hotel.cli.model;

import java.util.Optional;

/**
 * Input, a monadic input that may or may not yield a value.
 */
public interface Input extends CommandPart {
	Optional<?> parse( String input );
}