package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInnerClass {

	public static void main(String[] args) {
		// Anonymous inner class overrides compare() method
		Comparator<Duck> byName = new Comparator<Duck>() {
			@Override
			public int compare(Duck o1, Duck o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		// Anonymous inner class overrides compare() method
		Comparator<Duck> byWeight = new Comparator<Duck>() {
			@Override
			public int compare(Duck o1, Duck o2) {
				return o1.getWeight() - o2.getWeight();
			}
		};

		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Yasin", 21));
		ducks.add(new Duck("Maria", 20));
		ducks.add(new Duck("Nadine", 4));
		ducks.add(new Duck("Camilia", 10));

		// Before sorting
		System.out.println(ducks); // [Yasin, Maria, Nadine, Camilia]

		// Sort by name
		Collections.sort(ducks, byName); // Sort by name
		System.out.println(ducks); // [Camilia, Maria, Nadine, Yasin]

		// Sort by weight
		Collections.sort(ducks, byWeight); // Sort by weight
		System.out.println(ducks); // [Nadine, Camilia, Maria, Yasin]
	}
}

class Duck {
	private String name;
	private int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return name;
	}
}