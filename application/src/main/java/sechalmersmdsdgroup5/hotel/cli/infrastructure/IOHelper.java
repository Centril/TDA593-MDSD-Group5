package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import sechalmersmdsdgroup5.hotel.cli.infrastructure.color.PrintColor;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.color.PrintColorWriter;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.color.TermColor;

import java.io.*;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.stream.Stream.concat;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.Readers.reader;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.color.StandardPrintColor.*;
import static sechalmersmdsdgroup5.hotel.utils.Functional.listify;
import static sechalmersmdsdgroup5.hotel.utils.Streams.*;

/**
 * IOHelper: helper for I/O in CLI.
 * Not thread safe.
 */
public class IOHelper {
	private BufferedReader reader;
	private PrintColorWriter out;
	private PrintColorWriter err;

	private boolean cancelable = false;
	private IOHelper parent;

	/**
	 * Creates an IOHelper using System.in, System.out, System.err.
	 *
	 * @return the IOHelper.
	 */
	public static IOHelper system() {
		return new IOHelper( System.in, System.out, System.out );
	}

	/**
	 * Constructs the helper given input, output, error stream.
	 * @param in the input stream.
	 * @param out the print stream for normal output.
	 * @param err the print stream for error output.
	 */
	public IOHelper( InputStream in, PrintStream out, PrintStream err ) {
		reader = new BufferedReader( new InputStreamReader( in ) );
		try {
			this.out = new PrintColorWriter( out );
			this.err = new PrintColorWriter( out );
		} catch ( UnsupportedEncodingException e ) {
			throw new RuntimeException( e );
		}
	}

	/**
	 * Copy constructor.
	 *
	 * @param helper the other helper.
	 */
	public IOHelper( IOHelper helper ) {
		reader = helper.reader;
		out = helper.out;
		err = helper.err;
		parent = helper;
	}

	/**
	 * Returns an IOMonadic view of this helper.
	 *
	 * @return the IOMonadic helper.
	 */
	public IOMonadic monadic() {
		return new IOMonadic( this );
	}

	/**
	 * Returns a IOPromising view of this helper.
	 *
	 * @return the IOPromising helper.
	 */
	public IOPromising promising() {
		return new IOPromising( this );
	}

	/**
	 * Helper for void returning lambda functions.
	 */
	public void noop() {}

	/**
	 * Clears console if possible.
	 */
	protected IOHelper clear() {
		if ( TermColor.enabled ) {
			out.print( "\033[H\033[2J" );
			out.flush();
		}
		return this;
	}

	/**
	 * Print error and issue a QuitException.
	 *
	 * @param msg the message.
	 */
	public IOHelper error( Object msg ) {
		bracketln( err, RED, "ERROR", msg );
		err.println();
		throw new QuitException();
	}

	/**
	 * Print warning message.
	 *
	 * @param msg the message.
	 */
	public IOHelper warn( Object msg ) {
		return bracketln( err, YELLOW, "WARN", msg );
	}

	/**
	 * Print info message.
	 *
	 * @param msg the message.
	 */
	public IOHelper info( Object msg ) {
		return bracketln( CYAN, "INFO", msg );
	}

	/**
	 * Prints something like this: [color(inside)] msg with newline at end.
	 *
	 * @param color the color of the inside.
	 * @param inside the inside msg.
	 * @param msg the outside msg.
	 */
	public IOHelper bracketln( PrintColor color, Object inside, Object msg ) {
		return bracketln( out, color, inside, msg );
	}

	/**
	 * Prints something like this: [color(inside)] msg.
	 *
	 * @param color the color of the inside.
	 * @param inside the inside msg.
	 * @param msg the outside msg.
	 */
	public IOHelper bracket( PrintColor color, Object inside, Object msg ) {
		return bracket( out, color, inside, msg );
	}

	/**
	 * Prints a paragraph.
	 *
	 * @param msg the message.
	 */
	public IOHelper paragraph( Object msg ) {
		newline( msg );
		return newline();
	}

	/**
	 * Prints a paragraph in color.
	 *
	 * @param color the color.
	 * @param msg the message.
	 */
	public IOHelper paragraph( PrintColor color, Object msg ) {
		newline( color, msg );
		return newline();
	}

