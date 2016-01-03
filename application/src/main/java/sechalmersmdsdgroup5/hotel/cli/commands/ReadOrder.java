package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import java.util.List;

/**
 * Created by Hampus on 2016-01-03.
 */
public class ReadOrder implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept( IOHelper io, Hotel hotel ) {
        io.info( "Displays order..." ).newline()
                .io(() -> io.info(read(hotel, io.read("Order ID: "))));
    }

    @Override
    public String help() {
        return "displays an order.";
    }

    @Override
    public String getIdentifier() {
        return "read-order";
    }

    public String read (Hotel hotel, String id){
        List<Order> orders = hotel.getOrders();
        String returnvalue = "Order not found!";
        int orderID;

        try {
            orderID = Integer.parseInt(id);
        }catch (NumberFormatException e){
            return "Order not found!";
        }

        for(Order order : orders){
            if(order.getId() == orderID){
                returnvalue = order.toString();
            }
        }

        return returnvalue;
    }
}