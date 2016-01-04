package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.PreOrder;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;
import sechalmersmdsdgroup5.hotel.search.SearchResult;
import sechalmersmdsdgroup5.hotel.search.impl.Search;

import java.util.List;

public class SearchAvaiableOrders implements IdentifiableCommand<Hotel, List<SearchResult<PreOrder>>> {
    @Override
    public List<SearchResult<PreOrder>> apply(IOHelper io, Hotel hotel) {
        //SearchQuery
        //io.executeMany()
        io.info("Searching for available rooms orders...").newline()
            .io( () -> new Search(hotel).searchAvailableOrders());
        return null;
    }

    @Override
    public String help() {
        return "search available orders within a time interval";
    }

    @Override
    public String getIdentifier() {
        return "search-available-orders";
    }
}

//fråga om två datum from och to. dåliga datum anta nu och imorgon.