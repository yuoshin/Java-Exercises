package arrayList;
import java.util.ArrayList;

public class getAndSize {

	public static void main(String[] args) {
		ArrayList<String> getElement = new ArrayList<>();
		getElement.add("One");
		getElement.add("Two");
		getElement.add("Three");
		
		System.out.println("The element in index 1 is: " + getElement.get(1));	
//		Will return the element at the specified position in the ArrayList
		
		System.out.println("The number of elements in the ArrayList is: " + getElement.size());
//		Will return the number of elements in the ArrayList
		
	}
}
