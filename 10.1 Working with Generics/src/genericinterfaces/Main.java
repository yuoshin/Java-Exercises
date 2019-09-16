package genericinterfaces;



public class Main {

	public static void main(String[] args) {
	}
}

class Robot{
	
}

//There are 3 ways a class can approach implementing this generic interface.
interface Shippable<T> {
	void ship(T t);
}

//1: Specify the generic type in the class
class ShippableRobotCrate implements Shippable<Robot> {
	public void ship(Robot t) { }
}

//2: Create a generic class
class ShippableAbstractCrate<U> implements Shippable<U> {
	public void ship(U t) { }
}

/*3: Don't use generics at all. This is the old way of writing code. It generates a compiler warning
 * about Shippable being a raw type, but it does compile.*/
class ShippableCrate implements Shippable {		//No generic type
	public void ship(Object t) { }				//Object type as generic not defined
}