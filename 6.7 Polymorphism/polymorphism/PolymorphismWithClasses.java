package polymorphism;

public class PolymorphismWithClasses {

	public static void main(String[] args) {
		Employee empProg = new Programmer();
		Employee empMgr = new Manager();
		empProg.reachOffice();			//prints Reached office
		empMgr.reachOffice();			//prints Reached office
		empProg.startProjectWork();		//Define classes Unit test code
		empMgr.startProjectWork();		//Meet Customer Project Schedule Team work starts
	}
}

abstract class Employee { 		// abstract base class
	public void reachOffice() {
		System.out.println("Reached office ");
	}

	public abstract void startProjectWork(); 	// abstract method
}

class Programmer extends Employee { 	//Derived class, Programmer
	public void startProjectWork() {	//abstract method from parent class overridden and implemented in child
		defineClasses();
		unitTestCode();
	}

	private void defineClasses() {
		System.out.println("Define classes");
	}

	private void unitTestCode() {
		System.out.println("Unit test code");
	}
}

class Manager extends Employee { 		//Derived class, Manager
	public void startProjectWork() {	//abstract method from parent class overridden and implemented in child
		meetingWithCustomer();
		defineProjectSchedule();
		assignRespToTeam();
	}

	private void meetingWithCustomer() {
		System.out.println("Meet Customer");
	}

	private void defineProjectSchedule() {
		System.out.println("Project Schedule");
	}

	private void assignRespToTeam() {
		System.out.println("Team work starts");
	}
}