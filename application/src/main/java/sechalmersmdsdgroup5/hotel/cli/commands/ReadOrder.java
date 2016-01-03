package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.Order;

import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.intId;

/**
 * Created by Hampus on 2016-01-03.
 */
public class ReadOrder implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept( IOHelper io, Hotel hotel ) {
        io.info( "Displays order..." ).newline()
          .info( io.read("Order ID:", "Order not found!", intId( hotel.getOrders(), Order::getId ) ) );
    }

    @Override
    public String help() {
        return "displays an order.";
    }

    @Override
    public String getIdentifier() {
        return "read-order";
    }
}