package interfaces;

/*	- Unlike a class, an interface can't define constructors.
*/
interface Trainable{
	int numberOfHours = 3;		
	//this is equivalent to "public static final int numberOfHours = 3"
	//The variables of an interface are implicitly public, final, and static 
	//therefore they must be initialized or the code won't compile.
	//An interface can only define constants. 
	void attendTraining();		//The methods of an interface are implicitly public.
	//public void attendTraining();
}

interface Interviewer{
	void conductInterview();	//The methods of an interface are implicitly public.
	//public void conductInterview();
}

class Employee{
	String name;
	String address;
	String phoneNumber;
	float yearsOfExperience;	
}

class Manager extends Employee implements Trainable, Interviewer{
	//The methods of an interface are implicitly public. When you implement an interface, you must 
	//implement all of its methods by using the access modifier public. A class that 
	//implements a method can't make the method any more restrictive.
	public void conductInterview(){	
		System.out.println("Manager - Conduct Interview");		
	}
/*	void conductInterview(){
 * 		System.out.println("Manager - Conduct Interview");		
 * 	}	//This wont compile. You cant assign stricter access (default) to public method conductInterview()
 */		//in class Manager
	public void attendTraining(){
		System.out.print("Manager - Attend Training");
	}
/*	void attendTraining(){
 *		System.out.print("Manager - Attend Training");
 *	}	//This wont compile. You cant assign stricter access (default) to public method attendTraining()
*/		//in class Manager
}

public class Interfaces {

	public static void main(String[] args) {
		Manager mgr = new Manager();
		mgr.conductInterview();
		mgr.attendTraining();
	}
}
