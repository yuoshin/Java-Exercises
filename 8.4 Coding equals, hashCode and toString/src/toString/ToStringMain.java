package toString;

public class ToStringMain {
	private String name;
	private double weight;

	public ToStringMain(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	/*@Override
	public String toString() {
		// return name;
		return "Name: " + name + " Weight: " + weight;
	}*/

	public static void main(String[] args) {
		ToStringMain newObj = new ToStringMain("Yasin", 75.5);
		System.out.println(newObj); // prints Name: Yasin Weight: 75.5
		//if toString method is not overridden, output will be toString.ToStringMain@10dea4e

	}

}
