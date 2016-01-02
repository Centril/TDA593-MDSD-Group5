package sechalmersmdsdgroup5.hotel.utils;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Holder monad.
 */
public class Holder<A> implements Monad<A>, Supplier<A> {
	private final A val;

	public Holder( A val ) {
		this.val = val;
	}

	@Override
	public <B> Holder<B> pure( B val ) {
		return new Holder<>( val );
	}

	@Override
	public <B> Holder<B> bind( Function<A, Monad<B>> fn ) {
		return (Holder<B>) fn.apply( val );
	}

	@Override
	public <B> Holder<B> compose( Monad<B> mb ) {
		return (Holder<B>) Monad.super.compose( mb );
	}

	@Override
	public <B> Holder<A> composeInv( Monad<B> mb ) {
		return (Holder<A>) Monad.super.composeInv( mb );
	}

	@Override
	public <B> Holder<B> fmap( Function<A, B> mapper ) {
		return (Holder<B>) Monad.super.fmap( mapper );
	}

	@Override
	public <B> Holder<B> ap( Monad<Function<A, B>> m ) {
		return (Holder<B>) Monad.super.ap( m );
	}

	@Override
	public A get() {
		return val;
	}

	public Stream<A> stream() {
		return Stream.of( val );
	}
}