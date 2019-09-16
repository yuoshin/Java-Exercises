package readpassword;

import java.io.*;
import java.util.*;

public class ReadPasswordMain {

	public static void main(String[] args) {
		Console console = System.console();
		if(console==null) {
			throw new RuntimeException("Console not available in Eclipse");
		}else {
			char[] password = console.readPassword("Enter your password: ");
			console.format("Enter your password again: ");
			console.flush();
			char[] verify = console.readPassword();
			boolean match = Arrays.equals(password,verify);
			// Immediately clear passwords from memory for security reasons
			// Could also use Array.fill(password,'x') to wipe an array’s data.
			for(int i=0; i<password.length; i++) {
				password[i]='x';
			}
			for(int i=0; i<verify.length; i++) {
				verify[i]='x';
			}
			console.format("Your password was "+(match ? "correct":
			"incorrect"));
		}

	}

}
