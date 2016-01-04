package sechalmersmdsdgroup5.hotel.search.impl;

import com.sun.org.apache.xpath.internal.operations.Or;
import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.ordering.*;
import sechalmersmdsdgroup5.hotel.search.ISearch;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;
import sechalmersmdsdgroup5.hotel.search.SearchResult;
import sechalmersmdsdgroup5.hotel.search.logic.SearchQueryBuilder;
import sechalmersmdsdgroup5.hotel.search.logic.Searcher;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static sechalmersmdsdgroup5.hotel.search.logic.SearchCriteriaFactory.matches;
import static sechalmersmdsdgroup5.hotel.search.logic.SearchCriteriaFactory.query;
import static sechalmersmdsdgroup5.hotel.utils.Dates.*;
import static sechalmersmdsdgroup5.hotel.utils.Functional.concatMap;
import static sechalmersmdsdgroup5.hotel.utils.Functional.listify;

public class Search implements ISearch {
	private final Hotel hotel;

	public Search( Hotel hotel ) {
		this.hotel = hotel;
	}

    @Override
    public List<Order> searchActiveOrders(String clientName) {
        List<Order> allOrders = new ArrayList<>(hotel.getOrders());
        List<Order> clientOrders = null;
        for (Order order : allOrders ) {
            String acquiredName = order.getCustomer().getIdentity().getName();
            if ( null != acquiredName && acquiredName.equals(clientName) ) {
                clientOrders.add(order);
            }
        }
        return clientOrders;
    }

	@Override
	public List<SearchResult<PreBooking>> searchAvailableBookings( Date from, Date to, SearchQuery<PreBooking> query ) {
		// Swap if to <= from:
		if ( leq( to, from ) ) {
			Date tmp = from;
			from = to;
			to = tmp;
		}

		final Date ffrom = from;
		final Date fto = to;

		// Get all available rooms in interval:
		List<Room> rooms = searchAvailableRooms( from, to );

		OrderingFactory factory = OrderingFactory.INSTANCE;

		return new Searcher<PreBooking>().searchInit(
			listify( rooms.stream().map( room -> {
				PreBooking pb = factory.createPreBooking();
				pb.setWillBook( room );
				pb.setStartDate( ffrom );
				pb.setEndDate( fto );
				return pb;
			} ) ),
			query );

		/*
		// Compute permutations of periods in [from, to]:
		LocalDate ldFrom = localDate( from );
		LocalDate ldTo = localDate( to );
		Stream.Builder<Pair<Date, Date>> periodBuilder = Stream.builder();
		for ( LocalDate f = ldFrom; f.isBefore( ldTo ); f = f.plusDays( 1 ) ) {
			for ( LocalDate t = f; t.isBefore( ldTo ); t = t.plusDays( 1 ) ) {
				periodBuilder.accept( Pair.create( toDate( f ), toDate( t ) ) );
			}
		}
		Stream<Pair<Date, Date>> periods = periodBuilder.build();

		// Compute stream of PreBooking with periods X rooms:
		Stream<PreBooking> pbs = concatMap( rooms.stream(),
			room -> listify( periods.map( period -> {
				PreBooking pb = factory.createPreBooking();
				pb.setWillBook( room );
				pb.setStartDate( period.fst() );
				pb.setEndDate( period.snd() );
				return pb;
			} ) ) );
		*/
	}

	@Override
	public List<Room> searchAvailableRooms( Date from, Date to ) {
		List<Room> rooms = new ArrayList<>( hotel.getRooms() );
		rooms.removeAll( searchOccupiedRooms( from, to ) );
		return rooms;
	}

	@Override
	public List<Room> searchOccupiedRooms( Date from, Date to ) {
		return listify( searchActiveBookings( from, to ).stream().map( RoomBooking::getBookedRoom ).distinct() );
	}

	@Override
	public List<RoomBooking> searchActiveBookings( Date from, Date to ) {
		return new Searcher<RoomBooking>().searchInitFlatten( allBookings(),
			query( matches( booking ->
				booking.getCheckinTime() != null &&
				(booking.getCheckoutTime() == null || geq( booking.getCheckoutTime(), from )) &&
				conflictsInterval( booking, from, to )
			) ) );
	}

	private boolean conflictsInterval( RoomBooking booking, Date from, Date to ) {
		return	(leq( booking.getStartDate(), from ) && geq( booking.getEndDate(), to )) ||
				within( booking.getStartDate(), from, to ) ||
				within( booking.getEndDate(), from, to );
	}

	@Override
	public List<Service> searchUsedServices( RoomBooking booking ) {
		return booking.getServices();
	}

	@Override
	public List<Service> searchUsedServices( Order order ) {
		return concatMap( order.getBookings(), RoomBooking::getServices );
	}

	@Override
	public List<ServiceBlueprint> searchServicesFor( Room room ) {
		return room.getServicesAfforded();
	}

	@Override
	public List<SearchResult<RoomBooking>> searchBookingsNotCheckedIn( SearchQuery<RoomBooking> query ) {
		// Restriction: Limit to bookings with start/end date in future & not checked in:
		Date now = new Date();
		SearchCriteria<RoomBooking> restriction = matches( booking -> booking.getCheckinTime() == null &&
			leq( now, booking.getStartDate() ) || leq( now, booking.getEndDate() ) );

		return new Searcher<RoomBooking>().searchInit( allBookings(),
				SearchQueryBuilder.<RoomBooking>builder().wrap( restriction )
					.and().each( query.getCriterias(), SearchQueryBuilder::or ).query() );
	}

	@Override
	public List<SearchResult<Key>> searchKey( SearchQuery<Key> query ) {
		return new Searcher<Key>().searchInit( hotel.getKeys(), query );
	}

	private List<RoomBooking> allBookings() {
		return concatMap( hotel.getOrders(), Order::getBookings );
	}
}