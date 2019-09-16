package callingMethodsThatThrowExceptions;

/* 
 * When you’re calling a method that throws an exception, the rules are the 
 * same as within a method. For checked exceptions, they must be handled or declared.
 */

public class MethodsThatThrowExceptions extends Exception {

	/** This wont compile **/
	
	/*public static void main(String[] args) {
		eatCarrot();
	}*/
	 

	/** You can either throw the exception here OR **/	
	public static void main(String[] args) throws MethodsThatThrowExceptions {
		eatCarrot();
	}
	 
	/** Handle it here **/
	/*public static void main(String[] args) {
		try {
			eatCarrot();
		} catch (MethodsThatThrowExceptions e) {
		}
	}*/

	private static void eatCarrot() throws MethodsThatThrowExceptions {
		System.out.println("Exception handled!");
	}
}
