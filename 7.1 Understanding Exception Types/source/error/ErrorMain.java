package error;

public class ErrorMain {
	
	/*
	 * A class can catch and handle an error, but it shouldn’t—it should instead let the JVM handle the error itself.
	 * The error is caught however it will still cause a sort of infinite loop - StackOverFlowError.
	 */

	public static void main(String args[]) {
		try {
			myMethod();
		} catch (StackOverflowError s) {
			System.out.println(s);
		}
	}

	public static void myMethod() {
		System.out.println("myMethod");
		myMethod();
	}

}
