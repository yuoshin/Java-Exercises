package defaultConstructor;

class defaultConstructor{
	int age;
	String name;
	/*The following is the default constructor created by Java:
	 * 
	 * 	defaultConstructor(){
	 * 		super();
	 * 		age = 0;
	 * 		name = null;
	 * 	}
	 */
}

public class defaultMain {

	public static void main(String[] args) {
		
		defaultConstructor obj = new defaultConstructor();	
		/*In the absence of a user-defined constructor, Java inserts a default constructor. This
		 * constructor doesn’t accept any method arguments. It calls the constructor of the
		 * super (parent) class and assigns default values to all the instance variables.*/

	}

}
