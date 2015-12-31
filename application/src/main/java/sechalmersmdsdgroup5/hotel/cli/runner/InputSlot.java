package sechalmersmdsdgroup5.hotel.cli.runner;

import sechalmersmdsdgroup5.hotel.cli.model.CommandPart;

import java.util.ArrayList;
import java.util.List;

public class InputSlot {
	protected CommandPart part;
	protected Object data;

	InputSlot( CommandPart part ) {
		this.part = part;
		data = part.limit() == 1 ? null : new ArrayList<>();
	}

	public int count() {
		return part.limit() == 1 ? (data == null ? 0 : 1) : ((List<?>) data).size();
	}

	public boolean requiredSatisfied() {
		return count() >= part.required();
	}

	public boolean limitReached() {
		return part.limit() != 0 && count() == part.limit();
	}

	public Object data() {
		return data;
	}

	public CommandPart part() {
		return part;
	}

	@SuppressWarnings( "unchecked" )
	public void addData( Object d ) {
		if ( part.required() != 1 ) {
			((List) data).add( d );
		} else {
			data = d;
		}
	}
}