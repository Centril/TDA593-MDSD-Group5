package sechalmersmdsdgroup5.hotel.cli.commands;

import sechalmersmdsdgroup5.hotel.Hotel;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.Command;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IOHelper;
import sechalmersmdsdgroup5.hotel.cli.infrastructure.IdentifiableCommand;
import sechalmersmdsdgroup5.hotel.clients.Guest;
import sechalmersmdsdgroup5.hotel.identities.Identity;
import sechalmersmdsdgroup5.hotel.personnel.Employee;
import sechalmersmdsdgroup5.hotel.search.impl.Search;

import java.util.List;

import static sechalmersmdsdgroup5.hotel.cli.commands.Utils.readDate;

/**
 * Created by Hampus on 2016-01-03.
 */
public class TakeBackKey  implements Command.Consuming<Hotel>, IdentifiableCommand<Hotel, Void> {
    @Override
    public void accept( IOHelper io, Hotel hotel ) {
        io.info( "Returning a key..." ).newline()
                .io(() -> io.info(removeKey(hotel, io.read("Keyholders ID: ")) ? "Key removed." : "Keyholder not found."));
    }

    @Override
    public String help() {
        return "takes back a key from a guest or employee.";
    }

    @Override
    public String getIdentifier() {
        return "take-back-key";
    }

    private boolean removeKey(Hotel hotel, String id) {
        List<Guest> guests = hotel.getGuests();
        List<Employee> employees = hotel.getEmployees();

        for(Guest guest : guests){
            if(guest.getIdNumber().equals(id)){
                guest.setKey(null);
                return true;
            }
        }

        for (Employee employee : employees){
            if(employee.getIdNumber().equals(id)){
                employee.setKey(null);
                return true;
            }
        }

        return false;
    }
}