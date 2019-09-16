package primitivesToMethods;

public class primitiveToMethods {

	int primitiveVar;
	void varToMethod(int a) {
		a = a + 10;
		System.out.println("Value of primitive to method = " + a);
	}

	public static void main(String[] args) {

		primitiveToMethods obj = new primitiveToMethods();

		System.out.println("Value of primitive variable before passing to method: " + obj.primitiveVar);
		obj.varToMethod(obj.primitiveVar);
		/*
		 * When you pass a primitive variable to a method, its value remains the same
		 * after the execution of the method. The value doesn’t change, regardless of
		 * whether the method reassigns the primitive to another variable or modifies
		 * it.
		 */
		System.out.println("Value of primitive variable after passing to method: " + obj.primitiveVar);

	}

}