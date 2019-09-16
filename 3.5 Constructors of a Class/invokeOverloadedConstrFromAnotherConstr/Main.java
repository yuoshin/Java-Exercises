package invokeOverloadedConstrFromAnotherConstr;

class invoke{
	String name;
	int age;
	
	invoke(){
		this("Yasin", 0);	//this will invoke the constructor below. must be first statement here
	}
	
/*	invoke(){				//this wont compile as recursions dont work on constructors
 * 		invoke("Yasin", 0);
 * 	}
 * 	A method calling itself is called recursion. Two or more methods calling each other, 
 * 	in a circular manner, is called circular method calling. The Java compiler won’t compile 
 * 	code with recursive or circular constructors. A constructor is used to initialize an 
 * 	object, so it doesn’t make sense to allow recursive calls to a constructor. You can 
 * 	initialize an object once and then modify it. You can’t initialize an object multiple times.
 */
		
	invoke(String newName, int newAge){
		name = newName;
		age = newAge;
		System.out.println(name + " " + age);
	}
}

public class Main {

	public static void main(String[] args) {
		invoke obj = new invoke();

	}

}