	/**
	 * Prints newline.
	 */
	public IOHelper newline() {
		out.println();
		return this;
	}

	/**
	 * Print message with new line at end.
	 *
	 * @param msg the message.
	 */
	public IOHelper newline( Object msg ) {
		out.println( msg.toString() );
		return this;
	}

	/**
	 * Prints msg in color with newline at end.
	 *
	 * @param color the color.
	 * @param msg the message.
	 */
	public IOHelper newline( PrintColor color, Object msg ) {
		out.println( color, msg.toString() );
		return this;
	}

	/**
	 * Prints msg without newline.
	 *
	 * @param msg the message.
	 */
	public IOHelper print( Object msg ) {
		out.print( msg.toString() );
		out.flush();
		return this;
	}

	/**
	 * Prints msg in color.
	 *
	 * @param color the color.
	 * @param msg the message.
	 */
	public IOHelper print( PrintColor color, Object msg ) {
		out.print( color, msg );
		return this;
	}

	/**
	 * Make the ":c" input sequence issue a CancelException.
	 */
	public IOHelper cancelable() {
		return cancelable( true );
	}

	/**
	 * Set if the ":c" input sequence issues a CancelException or not.
	 *
	 * @param f issue CancelException on "c"?
	 */
	public IOHelper cancelable( boolean f ) {
		cancelable = f;
		return this;
	}

