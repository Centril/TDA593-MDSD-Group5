package sechalmersmdsdgroup5.hotel.cli.infrastructure.color;

import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * From: http://cesarloachamin.github.io/2015/03/31/System-out-print-colors-and-unicode-characters/
 */
public class PrintColorWriter extends PrintWriter {
	private static final String ANSI_RESET = "\u001B[0m";

	public PrintColorWriter( PrintStream out ) throws UnsupportedEncodingException {
		super( new OutputStreamWriter( out, "UTF-8" ), true );
	}

	public void print( PrintColor color, String msg ) {
		printColor( color, msg );
		flush();
	}

	public void println( PrintColor color, String msg ) {
		printColor( color, msg );
		println();
		flush();
	}

	private void printColor( PrintColor color, String msg ) {
		if ( TermColor.enabled ) {
			print( color.getAnsiColor() );
			print( msg );
			print( ANSI_RESET );
		} else {
			print( msg );
		}
	}
}