package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.readers.StandardReaders;
import sechalmersmdsdgroup5.hotel.facilities.PrototypeOrdering;
import sechalmersmdsdgroup5.hotel.ordering.RoomBooking;
import sechalmersmdsdgroup5.hotel.services.Service;
import sechalmersmdsdgroup5.hotel.services.ServiceBlueprint;

import java.time.LocalDateTime;
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
	 * Lists the given bookings and total cost.
	 *
	 * @param builder
	 * @param count
	 * @param booking
	 */
	public static void appendBooking(StringBuilder builder, int count, RoomBooking booking) {
		builder.append( count + ". ");
		// This is how to get the name:
		// System.out.println(order.getBookings().get(0).getBookedRoom().getPrototypes().get(0).getPrototype().getName());
		appendRoomName(builder, booking);
		builder.append(" \n Room Number: "+ booking.getBookedRoom().getNr());
	}

	/**
	 * Lists the given bookings and total cost.
	 *
	 * @param builder
	 * @param count
	 * @param service
	 */
	public static void appendServiceBlueprint(StringBuilder builder, Integer count, ServiceBlueprint service) {
		builder.append("\n" + count + ". ");
		// This is how to get the name:
		// System.out.println(order.getBookings().get(0).getBookedRoom().getPrototypes().get(0).getPrototype().getName());
		builder.append(" \n Service: " + service.getBasePrice() + "SEK");
		count++;
	}

	/**
	 * Lists the given bookings and total cost.
	 *
	 * @param builder
	 * @param count
	 * @param service
	 */
	public static void appendService(StringBuilder builder, Integer count, Service service) {
		builder.append("\n" + count + ". ");
		// This is how to get the name:
		// System.out.println(order.getBookings().get(0).getBookedRoom().getPrototypes().get(0).getPrototype().getName());
		builder.append(" \n Service: " + service.getPrice() + "SEK");
		count++;
	}

	/**
	 * Appends the names of the prototypes for the room to a given StringBuilder.
	 * @param builder
	 * @param roomBooking
	 */
	public static void appendRoomName(StringBuilder builder, RoomBooking roomBooking) {
		List<PrototypeOrdering> orderedPrototypes = roomBooking.getBookedRoom().getPrototypes();
		for (PrototypeOrdering orderedPrototype : orderedPrototypes) {
			builder.append(orderedPrototype.getPrototype().getName() + " ");
		}
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
}