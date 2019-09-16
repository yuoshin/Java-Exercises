package runtimeException;

public class RuntimeUncheckedException {

	/*
	 * Runtime exceptions tend to be unexpected but not necessarily fatal. They don’t have to be handled or declared.
	 * In the same way you can catch a checked exception, you can also catch a Runtime- Exception.
	 * The following code throws a runtime exception (ArrayIndexOutOfBoundsException):
	 */
	public static void main(String args[]) {
		String[] students = { "Yasin", "Maria" };
		System.out.println(students[5]); // [5] is non-existent
		System.out.println("All seems to be well");
	}
}