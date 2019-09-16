package multicatch;

import java.io.IOException;
import java.lang.Exception;

/*
 * Java intends multi-catch to be used for exceptions that aren’t related, and it prevents you from specifying 
 * redundant types in a multi-catch.
 * 
 * Notice how there is only one variable name in the catch clause. The exceptions can be listed in any order 
 * within the catch clause. However, the variable name must appear only once and at the end.
 */

public class MultiCatch {

	public static void main(String[] args){
		try {
			System.out.println("Try block");
			throw new Exception2();
		}catch(Exception2 | Exception1 e) {		//Separated by a |. Only one variable at the end.
			System.out.println("Exception caught!");
		}

	}

}

class Exception1 extends ClassCastException{

}

class Exception2 extends IndexOutOfBoundsException{
	
}