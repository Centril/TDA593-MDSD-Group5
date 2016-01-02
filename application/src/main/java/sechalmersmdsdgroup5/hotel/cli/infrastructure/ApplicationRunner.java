package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.Map;
import java.util.function.Consumer;

import static sechalmersmdsdgroup5.hotel.cli.infrastructure.Command.commandVoid;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.Readers.reader;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.color.StandardPrintColor.RED;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.color.StandardPrintColor.YELLOW;

/**
 * ApplicationRunner runs an application.
 *
 * @param <I> the input type of the commands.
 */
public class ApplicationRunner<I> implements Consumer<Application<I>> {
	private final IOHelper helper;
	private final I state;

	/**
	 * Creates and returns a new runner.
	 *
	 * @param io the IOHelper.
	 * @param state the state.
	 * @param <I> the input type of the commands.
	 * @return the runner.
	 */
	public static <I> ApplicationRunner<I> runner( IOHelper io, I state ) {
		return new ApplicationRunner<>( io, state );
	}

	/**
	 * Constructs an ApplicationRunner given an IOHelper and state.
	 *
	 * @param io the IOHelper.
	 * @param state the state.
	 */
	public ApplicationRunner( IOHelper io, I state ) {
		this.helper = io;
		this.state = state;
	}

	@Override
	public void accept( Application<I> app ) {
		Map<String, Command<I, ?>> available = app.get();

		// Add help command:
		available.put( "help", commandVoid( "Displays this help message.", (io, $) -> {
			io.info( "These commands exist:" ).newline();
			available.forEach( (id, cmd) -> io.print( YELLOW, id ).paragraph( ": " + cmd.help() ) );
		} ) );

		// Add clear command:
		available.put( "clear", commandVoid( "Clears the screen.", (io, $) -> io.clear() ) );

		while ( true ) {
			// Reset cancelable state:
			helper.cancelable( false );

			// Fetch & Execute command:
			try {
				helper.read( "Specify command:", reader( available::containsKey, available::get ) )
					  .apply( helper, state );
				helper.newline();
			} catch ( QuitException e ) {
				helper.bracketln( RED, "QUIT", "Good bye." );
				return;
			} catch ( CancelException ignored ) {
				helper.cancelling( "Command" );
			}
		}
	}
}