package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.facilities.RoomAttribute;
import sechalmersmdsdgroup5.hotel.facilities.impl.RoomAttributeImpl;
import sechalmersmdsdgroup5.hotel.ordering.PreBooking;
import sechalmersmdsdgroup5.hotel.search.SearchCriteria;
import sechalmersmdsdgroup5.hotel.search.SearchResult;
import sechalmersmdsdgroup5.hotel.search.impl.*;
import sechalmersmdsdgroup5.hotel.search.logic.IsSearchCriteria;
import sechalmersmdsdgroup5.hotel.search.logic.PredicatedSearchCriteria;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

import static java.lang.Integer.parseInt;
import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readDate;
import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readOrTomorrow;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.color.StandardPrintColor.CYAN;
import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.*;
import static sechalmersmdsdgroup5.hotel.search.logic.SearchCriteriaFactory.query;
import static sechalmersmdsdgroup5.hotel.utils.Functional.foreachIndexed;

public class SearchAvailableBookings implements IdentifiableCommand<Hotel, List<SearchResult<PreBooking>>> {
    @Override
    public List<SearchResult<PreBooking>> apply( IOHelper io, Hotel hotel ) {
        return io.io(
            () -> new Search( hotel ).searchAvailableBookings(
                readDate( "from when? [default: now]",
                    io.info("Searching for available rooms orders...").newline() ),
                readOrTomorrow( "to when? [default: tomorrow]", io ),
                query( io.paragraph( CYAN, "Please enter zero or more criterias where one or more matches:" )
                         .executeMany( 0, hotel, Command.command( "", this::criteriaMaker ) ) ) ),
            bookings ->
                io.info( "The results were:" ).newline().io(
                    () -> foreachIndexed( bookings, (sr, index) ->
                        io.print( CYAN, (index + 1) + ") " )
                          .paragraph( sr.getResult() )
                          .paragraph( "relevance: " + bookings.get( index ).getRelevance() ) )
                ).newline() );
    }

    private SearchCriteria<PreBooking> criteriaMaker( IOHelper io, Hotel hotel ) {
        return io.newline( CYAN, "You may choose from these types of criterias:" )
                 .newline( "1) Matching an attribute on a room," )
                 .newline( "2) Matching an exact amount of beds," )
                 .newline( "3) More than X amount of beds," )
                 .newline( "4) Less than X amount of beds," )
                 .newline( "5) On a certain floor," )
                 .newline( "6) On a floor above," )
                 .newline( "7) On a floor below," )
                 .newline( "8) On a floor in a certain interval," )
                 .newline( "9) Exactly matching a base price," )
                 .newline( "10) Below a base price," )
                 .newline( "11) Above a base price," )
                 .newline( "12) Within a base price interval," )
                 .newline( "13) Negate a criteria to specify," )
                 .newline( "14) Logical AND of two criterias," )
                 .newline( "15) Logical OR of two criterias," )
                 //.newline( "16) Specify criteria in groovy," )
                 //.newline( "17) Specify criteria in javascript," )
                 .newline()
                 .read( "Pick one of the above:", "Invalid choice of type.", choice( availableCriterias( hotel ) ) )
                 .apply( io );
    }

    private List<Function<IOHelper, SearchCriteria<PreBooking>>> availableCriterias( Hotel hotel ) {
        return Arrays.asList(
            io -> attributeTest( io.read( "Attribute name:" ), io.read( "Attribute value:" ), Object::equals ),
            io -> bedsTest( io, Object::equals ),
            io -> bedsTest( io, (a, b) -> a > b ),
            io -> bedsTest( io, (a, b) -> a < b ),
            io -> new IsSearchCriteria<>( readFloor( "", io ), this::bookingFloor ),
            io -> new MatchesSearchCriteriaImpl<>( readFloor( "", io ), this::bookingFloor, (a, b) -> b > a ),
            io -> new MatchesSearchCriteriaImpl<>( readFloor( "", io ), this::bookingFloor, (a, b) -> b < a ),
            this::rangeFloor,
            io -> new IsSearchCriteria<>( readPrice( "", io ), this::bookingPrice ),
            io -> new MatchesSearchCriteriaImpl<>( readPrice( "", io ), this::bookingPrice, ( a, b ) -> b > a ),
            io -> new MatchesSearchCriteriaImpl<>( readPrice( "", io ), this::bookingPrice, ( a, b ) -> b < a ),
            this::rangePrice,
            io -> new NotSearchCriteriaImpl<>( subCriteria( io, hotel ) ),
            io -> new AndSearchCriteriaImpl<>( subCriteria( io, hotel ), subCriteria( io, hotel ) ),
            io -> new OrSearchCriteriaImpl<>( subCriteria( io, hotel ), subCriteria( io, hotel ) )
        );
    }

    private SearchCriteria<PreBooking> subCriteria( IOHelper io, Hotel hotel ) {
        return io.execute( hotel, Command.command( "", this::criteriaMaker ) );
    }

    private SearchCriteria<PreBooking> rangePrice( IOHelper io ) {
        double from = readPrice( "from ", io ), to = readPrice( "to ", io );
        return new PredicatedSearchCriteria<>( b -> from <= bookingPrice( b ) && bookingPrice( b ) >= to );
    }

    private double readPrice( String label, IOHelper io ) {
        return io.read( label + "price:", "not a valid price!", doubleR() );
    }

    private double bookingPrice( PreBooking b ) {
        return b.getWillBook().getBasePrice();
    }

    private SearchCriteria<PreBooking> rangeFloor( IOHelper io ) {
        int from = readFloor( "from ", io ), to = readFloor( "to ", io );
        return new PredicatedSearchCriteria<>( b -> from <= bookingFloor( b ) && bookingFloor( b ) >= to );
    }

    private int readFloor( String label, IOHelper io ) {
        return io.read( label + "floor #nr:", "not a valid floor #nr!", naturalInt() );
    }

    private int bookingFloor( PreBooking b ) {
        return b.getWillBook().getFloor();
    }

    private SearchCriteria<PreBooking> bedsTest( IOHelper io, BiPredicate<Integer, Integer> test ) {
        return attributeTest(
                RoomAttributeImpl.AMOUNT_OF_BEDS,
                io.read( "#nr of beds:", "not a #nr of beds", naturalInt() ),
                (Object a, Object b) -> test.test( a instanceof Integer ? (int) a : parseInt( (String) a ), (int) b ) );
    }

    private SearchCriteria<PreBooking> attributeTest( String name, Object value, BiPredicate<Object, Object> test ) {
        return new PredicatedSearchCriteria<>(
                booking -> {
                    RoomAttribute attr = booking.getWillBook().getAttribute( name );
                    return attr != null && test.test( attr.getValue().toString(), value.toString() );
                } );
    }

    @Override
    public String help() {
        return "search available bookings within a time interval and with a query.";
    }

    @Override
    public String getIdentifier() {
        return "search-available-bookings";
    }
}