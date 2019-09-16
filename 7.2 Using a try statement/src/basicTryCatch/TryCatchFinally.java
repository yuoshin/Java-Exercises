package basicTryCatch;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int[] arr = { 1, 2 };
			//System.out.println("Here it is: " + arr[2]); // 	Output: Not valid (invalid index)
			System.out.println("Here it is: " + arr[1]); // 	Output: Here it is: 2

		} catch (Exception E) {
			System.out.println("Not valid");
		} finally {
			System.out.println("Finally printed.");
		}
	}

}