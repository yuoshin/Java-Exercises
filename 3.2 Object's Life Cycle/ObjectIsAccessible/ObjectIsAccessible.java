package ObjectIsAccessible;

public class ObjectIsAccessible {
	
	public void setName(String examName){
		String newName = examName;
		System.out.println("Exam name is " + newName);

}

	public static void main(String[] args) {
		
	/*	ObjectIsAccessible myExam;	//Declaring a reference variable of type ObjectMain
	 * 	new ObjectIsAccessible();	//an unreferenced object	 
	 */
		ObjectIsAccessible myExam = new ObjectIsAccessible();	//object created
		myExam.setName("OCA Java Programmer 1");	//access method
		myExam = null;		//reference variable set to null
		myExam = new ObjectIsAccessible();	//new objject created
		myExam.setName("PHP");		//access method
		
		}

}