	/**
	 * Reads a line from InputStream specified.
	 *
	 * @param label The label to present to user.
	 * @return the line read.
	 */
	public String read( String label ) {
		try {
			bracket( out, GREEN, "INPUT", label + " " );
			String data = reader.readLine().trim();
			newline();

			if ( data.equals( ":q" ) ) {
				throw new QuitException();
			} else if ( isCancelable() && data.equals( ":c" ) ) {
				throw new CancelException();
			}

			return data;
		} catch ( IOException e ) {
			warn( "" );
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * Reads a line and feeds into a Reader that optionally results in T.
	 *
	 * @param label The label to present to user.
	 * @param reader the reader.
	 * @param <T> the type of the reader.
	 * @return the read object.
	 */
	public <T> Optional<T> readOpt( String label, Read<T> reader ) {
		return reader.read( read( label ) );
	}

	/**
	 * Reads a line and feeds into a Reader that results in T.
	 * Keeps reading until reader is satisfied.
	 *
	 * @param label The label to present to user.
	 * @param reader the reader.
	 * @param <T> the type of the reader.
	 * @return the read object.
	 */
	public <T> T read( String label, Read<T> reader ) {
		return read( label, "Invalid input specified.", reader );
	}

	/**
	 * Reads a line and feeds into a Reader that results in T.
	 * Keeps reading until reader is satisfied.
	 *
	 * @param label The label to present to user.
	 * @param onError The error message to warn() on error.
	 * @param reader the reader.
	 * @param <T> the type of the reader.
	 * @return the read object.
	 */
	public <T> T read( String label, String onError, Read<T> reader ) {
		return doWhile( () -> readOpt( label, reader ), () -> {
			warn( onError );
			err.println();
		} );
	}

	/**
	 * Reads at least min times with reader, optionally more.
	 *
	 * @param min minimum amount of times to read.
	 * @param label The label to present to user.
	 * @param reader the reader.
	 * @param <T> the type of the reader.
	 * @return the read objects.
	 */
	public <T> List<T> readMany( int min, String label, Read<T> reader ) {
		return listify( atLeast( min, reader, this::readMore ).map( r -> read( label, r ) ) );
	}

	/**
	 * Executes command, optionally.
	 *
	 * @param input the input, second argument to command.
	 * @param cmd the command to execute.
	 * @param <I> the input type of command.
	 * @param <O> the output type of command.
	 * @return the resulting object, optionally.
	 */
	public <I, O> Optional<O> executeOpt( I input, Command<I, O> cmd ) {
		IOHelper io = new IOHelper( this );

		try {
			return Optional.ofNullable( cmd.apply( io, input ) );
		} catch( CancelException ignored ) {
			if ( !io.cancelable ) throw ignored;
			io.cancelling( "Subcommand" );
			return Optional.empty();
		}
	}

	/**
	 * Executes command.
	 *
	 * @param input the input, second argument to command.
	 * @param cmd the command to execute.
	 * @param <I> the input type of command.
	 * @param <O> the output type of command.
	 * @return the resulting object.
	 */
	public <I, O> O execute( I input, Command<I, O> cmd ) {
		return doWhile( () -> executeOpt( input, cmd ), () -> {} );
	}

	/**
	 * Executes command at least min times, optionally more and returns result.
	 *
	 * @param min minimum amount of times to execute.
	 * @param input the input, second argument to command.
	 * @param cmd the command to execute.
	 * @param <I> the input type of command.
	 * @param <O> the output type of command.
	 * @return the resulting objects.
	 */
	public <I, O> List<O> executeMany( int min, I input, Command<I, O> cmd ) {
		return listify( concat(
			repeat( cmd ).limit( min ).map( c -> execute( input, c ) ),
			growingInfinite( cmd, this::readMore )
				.map( c -> executeOpt( input, c ) )
				.filter( Optional::isPresent ).map( Optional::get ) ) );
	}

	/**
	 * Produces a value, consumes it and then returns the produced value.
	 *
	 * @param producer the produces.
	 * @param consumer the consumer.
	 * @param <T> the type of the value produced.
	 * @return the produced value.
	 */
	public <T> T io( Supplier<T> producer, Consumer<T> consumer ) {
		T e = producer.get();
		consumer.accept( e );
		return e;
	}

	/**
	 * Performs an operation.
	 *
	 * @param operation the operation.
	 */
	public IOHelper io( Runnable operation ) {
		return io( io -> operation.run() );
	}

	/**
	 * Produces a value, consumes it and then returns the produced value.
	 *
	 * @param producer the produces.
	 * @param consumer the consumer.
	 * @param <T> the type of the value produced.
	 * @return the produced value.
	 */
	public <T> T io( Function<IOHelper, T> producer, BiConsumer<IOHelper, T> consumer ) {
		return io( producer.apply( this ), consumer );
	}

	/**
	 * Does an operation on some data and then returns that data.
	 * Can be seen as (<*) in terms of Monad:s.
	 *
	 * @param elem the data.
	 * @param operation the operation to run.
	 * @param <T> the type of the data.
	 * @return the data.
	 */
	public <T> T io( T elem, BiConsumer<IOHelper, T> operation ) {
		operation.accept( this, elem );
		return elem;
	}

	/**
	 * Performs an operation on this IOHelper.
	 *
	 * @param operation the operation.
	 */
	public IOHelper io( Consumer<IOHelper> operation ) {
		operation.accept( this );
		return this;
	}

	/**
	 * Makes a specific operation quit instruction aware.
	 *
	 * @param operation the operation.
	 */
	public IOHelper quitAware( Consumer<IOHelper> operation ) {
		try {
			return io( operation );
		} catch ( QuitException ignored ) {
			bracketln( RED, "QUIT", "Good bye." );
			System.exit( 0 );
			return this;
		}
	}

	IOHelper cancelling( String what ) {
		return bracketln( PURPLE, "CANCELLING", what ).newline();
	}

	private boolean isCancelable() {
		IOHelper curr = this;
		while ( curr != null ) {
			if ( curr.cancelable ) return true;
			curr = curr.parent;
		}
		return false;
	}

	private <T> T doWhile( Supplier<Optional<T>> action, Runnable onFail ) {
		Optional<T> retr;
		while( !(retr = action.get() ).isPresent() ) onFail.run();
		return retr.get();
	}

	private boolean readMore() {
		return read( "More?", reader(
			str -> str.startsWith( "y" ) || str.startsWith( "n" ),
			str -> str.startsWith( "y" ) ) );
	}

	private IOHelper bracketln( PrintColorWriter writer, PrintColor color, Object inside, Object msg ) {
		bracket( writer, color, inside, msg );
		writer.println();
		return this;
	}

	private IOHelper bracket( PrintColorWriter writer, PrintColor color, Object inside, Object msg ) {
		writer.print( '[' );
		writer.print( color, inside.toString() );
		writer.print( "] " );
		writer.print( msg );
		writer.flush();
		return this;
	}
}