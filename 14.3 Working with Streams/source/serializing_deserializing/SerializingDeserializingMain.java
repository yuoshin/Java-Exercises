package serializing_deserializing;

import java.io.*;
import java.util.*;

class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private char type;

	public Animal(String name, int age, char type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getType() {
		return type;
	}

	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
}

public class SerializingDeserializingMain {
	/* A little more complex, as we must take special care to deserialize the objects from disk.
	 * Check the notes of this method in Java Notes */
	public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
		List<Animal> animals = new ArrayList<Animal>();
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
			while (true) {
				Object object = in.readObject();
				if (object instanceof Animal)
					animals.add((Animal) object);
			}
		} catch (EOFException e) {
			// File end reached
		}
		return animals;
	}
	
	/* straightforward since we are just iterating over the List object and serializing each Animal object to 
		disk using the writeObject() method. */
	public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			for (Animal animal : animals)
				out.writeObject(animal);
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Tommy Tiger", 5, 'T'));
		animals.add(new Animal("Peter Penguin", 8, 'P'));
		File dataFile = new File("animal.data");	//file created in 14.3 Working with Streams folder
		createAnimalsFile(animals, dataFile);
		System.out.println(getAnimals(dataFile));
	}
}
