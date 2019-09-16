package refVarAndObjTypes;

public class Main {

	public static void main(String[] args) {
		Manager ManagerObj = new Manager(); // Manager ref var, Manager object
		ManagerObj.conductInterview(); // prints Interviewer: Manager conducting interview.

		HRExecutive HRobj = new HRExecutive(); // HRExecutive ref vat, HRExecutive object
		HRobj.conductInterview(); // prints Interviewer: HR Executive conducting interview.

		Employee ManagerObj2 = new Manager(); // Employee ref var, Manager object
		ManagerObj2.sayHello(); // prints Hello
		// ManagerObj2.conductInterview(); //Error as ref var points to parent class.
		// can only access parent methods

		Employee HRobj2 = new HRExecutive(); // Employee ref vat, HRExecutive object
		HRobj2.sayHello(); // prints Hello
		// HRobj2.conductInterview(); //Error as ref var points to parent class. can
		// only access parent methods

		/******************************************************************/
		/*
		 * Why do we need a reference variable of a base class or an implemented
		 * interface to access an object of a derived class if a variable can’t access
		 * all the members that are available to an object of a derived class? Why don't
		 * we just create a reference variable of the derived class /* This arrangement
		 * also makes it possible to create an array or list of the objects that refers
		 * to different types of objects grouped by a common base class or an interface.
		 */

		// Array of interviewers reference variables created. NOT OBJECTS
		Interviewer[] inter = new Interviewer[2];

		// Because Manager implements interface Interviewer, inter[0] can reference
		// Manager object
		inter[0] = new Manager();
		// Because HRExecutive implements the interface Interviewer, inter[1] can
		// reference HRExecutive object
		inter[1] = new HRExecutive();

		for (Interviewer i : inter) {
			i.conductInterview();
			// prints Interviewer: Manager conducting interview.
			// prints Interviewer: HR Executive conducting interview.
		}
	}
}

// Employee class is parent
// Interviewer interface is parent
// Manager class is child class
// HRExecutive class is child class

class Employee {
	String name;
	String phoneNumber;
	int age;

	void sayHello() {
		System.out.println("Hello");
	}
}

interface Interviewer {
	String type = "Interviewer: "; // Variables in interfaces are constants so must be defined
	void conductInterview(); // Members of interface are all implicitly public

}

class Manager extends Employee implements Interviewer {

	public void conductInterview() { // must declare this method as public
		name = "Manager"; // Variable name from Employee class defined in this method
		System.out.println(type + name + " conducting interview."); // Interviewer: Manager conducting interview.
	}
}

class HRExecutive extends Employee implements Interviewer {
	public void conductInterview() { // must declare this method as public
		name = "HR Executive"; // Variable name from Employee class defined in this method
		System.out.println(type + name + " conducting interview."); // Interviewer: HR Executive conducting interview.
	}
}