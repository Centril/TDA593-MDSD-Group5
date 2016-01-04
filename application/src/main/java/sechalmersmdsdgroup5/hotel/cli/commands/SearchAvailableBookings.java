package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.PreBooking;
import sechalmersmdsdgroup5.hotel.search.SearchQuery;
import sechalmersmdsdgroup5.hotel.search.SearchResult;
import sechalmersmdsdgroup5.hotel.search.impl.Search;
import sechalmersmdsdgroup5.hotel.search.logic.SearchQueryBuilder;
import sechalmersmdsdgroup5.hotel.utils.Dates;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readDate;
import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readOrTomorrow;
import static sechalmersmdsdgroup5.hotel.utils.Dates.toDate;

public class SearchAvailableBookings implements IdentifiableCommand<Hotel, List<SearchResult<PreBooking>>> {
    @Override
    public List<SearchResult<PreBooking>> apply( IOHelper io, Hotel hotel ) {
        io.info("Searching for available rooms orders...").newline();

        Date from = readDate( "from when? [default: now]", io );
        Date to = readOrTomorrow( "to when? [default: tomorrow]", io );

        SearchQuery query = SearchQueryBuilder.builder().query();


        //SearchQuery
        //io.executeMany()

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