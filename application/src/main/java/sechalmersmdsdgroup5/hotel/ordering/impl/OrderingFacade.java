package sechalmersmdsdgroup5.hotel.ordering.impl;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.HotelFactory;
import sechalmersmdsdgroup5.hotel.clients.ClientsFactory;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.clients.impl.GuestImpl;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomAttribute;
import sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl;
import sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl;
import sechalmersmdsdgroup5.hotel.ordering.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import static sechalmersmdsdgroup5.hotel.utils.Functional.concatMap;

/**
 * Created by neon on 2015-12-29.
 */
public class OrderingFacade implements IOrder {
    private final Hotel hotel;
    public OrderingFacade(Hotel hotel) {
        this.hotel = hotel;
    }
    @Override
    public RoomBooking createBooking(PreBooking preBooking, List<Guest> guests) {
        if(preBooking == null || guests == null) {
            throw new IllegalArgumentException("null argument in createBooking.");
        }

        RoomBooking newRoomBooking;
        newRoomBooking = new RoomBookingImpl();

        int newId = calculateNewBookingID();
        newRoomBooking.setId(newId);
        newRoomBooking.setBookedRoom(preBooking.getWillBook());
        newRoomBooking.setStartDate(preBooking.getStartDate());
        newRoomBooking.setEndDate(preBooking.getEndDate());
        newRoomBooking.setIsPaid(false); // you cant pay before this

        addGuestsToBooking(newRoomBooking,preBooking,guests);

        return newRoomBooking;
    }

    private void addGuestsToBooking(RoomBooking newRoomBooking,PreBooking preBooking, List<Guest> guests) {
        List<Guest> currentGuests = newRoomBooking.getGuests();
        checkAmountOfGuestsOK(currentGuests,preBooking);
        for(Guest g:guests) {
            currentGuests.add(g);
        }
    }

    private int calculateNewBookingID() {
        List<RoomBooking> rbs = concatMap(hotel.getOrders(),Order::getBookings);
        return rbs.stream().mapToInt(RoomBooking::getId).max().orElse(0);
    }

    private void checkAmountOfGuestsOK(List<Guest> guests, PreBooking preBooking) {
        Room roomToBook = preBooking.getWillBook();
        if(guests.size() > (Integer) roomToBook.getAttribute(RoomAttributeImpl.AMOUNT_OF_BEDS).getValue()) {
            throw new IllegalArgumentException("createBooking: There is no room for the guests in the room");
        }
    }

    @Override
    public Order createOrder(List<RoomBooking> bookings, Customer customer) {
        if(bookings == null || customer == null) {
            throw new IllegalArgumentException("null argument in createOrder");
        }

        Order newOrder = new OrderImpl();
        int nextId = calculateNewOrderID();
        newOrder.setId(nextId);

        newOrder.getBookings().addAll( bookings );

        newOrder.setCustomer( customer );

        hotel.getOrders().add(newOrder);
        return newOrder;
    }

    private void addBookingsToOrder(PreOrder preOrder, Order newOrder) {
        List<RoomBooking> currentBookings = newOrder.getBookings();
        for(PreBooking preBooking:preOrder.getBookings()) {
            currentBookings.add(createBooking(preBooking,new ArrayList<Guest>()));
        }
    }

    private int calculateNewOrderID() {
        return hotel.getOrders().stream().mapToInt( Order::getId ).max().orElse(0);
    }


    //will not be implemented further.
    @Override
    public boolean sendConfirmationMail(Order order, String email) {
        if(email != null && order != null){
            return true;
        }
        return false;
    }

    @Override
    public Guest createGuest(String name, String ssn, int age) {
        if(name == null || ssn == null || age < 0) {
            throw new IllegalArgumentException("Illegal age or null argument in createGuest");
        }
        ClientsFactory factory = ClientsFactory.INSTANCE;
        Guest newGuest = factory.createGuest();
        newGuest.setName(name);
        newGuest.setAge(age);
        newGuest.setIdNumber(ssn);

        return newGuest;
    }

    @Override
    public void addGuestToBooking(Guest guest, RoomBooking booking) {
        RoomAttribute a = booking.getBookedRoom().getAttribute(RoomAttributeImpl.AMOUNT_OF_BEDS);
        int nbrOfGuests = booking.getGuests().size();

        Integer nbrOfBeds;
        try {
            Object val = a.getValue();
            nbrOfBeds = val instanceof Integer ? (int) val : Integer.parseInt( (String) val );
        } catch (NumberFormatException e) {
            throw new RuntimeException(RoomAttributeImpl.AMOUNT_OF_BEDS + " value is not an integer: " + a.getValue());
        }

        if (nbrOfGuests >= nbrOfBeds) {
            throw new IllegalArgumentException("No more space in room.");
        } else {
            booking.getGuests().add(guest);
        }
    }

    @Override
    public void addBookingToOrder(RoomBooking booking, Order order) {

    }

    @Override
    public void addCustomerToOrder(Customer customer, Order order) {

    }

    @Override
    public boolean isValidDate(Date from, Date to) {
        return false;
    }

}
