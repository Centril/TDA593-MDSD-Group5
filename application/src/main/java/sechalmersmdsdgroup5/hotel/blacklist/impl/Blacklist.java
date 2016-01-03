package sechalmersmdsdgroup5.hotel.blacklist.impl;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem;
import sechalmersmdsdgroup5.hotel.blacklist.IBlacklist;
import sechalmersmdsdgroup5.hotel.identities.Identity;

import java.util.Date;

/**
 * Created by Kerp on 31/12/15.
 */
public class Blacklist implements IBlacklist {

    private Hotel hotel;

    public Blacklist(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void addToBlackList(Identity identity, String reason) {
        BlacklistItem blacklistItem = new BlacklistItemImpl();
        blacklistItem.setDate(new Date());
        blacklistItem.setIdentity(identity);
        blacklistItem.setReason(reason);

        hotel.getBlacklist().getItems().add(blacklistItem);
    }

    @Override
    public void removeFromBlackList(Identity identity) {
        hotel.getBlacklist().getItems().removeIf((item) -> item.getIdentity().getIdNumber() == identity.getIdNumber());
    }
}
