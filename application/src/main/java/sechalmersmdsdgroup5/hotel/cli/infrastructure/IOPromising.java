package sechalmersmdsdgroup5.hotel.cli.infrastructure;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Function;

import static java.util.concurrent.CompletableFuture.completedFuture;

/**
 * Provides an interface for IOHelper that returns promises instead.
 */
public class IOPromising {
	private final IOHelper io;

	public IOPromising( IOHelper io ) {
		this.io = io;
	}

	/**
	 * Reads a line from InputStream specified.
	 *
	 * @param label The label to present to user.
	 * @return the line read.
	 */
	public CompletableFuture<String> read( String label ) {
		return completedFuture( io.read( label ) );
	}

	/**
	 * Reads a line and feeds into a Reader that optionally results in T.
	 *
	 * @param label The label to present to user.
	 * @param reader the reader.
	 * @param <T> the type of the reader.
	 * @return the read object.
	 */
	public <T> CompletableFuture<Optional<T>> readOpt( String label, Read<T> reader ) {
		return completedFuture( io.readOpt( label, reader ) );
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
	public <T> CompletableFuture<T> read( String label, Read<T> reader ) {
		return completedFuture( io.read( label, reader ) );
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
	public <T> CompletableFuture<List<T>> readMany( int min, String label, Read<T> reader ) {
		return completedFuture( io.readMany( min, label, reader ) );
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
	public <I, O> CompletableFuture<Optional<O>> executeOpt( I input, Command<I, O> cmd ) {
		return completedFuture( io.executeOpt( input, cmd ) );
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
	public <I, O> CompletableFuture<O> execute( I input, Command<I, O> cmd ) {
		return completedFuture( io.execute( input, cmd ) );
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
	public <I, O> CompletableFuture<List<O>> executeMany( int min, I input, Command<I, O> cmd ) {
		return completedFuture( io.executeMany( min, input, cmd ) );
	}

	/**
	 * Produces a value, consumes it and then returns the produced value.
	 *
	 * @param producer the produces.
	 * @param consumer the consumer.
	 * @param <T> the type of the value produced.
	 * @return the produced value.
	 */
	public <T> CompletableFuture<T> io( Function<IOHelper, T> producer, BiConsumer<IOHelper, T> consumer ) {
		return completedFuture( io.io( producer, consumer ) );
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
	public <T> CompletableFuture<T> io( T elem, BiConsumer<IOHelper, T> operation ) {
		return completedFuture( io.io( elem, operation ) );
	}
}