package sechalmersmdsdgroup5.hotel.ordering.impl;

import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.facilities.Key;
import sechalmersmdsdgroup5.hotel.identities.Identity;
import sechalmersmdsdgroup5.hotel.ordering.ICheckInCheckOut;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.personnel.Employee;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServicesFactory;

import java.util.Date;

/**
 * Created by kalior on 18/12/15.
 */
public class CheckInCheckOut implements ICheckInCheckOut {

    public CheckInCheckOut() {}

    @Override
    public boolean checkIn(Guest guest, RoomBooking booking) {
        if (booking.getGuests().contains(guest) && (new Date()).getTime() >= booking.getStartDate().getTime())
        {
            booking.setCheckinTime(new Date());
            return true;
        }
        return false;
    }

    @Override
    public boolean checkOut(Guest guest, RoomBooking booking) {
        if (booking.getGuests().contains(guest)) {
            if ((new Date()).getTime() >= booking.getEndDate().getTime()) {
                // The price 100.0 is just an arbitrary number, should perhaps exist in some config at a later date.
                Service overextendService = ServicesFactory.INSTANCE.createService(100.0, booking);
                booking.getServices().add(overextendService);
            }
            booking.setCheckoutTime(new Date());
            return true;
         }

        return false;
    }

    @Override
    public boolean giveOutKey(Identity identity, Key key) {
        if(identity != null && key != null){
            if(identity instanceof Guest){
                ((Guest) identity).setKey(key);
            }else if(identity instanceof Employee){
                ((Employee) identity).setKey(key);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean takeBackKey(Key key) {
        return false;
    }
}
