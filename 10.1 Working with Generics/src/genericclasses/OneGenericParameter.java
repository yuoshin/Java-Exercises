package genericclasses;

/*
 * Don’t worry if you can’t think of a use for generic classes of your own. 
 * Unless you are writing a library for others to reuse, generics hardly show up in the class definitions you write. 
 * They do show up frequently in the code you call, such as the Java Collections Framework
 */
/*
 * Generic classes become useful when the classes used as the type parameter can have absolutely nothing to do with each other
 */


public class OneGenericParameter {
	public static void main(String[] args) {
		Elephant elephantObj =  new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(elephantObj);
		Elephant inNewHone = crateForElephant.emptyCrate();
	}
}

//Declare a formal type parameter in angle brackets to introduce generics in your class
class Crate<T> {	//When you instantiate the class, you tell the compiler what T should be for that particular instance
	private T contents;

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
	this.contents=contents;
	System.out.println("Packed");
	}
}

class Elephant{
	private int weight;
}