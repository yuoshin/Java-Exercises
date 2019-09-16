package casting;

public class CastingMain {

	public static void main(String[] args) {

		/*************** EXAMPLE 1 **************/
		Interviewer interviewerObj = new HRExecutive();
		/*
		 * interviewerObj.specialization = new String[] {"Staffing"}; This wont compile
		 * as refVar is parent class and Obj is child as per exercise in 6.3
		 */

		((HRExecutive) interviewerObj).specialization = new String[] { "Staffing" };
		((HRExecutive) interviewerObj).showSpecialization();
		// Both code above will compile after casting to child type HRExecutive

		/*************** EXAMPLE 2 **************/
		/*
		 * You can’t access all the members of an object if you access it using a
		 * reference variable of any of its implemented interfaces or of a base class.
		 * But if a need arises, you might choose to access some of the members of a
		 * derived class, which are not explicitly available, by using the reference
		 * variable of the base type or the implemented interface.
		 */
		// Array of Interviewer refVar created
		Interviewer[] interviewerArr = new Interviewer[2];
		interviewerArr[0] = new Manager(); // Store object of Manager at array 0
		interviewerArr[1] = new HRExecutive(); // Store object of HRExecutive at 1

		for (Interviewer i : interviewerArr) {
			if (i instanceof Manager) {
				int teamSize = ((Manager) i).teamSize;
				/*
				 * Code above can be translated to: If object interviewers referred to by
				 * interviewer is of class Manager, use casting to retrieve value for its
				 * teamSize
				 */
				if (teamSize > 10) {
					i.conductInterview();
				} else {
					System.out.println("Mgr can't " + "interview with team size less than 10");
				}
			} else if (i instanceof HRExecutive) {
				i.conductInterview();
			}
		}

	}
}

class Employee {

}

interface Interviewer {
	public void conductInterview();
}

class HRExecutive extends Employee implements Interviewer {
	String[] specialization;

	void showSpecialization() {
		for (int i = 0; i < specialization.length; i++) {
			System.out.println(specialization[i]);
		}
	}

	public void conductInterview() {
		System.out.println("HRExecutive - conducting interview");
	}
}

class Manager implements Interviewer {
	int teamSize;

	public void conductInterview() {
		System.out.println("Manager - conducting interview");
	}
}
