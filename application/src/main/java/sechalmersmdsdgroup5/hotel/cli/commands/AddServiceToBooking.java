package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.IService;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;
import sechalmersmdsdgroup5.hotel.services.impl.ServiceFacade;
import sechalmersmdsdgroup5.hotel.utils.Pair;
import sechalmersmdsdgroup5.hotel.utils.PairList;

import java.util.List;

public class AddServiceToBooking implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel) {
        List<Order> hotelOrders = hotel.getOrders();
        if ( null == hotelOrders || hotelOrders.isEmpty() ) {
            io.info("There are no current bookings. Exiting command.");
        }
        else {
            PairList<Integer, RoomBooking> pairs = new PairList<>();
            StringBuilder builder = new StringBuilder();
            int count = 1;
            List<Order> orders = hotelOrders;
            for (Order order : orders) {
                for (RoomBooking booking : order.getBookings()) {
                    pairs.add(new Pair<>(count, booking));
                    Utils.appendBooking(builder,count,booking);
                    builder.append("\n");
                    count++;
                }
            }
            if  (pairs.isEmpty()) {
                io.info("There are no current bookings. Exiting.");
            }
            else {
                String msg = io.read("These are the current room bookings. Please specify which room you wish to " +
                        "add a service to by inputting the corresponding number.\n " + builder.toString());
                int nbr = Utils.parseInteger(msg);
                if (nbr == -1) {
                    io.info("Incorrect input. Exiting.");}

                else {
                    RoomBooking bookingToUse = (RoomBooking) pairs.getPair(nbr).snd();
                    if (bookingToUse == null) {io.info("There is no such index. Exiting.");}

                    else {
                        builder = new StringBuilder();
                        count = 1;
                        PairList<Integer,ServiceBlueprint> blueprintList = new PairList<>();
                        for (ServiceBlueprint service : hotel.getServiceBlueprints()) {
                            Utils.appendServiceBlueprint(builder,count,service);
                            blueprintList.add(new Pair<Integer, ServiceBlueprint>(count,service));
                            count++;
                        }

                        String pick = io.read("Pick a service to add to your booking: \n" + builder.toString());
                        if (nbr == -1) {
                            io.info("Incorrect input. Exiting.");
                        } else {
                            ServiceBlueprint blueprint = (ServiceBlueprint) blueprintList.getPair(nbr).snd();
                            IService serviceFacade = new ServiceFacade();
                            serviceFacade.bookService(bookingToUse,blueprint);
                            io.info("The desired service has been booked. Thank you.\n Exiting.");
                        }
                    }
                }
            }
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

