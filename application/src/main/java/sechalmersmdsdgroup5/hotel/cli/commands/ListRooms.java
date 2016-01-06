package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesFactoryImpl;

public class ListRooms implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel) {
        Room room = FacilitiesFactoryImpl.eINSTANCE.createRoom();
        io.info( "All rooms:" ).newline()
                .io( () ->
                    hotel.getRooms().forEach( io::paragraph )
                );
    }

    @Override
    public String getIdentifier() {
        return "list-rooms";
    }

    @Override
    public String help() {
        return "lists all rooms in the hotel";
    }
}
