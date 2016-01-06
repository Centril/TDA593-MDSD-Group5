package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.payment.IPayment;
import sechalmersmdsdgroup5.hotel.payment.Payable;
import sechalmersmdsdgroup5.hotel.payment.impl.Payment;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.utils.Pair;
import sechalmersmdsdgroup5.hotel.utils.PairList;

import java.util.List;

public class Debit implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept(IOHelper io, Hotel hotel ) {
        List<Order> hotelOrders = hotel.getOrders();
        if ( null == hotelOrders || hotelOrders.isEmpty() ) {
            io.info("There is nothing to debit. Exiting command.");
        }
        else {
            PairList<Integer, Payable> pairs = new PairList<>();
            StringBuilder builder = new StringBuilder();
            int count = 1;
            List<Order> orders = hotelOrders;
            for (Order order : orders) {
                for (RoomBooking booking : order.getBookings()) {
                    if (!booking.isPaid()) {
                        pairs.add(new Pair<>(count, booking));
                        Utils.appendBooking(builder,count,booking);
                        count++;
                        for (Service service : booking.getServices()) {
                            if (!service.isPaid()) {
                                builder.append("\n");
                                pairs.add(new Pair<Integer, Payable>(count, service));
                                Utils.appendService(builder,count,service);
                                count++;
                            }
                        }
                        builder.append("\n");
                        count++;
                    }
                }
            }
            if  (pairs.isEmpty()) {
                io.info("There is nothing to debit. Exiting.");
            }
            else {
                String msg = io.read("These are the current payables. Please specify which one you wish to " +
                        "debit by inputting the corresponding number.\n " + builder.toString());
                int nbr = Utils.parseInteger(msg);
                if (nbr == -1) {
                    io.info("Incorrect input. Exiting.");}

                else {
                    Payable payable = (Payable) pairs.getPair(nbr).snd();
                    if (payable == null) {io.info("There is no such index. Exiting.");}

                    else {
                        io.info("Debiting payable with index " + nbr + ". Thank you for your patience. Exiting.");
                        IPayment paymentManager = new Payment();
                        paymentManager.debit(payable);

                    }
                }
            }
        }

    }


    @Override
    public String help() {
        return "Staff debits for a payable.";
    }

    @Override
    public String getIdentifier() {
        return "debit";
    }

}


