package genericmethods;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

	}

/*
 * Unless a method is obtaining the generic formal type parameter from the class/interface, 
 * it is specified immediately before the return type of the method
 */
	
	public <T extends Animal> void takeThing(ArrayList<T> list) {}
/*
 * 	The code above is not the same as:
 * 		public void takeThing(ArrayList<Animal> list)
 * 
 * 	The first one, where <T extends Animal> is part of the method declaration, means that any ArrayList 
 * declared of a type that is Animal, or one of Animal’s subtypes (like Dog or Cat), is legal. 
 * So you could invoke the top method using an ArrayList<Dog>, ArrayList<Cat>, or ArrayList<Animal>.
 * But the one on the bottom, where the method argument is (ArrayList<Animal> list) means that only 
 * an ArrayList<Animal> is legal. In other words, it takes only an ArrayList of type Animal. Not 
 * ArrayList<Dog>, or ArrayList<Cat> but only ArrayList<Animal>.
 */

}

class Animal {

}