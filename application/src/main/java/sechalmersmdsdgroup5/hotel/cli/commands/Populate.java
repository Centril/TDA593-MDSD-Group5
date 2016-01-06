package sechalmersmdsdgroup5.hotel.cli.commands;


import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.clients.IClient;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientFacade;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientsFactoryImpl;
import sechalmersmdsdgroup5.hotel.facilities.*;
import sechalmersmdsdgroup5.hotel.facilities.impl.Facilities;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl;
import sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;
import sechalmersmdsdgroup5.hotel.services.ServicesFactory;

import java.util.ArrayList;
import java.util.Date;
import sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl;
import sechalmersmdsdgroup5.hotel.identities.RealPerson;
import sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesFactoryImpl;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.OrderingFactory;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.IService;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;
import sechalmersmdsdgroup5.hotel.services.ServicesFactory;
import sechalmersmdsdgroup5.hotel.services.impl.ServiceFacade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Populate implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel) {
        hotel.getRoomPrototypes().addAll(generateRoomPrototypes());
        hotel.getRooms().addAll(generateRooms());
        hotel.getGuests().addAll(generateGuests(hotel));
        hotel.getOrders().addAll(generateOrders());
        hotel.getServiceBlueprints().addAll(generateServiceBlueprints());

        // TODO create some active bookings
        // Alma har gjort service blueprints, order.
        
    }3

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

        RoomAttribute twoBeds = fac.createRoomAttribute(RoomAttributeImpl.AMOUNT_OF_BEDS, 2, 100);
        RoomAttribute threeBeds = fac.createRoomAttribute(RoomAttributeImpl.AMOUNT_OF_BEDS, 3, 150);
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


        List<PrototypeOrdering> asd = new ArrayList<>();
        asd.add(fac.createPrototypeOrdering(1, roomPrototypes.get(0)));
        asd.add(fac.createPrototypeOrdering(4, roomPrototypes.get(1)));

        rooms.add(fac.createRoom(101, 1, true, 500, null, roomPrototypes.get(0).getStates(), null));
        rooms.add(fac.createRoom(102, 1, true, 500, null, roomPrototypes.get(0).getStates(), null));
        rooms.add(fac.createRoom(103, 1, true, 500, null, roomPrototypes.get(0).getStates(), null));
        rooms.add(fac.createRoom(201, 2, true, 1000, null, roomPrototypes.get(1).getStates(), null));
        rooms.add(fac.createRoom(202, 2, true, 1000, null, roomPrototypes.get(1).getStates(), null));
        rooms.add(fac.createRoom(203, 2, true, 1000, null, roomPrototypes.get(1).getStates(), null));
        rooms.add(fac.createRoom(301, 3, true, 2000, null, roomPrototypes.get(2).getStates(), null));
        rooms.add(fac.createRoom(401, 4, true, 2200, asd, null, null));

        return rooms;
    }
    private List<Guest> generateGuests(Hotel hotel) {
        IClient facade = new ClientFacade();
        List<Guest> someGuests = new ArrayList<>();
        someGuests.add(facade.createGuest("Einstein","18790314-1337",134));
        someGuests.add(facade.createGuest("Hillbert","19860513-3321",73));
        someGuests.add(facade.createGuest("Erik N","19911211-5321",24));
        someGuests.add(facade.createGuest("Bill G","19560713-2121",56));
        someGuests.add(facade.createGuest("André S","19941914-2246",21));
        someGuests.add(facade.createGuest("Mazdak F","19901011-7631",25));
        someGuests.add(facade.createGuest("Mattias N","19930301-9999",22));
        someGuests.add(facade.createGuest("Ivar J","19940101-1212",22));
        someGuests.add(facade.createGuest("Joel G","19941127-0101",22));
        someGuests.add(facade.createGuest("Alma O","19940202-9912",22));
        someGuests.add(facade.createGuest("Hampus D","1990715-7777",22));

        return someGuests;
    }

    private List<RoomBooking> generateBookings(Hotel hotel) {
        List<RoomBooking> someBookings = new ArrayList<>();

        List <Guest> guestList1 = new ArrayList<>();
        guestList1.add(hotel.getGuests().get(4));
        someBookings.add(new RoomBookingImpl(new Date(116, 2, 0), new Date(116, 2,15), hotel.getRooms().get(2),
                guestList1, new ArrayList<>()));

        List <Guest> guestList2 = new ArrayList<>();
        guestList2.add(hotel.getGuests().get(5));
        List <Service> serviceList = new ArrayList<>();
        Service service = ServicesFactory.INSTANCE.createService();
        service.setPrice(hotel.getServiceBlueprints().get(0).getBasePrice());
        serviceList.add(service);
        RoomBooking booking = new RoomBookingImpl(new Date(116, 0, 14), new Date(116, 0,15), hotel.getRooms().get(4),
                guestList2, serviceList);
        service.setConsumer(booking);
        someBookings.add(booking);

        List <Guest> guestList3 = new ArrayList<>();
        guestList3.add(hotel.getGuests().get(9));
        guestList3.add(hotel.getGuests().get(10));

        List<Service> serviceList1 = new ArrayList<>();


        Service service1 = ServicesFactory.INSTANCE.createService();
        service1.setPrice(hotel.getServiceBlueprints().get(1).getBasePrice());
        Service service2 = ServicesFactory.INSTANCE.createService();
        service2.setPrice(hotel.getServiceBlueprints().get(0).getBasePrice());
        serviceList1.add(service1);
        serviceList1.add(service2);
        RoomBooking booking1 = new RoomBookingImpl(new Date(116, 4, 20), new Date(116, 4,24), hotel.getRooms().get(4),
                guestList3, serviceList1);
        service1.setConsumer(booking1);
        service2.setConsumer(booking1);

        someBookings.add(booking1);


        return someBookings;
    }

    /**
     * returns some test blueprints for services.
     * @return
     */
    public List<ServiceBlueprint> generateServiceBlueprints() {
        List<ServiceBlueprint> blueprints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ServiceBlueprint blueprint = ServicesFactory.INSTANCE.createServiceBlueprint();
            double r = (Math.random()*300)+75;
            blueprint.setBasePrice(r);
            blueprint.setId((int) r);
            blueprint.setName("The price is: " + r);
            blueprints.add(blueprint);
        }
        return blueprints;
    }

    /**
     * Can be used to test this command.
     * @return
     */
    public static List<Order> generateOrders() {
        // Create test customer

        Customer customer = ClientsFactoryImpl.eINSTANCE.createCustomer();
        RealPerson testPerson = IdentitiesFactoryImpl.eINSTANCE.createRealPerson();
        testPerson.setName("John Doe");

        //Create room prototype
        RoomPrototype testRoomPrototype = FacilitiesFactory.INSTANCE.createRoomPrototype();
        testRoomPrototype.setName("Single-room suite");
        testRoomPrototype.setBasePrice(705.50);
        PrototypeOrdering orderingTest = FacilitiesFactory.INSTANCE.createPrototypeOrdering();
        orderingTest.setOrder(1);
        orderingTest.setPrototype(testRoomPrototype);
        List<PrototypeOrdering> prototypeOrderings = new ArrayList<>();
        prototypeOrderings.add(orderingTest);

        //Create test room booking using prototype.
        Room room = FacilitiesFactory.INSTANCE.createRoom(prototypeOrderings);
        RoomBooking booking = OrderingFactory.INSTANCE.createRoomBooking();
        booking.setBookedRoom(room);
        // Set start and end-dates.
        Calendar cal = Calendar.getInstance();
        cal.set(2016,1,7);
        booking.setStartDate(cal.getTime());
        cal.set(2016,1,8);
        booking.setEndDate(cal.getTime());
        List<RoomBooking> bookingsList = new ArrayList<>();
        bookingsList.add(booking);
        //Add service to booking.
        IService service = new ServiceFacade();
        service.addServiceToBooking(booking, ServicesFactory.INSTANCE.createService(204.8, booking));
        //Create test order

        List<Order> orderList = new ArrayList<>();
        orderList.add(OrderingFactory.INSTANCE.createOrder(null, customer, false, null, bookingsList, null));
        return orderList;
    }




}
