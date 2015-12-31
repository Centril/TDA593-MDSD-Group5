package sechalmersmdsdgroup5.hotel.cli.runner;

import sechalmersmdsdgroup5.hotel.cli.model.Command;

import java.util.List;

import static sechalmersmdsdgroup5.hotel.utils.Functional.listify;

public class CommandState<I> {
	Command<I, ?> cmd;

	private int curr = 0;
	private List<InputSlot> slots;

	public CommandState( Command<I, ?> cmd ) {
		this.cmd = cmd;
		cmd.get().forEach( part -> slots.add( new InputSlot( part ) ) );
	}

	public InputSlot curr() {
		return slots.get( curr );
	}

	public boolean atLast() {
		return curr == slots.size() - 1;
	}

	public void advance() {
		if ( curr < slots.size() - 1 ) {
			curr++;
		}
	}

	public Object execute( I state ) {
		return cmd.apply( state, datas() );
	}

	private List<?> datas() {
		return listify( slots.stream().map( InputSlot::data ) );
	}
}