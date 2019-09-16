package localInnerClass;

/*
 * A local inner class is a nested class defined within a method. Like local variables, a local
 * inner class declaration does not exist until the method is invoked, and it goes out of scope
 * when the method returns
 */

public class LocalInnerMain {
	private int length = 2;		//private instance variable
	
	public void calculate() {
		final int width = 5;	//final local variable
		class InnerClass{		//local inner class
			public void multiply() {
				System.out.println(length * width);
			}
		}
		InnerClass innerObj = new InnerClass();	//Create obj of inner class
		innerObj.multiply();	//call multiply method
	}

	public static void main(String[] args) {
		LocalInnerMain outerObj = new LocalInnerMain();	//create obj of outer class
		outerObj.calculate();	//call calculate method from outer class
	}

}
