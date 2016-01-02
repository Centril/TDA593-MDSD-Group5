package sechalmersmdsdgroup5.hotel.ordering.impl;

import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl;
import sechalmersmdsdgroup5.hotel.facilities.impl.RoomImpl;
import sechalmersmdsdgroup5.hotel.ordering.*;

import java.util.Date;
import java.util.List;

/**
 * Created by neon on 2015-12-29.
 */
public class OrderingFacade implements IOrder {
    @Override
    public RoomBooking createBooking(PreBooking preBooking, List<Guest> guests) {
        if(preBooking == null || guests == null) {
            throw new IllegalArgumentException("null argument in createBooking.");
        }

        RoomBooking newRoomBooking;
        newRoomBooking = new RoomBookingImpl();
        newRoomBooking.setBookedRoom(preBooking.getWillBook());
        newRoomBooking.setStartDate(preBooking.getStartDate());
        newRoomBooking.setEndDate(preBooking.getEndDate());
        newRoomBooking.setIsPaid(false); // you cant pay before this

        List<Guest> currentGuests = newRoomBooking.getGuests();
        checkAmountOfGuestsOK(currentGuests,preBooking);
        for(Guest g:guests) {
            currentGuests.add(g);
        }

        return newRoomBooking;
    }
    private void checkAmountOfGuestsOK(List<Guest> guests, PreBooking preBooking) {
        Room roomToBook = preBooking.getWillBook();
        if(guests.size() > (Integer) roomToBook.getAttribute(RoomAttributeImpl.AMOUNT_OF_BEDS).getValue()) {
            throw new IllegalArgumentException("createBooking: There is no room for the guests in the room");
        }
    }

    @Override
    public Order createOrder(PreOrder preOrder, Customer customer) {
        return null;
    }

    @Override
    public boolean sendConfirmationMail(Order order, String email) {
        return false;
    }

    @Override
    public Guest createGuest(String name, String ssn, int age) {
        return null;
    }

    @Override
    public void addGuestToBooking(Guest guest, RoomBooking booking) {

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
