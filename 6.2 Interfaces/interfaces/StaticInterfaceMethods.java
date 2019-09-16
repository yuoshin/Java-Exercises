package interfaces;

public class StaticInterfaceMethods implements Hop {
	public void printDetails() {
		//System.out.println(getJumpHeight()); // DOES NOT COMPILE
		/* Without an explicit reference to the name of the interface the code will not compile, even though Bunny implements Hop */
		System.out.println(Hop.getJumpHeight()); // WILL COMPILE
	}
}

interface Hop {
	static int getJumpHeight() {
		return 8;
	}
}