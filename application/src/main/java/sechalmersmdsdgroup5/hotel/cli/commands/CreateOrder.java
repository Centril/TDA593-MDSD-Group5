package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.blacklist.impl.IBlacklistImpl;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;
import sechalmersmdsdgroup5.hotel.clients.Address;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.clients.IClient;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientFacade;
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
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Collections.singletonList;
import static sechalmersmdsdgroup5.hotel.cli.commands.AddGuest.basicAddGuest;
import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readInteger;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.Readers.reader;
import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.*;
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

        if ( !verifyCustomerLegality( io ) ) return null;

        List<SearchResult<PreBooking>> resultBookings;
        while ( (resultBookings = io.execute( hotel, new SearchAvailableBookings() )).isEmpty() )
            io.warn( "There were no available bookings!" ).newline();

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
            Guest firstGuest = io.execute( hotel, Command.command( AddGuest::readGuest ) );
            RoomBooking booking = facade.createBooking( pre, singletonList( firstGuest ) );

            // Keep adding forever until we can't add guests anymore:
            while ( io.read( "Add more guests?", addMore() ) && basicAddGuest( io, hotel, booking ) != null );

            //TODO: add services to booking.

            return booking;
        } ) );

        Customer customer = io.execute( hotel, Command.command( this::readCustomer ) );

        Order order = facade.createOrder( bookeds, customer );

        io.info( "The created order will be:" ).newline().paragraph( order );

        if ( !io.read( "Do you accept the terms and conditions (yes/no)?", "Specify yes or no.", yesNo() ) ) {
            hotel.getOrders().remove(order);
            return null;
        }

        io.info( "Your order has been created!" );

        return order;
    }

    private Customer readCustomer( IOHelper io, Hotel hotel ) {
        io.info( "Specify the customer..." ).newline();

        IClient facade = new ClientFacade();

        Identity identity;
        if ( io.read(
                "Is customer a real person or organisation?",
                "Invalid input, answer real or organisation",
                reader( str -> str.startsWith( "r" ) || str.startsWith( "o" ),
                        str -> str.startsWith( "r" ) ) ) ) {
            io.info( "OK, specifying a real person." ).newline();

            RealPerson person = IdentitiesFactory.INSTANCE.createRealPerson();

            specifyIdentity( io, person );
            person.setAge( io.read( "Customer age?", "Invalid age.", nonNegativeInt() ) );
            person.setCitizenship( io.read( "Customer citizenship?" ) );
            identity = person;
        } else {
            io.info( "OK, specifying an organisation." ).newline();

            Organisation organisation = IdentitiesFactory.INSTANCE.createOrganisation();
            identity = organisation;
            specifyIdentity( io, organisation );
        }

        String reason = new IBlacklistImpl( hotel ).getBlacklistReason( identity );
        if( reason != null ) {
            io.warn( "Person is blacklisted, reason: " + reason ).newline();
            return null;
        }

        String email = ( io.read( "Customer email?" ) );

        String country = io.read( "Address, country?" ) ;
        String region = io.read( "Address, region?" ) ;
        String municipality = io.read( "Address, municipality?" ) ;
        String street = io.read( "Address, street?" ) ;
        String zipArea = io.read( "Address, zip area?" ) ;
        int zipCode = io.read( "Address, zip code?", "Not a zip code.", naturalInt() );
        String careOf = io.read( "Address, care of?" );

        Address address = facade.createAddress(street, zipCode, zipArea, country, region, municipality, careOf);

        CreditCard card = PaymentFactory.INSTANCE.createCreditCard();
        card.setName( io.read( "Card holder?" ) );
        card.setNumber( io.read( "Card number?" ) );
        card.setCcv( io.read( "Card ccv?", "Invalid ccv.", naturalInt() ) );
        card.setExpiryMonth( io.read( "Card expiry month?", "Not a month.", naturalInt() ) );
        card.setExpiryYear( io.read( "Card expiry year?", "Not a year.", naturalInt() ) );

        Customer customer = facade.createCustomer(identity, null, email, card, address);
        return customer;
    }

  

    private void specifyIdentity( IOHelper io, Identity identity ) {
        identity.setName( io.read( "Customer name?" ) );
        identity.setIdNumber( io.read( "Customer SSN?" ) );
    }

    private boolean verifyCustomerLegality(IOHelper io) {
        io.info( "Verifying that you are allowed to make an order" ).newline();
        int age = readInteger("What is your age? ", io);
        // In the future, get some config about age here
        // And add other legality factors
        if (age <= 15) {
            io.warn("Not old enough to make order").newline();
            return false;
        }
        return true;

    }
}