package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.facilities.IFacilities;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomAttribute;
import sechalmersmdsdgroup5.hotel.facilities.impl.Facilities;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;
import sechalmersmdsdgroup5.hotel.services.ServicesFactory;

import java.util.ArrayList;
import java.util.List;

import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readInteger;
import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.*;

public class AddRoom implements IdentifiableCommand<Hotel, Room> {
    @Override
    public Room apply( IOHelper io, Hotel hotel ) {
        io.info( "Input room details:" ).newline();

        IFacilities facade = new Facilities();

        int nr = io.read("RoomNr?", "RoomNr already exists", intNotFound( hotel.getRooms(), Room::getNr ) );
        int floor = readInteger( "Floor?", io );
        int basePrice = readInteger( "Base price?", io );
        boolean usable = io.read( "Usable (yes/no)?", "Type yes or no.", yesNo() );

        List<RoomAttribute> attrs = new ArrayList<>();
        while ( io.read( "Add attribute (yes/no)?", "Type yes or no.", yesNo() ) ) {
            String name = io.read( "Attribute name?" );

            if ( attrs.stream().anyMatch( attr -> attr.getName().equals( name ) ) ) {
                io.warn( "Attribute already exists." ).newline();
                continue;
            }

            RoomAttribute attr = facade.createRoomAttribute(
                name,
                io.read( "Attribute value?" ),
                io.read( "Attribute price?", doubleR() ) );

            attrs.add( attr );
        }

        ServicesFactory serviceFactory = ServicesFactory.INSTANCE;
        List<ServiceBlueprint> blueprints = new ArrayList<>();
        while ( io.read( "Add blueprint (yes/no)?", "Type yes or no.", yesNo() ) ) {
            ServiceBlueprint sb = serviceFactory.createServiceBlueprint();

            if ( io.read( "Does blueprint exist (yes/no)?", "Type yes or no.", yesNo() ) ) {
                sb = io.read( "service id?", "non-existent blueprint id.",
                        intId( hotel.getServiceBlueprints(), ServiceBlueprint::getId ) );
            } else {
                sb.setId( io.read( "service id?", "id already exists",
                    intNotFound( hotel.getServiceBlueprints(), ServiceBlueprint::getId ) ) );
                sb.setName( io.read( "service name?" ) );
                sb.setBasePrice( io.read( "service price?", "invalid price.", doubleR() ) );
                hotel.getServiceBlueprints().add( sb );
            }

            blueprints.add( sb );
        }

        Room room = facade.createRoom( nr, floor, usable, basePrice, new ArrayList<>(), attrs, blueprints );
        hotel.getRooms().add( room );
        io.info( "The room was created with:" ).newline().paragraph( room );

        return room;
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
