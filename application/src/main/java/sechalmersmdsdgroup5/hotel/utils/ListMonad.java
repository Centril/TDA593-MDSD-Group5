package sechalmersmdsdgroup5.hotel.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static sechalmersmdsdgroup5.hotel.utils.Functional.concatMap;

/**
 * ListMonad, a monadic view of lists.
 */
public class ListMonad<A> implements Monad<A>, List<A> {
	private final List<A> list;

	public ListMonad( List<A> list ) {
		this.list = list;
	}

	@Override
	public <B> Monad<B> pure( B val ) {
		return new ListMonad<>( asList( val ) );
	}

	@Override
	public <B> Monad<B> bind( Function<A, Monad<B>> fn ) {
		return new ListMonad<>( concatMap( list, a -> (ListMonad<B>) fn.apply( a ) ) );
	}

	@Override
	public <B> ListMonad<B> compose( Monad<B> mb ) {
		return (ListMonad<B>) Monad.super.compose( mb );
	}

	@Override
	public <B> ListMonad<A> composeInv( Monad<B> mb ) {
		return (ListMonad<A>) Monad.super.composeInv( mb );
	}

	@Override
	public <B> ListMonad<B> fmap( Function<A, B> mapper ) {
		return (ListMonad<B>) Monad.super.fmap( mapper );
	}

	@Override
	public <B> ListMonad<B> ap( Monad<Function<A, B>> m ) {
		return (ListMonad<B>) Monad.super.ap( m );
	}

	@Override
	public Stream<A> stream() {
		return list.stream();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean contains( Object o ) {
		return list.contains( o );
	}

	@Override
	public Iterator<A> iterator() {
		return list.iterator();
	}

	@Override
	public Object[] toArray() {
		return list.toArray();
	}

	@Override
	public <T> T[] toArray( T[] a ) {
		return list.toArray( a );
	}

	@Override
	public boolean add( A a ) {
		return list.add( a );
	}

	@Override
	public boolean remove( Object o ) {
		return list.remove( o );
	}

	@Override
	public boolean containsAll( Collection<?> c ) {
		return list.containsAll( c );
	}

	@Override
	public boolean addAll( Collection<? extends A> c ) {
		return list.addAll( c );
	}

	@Override
	public boolean addAll( int index, Collection<? extends A> c ) {
		return list.addAll( c );
	}

	@Override
	public boolean removeAll( Collection<?> c ) {
		return list.removeAll( c );
	}

	@Override
	public boolean retainAll( Collection<?> c ) {
		return list.retainAll( c );
	}

	@Override
	public void clear() {
		list.clear();
	}

	@Override
	public A get( int index ) {
		return list.get( index );
	}

	@Override
	public A set( int index, A element ) {
		return list.set( index, element );
	}

	@Override
	public void add( int index, A element ) {
		list.add( index, element );
	}

	@Override
	public A remove( int index ) {
		return list.remove( index );
	}

	@Override
	public int indexOf( Object o ) {
		return list.indexOf( o );
	}

	@Override
	public int lastIndexOf( Object o ) {
		return list.lastIndexOf( o );
	}

	@Override
	public ListIterator<A> listIterator() {
		return list.listIterator();
	}

	@Override
	public ListIterator<A> listIterator( int index ) {
		return list.listIterator( index );
	}

	@Override
	public List<A> subList( int fromIndex, int toIndex ) {
		return list.subList( fromIndex, toIndex );
	}
}
