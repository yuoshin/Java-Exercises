package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingGenericObjectsInt implements Comparable<SortingGenericObjectsInt>{
	private int id;

	@Override //toString override method for int values. Needs to return a string therefore here's the hack
	public String toString() {
		return "" + id;
	}
	
	@Override
	public int compareTo(SortingGenericObjectsInt a) {
		return id-a.id;		//For ascending/normal order
		//return a.id-id;		//For descending/reverse order
	}

	// Contructor
	public SortingGenericObjectsInt(int id) {
		this.id = id;
	}

	public static void main(String[] args) {

		List<SortingGenericObjectsInt> intObject = new ArrayList<>();	//Type is generic
		intObject.add(new SortingGenericObjectsInt(10));
		intObject.add(new SortingGenericObjectsInt(4));
		intObject.add(new SortingGenericObjectsInt(13));
		intObject.add(new SortingGenericObjectsInt(2));

		System.out.println("Before sorting intObject:");
		for (SortingGenericObjectsInt num : intObject) {
			System.out.print(num + " ");	// 10 4 13 2 
		}

		// Sort objects
		Collections.sort(intObject);
		System.out.println("\n\nAfter sorting intObject:");
		for (SortingGenericObjectsInt num : intObject) {
			System.out.print(num + " ");	// 2 4 10 13 
		}

	}

}
