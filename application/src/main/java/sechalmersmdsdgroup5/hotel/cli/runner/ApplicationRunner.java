package sechalmersmdsdgroup5.hotel.cli.runner;

import sechalmersmdsdgroup5.hotel.cli.model.Application;
import sechalmersmdsdgroup5.hotel.cli.model.Command;
import sechalmersmdsdgroup5.hotel.cli.model.CommandPart;
import sechalmersmdsdgroup5.hotel.cli.model.Subcommand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ApplicationRunner<I> implements Runnable {
	private I state;

	private Deque<CommandState<I>> commands = new ArrayDeque<>();

	private BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

	private Map<String, Command<I, ?>> available;

	public ApplicationRunner( I state, Application<I> app ) {
		this.state = state;
		this.available = app.get();
	}

	@Override
	public void run() {
		loop:
		while ( true ) {
			String next = read();
			String lc = next.toLowerCase();
			switch ( lc ) {
				case ":q":
					return;

				case "":
					continue loop;

				case ":c":
					cancelRoot();
					continue loop;

				case ":cc":
					if ( commands.size() == 1 ) {
						cancelRoot();
					} else {
						cancelCurrent();
					}
					continue loop;
			}

			if ( commands.isEmpty() ) {
				// Add a new root command.
				Command<I, ?> command = available.get( lc );

				if ( command == null ) {
					error( "No such command exists." );
					continue;
				}

				commands.addFirst( new CommandState<>( command ) );
				tryAdvance();
				continue;
			}

			CommandState<I> top = commands.peekLast();
			InputSlot slot = top.curr();
			CommandPart part = slot.part();
			if ( part instanceof Subcommand ) {
				//noinspection unchecked
				commands.addLast( new CommandState<I>( ((Subcommand<I, ?>) part).get() ) );
			} else {

			}
		}
	}

	private void cancelCurrent() {
		CommandState<I> cmd = commands.pollLast();
		if ( cmd != null && cmd.cmd.cancelable() ) {
			if ( !commands.peekLast().curr().requiredSatisfied() ) {
				commands.addLast( cmd );
				error( "Sub-command can't be canceled yet." );
			} else {
				tryAdvance();
			}
		} else {
			commands.addLast( cmd );
			error( "Sub-command can't be canceled." );
		}
	}

	private void tryAdvance() {
		CommandState<I> cmd = commands.peekLast();
		while ( cmd != null && cmd.curr().requiredSatisfied() ) {
			if ( willAddMore( cmd.curr() ) ) {
				return;
			}

			if ( cmd.atLast() ) {
				Object result = cmd.execute( state );
				commands.removeLast();
				if ( !commands.isEmpty() ) {
					cmd = commands.peekLast();
					cmd.curr().addData( result );
				}
			} else {
				cmd.advance();
			}
		}
	}

	private boolean willAddMore( InputSlot slot ) {
		if ( !slot.limitReached() ) {
			info( "Add more?" );
			if ( read().startsWith( "y" ) ) {
				return true;
			}
		}

		return false;
	}

	private void cancelRoot() {
		CommandState<I> owner = commands.peekFirst();
		if ( owner != null && owner.cmd.cancelable() ) {
			commands.clear();
		} else {
			error( "Command can't be canceled." );
		}
	}

	private void error( String msg ) {
		System.out.println( msg );
	}

	private void info( String msg ) {
		System.out.println( msg );
	}

	private String read() {
		try {
			return reader.readLine().trim();
		} catch ( IOException e ) {
			e.printStackTrace();
			return "";
		}
	}
}