package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//To sort generic type objects, need to implement Comparable and override the compareTo() method
//This is the Comparable interface
/*	
 * public interface Comparable<T> {
 * 		public int compareTo(T o);
 * }
 */
public class SortingGenericObjectsString implements Comparable<SortingGenericObjectsString> {

	private String name;

	public SortingGenericObjectsString(String name) {
		this.name = name;
	}

	public String toString() { // To use readable output
		return name;
	}
	
	//Override Comparable's compareTo method
	public int compareTo(SortingGenericObjectsString d) {
		return name.compareTo(d.name); // call String's compareTo which compares and sorts the strings accordingly
		//return d.name.compareTo(name);	//Sort in descending order
	}

	public static void main(String[] args) {
		List<SortingGenericObjectsString> name = new ArrayList<>();	//Type is generic

		// List of name objects
		name.add(new SortingGenericObjectsString("Yasin"));
		name.add(new SortingGenericObjectsString("Maria"));
		name.add(new SortingGenericObjectsString("Nadine"));
		name.add(new SortingGenericObjectsString("Camilia"));

		// Before sorting
		System.out.println("Before sorting: ");
		for (SortingGenericObjectsString obj : name) {
			System.out.print(obj + " "); // Yasin Maria Nadine Camilia
		}

		Collections.sort(name);
		System.out.println("\n\nAfter sorting: ");
		for (SortingGenericObjectsString obj : name) {
			System.out.print(obj + " "); // Camilia Maria Nadine Yasin
		}

	}

}
