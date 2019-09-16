package newway;

/***	Old way		***/
/*import java.io.*;

public class UserInputMain {
	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = reader.readLine();
		System.out.println("You typed: " + userInput);
	}
}*/

/***	New way		***/
import java.io.Console;

public class NewWayMain {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			String userInput = console.readLine();
			console.writer().println("You entered the following: " + userInput);
		}
		else {
			System.out.println("No console available");
		}
	}
}