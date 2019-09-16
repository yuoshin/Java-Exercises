package usingTheBuilderPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//class is mutable but build method will mimmutable
public class AnimalBuilder {
	
	private String species;
	private int age;
	private List<String> favouriteFoods;
	
	public AnimalBuilder setSpecies(String species) {	//setter returns this
		this.species = species;
		return this;
	}

	public AnimalBuilder setAge(int age) {				//setter returns this
		this.age = age;
		return this;
	}

	public AnimalBuilder setFavouriteFoods(List<String> favouriteFoods) {	//setter returns this
		this.favouriteFoods = favouriteFoods;
		return this;
	}
	
	public Animal build() {		////Build method with Animal type. Result will be immutable object
		return new Animal(species, age, favouriteFoods);
	}


	public static void main(String[] args) {
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder.setAge(4).setFavouriteFoods(Arrays.asList("grass","fish")).setSpecies("duck");
		Animal duck = duckBuilder.build();
		
		Animal flamingo = new AnimalBuilder()	
		.setFavouriteFoods(Arrays.asList("algae","insects")).setSpecies("flamingo").build();	//flamingo instance not even used

	}

}

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