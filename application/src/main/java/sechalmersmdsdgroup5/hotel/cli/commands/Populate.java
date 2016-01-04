package sechalmersmdsdgroup5.hotel.cli.commands;


import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.facilities.IFacilities;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomAttribute;
import sechalmersmdsdgroup5.hotel.facilities.RoomPrototype;
import sechalmersmdsdgroup5.hotel.facilities.impl.Facilities;

import java.util.ArrayList;
import java.util.List;

public class Populate implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel) {
        hotel.getRoomPrototypes().addAll(generateRoomPrototypes());
        hotel.getRooms().addAll(generateRooms());

        
    }

    @Override
    public String getIdentifier() {
        return "populate";
    }

    @Override
    public String help() {
        return "Populate the system with dummy data";
    }

    private List<RoomPrototype> generateRoomPrototypes() {
        IFacilities fac = new Facilities();
        List<RoomPrototype> list = new ArrayList<>();
        List<RoomAttribute> attr1 = new ArrayList<>();
        List<RoomAttribute> attr2 = new ArrayList<>();

        List<RoomAttribute> attr3 = new ArrayList<>();

        RoomAttribute twoBeds = fac.createRoomAttribute("Two beds", 2, 100);
        RoomAttribute threeBeds = fac.createRoomAttribute("Three beds", 3, 150);
        RoomAttribute seaView = fac.createRoomAttribute("Sea view", 1, 2);
        RoomAttribute plant = fac.createRoomAttribute("Plant", 1, 320);

        attr1.add(twoBeds);
        attr1.add(seaView);
        attr1.add(plant);

        attr2.add(twoBeds);

        attr3.add(threeBeds);
        attr3.add(seaView);

        list.add(fac.createRoomPrototype("Suite", 2000, attr1));
        list.add(fac.createRoomPrototype("Standard", 500, attr2));
        list.add(fac.createRoomPrototype("Standard Deluxe", 750, attr3));

        return list;
    }

    private List<Room> generateRooms() {
        IFacilities fac = new Facilities();

        List<RoomPrototype> roomPrototypes = generateRoomPrototypes();
        List<Room> rooms = new ArrayList<>();

        rooms.add(fac.createRoom(101, 1, true, 500, null, roomPrototypes.get(1).getStates(), null));
        rooms.add(fac.createRoom(102, 1, true, 500, null, roomPrototypes.get(1).getStates(), null));
        rooms.add(fac.createRoom(103, 1, true, 500, null, roomPrototypes.get(1).getStates(), null));
        rooms.add(fac.createRoom(201, 2, true, 1000, null, roomPrototypes.get(2).getStates(), null));
        rooms.add(fac.createRoom(202, 2, true, 1000, null, roomPrototypes.get(2).getStates(), null));
        rooms.add(fac.createRoom(203, 2, true, 1000, null, roomPrototypes.get(2).getStates(), null));
        rooms.add(fac.createRoom(301, 3, true, 2000, null, roomPrototypes.get(3).getStates(), null));

        return rooms;
    }

}
