package objRefToMethods;

class Person2 {
	private String name;

	Person2(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setName(String val) {
		name = val;
	}
}

public class methodModifiesStateOfObjRef {
	public static void resetValueOfMemberVariable(Person2 p1) {
		p1.setName("Rodrigue");
	}

	public static void main(String args[]) {
		Person2 person1 = new Person2("John");
		System.out.println(person1.getName());

		resetValueOfMemberVariable(person1);
		/*
		 * The method resetValueOfMemberVariable accepts the object referred to
		 * by person1 and assigns it to the method parameter p1. Now both the
		 * variables person1 and p1 refer to the same object.
		 * p1.setName("Rodrigue") modifies the value of the object referred to
		 * by variable p1. Because the variable person1 also refers to the same
		 * object, person1.getName() returns the new name, Rodrigue, in the
		 * method main.
		 */
		System.out.println(person1.getName());
	}
}