package encapsulatingData;

/* Requirements:
 * Each animal has a non‐null , non‐empty species field
 * Each animal has an age field that is greater than or equal to zero
 */

/* Advantage:
 * The advantage of this implementation of the Animal class is that it uses encapsulation
 * to enforce the design principles of the class. Anytime an instance of an Animal object is
 * passed to a method, it can be used without requiring that its invariants be validated.
 */

public class Main {

	private String species;
	private int age;

	public Main(String species) { // constructor that calls setter method
		this.setSpecies(species);
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		if (species == null || species.trim().length() == 0) {
			throw new IllegalArgumentException("Species is required");
		}
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be a negative number");
		}
		this.age = age;
	}

}
