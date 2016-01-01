package sechalmersmdsdgroup5.hotel.blacklist.impl;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.blacklist.IBlacklist;
import sechalmersmdsdgroup5.hotel.identities.Identity;

/**
 * Created by Kerp on 31/12/15.
 */
public class Blacklist implements IBlacklist {

    private Hotel hotel;

    public Blacklist(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void addToBlackList(Identity identity) {
        hotel.getBlacklist().add(identity);
    }

    @Override
    public void removeFromBlackList(Identity identity) {
        hotel.getBlacklist().remove(identity);
    }
}
