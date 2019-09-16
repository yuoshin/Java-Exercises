package polymorphism;
/* 
 * With inheritance, the instance variables bind at compile time and the methods bind at runtime
 */
public class BindingOfVariablesAtCompileTimeAndRuntime {

	public static void main(String[] args) {
		Employee2 emp = new Employee2();			//Parent ref, parent obj
		Employee2 programmer = new Programmer2();	//Parent ref, child obj
		System.out.println(emp.name);			//prints Employee
		System.out.println(programmer.name);	//Prints Employee ref var is parent class (Employee2)
		emp.printName();						//Prints Employee
		programmer.printName();					//This should print Employee but its Programmer 
		/*
		 * Even though the method printName is called using a reference of type Employee, the JRE is 
		 * aware that the method is invoked on a Programmer object and hence executes the overridden 
		 * printName method in the class Programmer because, With inheritance, the instance variables bind at 
		 * compile time and the methods bind at runtime
		 */
	}
}

class Employee2 {
	String name = "Employee";
	void printName() {
		System.out.println(name);
	}
}

class Programmer2 extends Employee2 {
	String name = "Programmer";
	void printName() {
		System.out.println(name);
	}
	
	void newMethod() {
		System.out.println("New method");
	}
}