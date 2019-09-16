package throwingASecondException;

public class Main {

	public static void main(String[] args) {
		int[] arr = {0};
		try {
			try {
				//System.out.println("Here it is inner: " + arr[0]);	//prints "Here it is inner: 0"
				System.out.println("Here it is inner: " + arr[1]);	//prints Inner try catch
			}catch (Exception e) {
				System.out.println("Inner try catch");
			}
			System.out.println("Here it is outer: " + arr[0]);	//prints "Here it is outer: 0"
			//System.out.println("Here it is outer: " + arr[1]);	//prints Outer catch block
			
		}catch (Exception e) {
			System.out.println("Outer catch block");
		}finally {
			System.out.println("Finally block");
		}

	}

}
