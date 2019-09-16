package superKeyword;

/* 
 * The variable reference super can be used to access a variable or method from the base class 
 * if there’s a clash between these names. This situation normally occurs when a derived class defines 
 * variables and methods with the same name as the base class.
 */

public class UsingSuperToAccessVariablesAndMethods {
	public static void main(String[] args) {
		Programmer programmer = new Programmer(); // Object creation
		programmer.setNames();
		programmer.printNames();	//prints Employee Programmer
	}
}

class Employee {
	String name; // Instance variable - name, in Employee
}

class Programmer extends Employee {
	String name; // instance variable - name, in Programmer

	void setNames() {
		this.name = "Programmer"; 	// Assign value to name in Programmer
		super.name = "Employee"; 	// Assign value to name in parent class Employee
	}

	void printNames() {
		System.out.println(super.name); // Print name in Employee
		System.out.println(this.name); // Print name in Programmer
	}
}

