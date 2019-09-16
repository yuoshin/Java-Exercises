package Scope;

/*Local variables are defined within a method.
 *They may or may not be defined within code
 *constructs such as if-else constructs, looping constructs, or switch statements.   
 */

public class Scope {

	int variableTest = 100; //
	static int variableStatic = 5000; // static variable created

	int methodTest() {
		int localVariable = 10; // this is a local variable
		return localVariable;
	};

}