package sechalmersmdsdgroup5.hotel.cli;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.commands.SearchActiveBookings;
import sechalmersmdsdgroup5.hotel.cli.commands.SearchAvailableRooms;
import sechalmersmdsdgroup5.hotel.cli.commands.SearchOccupiedRooms;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Application;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.color.TermColor;

import java.util.Arrays;

import static sechalmersmdsdgroup5.hotel.HotelFactory.INSTANCE;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.ApplicationRunner.runner;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.Command.command;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper.system;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.Readers.reader;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.color.StandardPrintColor.GREEN;

/**
 * CLI program.
 */
public class Main {
	/**
	 * CLI entry point.
	 *
	 * @param args CLI args.
	 */
	public static void main( String[] args ) {
		checkDisableColors( args );

		runner( header( system() ), INSTANCE.createHotel() ).accept( Application.<Hotel>builder()
			.add( SearchAvailableRooms::new )
			.add( SearchOccupiedRooms::new )
			.add( SearchActiveBookings::new )
			.cmdVoid( "error", "tests error", (io, $) -> io.error( "hello world" ) )
			.cmdVoid( "hello", "displays hello world", (io, $) -> io.info( "hello world" ) )
			.cmdVoid( "green", "displays hello world in green", (io, $) -> io.newline( GREEN, "hello world" ) )
			.cmdVoid( "test", "stuff", (io, $) ->
				io.cancelable().info( "size: " + io.readMany( 2, "label:", reader(
					x -> x.startsWith( "a" ) ) ).size() ) )
			.cmdVoid( "sub", "runs subcommands", (io, $) ->
				io.cancelable()
				  .info( "size: " + io.executeMany( 2, $, command( "",
						(io2, $2) -> io2.cancelable().read( "aaa" ) ) ).size() )
				  .info( "1337" ) )
			.cmdVoid( "sub2", "runs subcommands", (io, $) ->
				io.cancelable()
				  .info( "size: " + io.executeMany( 2, $, command( "", (io2, $2) -> io2.read( "aaa" ) ) ).size() )
				  .info( "1337" ) )
			.build() );
	}

	private static IOHelper header( IOHelper helper ) {
		return helper.paragraph( "n00dels, Hotel management system 1.0.0" )
					.quitAware( io -> io.paragraph( "Welcome back " + io.read( "Please identify" ) + "!" ) );
	}

	/**
	 * Disable terminal colors if instructed to.
	 *
	 * @param args CLI args.
	 */
	private static void checkDisableColors( String[] args ) {
		if ( Arrays.stream( args ).map( String::trim ).anyMatch(
				str -> str.equals( "--no-color" ) || str.equals( "-nc" ) ) ) {
			TermColor.enabled = false;
		}
	}
}