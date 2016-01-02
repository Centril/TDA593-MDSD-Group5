package sechalmersmdsdgroup5.hotel.utils;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;

/**
 * Maybe monad.
 */
public class Maybe<A> implements Monad<A> {
	private Optional<A> val;

	static <A> Maybe<A> nothing() {
		return new Maybe<>();
	}

	static <A> Maybe<A> just( A val ) {
		return new Maybe<>( val );
	}

	public Maybe() {
		this( empty() );
	}

	public Maybe( A val ) {
		this( ofNullable( val ) );
	}

	public Maybe( Optional<A> val ) {
		this.val = val;
	}

	@Override
	public <B> Monad<B> pure( B val ) {
		return new Maybe<>( val );
	}

	@Override
	public <B> Monad<B> bind( Function<A, Monad<B>> fn ) {
		return val.isPresent() ? fn.apply( val.get() ) : nothing();
	}

	@Override
	public <B> Maybe<B> compose( Monad<B> mb ) {
		return (Maybe<B>) Monad.super.compose( mb );
	}

	@Override
	public <B> Maybe<B> fmap( Function<A, B> mapper ) {
		return (Maybe<B>) Monad.super.fmap( mapper );
	}

	@Override
	public <B> Maybe<B> ap( Monad<Function<A, B>> m ) {
		return (Maybe<B>) Monad.super.ap( m );
	}

	@Override
	public Stream<A> stream() {
		return val.isPresent() ? Stream.of( val.get() ) : Stream.empty();
	}
}