package arrayList;
import java.util.ArrayList;

/*	There are 2 ways to remove elements from an ArrayList:
 *		1. remove(int index)
 *		2. remove(Object o)
 *
 * 	Method number 2 is pretty confusing therefore I will be skipping it
 */

public class deletingElements {
	public static void main(String args[]){
/*		ArrayList<StringBuilder> deleteElement = new ArrayList<>();
		
		StringBuilder element1 = new StringBuilder("One");
		StringBuilder element2 = new StringBuilder("Two");
		StringBuilder element3 = new StringBuilder("Three");
		StringBuilder element4 = new StringBuilder("Four");
		
		deleteElement.add(element1);
		deleteElement.add(element2);
		deleteElement.add(element3);
		deleteElement.add(element4);
		
		System.out.println("Before removing elements:");
		for(StringBuilder element : deleteElement){
			System.out.println(element);
		}
		
		deleteElement.remove(1);		//able to remove using index
		deleteElement.remove(element4);	//also able to use using object name
		
		System.out.println();
		System.out.println("After removing elements:");
		for(StringBuilder element : deleteElement){
			System.out.println(element);
		}*/
/*********************************************************************************************/
		
		ArrayList<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
/*6*/	System.out.println(birds.remove("cardinal")); // prints false
/*7*/	System.out.println(birds.remove("hawk")); // prints true
/*8*/	System.out.println(birds.remove(0)); // prints hawk
/*9*/	System.out.println(birds); // prints []
		
/* Line 6 tries to remove an element that is not in birds. It returns false because no such element is found. 
 * Line 7 tries to remove an element that is in birds and so returns true. Notice that it removes only one match. 
 * Line 8 removes the element at index 0, which is the last remaining element in the ArrayList. 
 * Since calling remove() with an int uses the index, an index that doesn’t exist will throw an exception. 
 * For example, birds.remove(100) throws an IndexOutOfBoundsException.
 */
		
		
	}

}
