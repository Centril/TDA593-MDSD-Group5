package sechalmersmdsdgroup5.hotel.facilities.impl;

import sechalmersmdsdgroup5.hotel.facilities.*;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.List;

/**
 * Created by Kerp on 18/12/15.
 */
public class Facilities implements IFacilities {

    @Override
    public Key createKey(int id, List<Door> unlocks) {
        return new KeyImpl(id, unlocks);
    }

    @Override
    public Room createRoom(int nr, int floor, boolean usable, double basePrice, List<PrototypeOrdering> prototypeOrdering,
                           List<RoomAttribute> roomAttributes, List<ServiceBlueprint> serviceBlueprints) {

        return new RoomImpl(nr, floor, usable, basePrice, roomAttributes, prototypeOrdering, serviceBlueprints);
    }

    @Override
    public RoomPrototype createRoomPrototype(String name, double basePrice, List<RoomAttribute> roomAttributes) {
        return new RoomPrototypeImpl(name, basePrice, roomAttributes);
    }

    @Override
    public RoomAttribute createRoomAttribute(String name, Object value, double price) {
        return new RoomAttributeImpl(name, value, price);
    }

    @Override
    public Door createDoor(int id, List<Area> areas) {
        return new DoorImpl(id, areas);
    }

    @Override
    public EmployeeArea createEmployeeArea(int id, int floor) {
        return new EmployeeAreaImpl(id, floor);
    }
}
