package arrayList;
import java.util.ArrayList;		//imported to access ArrayList
import java.util.ListIterator;	//imported to access ListIterator

public class accessElementsArrayList {

	public static void main(String[] args) {
		ArrayList<String> accessElmt = new ArrayList<>();
		
		accessElmt.add("Element [0]: One");
		accessElmt.add("Element [1]: Two");
		accessElmt.add("Element [2]: Three");
		
//		2 ways to access arraylist elements
/***********************************************************************************************/
//		1: Enhanced for loop method
/*		for(String element : accessElmt){	//code to access arraylist elements
			System.out.println(element);
		} */
/***********************************************************************************************/
//		2: ListIterator
		ListIterator<String> iterator = accessElmt.listIterator();	//get the iterator
		while(iterator.hasNext()){		//use hasNext() to check whether more elements exist
			System.out.println(iterator.next());		//use next() to get the next item from iterator
		}
/***********************************************************************************************/
		//Or you can just use this because unlike arrays, ArrayList implements the toString() method
		System.out.println(accessElmt);
		//This however outputs it like this: [Element [0]: One, Element [1]: Two, Element [2]: Three]
	}	
}
