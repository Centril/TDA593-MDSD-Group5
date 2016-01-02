package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * Application provides mappings between identifier and command.
 *
 * @param <I> the input type of the commands.
 */
public interface Application<I> extends Supplier<Map<String, Command<I, ?>>> {
	/**
	 * Builder for Application.
	 *
	 * @param <I> the input type of the commands.
	 */
	interface Builder<I> {
		/**
		 * Adds a command with ident(ifier).
		 *
		 * @param ident the identifier.
		 * @param cmd the command.
		 * @return the builder.
		 */
		Builder<I> add( String ident, Command<I, ?> cmd );

		/**
		 * Builds the Application.
		 *
		 * @return the Application.
		 */
		Application<I> build();

		/**
		 * Adds a command with ident(ifier), help message and cmd (a function, IOHelper -> I -> ?
		 *
		 * @param ident the identifier.
		 * @param help the help message.
		 * @param cmd the command.
		 * @return the builder.
		 */
		default Builder<I> cmd( String ident, String help, BiFunction<IOHelper, I, ?> cmd ) {
			return add( ident, Command.command( help, cmd ) );
		}

		/**
		 * Adds a command with ident(ifier), help message and cmd (a consumer, IOHelper -> I -> ().
		 *
		 * @param ident the identifier.
		 * @param help the help message.
		 * @param cmd the command.
		 * @return the builder.
		 */
		default Builder<I> cmdVoid( String ident, String help, BiConsumer<IOHelper, I> cmd ) {
			return add( ident, Command.commandVoid( help, cmd ) );
		}
	}

	/**
	 * Returns an Application.Builder.
	 *
	 * @return the builder.
	 */
	static <I> Builder<I> builder() {
		return new StandardBuilder<>();
	}

	class StandardBuilder<I> implements Builder<I> {
		private final Map<String, Command<I, ?>> commands = new LinkedHashMap<>();

		@Override
		public Builder<I> add( String ident, Command<I, ?> cmd ) {
			commands.put( ident, cmd );
			return this;
		}

		@Override
		public Application<I> build() {
			return () -> commands;
		}
	}
}