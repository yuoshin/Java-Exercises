package MainRough;

import java.io.*;

/*public class test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Console console = System.console();
		if (console == null) {
			throw new RuntimeException("Console not available");
		} else {
			console.writer().print("How excited are you about your trip?");
			console.flush();
			String excitementAnswer = console.readLine();
			String name = console.readLine("Please enter your name: ");
			Integer age = null;
			console.writer().print("What is your age? ");
			console.flush();
			BufferedReader reader = new BufferedReader(console.reader());
			String value = reader.readLine();
			age = Integer.valueOf(value);
			console.writer().println();
			console.format("Your name is " + name);
			console.writer().println();
			console.format("Your age is " + age);
			console.printf("Your excitement level is: " + excitementAnswer);
		}
	}
}*/

public class test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Console console = System.console();
		if (console == null) {
			throw new RuntimeException("Console not available");
		} else {
			/**1: First way to read input from the user. Print the text first, flush then readLine*/
			//console.writer().print("How excited are you about your trip?");
			//console.flush();
			//String excitementAnswer = console.readLine();
			/**2: Second way to read input from the user. */
			String excitementAnswer = console.readLine("How excited are you about your trip?");
			//String name = console.readLine("Please enter your name: ");
			console.writer().print("Please enter your name: ");
			console.flush();
			String name = console.readLine();
			console.writer().print("What is your age? ");
			console.flush();
			BufferedReader reader = new BufferedReader(console.reader());
			String age = reader.readLine();
			console.writer().println();
			console.format("Your name is " + name);
			console.writer().println();
			console.format("Your age is " + age);
			console.printf("Your excitement level is: " + excitementAnswer);
		}
	}
}