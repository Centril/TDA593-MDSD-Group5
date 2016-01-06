package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.payment.IPayment;
import sechalmersmdsdgroup5.hotel.payment.impl.Payment;
import sechalmersmdsdgroup5.hotel.search.impl.Search;
import sechalmersmdsdgroup5.hotel.utils.Pair;
import sechalmersmdsdgroup5.hotel.utils.PairList;

import java.util.ArrayList;
import java.util.List;

public class PayForOrder  implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel ) {

        List<Order> orders = findCustomerOrders(io.read( "Please specify the first name followed by" +
                " the surname under which the order was created. [Example: John Doe]\n: " ), hotel);

        if ( null == orders || orders.isEmpty() ) {
            io.info("There are no orders associated with that name. Exiting command.");
        }

        else {
            //List the orders associated with the customer as pairs.
            PairList pairs = new PairList();

            StringBuilder builder = new StringBuilder();
            int count = 1;
            for (Order order : orders) {
                appendOrder(builder, count, order);
                builder.append("\n");
                pairs.add(new Pair<>(count, order));
            }

            String msg = io.read("These are the associated orders. Please specify which order you wish to " +
                    "pay for by inputting the corresponding number." + builder.toString());
            int nbr = Utils.parseInteger(msg);
            if (nbr == -1) {
                io.info("Incorrect input. Exiting.");
            } else {
                Order orderToPay = (Order) pairs.getPair(nbr).snd();
                if ( orderToPay != null ) {
                    String choice = io.read("Do you wish to pay the following by " +
                            " [1: invoice] or [2: directly using your credit card]?" + builder.toString());


                    int nbr1 = Utils.parseInteger(choice);
                    IPayment payment = new Payment();
                    if (nbr1 == 1) {
                        io.info("An invoice will be sent to your home address. " +
                                "A receipt will be printed shortly... Thank you for your stay.");
                        payment.debit(orderToPay, orderToPay.getCustomer());
                    } else if (nbr1 == 2) {
                        io.info("Please pay through the credit card reader. Thank you for your visit.");
                        payment.debit(orderToPay);
                    } else {
                        io.info("Invalid input. Exiting.");
                    }
                }
            }
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
        // This is how to get the name:
        // System.out.println(order.getBookings().get(0).getBookedRoom().getPrototypes().get(0).getPrototype().getName());
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

}

