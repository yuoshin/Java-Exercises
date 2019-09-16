package modifyingAnImmutableObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * We can’t modify an immutable object however we can create new immutable objects that contain all of the same 
 * information as the original object plus whatever we wanted to change
 */

public class Main {

	public static void main(String[] args) {
		Animal lion = new Animal("Lion",20,Arrays.asList("chicken","cow"));
		
		// Create a new Animal instance using data from the first instance
		List<String> favoriteFoods = new ArrayList<String>();
		for(int i=0; i<lion.getFavouriteFoodsCount(); i++) {
			favoriteFoods.add(lion.getFavouriteFoods(i));
		}
		
		//Copy results to new reference variable
		Animal updatedLion = new Animal(lion.getSpecies(), lion.getAge()+1, favoriteFoods);

	}

}


/*
 * class Animal copied from the applyingAnImmutableStrategy package
 */
final class Animal {	//final class
	private final String species;		//private and final instance variables
	private final int age;
	private final List<String> favouriteFoods;

	public Animal(String species, int age, List<String> favouriteFoods) {
		this.species = species;
		this.age = age;
		if (favouriteFoods == null) {
			throw new RuntimeException("Favourite food is required.");
		} else
			this.favouriteFoods = new ArrayList<String>(favouriteFoods);
		// this.favouriteFoods = favouriteFoods; /* the caller that creates the object
		// is using the same reference as the immutable object, which means that it has the
		// ability to change the List. It is important when creating immutable objects that any 
		// mutable input arguments are copied to the instance instead of being used directly.
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}

	public int getFavouriteFoodsCount() {
		return favouriteFoods.size();
	}

	public String getFavouriteFoods(int index) {
		return favouriteFoods.get(index);
	}
}