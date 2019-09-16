package checkedException;

import java.io.*;

/*
 *  Checked exceptions tend to be more anticipated.
 *  For checked exceptions, Java requires the code to either handle them or declare them in the method signature.
 *  Because checked exceptions tend to be anticipated, Java enforces that the programmer do something to show the exception was 
 *  thought about. In that case:
 *  	The method should be enclosed within a try-catch block or
 *  	The method should specify this exception to be thrown in its method signature
 *  
 *  If a method doesn’t wish to handle the checked exceptions thrown by a method it calls, 
 *  it can throw these exceptions using the throws clause in its own method signature.
 */

public class CheckedException {
	
	public static void main /* throws IOException */(String[] args){
		CheckedException method = new CheckedException();
		//method.myMethod();	
		/*IO Exception here. Main method should have throws IOException in its method signature. But then again, that will result
		 * in a runtime exception as the IOException was not handled by any method */
	}
	public void myMethod() throws IOException {
		FileInputStream soccer = new FileInputStream("soccer.txt");
		soccer.close();
	}
	/*
	 * The method myMethod doesn’t include an exception handler; instead, it rethrows the IOException thrown 
	 * by a constructor of the class FileInputStream using the throws clause in its method signature. 
	 * Any method that calls myMethod must now either catch the exception IOException or declare that it will be 
	 * rethrown in its method signature.
	 */

}
