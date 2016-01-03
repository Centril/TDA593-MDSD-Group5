package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.impl.FacilitiesFactoryImpl;

import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readInteger;
import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readDate;
import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readBool;

public class AddRoom implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel) {
        Room room = FacilitiesFactoryImpl.eINSTANCE.createRoom();
        io.cancelable().
                info( "Input room details:" ).newline()
                .io( () ->
                        room.setNr(
                            io.read("RoomNr: ", StandardReaders.intNotFound(hotel.getRooms(), (r -> r.getNr())))
                        )
                )
                .io( () -> room.setFloor( readInteger("Floor: ",  io) ) )
                .io( () -> room.setBasePrice( readInteger("BasePrice", io) ) )
                .io( () -> room.setLastCleaned( readDate("LastCleaned", io) ) )
                .io( () -> room.setUsable( readBool("Usable?: ", io) ) );
        hotel.getRooms().add(room);
    }

    @Override
    public String getIdentifier() {
        return "add-room";
    }

    @Override
    public String help() {
        return "adds a new room to the hotel";
    }
}
