package ifCloseThrowsException;

public class CloseThrowsException implements AutoCloseable{
	
	/*
	 * If close throws an Exception
	 * 		- we can catch the exception thrown by close() if we wish or
	 * 		- we can allow the caller to deal with it. Just like a regular exception, checked exceptions must be handled or declared.
	 * 		  Runtime exceptions do not need to be acknowledged.
	 */
	
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}

	public static void main(String[] args) {
		try (CloseThrowsException t = new CloseThrowsException()) {
			System.out.println("put turkeys in");
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}

	}

}