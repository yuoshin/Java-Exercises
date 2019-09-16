package memberInnerClasses;

public class MemberInner {

	private String greeting = "Hello there!";

	//INNER CLASS
	class innerClass {
		 int repeat = 3;

		public void go() {
			System.out.println(greeting);	//Can use the instance variable in outer class
		}
	}
	
	public void callInner() {
		innerClass inner = new innerClass();
		inner.go();		//Call the method in innerClass
	}

	public static void main(String[] args) {
		MemberInner newObj = new MemberInner();		//Outer class obj
		newObj.callInner();
		
		//Another way to instantiate the inner class is
		/*MemberInner newObj2 = new MemberInner();
		innerClass innerObj = newObj2.new innerClass();		//creates the inner class
		innerObj.go();*/
		

	}

}
