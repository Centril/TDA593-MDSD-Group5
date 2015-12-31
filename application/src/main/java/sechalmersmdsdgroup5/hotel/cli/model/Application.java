package sechalmersmdsdgroup5.hotel.cli.model;

import java.util.Map;
import java.util.function.Supplier;

public interface Application<I> extends Supplier<Map<String, Command<I, ?>>> {
}
