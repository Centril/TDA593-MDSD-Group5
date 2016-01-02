package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import sechalmersmdsdgroup5.hotel.utils.Holder;
import sechalmersmdsdgroup5.hotel.utils.ListMonad;
import sechalmersmdsdgroup5.hotel.utils.Maybe;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Provides an interface for IOHelper that returns monads instead.
 */
public class IOMonadic {
	private final IOHelper io;

	public IOMonadic( IOHelper io ) {
		this.io = io;
	}

	/**
	 * Reads a line from InputStream specified.
	 *
	 * @param label The label to present to user.
	 * @return the line read.
	 */
	public Holder<String> read( String label ) {
		return new Holder<>( io.read( label ) );
	}

	/**
	 * Reads a line and feeds into a Reader that optionally results in T.
	 *
	 * @param label The label to present to user.
	 * @param reader the reader.
	 * @param <T> the type of the reader.
	 * @return the read object.
	 */
	public <T> Maybe<T> readMaybe( String label, Read<T> reader ) {
		return new Maybe<>( io.readOpt( label, reader ) );
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
	public <T> Holder<T> read( String label, Read<T> reader ) {
		return new Holder<>( io.read( label, reader ) );
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
	public <T> ListMonad<T> readMany( int min, String label, Read<T> reader ) {
		return new ListMonad<>( io.readMany( min, label, reader ) );
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
	public <I, O> Maybe<O> executeOpt( I input, Command<I, O> cmd ) {
		return new Maybe<>( io.executeOpt( input, cmd ) );
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
	public <I, O> Holder<O> execute( I input, Command<I, O> cmd ) {
		return new Holder<>( io.execute( input, cmd ) );
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
	public <I, O> ListMonad<O> executeMany( int min, I input, Command<I, O> cmd ) {
		return new ListMonad<>( io.executeMany( min, input, cmd ) );
	}

	/**
	 * Produces a value, consumes it and then returns the produced value.
	 *
	 * @param producer the produces.
	 * @param consumer the consumer.
	 * @param <T> the type of the value produced.
	 * @return the produced value.
	 */
	public <T> Holder<T> io( Function<IOHelper, T> producer, BiConsumer<IOHelper, T> consumer ) {
		return new Holder<>( io.io( producer, consumer ) );
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
	public <T> Holder<T> io( T elem, BiConsumer<IOHelper, T> operation ) {
		return new Holder<>( io.io( elem, operation ) );
	}
}