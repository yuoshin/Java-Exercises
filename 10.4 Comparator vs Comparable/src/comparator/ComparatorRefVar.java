package comparator;

import java.util.*;

public class ComparatorRefVar {

	static class Rabbit { 		// static inner class
		int id;

		Rabbit(int id) { 		// Constructor
			this.id = id;
		}

		@Override 				// For readable output
		public String toString() {
			return "" + id;
		}
	}

	public static void main(String[] args) {
		List<Rabbit> rabbitObj = new ArrayList<>();
		rabbitObj.add(new Rabbit(4));
		rabbitObj.add(new Rabbit(8));
		rabbitObj.add(new Rabbit(3));
		rabbitObj.add(new Rabbit(1));
		Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;	// Comparator reference variable c added so list can be sorted

		/* Before sorting */	System.out.println("Before sorting:");	
		for (Rabbit a : rabbitObj) {
			System.out.print(a + " ");
		}

		Collections.sort(rabbitObj, c);

		/* After sorting */		System.out.println("\n\nAfter sorting:");
		for (Rabbit a : rabbitObj) {
			System.out.print(a + " ");
		}

	}

}
