package FuncProg;

public class FuncProgMain {

	public static void main(String[] args) {
		Tiger newObj = new Tiger();
		newObj.sprint("Cheetah");
	}
}

//Tiger class is a valid class that implements the interface
class Tiger implements Sprint {
	public void sprint(String animal) {
		System.out.println("Animal is sprinting fast! " + animal.toString());
	}
}

//Sprint interface is functional interface as it contains exactly one abstract method
@FunctionalInterface
interface Sprint {
	public void sprint(String animal);
}

//Valid functional interface as it extends Sprint which has only 1 abstract class
interface Run extends Sprint {}

//Valid functional interface as it overrides the abstract class so it only has 1 abstract class still
interface SprintFaster extends Sprint {
	public void sprint(String animal);
}

//Valid functional interface as it extends Sprint and the methods below are default and static,
//making the interface still a functional interface as it still contains only 1 abstract method.
interface Skip extends Sprint {
	public default int getHopCount(String kangaroo) {
		return 10;
	}
	public static void skip(int speed) {
	}
}

/* The first interface, Run, defines no
new methods, but since it extends Sprint, which defines a single abstract method, it is also
a functional interface. The second interface, SprintFaster, extends Sprint and defines
an abstract method, but this is an override of the parent sprint() method; therefore, the
resulting interface has only one abstract method, and it is considered a functional interface.
The third interface, Skip, extends Sprint and defines a static method and a default
method, each with an implementation. Since neither of these methods is abstract, the resulting
interface has only one abstract method and is a functional interface.
*/