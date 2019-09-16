package thiskeyword;

/* 
 * The 'this' reference always points to an object's own instance. Any object can use the 
 * 'this' reference to refer to its own instance.
 */

public class UsingThisToAccessVariablesAndMethods {

}

class Employee {
	String name;
}

class Programmer extends Employee {
	void accessEmployeeVariables() {
		name = "Programmer";
		this.name = "Programmer";	// or it can be accessed like this
	}
}
