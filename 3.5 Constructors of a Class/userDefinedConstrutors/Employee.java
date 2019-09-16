package userDefinedConstrutors;

public class Employee {
	
	int age;
	String name;
	
	Employee(int newAge, String newName){ 	//Because a constructor is a method, you can also pass method 
		age = newAge;						//parameters to it
		name = newName;
		System.out.println("Notice that this sentence is displayed first instead of the age and name although\n"
				+ "the call is for age and name and in the constructor the age and name"
				+ "is defined first. This is\n"
				+ "because, a constructor is called as soon as an object is created,");
	}

}
