package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.blacklist.IBlacklist;
import sechalmersmdsdgroup5.hotel.blacklist.impl.IBlacklistImpl;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientsFactoryImpl;
import sechalmersmdsdgroup5.hotel.identities.Identity;

public class IsBlacklisted implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel) {
        final Identity identity = ClientsFactoryImpl.eINSTANCE.createGuest();
        io.cancelable().
                info( "Blacklist check:" ).newline()
                .io( () ->
                        identity.setIdNumber(io.read("Input SSN")));

        IBlacklist blacklistFacade = new IBlacklistImpl(hotel);
        String reason = blacklistFacade.getBlacklistReason(identity);
        if(reason == null) {
            io.info("That person is not blacklisted");
        } else {
            io.info("Person is blacklisted, reason: " + reason);
        }
    }

    @Override
    public String getIdentifier() {
        return "is-blacklisted";
    }

    @Override
    public String help() {
        return "Given an SSN number displays whether that person is blacklisted or not " +
                "and the reason for the blacklisting if one was given";
    }
}
