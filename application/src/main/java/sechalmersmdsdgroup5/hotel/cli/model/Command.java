package sechalmersmdsdgroup5.hotel.cli.model;

import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * Command models a command with:
 *
 * get :: [CommandPart]
 * apply :: I -> [?] -> O
 * cancelable :: boolean
 *
 * @param <I>
 * @param <O>
 */
public interface Command<I, O> extends BiFunction<I, Iterable<?>, O>, Supplier<Iterable<? extends CommandPart>> {
	/**
	 * Returns true iff a command can be canceled at any point in time
	 * while executing input-parsing or dependencies.
	 *
	 * @return true iff cancelable.
	 */
	default boolean cancelable() { return false; }
}