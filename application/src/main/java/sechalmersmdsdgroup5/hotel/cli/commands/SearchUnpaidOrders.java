package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.Order;

import java.util.ArrayList;
import java.util.List;

public class SearchUnpaidOrders  implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept( IOHelper io, Hotel hotel ) {
        io.info("Searching for unpaid orders...").newline();
        for(Order o : getUnpaidOrders(hotel)){
            io.info(o.toString()).newline();
        }
    }

    @Override
    public String help() {
        return "Searches for unpaid orders.";
    }

    @Override
    public String getIdentifier() {
        return "search-unpaid-orders";
    }

    private List<Order> getUnpaidOrders(Hotel hotel){
        ArrayList<Order> unpaidOrders = new ArrayList<Order>();

        for(Order o : hotel.getOrders()){
            if(!o.isPaid()){
                unpaidOrders.add(o);
            }
        }

        return unpaidOrders;
    }
}
