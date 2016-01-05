package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;
import sechalmersmdsdgroup5.hotel.clients.Customer;
import sechalmersmdsdgroup5.hotel.clients.impl.ClientsFactoryImpl;
import sechalmersmdsdgroup5.hotel.facilities.FacilitiesFactory;
import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.facilities.Room;
import sechalmersmdsdgroup5.hotel.facilities.RoomPrototype;
import sechalmersmdsdgroup5.hotel.identities.RealPerson;
import sechalmersmdsdgroup5.hotel.identities.impl.IdentitiesFactoryImpl;
import sechalmersmdsdgroup5.hotel.ordering.Order;
import sechalmersmdsdgroup5.hotel.ordering.OrderingFactory;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

import static sechalmersmdsdgroup5.hotel.utils.Dates.toDate;

/**
 * Utils for commands.
 */
public class Utils {
	public static Date readOrTomorrow( String label, IOHelper io ) {
		return readDate( label, io, () -> toDate( LocalDateTime.now().plusDays( 1 ) ) );
	}

	public static Date readDate( String label, IOHelper io ) {
		return readDate( label, io, Date::new );
	}

	public static Date readDate( String label, IOHelper io, Supplier<Date> whenInvalid ) {
		return io.readOpt( label, StandardReaders.date() ).orElseGet( whenInvalid );
	}

	public static Integer readInteger( String label, IOHelper io ) {
		return io.read( label, StandardReaders.integer() );
	}

	public static Boolean readBool( String label, IOHelper io ) {
		return io.read( label, StandardReaders.bool() );
	}

	/**
	 * returns -1 if the parsing was unsuccessful.
	 * @param msg
	 * @return
	 */
	public static int parseInteger(String msg) {
		int nbr = -1;
		try {
			nbr = Integer.parseInt(msg);
		} catch (NumberFormatException e) {
		}
		return nbr;
	}
	/**
	 * Can be used to test this command.
	 * @return
	 */
	public static List<Order> testOrders() {
		// Create test customer

		Customer customer = ClientsFactoryImpl.eINSTANCE.createCustomer();
		RealPerson testPerson = IdentitiesFactoryImpl.eINSTANCE.createRealPerson();
		testPerson.setName("John Doe");

		//Create room prototype
		RoomPrototype testRoomPrototype = FacilitiesFactory.INSTANCE.createRoomPrototype();
		testRoomPrototype.setName("Single-room suite");
		testRoomPrototype.setBasePrice(705.50);
		PrototypeOrdering orderingTest = FacilitiesFactory.INSTANCE.createPrototypeOrdering();
		orderingTest.setOrder(1);
		orderingTest.setPrototype(testRoomPrototype);
		List<PrototypeOrdering> prototypeOrderings = new ArrayList<>();
		prototypeOrderings.add(orderingTest);

		//Create test room booking using prototype.
		Room room = FacilitiesFactory.INSTANCE.createRoom(prototypeOrderings);
		RoomBooking booking = OrderingFactory.INSTANCE.createRoomBooking();
		booking.setBookedRoom(room);
		// Set start and end-dates.
		Calendar cal = Calendar.getInstance();
		cal.set(2016,1,7);
		booking.setStartDate(cal.getTime());
		cal.set(2016,1,8);
		booking.setEndDate(cal.getTime());
		List<RoomBooking> bookingsList = new ArrayList<>();
		bookingsList.add(booking);
		//Create test order

		List<Order> orderList = new ArrayList<>();
		orderList.add(OrderingFactory.INSTANCE.createOrder(null, customer, false, null, bookingsList, null));
		return orderList;
	}


}