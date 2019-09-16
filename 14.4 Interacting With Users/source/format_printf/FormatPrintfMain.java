package format_printf;

import java.io.*;

import javax.management.RuntimeErrorException;

public class FormatPrintfMain {

	public static void main(String[] args) throws NumberFormatException, IOException{
		Console console = System.console();
		if(console==null) {
			throw new RuntimeException("Console not available in Eclipse");
		}
		else {
			console.writer().println("Welcome to the jungle");
			console.format("This jungle has 391 animals");
			console.writer().println();
			console.printf("The jungle spans 128.91 acres.");
		}
		

	}

}
