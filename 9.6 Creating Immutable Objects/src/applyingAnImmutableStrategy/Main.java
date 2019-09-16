package applyingAnImmutableStrategy;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Use a constructor to set all properties of the object.
 * 2. Mark all of the instance variables private and final.
 * 3. Don’t define any setter methods.
 * 4. Don’t allow referenced mutable objects to be modified or accessed directly.
 * 5. Prevent methods from being overridden.
 * 		- Mark the class or methods final
 * 		- Mark the constructor private and apply the factory pattern
 */

public class Main {
	public static void main(String[] args) {
	}
}

/*	The class below is mutable because of the getFavouriteFoods() method.
 * 	Even though they can’t change the List object to which it points, 
 * 	they can replace, remove, sort or delete  all of the items by calling getFavoriteFoods().clear()

 * 	final class Animal {
		private final List<String> favoriteFoods;
		public Animal(List<String> favoriteFoods) {
			if(favoriteFoods == null) {
				throw new RuntimeException("favoriteFoods is required");
			}
			this.favoriteFoods = new ArrayList<String>(favoriteFoods);
		}
		public List<String> getFavoriteFoods() { // MAKES CLASS MUTABLE!
		return favoriteFoods;
		}
	}
 */

/*	The class below is a better example.
 * 	The class does contain a mutable object, List, but no references to the object are 
 * 	publicly available. We provide two methods for retrieving the total number of favorite 
 * 	foods as well as a method to retrieve a food based on an index value
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