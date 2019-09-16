package zooKeeper;

public class ZooKeeper {
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("goat");
		food.consumed();
	}
}

class FoodFactory {
	public static Food getFood(String animalName) {
		switch (animalName) {
		case "zebra":
			return new Hay(100);
		case "rabbit":
			return new Pellets(5);
		case "goat":
			return new Pellets(30);
		case "polar bear":
			return new Fish(10);
		}
		// throw an exception if no matching subclass could be found
		throw new UnsupportedOperationException("Unsupported animal: " + animalName);
	}
}

abstract class Food { // parent abstract class
	private int quantity;

	Food(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public abstract void consumed(); // parent abstract method
}

class Hay extends Food {
	Hay(int quantity) {
		super(quantity); // calls parent constructor
	}

	public void consumed() { // implement parent abstract method
		System.out.println("Hay eaten: " + getQuantity());
	}
}

class Pellets extends Food {
	Pellets(int quantity) {
		super(quantity); // calls parent constructor
	}

	public void consumed() { // implement parent abstract method
		System.out.println("Pellets eaten: " + getQuantity());
	}
}

class Fish extends Food {
	Fish(int quantity) {
		super(quantity); // calls parent constructor
	}

	public void consumed() { // implement parent abstract method
		System.out.println("Fish eaten: " + getQuantity());
	}
}