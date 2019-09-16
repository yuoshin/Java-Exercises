package main;

public class MainClass {
	//checkSound method below can accept any object whose class implements the LivesInOcean interface.
	public void checkSound(LivesInOcean animal) {
		animal.makeSound();
	}

	public static void main(String[] args) {
		MainClass obj = new MainClass();
		obj.checkSound(new Dolphin());		//prints whistle
		obj.checkSound(new Whale());		//prints sing
	}
}

interface LivesInOcean {
	public void makeSound();
}

class Dolphin implements LivesInOcean {
	public void makeSound() {
		System.out.println("whistle");
	}
}

class Whale implements LivesInOcean {
	public void makeSound() {
		System.out.println("sing");
	}
}