package basicTryCatch;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int[] arr = { 1, 2 };
			System.out.println("Here it is: " + arr[2]); // Output: "Not valid" as invalid array index
			// System.out.println("Here it is: " + arr[1]); //Output: Here it is: 2

		} catch (Exception E) {
			System.out.println("Not valid");
		}
	}

}
