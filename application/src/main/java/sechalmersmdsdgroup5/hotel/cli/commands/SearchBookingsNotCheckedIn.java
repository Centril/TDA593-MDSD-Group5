package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;
import sechalmersmdsdgroup5.hotel.search.impl.Search;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static sechalmersmdsdgroup5.hotel.cli.infrastructure.color.StandardPrintColor.CYAN;
import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.choice;
import static sechalmersmdsdgroup5.hotel.search.logic.SearchCriteriaFactory.query;
import static sechalmersmdsdgroup5.hotel.utils.Functional.foreachIndexed;

public class SearchBookingsNotCheckedIn implements IdentifiableCommand<Hotel, List<SearchResult<RoomBooking>>> {
    @Override
    public List<SearchResult<RoomBooking>> apply( IOHelper io, Hotel hotel ) {
        return io.io(
            () -> new Search( hotel ).searchBookingsNotCheckedIn( query(
                    io.info( "Searching for bookings which are not checked in..." ).newline()
                      .paragraph( CYAN, "Please enter zero or more criterias where one or more matches:" )
                      .executeMany( 0, hotel, Command.command( "", this::criteriaMaker ) ) ) ),
            srs ->
                io.info( "The results were:" ).newline().io(
                    () -> foreachIndexed( srs, (sr, index) ->
                        io.print( CYAN, (index + 1) + ") " )
                          .paragraph( sr.getResult() )
                          .paragraph( "relevance: " + srs.get( index ).getRelevance() ) )
                 ).newline() );
    }

    private SearchCriteria<RoomBooking> criteriaMaker( IOHelper io, Hotel hotel ) {
        return io.newline( CYAN, "You may choose from these types of criterias:" )
                .newline( "1) Matching an attribute on a room," )
                .newline()
                .read( "Pick one of the above:", "Invalid choice of type.", choice( availableCriterias( hotel ) ) )
                .apply( io );
    }

    private List<Function<IOHelper, SearchCriteria<RoomBooking>>> availableCriterias(Hotel hotel ) {
        return Arrays.asList(
        );
    }

    @Override
    public String help() {
        return "search for bookings which are not checked in";
    }

    @Override
    public String getIdentifier() {
        return "search-bookings-not-checked-in";
    }
}
