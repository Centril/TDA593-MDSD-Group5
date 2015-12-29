package sechalmersmdsdgroup5.hotel.search.impl;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.PreOrder;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
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
import static sechalmersmdsdgroup5.hotel.utils.Dates.leq;
import static sechalmersmdsdgroup5.hotel.utils.Dates.within;
import static sechalmersmdsdgroup5.hotel.utils.Functional.*;

public class Search implements ISearch {
	private final Hotel hotel;

	public Search( Hotel hotel ) {
		this.hotel = hotel;
	}

	@Override
	public List<SearchResult<PreOrder>> searchAvailableOrders( SearchQuery<PreOrder> query ) {
		return null;
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
				within( booking.getCheckoutTime(), from, to ) && (
				within( booking.getStartDate(), from, to ) || within( booking.getEndDate(), from, to ) ) ) ) );
	}

	@Override
	public List<Service> searchUsedServices( RoomBooking booking ) {
		return null;
	}

	@Override
	public List<Service> searchUsedServices( Order order ) {
		return null;
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