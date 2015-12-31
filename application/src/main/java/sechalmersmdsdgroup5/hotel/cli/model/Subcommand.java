package sechalmersmdsdgroup5.hotel.cli.model;

import java.util.function.Supplier;

/**
 * Subcommand is a dependency for a Command.
 * @param <I>
 * @param <O>
 */
public interface Subcommand<I, O> extends CommandPart, Supplier<Command<I, O>> {
}