package polymorphism;

public class PolymorphismWithInterfaces {

	public static void main(String[] args) {
		//Reference type for the 2 objects below is the 
		MobileAppExpert expert1 = new Programmer3();	//Ref var interface MobileAppExpert
		MobileAppExpert expert2 = new Manager3();		//Ref var interface MobileAppExpert
		expert1.deliverMobileApp();		//prints Testing complete on real device
		expert2.deliverMobileApp();		//prints QA complete Code delivered with release not

	}
}

interface MobileAppExpert{
	void deliverMobileApp();		//abstract method in interface. implicitly public
}

class Employee3 {}

class Programmer3 extends Employee3 implements MobileAppExpert {
	public void deliverMobileApp() {
		System.out.println("Testing complete on real device");
	}
}

class Manager3 extends Employee3 implements MobileAppExpert {
	public void deliverMobileApp() {
		System.out.println("QA complete");
		System.out.println("Code delivered with release notes");
	}
}