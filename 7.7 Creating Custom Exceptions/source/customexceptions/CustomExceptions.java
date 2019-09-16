package customexceptions;

import java.io.File;

public class CustomExceptions {

	public static void main(String[] args) {

	}

}

class MyException1 extends Exception { 		// How to create custom exceptions

}

class MyException2 extends MyException1 {	// How to create custom exceptions

}

// The 3 most common constructors defined by the Exception class
/* 
public CannotSwimException() {
	super();	//default constructor with no parameters
}
public CannotSwimException(Exception e) {
	super(e);	//how to wrap another exception inside yours
}
public CannotSwimException(String message) {
	super(message);	// how to pass a custom error message
}
*/
