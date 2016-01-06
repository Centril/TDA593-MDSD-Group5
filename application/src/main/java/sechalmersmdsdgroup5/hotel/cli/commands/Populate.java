package sechalmersmdsdgroup5.hotel.cli.commands;


import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.clients.Address;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.clients.IClient;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientFacade;
import sechalmersmdsdgroup5.hotel.facilities.*;
import sechalmersmdsdgroup5.hotel.facilities.impl.Facilities;
import sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl;
import sechalmersmdsdgroup5.hotel.identities.IdentitiesFactory;
import sechalmersmdsdgroup5.hotel.identities.Organisation;
import sechalmersmdsdgroup5.hotel.identities.RealPerson;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.ordering.impl.CheckInCheckOut;
import sechalmersmdsdgroup5.hotel.ordering.impl.OrderingFacade;
import sechalmersmdsdgroup5.hotel.ordering.impl.RoomBookingImpl;
import sechalmersmdsdgroup5.hotel.payment.CreditCard;
import sechalmersmdsdgroup5.hotel.payment.PaymentFactory;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;
import sechalmersmdsdgroup5.hotel.services.ServicesFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Populate implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel) {
        hotel.getRoomPrototypes().addAll(generateRoomPrototypes());
        io.info( "Generated room prototypes:" ).newline()
                .io( () ->
                        hotel.getRoomPrototypes().forEach( io::paragraph )
                );
        hotel.getServiceBlueprints().addAll(generateServiceBlueprints());
        io.info( "Generated service blueprints:" ).newline()
                .io( () ->
                        hotel.getServiceBlueprints().forEach( io::paragraph )
                );
        hotel.getGuests().addAll(generateGuests(hotel));
        io.info( "Generated guests:" ).newline()
                .io( () ->
                        hotel.getGuests().forEach( io::paragraph )
                );
        hotel.getCustomers().addAll(generateCustomer());
        io.info( "Generated customers:" ).newline()
                .io( () ->
                        hotel.getCustomers().forEach( io::paragraph )
                );
        hotel.getRooms().addAll(generateRooms());
        io.info( "Generated rooms:" ).newline()
                .io( () ->
                        hotel.getRooms().forEach( io::paragraph )
                );
        List<Order> orders = generateOrders(hotel, generateBookings(hotel));
        io.info( "Generated orders:" ).newline()
                .io( () ->
                        orders.forEach( io::paragraph )
                );
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


        List <Guest> guestList2 = new ArrayList<>();
        guestList2.add(hotel.getGuests().get(5));
        List <Service> serviceList = new ArrayList<>();
        Service service = ServicesFactory.INSTANCE.createService();
        service.setPrice(hotel.getServiceBlueprints().get(0).getBasePrice());
        serviceList.add(service);
        RoomBooking booking = new RoomBookingImpl(new Date(116, 0, 14), new Date(116, 0,15), hotel.getRooms().get(1),
                guestList2, serviceList);
        service.setConsumer(booking);


        List <Guest> guestList1 = new ArrayList<>();
        guestList1.add(hotel.getGuests().get(4));
        RoomBooking booking1 = new RoomBookingImpl(new Date(116, 2, 0), new Date(116, 2,15), hotel.getRooms().get(2),
                guestList1, new ArrayList<>());
        (new CheckInCheckOut()).checkIn(hotel.getGuests().get(4), booking1);


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
        RoomBooking booking2 = new RoomBookingImpl(new Date(116, 0, 2), new Date(116, 0, 24), hotel.getRooms().get(4),
                guestList3, serviceList1);
        service1.setConsumer(booking2);
        service2.setConsumer(booking2);

        someBookings.add(booking1);
        someBookings.add(booking);
        someBookings.add(booking2);

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
            blueprint.setName("Service " + i);
            blueprints.add(blueprint);
        }
        return blueprints;
    }

    /**
     * Can be used to test this command.
     * @return
     */
    public List<Order> generateOrders(Hotel hotel, List<RoomBooking> bookings) {
        List<Order> someOrders = new ArrayList<>();

        List<RoomBooking> bookings1 = new ArrayList<>();
        bookings1.add(bookings.get(0));
        Order order1 = (new OrderingFacade(hotel)).createOrder(bookings1, hotel.getCustomers().get(0));

        List<RoomBooking> bookings2 = new ArrayList<>();
        bookings2.add(bookings.get(1));
        bookings2.add(bookings.get(2));
        Order order2 = (new OrderingFacade(hotel)).createOrder(bookings2, hotel.getCustomers().get(1));

        someOrders.add(order1);
        someOrders.add(order2);
        return someOrders;
    }

    
    private List<Customer> generateCustomer() {
        List<Customer> someCustomers = new ArrayList<>();

        RealPerson identity1 = IdentitiesFactory.INSTANCE.createRealPerson();
        identity1.setName("Linus Torvalds");
        identity1.setIdNumber("LT");
        identity1.setAge(46);
        identity1.setCitizenship("Finland");
        Address address1 = (new ClientFacade()).createAddress("Linus gata", 1337, "Stad", "Land", "Region",
                "Municipality", "No careof");
        CreditCard card1 = PaymentFactory.INSTANCE.createCreditCard();
        card1.setName("Linus Torvalds");
        card1.setNumber("5545012301529281");
        card1.setCcv(123);
        card1.setExpiryMonth(9);
        card1.setExpiryYear(2018);
        Customer customer = (new ClientFacade()).createCustomer(identity1, null, "linus@adress", card1, address1);


        Organisation identity2 = IdentitiesFactory.INSTANCE.createOrganisation();
        identity2.setIdNumber("G");
        identity2.setName("google");
        Address address2 = (new ClientFacade()).createAddress("googles gata", 1337, "Stad", "Land", "Region",
                "Municipality", "No careof");
        CreditCard card2 = PaymentFactory.INSTANCE.createCreditCard();
        card2.setName("Linus Torvalds");
        card2.setNumber("5545012301529281");
        card2.setCcv(123);
        card2.setExpiryMonth(9);
        card2.setExpiryYear(2018);
        Customer customer2 = (new ClientFacade()).createCustomer(identity2, null, "google@adress", card2, address2);

        someCustomers.add(customer);
        someCustomers.add(customer2);
        return  someCustomers;
    }
}
