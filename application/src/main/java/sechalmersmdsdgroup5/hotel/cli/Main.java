package sechalmersmdsdgroup5.hotel.cli;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.commands.*;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Application;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.color.TermColor;

import java.util.Arrays;

import static sechalmersmdsdgroup5.hotel.HotelFactory.INSTANCE;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.ApplicationRunner.runner;
import static sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper.system;

/**
 * CLI program.
 */
public class Main {
	/**
	 * CLI entry point.
	 *
	 * @param args CLI args.
	 */
	public static void main( String[] args ) {
		checkDisableColors( args );

		runner(header(system()), INSTANCE.createHotel()).accept(Application.<Hotel>builder()
				.add(CreateOrder::new)
				.add(AddGuest::new)
				.add(AddServiceToBooking::new)
				.add(PayForOrder::new)
				.add(ReadBooking::new)
				.add(ReadOrder::new)
				.add(ReadServicesBooking::new)
				.add(SearchCustomer::new)
				.add(TakeBackKey::new)
				.add(SearchAvailableBookings::new)
				.add(SearchAvailableRooms::new)
				.add(SearchOccupiedRooms::new)
				.add(SearchActiveBookings::new)
				.add(SearchUnpaidOrders::new)
				.add(SearchAvailableServices::new)
				.add(SearchUsedServices::new)
				.add(SearchBookingsNotCheckedIn::new)
				.add(AddRoom::new)
				.add(ListRooms::new)
				.add(SearchUnpaidServicesBooking::new)
				.add(SearchUnpaidServicesOrder::new)
				.add(IsBlacklisted::new)
				.add(CheckIn::new)
				.add(CheckOut::new)
				.add(Populate::new)
				.build());
	}

	private static IOHelper header( IOHelper helper ) {
		return helper.paragraph( "n00dels, Hotel Management System 1.0.0" )
					.quitAware( io -> io.paragraph( "Welcome back " + io.read( "Please identify:" ) + "!" ) );
	}

	/**
	 * Disable terminal colors if instructed to.
	 *
	 * @param args CLI args.
	 */
	private static void checkDisableColors( String[] args ) {
		if ( Arrays.stream( args ).map( String::trim ).anyMatch(
				str -> str.equals( "--no-color" ) || str.equals( "-nc" ) ) ) {
			TermColor.enabled = false;
		}
	}
}