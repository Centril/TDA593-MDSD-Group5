package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.blacklist.impl.IBlacklistImpl;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.clients.IClient;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientFacade;
import sechalmersmdsdgroup5.hotel.ordering.IOrder;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.ordering.impl.OrderingFacade;

import java.util.Optional;

import static java.util.Optional.empty;
import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.intId;
import static sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders.nonNegativeInt;
import static sechalmersmdsdgroup5.hotel.utils.Functional.concatMap;

public class AddGuest implements IdentifiableCommand<Hotel, Optional<Guest>> {
	@Override
	public String getIdentifier() {
		return "add-guest";
	}

	@Override
	public String help() {
		return "Adds a guest to a booking...";
	}

	@Override
	public Optional<Guest> apply( IOHelper io, Hotel hotel ) {
		return basicAddGuest( io, hotel, io.info( help() ).newline().read(
				"What booking id?", "Not a valid booking id.",
				intId( concatMap( hotel.getOrders(), Order::getBookings ), RoomBooking::getId ) ) );
	}

	static Optional<Guest> basicAddGuest( IOHelper io, Hotel hotel, RoomBooking booking ) {
		Optional<Guest> guest = io.executeOpt( hotel, Command.command( AddGuest::readGuest ) );

		if ( !guest.isPresent() ) {
			io.warn( "Not a valid guest specified." ).newline();
			return empty();
		}

		try {
			IOrder facade = new OrderingFacade( hotel );
			facade.addGuestToBooking( guest.get(), booking );
		} catch ( IllegalArgumentException iag ) {
			io.warn( "Can't add more to booking because room is full." ).newline();
			return null;
		}

		return guest;
	}

	static Guest readGuest( IOHelper io, Hotel hotel ) {
		io.info( "Adding a guest..." ).newline();

		IClient facade = new ClientFacade();
		Guest guest = facade.createGuest(
				io.read( "Guest name?" ),
				io.read( "Guest SSN?" ),
				io.read( "Guest age?", "Invalid age.", nonNegativeInt() ) );

		String reason = new IBlacklistImpl( hotel ).getBlacklistReason( guest );

		if( reason == null ) {
			hotel.getGuests().add(guest);
			return guest;
		}

		io.warn( "Person is blacklisted, reason: " + reason ).newline();
		return null;
	}
}