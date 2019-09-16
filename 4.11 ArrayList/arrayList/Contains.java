package arrayList;

import java.util.ArrayList;

/* The contains() method checks whether a certain value is in the ArrayList and returns true 
 * if the list contains the specified element.
 */
public class Contains {

	public static void main(String[] args) {
		ArrayList<String> containsObj = new ArrayList<>();
		containsObj.add("Yasin");
		containsObj.add("Nadine");
		System.out.println(containsObj.contains("Maria"));	//prints false
		System.out.println(containsObj.contains("Yasin"));	//prints true
	}

}
