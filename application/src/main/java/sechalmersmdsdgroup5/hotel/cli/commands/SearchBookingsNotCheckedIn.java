package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.ordering.PreBooking;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.impl.*;
import sechalmersmdsdgroup5.hotel.search.logic.SearchCriteriaFactory;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static sechalmersmdsdgroup5.hotel.cli.infrastructure.color.StandardPrintColor.CYAN;
import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.choice;

public class SearchBookingsNotCheckedIn implements IdentifiableCommand<Hotel, List<RoomBooking>> {
    @Override
    public List<RoomBooking> apply(IOHelper ioHelper, Hotel hotel) {
        return new Search(hotel).searchBookingsNotCheckedIn(SearchCriteriaFactory.query()).stream()
                .map(r -> r.getResult()).collect(Collectors.toList());

    }

    private SearchCriteria<PreBooking> criteriaMaker(IOHelper io, Hotel hotel ) {
        return io.newline( CYAN, "You may choose from these types of criterias:" )
                .newline( "1) Matching an attribute on a room," )
                .newline()
                .read( "Pick one of the above:", "Invalid choice of type.", choice( availableCriterias( hotel ) ) )
                .apply( io );
    }

    private List<Function<IOHelper, SearchCriteria<PreBooking>>> availableCriterias(Hotel hotel ) {
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
