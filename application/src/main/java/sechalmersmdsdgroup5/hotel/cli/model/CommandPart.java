package sechalmersmdsdgroup5.hotel.cli.model;

/**
 * CommandPart is a part of a command.
 */
public interface CommandPart {
	/**
	 * Returns how many, at most, that there can be of these (outputs).
	 * Zero means infinitely many.
	 *
	 * @return the limit.
	 */
	default int limit() { return 1; }

	/**
	 * Returns how many at least that there needs to be of these (outputs).
	 * Needs to return >= 1.
	 *
	 * @return the minimum.
	 */
	default int required() { return 1; }

	/**
	 * Human friendly label for the part.
	 *
	 * @return the label.
	 */
	String getLabel();
}