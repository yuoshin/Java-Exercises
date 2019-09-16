package workingWithAssertions;

import java.io.IOException;

public class UsingAssertions {

	/** Class invariant example **/
	 /* You assert the validity of an object’s state. Class invariants are typically private methods within the 
	  * class that return a boolean */

	private int width;
	private int height;

	public UsingAssertions(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getArea() {
		assert isValid() : "Not a valid Rectangle"; // assertion statement here
		return width * height;
	}

	private boolean isValid() {		//class invariant
		return (width >= 0 && height >= 0);
	}

	public static void main(String[] args) {
		UsingAssertions one = new UsingAssertions(5, 12);
		UsingAssertions two = new UsingAssertions(-4, 10); // invalid values
		System.out.println("Area one = " + one.getArea());
		System.out.println("Area two = " + two.getArea());
	}
}