package workingWithAssertions;

public class AssertionsMain {

	public static void main(String[] args) {
		int numOfPeople = -5;
		assert numOfPeople > 0;
		//assert numOfPeople > 0: "Assertion error";	//Alternate way of writing with string message
		System.out.println(numOfPeople);	
		//If assertions is not enabled, the program will still print -5
	}
}