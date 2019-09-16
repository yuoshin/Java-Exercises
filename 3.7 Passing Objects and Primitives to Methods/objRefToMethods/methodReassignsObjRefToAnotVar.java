package objRefToMethods;

class Person {
	private String name;

	Person(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setName(String val) {
		name = val;
	}
}

public class methodReassignsObjRefToAnotVar {
	public static void swap(Person p1, Person p2) {
		Person temp = p1;
		p1 = p2;
		p2 = temp;
	}

	public static void main(String args[]) {
		Person person1 = new Person("John"); // creates two object references, person1 and person2
		Person person2 = new Person("Paul");
		System.out.println(person1.getName() + ":" + person2.getName());

		swap(person1, person2);
		/*
		 * The code calls the method swap and passes to it the objects referred to by
		 * person1 and person2. When these objects are passed as arguments to the method
		 * swap, the method arguments p1 and p2 also refer to these objects. The method
		 * swap defines three lines of code: Person temp = p1; makes temp refer to the
		 * object referred to by p1. p1 = p2; makes p1 refer to the object referred to
		 * by p2. p2 = temp; makes p2 refer to the object referred to by temp.
		 */
		/*
		 * The reference variables person1 and person2 are still referring to the
		 * objects that they passed to the method swap. Because no change was made to
		 * the values of the objects referred to by variables person1 and person2, it
		 * prints John:Paul again.
		 */
		System.out.println(person1.getName() + ":" + person2.getName());
		// methodModifiesStateOfObjRef newObj = new methodModifiesStateOfObjRef();
	}
}