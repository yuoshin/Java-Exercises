package comparator;

import java.util.*;

public class ComparatorClass {
	
	public static void main(String[] args) {
		List<Squirrel> obj = new ArrayList<>();
		obj.add(new Squirrel("Z"));
		obj.add(new Squirrel("B"));
		obj.add(new Squirrel("T"));
		
		System.out.println(obj);		//Before sorting
		
		//Comparator reference variable to sort list
		ChainingComparator compareObj = new ChainingComparator();			//using lambda
		//MultiFieldComparator compareObj = new MultiFieldComparator();		//not using lambda
		Collections.sort(obj,compareObj);
		
		System.out.println(obj);		//After sorting
	}

}

class Squirrel {
	private int weight;
	private String species;

	public Squirrel(String theSpecies) {
		if (theSpecies == null)
			throw new IllegalArgumentException();
		species = theSpecies;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	@Override
	public String toString() {
		return species;
	}
	
	
}

/*
 * Comparator to sort by species name using lambda. If two squirrels are from the species,
 * It will sort the one that weighs the least first.
 */
class ChainingComparator implements Comparator<Squirrel> {		//Type is squirrel as we're comparing squirrel
	public int compare(Squirrel s1, Squirrel s2) {
		Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
		c = c.thenComparingInt(s -> s.getWeight());
		return c.compare(s1, s2);
	}
}

// Comparator to sort by species name without using lambda
class MultiFieldComparator implements Comparator<Squirrel> {
	public int compare(Squirrel s1, Squirrel s2) {
		int result = s1.getSpecies().compareTo(s2.getSpecies());
		if (result != 0)
			return result;
		return s1.getWeight() - s2.getWeight();
	}
}