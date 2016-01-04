package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientsFactoryImpl;
import sechalmersmdsdgroup5.hotel.facilities.FacilitiesFactory;
import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomPrototype;
import sechalmersmdsdgroup5.hotel.identities.RealPerson;
import sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesFactoryImpl;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.OrderingFactory;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.search.impl.Search;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PayForOrder  implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel ) {

        List<Order> orders = findCustomerOrders(io.read( "Please specify the first name followed by" +
                " the surname under which the order was created. [Example: John Doe]\n: " ), hotel);

        if ( null == testOrders() ) {
            io.info("There are no orders associated with that name. Exiting command.");
        }

        else {
            //List the orders associated with the customer.

            StringBuilder builder = new StringBuilder();
            int count = 1;

            for (Order order : testOrders()) {
                appendOrder(builder, count, order);
            }

            io.read("These are the associated orders. Please specify which order you wish to " +
                    "pay for by inputting the corresponding number." + builder.toString());

        }
    }

    /**
     * Lists the given orders' rooms and total cost.
     * @param builder
     * @param count
     * @param order
     */
    private void appendOrder(StringBuilder builder, int count, Order order) {
        builder.append( "\n" +  count + ". ");
        System.out.println(order.getBookings().get(0).getBookedRoom().getPrototypes().get(0).getPrototype().getName());
        List<RoomBooking> bookings = order.getBookings();
        for (RoomBooking roomBooking : bookings) {
            appendRoomName(builder, roomBooking);
        }
        builder.append(" \n Total price: " + order.totalPrice() + " SEK");
        count++;
    }

    /**
     * Appends the names of the prototypes for the room to a given StringBuilder.
     * @param builder
     * @param roomBooking
     */
    private void appendRoomName(StringBuilder builder, RoomBooking roomBooking) {
        List<PrototypeOrdering> orderedPrototypes = roomBooking.getBookedRoom().getPrototypes();
        for (PrototypeOrdering orderedPrototype : orderedPrototypes) {
            System.out.println(orderedPrototype.getPrototype().getName());
            builder.append(orderedPrototype.getPrototype().getName() + " ");
        }
    }

    private List<Order> findCustomerOrders(String input, Hotel hotel) {
        return new Search(hotel).searchActiveOrders(input);
    }

    @Override
    public String help() {
        return "Lets the client pay for his or her complete order.";
    }

    @Override
    public String getIdentifier() {
        return "pay-for-order";
    }


    private List<Order> testOrders() {
        // Create test customer
        //System.out.println(order.getBookings().get(0).getBookedRoom().getPrototypes().get(0).getPrototype().getName());

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
        //Create test order

        List<Order> orderList = new ArrayList<>();
        orderList.add(OrderingFactory.INSTANCE.createOrder(null, customer, false, null, bookingsList, null));
        return orderList;
    }

}

