package sechalmersmdsdgroup5.hotel.cli.infrastructure;

/**
 * IdentifiableCommand is a command that supplies its own identifier.
 */
public interface IdentifiableCommand<I, O> extends Command<I, O> {
	/**
	 * Returns the identifier.
	 *
	 * @return the identifier.
	 */
	String getIdentifier();
}