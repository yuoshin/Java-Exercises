package Scope;

public class MainScope {

	public static void main(String[] args) {

		Scope newObject = new Scope(); // object created

		System.out.println(newObject.methodTest()); // instance method
		System.out.println(newObject.variableTest); // instance variable
		System.out.println(Scope.variableStatic); // static variable called

		Scope.variableStatic += 10; // note how static variable is called using class directly

		System.out.println(Scope.variableStatic); // notice how variable value is still as per + 10
		System.out.println(newObject.variableStatic); // notice how static value is still the same here
		/*
		 * It doesn’t matter whether you use the name of the class or an object to
		 * access a class variable. You can change the value of a class variable using
		 * either of them because they all refer to a single shared copy.
		 */
	}
}