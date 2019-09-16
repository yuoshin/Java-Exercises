package thiskeyword;

public class UsingThisToAccessConstructors {
	Employee2 newObj = new Employee2();
}

class Employee2 {
	String name;
	String address; // Instance variables are name and address

	Employee2(String name) { // Constructor that accepts only name
		this.name = name;
	}

	Employee2(String name, String address) { // Constructor that accepts name and address
		this(name); // Calls constructor that accepts only name
		this.address = address;
	}

	Employee2() { // default constructor
		name = "NoName";
		address = "NoAddress";
	}

	Employee2(String name, String address, int id) {
		this(); // Calls default constructor. Must be first statement in method
		if (name != null) { // Assigns value of not null method parameters
			this.name = name;
			if (address != null) // Assigns value of not null method parameters
				this.address = address;
		}
	}
}