package superKeyword;

public class UsingSuperToAccessConstructorsOfBaseClass {

	public static void main(String[] args) {
		//Employee2 obj1 = new Employee2("Rahmat", "Khatib");
		Programmer2 obj2 = new Programmer2("Yasin", "Yishun", "Java");
		
	}

}

class Employee2 {
	String name;		//Instance variables name and address
	String address;
	Employee2(String name, String address) {		//Base class constructor
		this.name = name;
		this.address = address;
	}
}
class Programmer2 extends Employee2 {
	String progLanguage;		//instance variable progLanguage
	//Constructor that accepts values for superclass variables too
	Programmer2(String name, String address, String progLang) {
		super(name, address);			//calls parent class, Employee constructor
		this.progLanguage = progLang;
	}
}