package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;

/**
 * Created by kalior on 04/01/16.
 */
public class CheckOut implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper ioHelper, Hotel hotel) {
        
    }

    @Override
    public String getIdentifier() {
        return "check-out-room";
    }

    @Override
    public String help() {
        return null;
    }
}
