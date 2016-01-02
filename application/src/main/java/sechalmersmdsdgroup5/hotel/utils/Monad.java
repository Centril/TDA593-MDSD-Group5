package sechalmersmdsdgroup5.hotel.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static sechalmersmdsdgroup5.hotel.utils.Functional.foldl;

/**
 * Monad.
 * See: http://hackage.haskell.org/package/base-4.8.1.0/docs/Prelude.html#t:Monad
 *
 * @param <A>
 */
public interface Monad<A> {
	/**
	 * Returns pure (return in haskell).
	 *
	 * @param val the value to wrap in monad.
	 * @param <B> the monadic value type.
	 * @return the monad.
	 */
	<B> Monad<B> pure( B val );

	/**
	 * Binds this monad with a function to a monad of another type.
	 * Same as (>>=) in haskell.
	 *
	 * @param fn the function to bind monad with.
	 * @param <B> the monadic value type of the new monad.
	 * @return the new monad with monadic value type B.
	 */
	<B> Monad<B> bind( Function<A, Monad<B>> fn );

	/**
	 * Returns a stream of the monadic value type.
	 *
	 * @return the stream.
	 */
	Stream<A> stream();

	/**
	 * Composes to monadic actions sequentially,
	 * returning the second one.
	 * Same as (>>) in haskell.
	 *
	 * @param mb the second monad.
	 * @param <B> the monadic value type of the second monad.
	 * @return the second monad.
	 */
	default <B> Monad<B> compose( Monad<B> mb ) {
		return bind( k -> mb );
	}

	/**
	 * fmap: the same as this >>= return . mapper.
	 *
	 * @param mapper the mapper.
	 * @param <B> the monadic value type of the resulting monad.
	 * @return the resulting monad.
	 */
	default <B> Monad<B> fmap( Function<A, B> mapper ) {
		return bind( mapper.andThen( this::pure ) );
	}

	/**
	 * Promotes function application.
	 *
	 * @param m the monad with function as monadic value type.
	 * @param <B> the resulting monadic value type.
	 * @return the resulting monad.
	 */
	default <B> Monad<B> ap( Monad<Function<A, B>> m ) {
		return m.bind( x -> this.bind( a -> m.pure( x.apply( a ) ) ) );
	}

	/**
	 * Sequences monadic actions. Uses the pure implementation of the first monad.
	 * If the list is empty this won't work.
	 *
	 * @param iter the monads to sequence.
	 * @param <A> the monadic value type.
	 * @return the sequenced monad.
	 */
	static <A> Monad<Collection<A>> sequence( Collection<Monad<A>> iter ) {
		return sequence( iter.iterator().next()::pure, iter );
	}

	/**
	 * Sequences monadic actions.
	 *
	 * @param pure a function that implements pure.
	 * @param iter the collection of monads.
	 * @param <M> te type of the monad bound to A.
	 * @param <A> the monadic value type.
	 * @return the monad with a collection of A as monadic value.
	 */
	static <M extends Monad<A>, A> Monad<Collection<A>> sequence(
			Function<Collection<A>, Monad<Collection<A>>> pure,
	        Collection<M> iter ) {
		return foldl( iter, pure.apply( new ArrayList<>() ), (mp, m) ->
			m.bind( (A x) -> mp.bind( (Collection<A> xs) -> {
				xs.add( x );
				return pure.apply( xs );
			} ) ) );
	}

	/**
	 * Removes one level of monadic structure.
	 *
	 * @param x the monad.
	 * @param <A> the monadic value of the inner structure and the resulting monad.
	 * @return the inner monad.
	 */
	static <A> Monad<A> join( Monad<Monad<A>> x ) {
		return x.bind( identity() );
	}
}