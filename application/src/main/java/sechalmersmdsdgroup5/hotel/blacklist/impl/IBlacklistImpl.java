package sechalmersmdsdgroup5.hotel.blacklist.impl;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.blacklist.BlacklistItem;
import sechalmersmdsdgroup5.hotel.blacklist.IBlacklist;
import sechalmersmdsdgroup5.hotel.identities.Identity;

import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Kerp on 31/12/15.
 */
public class IBlacklistImpl implements IBlacklist {

    private Hotel hotel;

    public IBlacklistImpl(Hotel hotel) {
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
        hotel.getBlacklist().getItems().removeIf((item) -> item.getIdentity().getIdNumber().equals(identity.getIdNumber()));
    }

    @Override
    public String getBlacklistReason(Identity identity) {
        Optional<BlacklistItem> blacklistItem = hotel.getBlacklist().getItems().stream()
                .filter((item) -> item.getIdentity().getIdNumber().equals(identity.getIdNumber()))
                .findFirst();

        return blacklistItem.isPresent() ? blacklistItem.get().getReason() : null;
    }
}
