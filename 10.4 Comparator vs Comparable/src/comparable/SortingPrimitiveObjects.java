package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * For sorting primitive objects, there is no need to implement the Comparable interface.
 */

public class SortingPrimitiveObjects {

	public static void main(String[] args) {
		// List of String
		List<String> string = new ArrayList<>();
		string.add("Yasin");
		string.add("Maria");
		string.add("Nadine");
		string.add("Camilia");

		// Before sorting String
		System.out.println("Before sorting string: ");
		for (String strings : string) {
			System.out.print(strings + " ");	// Yasin Maria Nadine Camilia 
		}

		// Sort the String objects
		Collections.sort(string);
		// Collections.sort(string, Collections.reverseOrder());		//To sort in descending order
		System.out.println("\n\nAfter sorting string: ");
		for (String strings : string) {
			System.out.print(strings + " ");	// Camilia Maria Nadine Yasin
		}
		
		//List of Integer
		List<Integer> integer = new ArrayList<>();
		integer.add(3);
		integer.add(1);
		integer.add(6);
		integer.add(2);
		
		System.out.println("\n\nBefore sorting Integer:");
		for(Integer num: integer) {
			System.out.print(num + " ");
		}
		
		//Sort integer
		Collections.sort(integer);
		// Collections.sort(integer, Collections.reverseOrder())		//To sort in descending order
		System.out.println("\n\nAfter sorting Integer:");
		for(Integer num: integer) {
			System.out.print(num + " ");
		}

	}

}
