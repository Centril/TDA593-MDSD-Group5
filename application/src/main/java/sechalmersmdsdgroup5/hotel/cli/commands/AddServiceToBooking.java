package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;
import sechalmersmdsdgroup5.hotel.utils.Pair;

import java.util.ArrayList;
import java.util.List;

public class AddServiceToBooking implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel) {
        if ( null == hotel.getOrders() || hotel.getOrders().isEmpty() ) {
            io.info("There are no current bookings. Exiting command.");
        }
        else {
            List<Pair<Integer, RoomBooking>> pairs = new ArrayList<>();
            StringBuilder builder = new StringBuilder();
            int count = 1;
            List<Order> orders = Utils.testOrders();
            for (Order order : orders) {
                for (RoomBooking booking : order.getBookings()) {
                    pairs.add(new Pair<>(count, booking));
                    appendBooking(builder,count,booking);
                    builder.append("\n");
                }
            }

            String msg = io.read("These are the current room bookings. Please specify which room you wish to " +
                    "add a service to by inputting the corresponding number." + builder.toString());
            int nbr = Utils.parseInteger(msg);

            if (nbr == -1) {
                io.info("Incorrect input. Exiting.");}

            else {
                RoomBooking bookingToUse = pairs.get(nbr).snd();
                if (bookingToUse == null) {io.info("Invalid input. Exiting.");}

                else {
                    builder = new StringBuilder();
                    count = 1;
                    for (ServiceBlueprint service : hotel.getServiceBlueprints()) {
                        appendService(builder,count,service);
                    }

                        io.info("Pick a service to add to your booking: \n" + builder.toString());
                }
            }
        }
    }

    /**
     * Lists the given bookings and total cost.
     *
     * @param builder
     * @param count
     * @param booking
     */
    private void appendBooking(StringBuilder builder, int count, RoomBooking booking) {
        builder.append("\n" + count + ". ");
        // This is how to get the name:
        // System.out.println(order.getBookings().get(0).getBookedRoom().getPrototypes().get(0).getPrototype().getName());
        appendRoomName(builder, booking);
        builder.append(" \n Room Number: "+ booking.getBookedRoom().getNr());
        count++;
    }

    /**
     * Lists the given bookings and total cost.
     *
     * @param builder
     * @param count
     * @param service
     */
    private void appendService(StringBuilder builder, int count, ServiceBlueprint service) {
        builder.append("\n" + count + ". ");
        // This is how to get the name:
        // System.out.println(order.getBookings().get(0).getBookedRoom().getPrototypes().get(0).getPrototype().getName());
        builder.append(" \n Service information: " + service.toString());
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
            builder.append(orderedPrototype.getPrototype().getName() + " ");
        }
    }


    @Override
    public String help() {
        return "Adds a service to a given booking";
    }

    @Override
    public String getIdentifier() {
        return "add-service";
    }
}

