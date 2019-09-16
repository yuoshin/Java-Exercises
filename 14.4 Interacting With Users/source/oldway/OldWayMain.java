package oldway;

/***	Old way		***/
import java.io.*;

public class OldWayMain {
	public static void main(String[] args)throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = reader.readLine();
		System.out.println("You typed: " + userInput);
	}
}

/***	New way		***/
/*import java.io.Console;

public class OldWayMain {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			String userInput = console.readLine();
			console.writer().println("You entered the following: " + userInput);
		}
	}
}*/

/*import java.io.*;

public class UserInputMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Console console = System.console();
		if (console == null) {
			throw new RuntimeException("Console not available");
		} else {
			console.writer().println("Welcome to Our Zoo!");
			console.format("Our zoo has 391 animals and employs 25 people.");
			console.writer().println();
			console.printf("The zoo spans 128.91 acres.");
		}
	}
}*/