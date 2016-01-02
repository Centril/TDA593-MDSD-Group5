package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * A command, with an input, an IOHelper and an output.
 *
 * @param <I> input type
 * @param <O> output type
 */
public interface Command<I, O> extends BiFunction<IOHelper, I, O> {
	/**
	 * Returns a help message for this command.
	 *
	 * @return the help message.
	 */
	String help();

	/**
	 * Returns a command from help message and a BiConsumer as command body.
	 * Useful for lambda expressions without explicit return.
	 *
	 * @param help the help message.
	 * @param cmd the command.
	 * @param <I> the input type.
	 * @return the command.
	 */
	static <I> Command<I, Void> commandVoid( String help, BiConsumer<IOHelper, I> cmd ) {
		return command( help, (io, input) -> { cmd.accept( io, input ); return null; } );
	}

	/**
	 * Returns a command from help message and a function as command body.
	 * Useful for lambda expressions.
	 *
	 * @param help the help message.
	 * @param cmd the command.
	 * @param <I> the input type.
	 * @param <O> the output type.
	 * @return the command.
	 */
	static <I, O> Command<I, O> command( String help, BiFunction<IOHelper, I, O> cmd ) {
		return new Base<>( help, cmd );
	}

	/**
	 * Base class for a command.
	 *
	 * @param <I> the input type.
	 * @param <O> the output type.
	 */
	class Base<I, O> implements Command<I, O> {
		private String help;
		private BiFunction<IOHelper, I, O> cmd;

		public Base( String help, BiFunction<IOHelper, I, O> cmd ) {
			this.help = help;
			this.cmd = cmd;
		}

		@Override
		public String help() {
			return help;
		}

		@Override
		public O apply( IOHelper io, I input ) {
			return cmd.apply( io, input );
		}
	}
}