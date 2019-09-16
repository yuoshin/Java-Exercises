package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HelperClassLamdbaMethodReference {

	public static void main(String[] args) {
		/*Comparator is a functional interface therefore the anonymous inner class(ComparatorInnerClass.java) can be re-written like this:*/
		//Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()-d2.getWeight();
		//Comparator<Duck> byWeight = (Duck d1, Duck d2) -> d1.getWeight()-d2.getWeight();
		//Comparator<Duck> byWeight = (d1, d2) -> { return d1.getWeight()-d2.getWeight(); };
		//Comparator<Duck> byWeight = (Duck d1, Duck d2) -> {return d1.getWeight()-d2.getWeight(); };
		
		/*If there is a helper class, can also re-write like this:*/
		Comparator<Duck2> byWeight = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
		Comparator<Duck2> byName = (d1, d2) -> DuckHelper.compareByName(d1, d2);
		//The line above can re-write using method reference like below
		//Comparator<Duck2> byWeight = DuckHelper::compareByWeight;
		//Comparator<Duck2> byName = DuckHelper::compareByName;
		// The :: operator tells Java to pass the parameters automatically into byWeight and byName
		
		List<Duck2> ducks = new ArrayList<>();
		ducks.add(new Duck2("Quack", 7));
		ducks.add(new Duck2("Puddles", 10));
		ducks.add(new Duck2("Alpha", 8));
		
		//Before sorting
		System.out.println("Before sorting: " + ducks);						// [Quack, Puddles, Alpha]
		
		//Sort by name
		Collections.sort(ducks, byName);									// Comparator Sort by name, ascending
		System.out.println("After sorting by name: " + ducks); 				// [Alpha, Puddles, Quack]
		
		//Sort by weight
		Collections.sort(ducks, byWeight);									// Sort by weight, ascending
		System.out.println("After sorting by weight: " + ducks); 			// [Quack, Alpha, Puddles]

	}

}

class Duck2 {
	private String name;
	private int weight;

	public Duck2(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override	//For readable output
	public String toString() {
		return name;
	}
}

//Helper class to compare by weight and name respectively
class DuckHelper {
	public static int compareByWeight(Duck2 d1,Duck2 d2) {
		return d1.getWeight()-d2.getWeight();
	}
	public static int compareByName(Duck2 d1, Duck2 d2) {
		return d1.getName().compareTo(d2.getName());
	}
}