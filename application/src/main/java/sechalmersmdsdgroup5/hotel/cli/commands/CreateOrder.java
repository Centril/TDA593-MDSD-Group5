package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.blacklist.impl.IBlacklistImpl;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;
import sechalmersmdsdgroup5.hotel.clients.Address;
import sechalmersmdsdgroup5.hotel.clients.ClientsFactory;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.identities.IdentitiesFactory;
import sechalmersmdsdgroup5.hotel.identities.Identity;
import sechalmersmdsdgroup5.hotel.identities.Organisation;
import sechalmersmdsdgroup5.hotel.identities.RealPerson;
import sechalmersmdsdgroup5.hotel.ordering.IOrder;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.PreBooking;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.ordering.impl.OrderingFacade;
import sechalmersmdsdgroup5.hotel.payment.CreditCard;
import sechalmersmdsdgroup5.hotel.payment.PaymentFactory;
import sechalmersmdsdgroup5.hotel.search.SearchResult;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static java.util.Collections.singletonList;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.Readers.reader;
import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.*;
import static sechalmersmdsdgroup5.hotel.utils.Functional.foreachIndexed;
import static sechalmersmdsdgroup5.hotel.utils.Functional.listify;

public class CreateOrder implements IdentifiableCommand<Hotel, Order> {
    @Override
    public String getIdentifier() {
        return "create-order";
    }

    @Override
    public String help() {
        return "Create an order.";
    }

    @Override
    public Order apply( IOHelper io, Hotel hotel ) {
        io.info( "Creating an order..." ).newline();

        List<SearchResult<PreBooking>> resultBookingsMut;
        while ( (resultBookingsMut = io.execute( hotel, new SearchAvailableBookings() )).isEmpty() )
            io.warn( "There were no available bookings!" ).newline();

        final List<SearchResult<PreBooking>> resultBookings = resultBookingsMut;

        io.io( () -> foreachIndexed( resultBookings, (sr, index) ->
            io.newline( (index + 1) + ") " + sr.getResult() )
              .newline( "relevance:" + resultBookings.get( index ).getRelevance() )
        ) ).newline();

        List<PreBooking> bookings = listify( resultBookings.stream().map( SearchResult::getResult ) );
        Set<Integer> picked = new HashSet<>();
        List<PreBooking> selected = io.readMany(
            1,
            "Pick/add a booking from the list: ",
            "No booking with that index in list.",
            StandardReaders.integer().andThen( index -> {
                if ( picked.contains( index ) ) {
                    io.warn( "Booking already added." );
                    return null;
                }

                PreBooking booking = bookings.get( index - 1 );
                picked.add( index );
                return booking;
            } ) );

        IOrder facade = new OrderingFacade( hotel );

        List<RoomBooking> bookeds = listify( selected.stream().map( pre -> {
            // Should never fail... all rooms have min 1 room:
            Guest firstGuest = io.execute( hotel, Command.command( this::readGuest ) );
            RoomBooking booking = facade.createBooking( pre, singletonList( firstGuest ) );

            // Keep adding forever until we can't add guests anymore:
            while ( true ) {
                if ( !io.read( "Add more guests?", addMore() ) ) break;

                Optional<Guest> maybeGuest = io.executeOpt( hotel, Command.command( this::readGuest ) );

                if ( !maybeGuest.isPresent() )
                    io.warn( "Not a valid guest specified." );

                try {
                    facade.addGuestToBooking( maybeGuest.get(), booking );
                } catch ( IllegalArgumentException iag ) {
                    io.warn( "Can't add more to booking because room is full." );
                }
            }

            return booking;
        } ) );

        Customer customer = io.execute( hotel, Command.command( this::readCustomer ) );

        Order order = facade.createOrder( bookeds, customer );

        if ( !io.read( "Do you accept the terms and conditions (yes/no)?", "Specify yes or no.", yesNo() ) )
            hotel.getOrders().remove( order );

        return order;
    }

    private Customer readCustomer( IOHelper io, Hotel hotel ) {
        io.info( "Specify the customer..." ).newline();

        ClientsFactory factory = ClientsFactory.INSTANCE;
        Customer customer = factory.createCustomer();

        if ( io.read(
                "Is customer a real person or organisation?",
                "Invalid input, answer real or organisation",
                reader( str -> str.startsWith( "r" ) || str.startsWith( "o" ),
                        str -> str.startsWith( "r" ) ) ) ) {
            io.info( "OK, specifying a real person." ).newline();

            RealPerson person = IdentitiesFactory.INSTANCE.createRealPerson();
            customer.setIdentity( person );

            specifyIdentity( io, person );
            person.setAge( io.read( "Customer age?", "Invalid age.", nonNegativeInt() ) );
            person.setCitizenship( io.read( "Customer citizenship?" ) );
        } else {
            io.info( "OK, specifying an organisation." ).newline();

            Organisation organisation = IdentitiesFactory.INSTANCE.createOrganisation();
            customer.setIdentity( organisation );
            specifyIdentity( io, organisation );
        }

        String reason = new IBlacklistImpl( hotel ).getBlacklistReason( customer.getIdentity() );
        if( reason != null ) {
            io.warn( "Person is blacklisted, reason: " + reason ).newline();
            return null;
        }

        customer.setEmail( io.read( "Customer email?" ) );
        customer.setPaymentMethod( null );

        Address address = factory.createAddress();
        customer.setAssociatedAdress( address );
        address.setCountry( io.read( "Address, country?" ) );
        address.setRegion( io.read( "Address, region?" ) );
        address.setMunicipality( io.read( "Address, municipality?" ) );
        address.setStreet( io.read( "Address, street?" ) );
        address.setZipArea( io.read( "Address, zip area?" ) );
        address.setZipCode( io.read( "Address, zip code?", "Not a zip code.", naturalInt() ) );

        CreditCard card = PaymentFactory.INSTANCE.createCreditCard();
        customer.setCard( card );
        card.setName( io.read( "Card holder?" ) );
        card.setNumber( io.read( "Card number?" ) );
        card.setCcv( io.read( "Card ccv?", "Invalid ccv.", naturalInt() ) );
        card.setExpiryMonth( io.read( "Card expiry month?", "Not a month.", naturalInt() ) );
        card.setExpiryYear( io.read( "Card expiry year?", "Not a year.", naturalInt() ) );

        return customer;
    }

    private void specifyIdentity( IOHelper io, Identity identity ) {
        identity.setName( io.read( "Guest name?" ) );
        identity.setIdNumber( io.read( "Guest SSN?" ) );
    }

    private Guest readGuest( IOHelper io, Hotel hotel ) {
        io.info( "Adding a guest..." ).newline();

        String name = io.read( "Guest name?" );
        // 3 month old baby...
        int age = io.read( "Guest age?", "Invalid age.", nonNegativeInt() );
        String ssn = io.read( "Guest SSN?" );

        IOrder facade = new OrderingFacade( hotel );
        Guest guest = facade.createGuest( name, ssn, age );

        String reason = new IBlacklistImpl( hotel ).getBlacklistReason( guest );

        if( reason == null ) {
            return guest;
        }

        io.warn( "Person is blacklisted, reason: " + reason ).newline();
        return null;
    }
}