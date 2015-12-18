package sechalmersmdsdgroup5.hotel.ordering.impl;

import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.identities.Identity;
import sechalmersmdsdgroup5.hotel.ordering.ICheckInCheckOut;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;

/**
 * Created by kalior on 18/12/15.
 */
public class CheckInCheckOut implements ICheckInCheckOut {
    @Override
    public boolean checkIn(Guest guest, RoomBooking booking) {
        return false;
    }

    @Override
    public boolean checkOut(Guest guest, RoomBooking booking) {
        return false;
    }

    @Override
    public boolean giveOutKey(Identity identity, Key key) {
        return false;
    }

    @Override
    public boolean takeBackKey(Key key) {
        return false;
    }
}
