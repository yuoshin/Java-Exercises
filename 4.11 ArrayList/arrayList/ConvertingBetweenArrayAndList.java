package arrayList;

import java.util.ArrayList;
import java.util.*;

public class ConvertingBetweenArrayAndList {

	public static void main(String[] args) {
		//ARRAYLIST TO ARRAY
		ArrayList<String> obj = new ArrayList<>();
		obj.add("Yasin");
		obj.add("Maria");

		//String[] toArray = obj.toArray(new String[obj.size()]);
		String[] toArray = obj.toArray(new String[10]);
		/* The advantage of specifying a size of 0 for the parameter is that Java will create a 
		 * new array of the proper size for the return value. If you like, you can 
		 * suggest a larger array to be used instead. If the ArrayList fits in that array, 
		 * it will be returned. Otherwise, a new one will be created. */
		
		System.out.println(obj);	//prints [Yasin, Maria]
		System.out.println(toArray[0] + ", " + toArray[1] + ", " + toArray[2]);		//prints Yasin, Maria, null
		
/**********************************************************************************/
		//ARRAY TO LIST
		/* Converting from an array to a List is more interesting. The original array 
		 * and created array backed List are linked. When a change is made to one, it is 
		 * available in the other. It is a fixed-size list and is also known as backed List 
		 * because the array changes with it. Pay careful attention to the values here
		 */
		String[] array = {"hawk", "robin"};	//[hawk, robin]
		List<String> list = Arrays.asList(array);	 /* Converts the array to a List and returns fixed
		size list. Note that this  isn’t java.util.ArrayList. It is a fixed-size, backed version of a List */
		System.out.println(list.size()); // prints 2
		list.set(1, "test"); // [hawk, test]	//this updates both array and list because they point to the same data 
		array[0] = "new"; // [new, test]
		System.out.println(list);	//new test. changes to array affects List too because they point to the same data
		for (String b : array) {
			System.out.print(b + " "); // new test
		}
		//list.remove(1); // throws UnsupportedOperation Exception as List fixed size and is tied to array
	}
}