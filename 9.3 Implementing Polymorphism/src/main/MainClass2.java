package main;

class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	public boolean isTailStriped();
}

public class MainClass2 extends Primate implements HasTail {
	public int age = 10;

	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		MainClass2 lemur = new MainClass2();
		System.out.println(lemur.age);	//prints 10
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());	//prints false
		Primate primate = lemur;
		System.out.println(primate.hasHair());	//prints true
	}
}

/*
 * The most important thing to note about this example is that only one object, MainClass2, is
created and referenced. The ability of the MainClass2 object to be passed as an instance of an
interface it implements, HasTail, as well as an instance of one of its superclasses, Primate,
is the nature of polymorphism.
 */

/*
  	HasTail hasTail = lemur;
	System.out.println(hasTail.age); // DOES NOT COMPILE
	Primate primate = lemur;
	System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
	
	In this example, the reference hasTail and primate has direct access only to methods defined with
	the HasTail interface and Primate class;
 */


