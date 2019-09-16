package interfaces;

/* 
 * Default Interface rules:
1. A default method may only be declared within an interface and not within a class or abstract class.
2. A default method must be marked with the default keyword. If a method is marked as default, it must provide a method body.
3. A default method is not assumed to be static, final, or abstract, as it may be used or overridden by a class 
   that implements the interface therefore require an instance of the class implementing the interface to be invoked.
4. Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private or protected.
 */

public class DefaultInterfaceMethods implements Walk, Run{

	/*public static void main(String[] args) {
		System.out.println(new DefaultInterfaceMethods().getSpeed());	//DOES NOT COMPILE AS COMPILER NOT SURE WHICH METHOD TO USE
	}*/
	
	public int getSpeed() { 	// overrides duplicate default methods
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(new DefaultInterfaceMethods().getSpeed());	//Program runs and prints 1 after default method overridden
	
	}
}

interface Walk {
	public default int getSpeed() {		//default method
		return 5;
	}
}

interface Run {
	public default int getSpeed() {		//default method
		return 10;
	}
}

