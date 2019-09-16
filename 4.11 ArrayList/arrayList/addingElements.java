package arrayList;
import java.util.ArrayList;

//You can add a value to an ArrayList either at its end or at a specified position.

public class addingElements {

	public static void main(String[] args) {
		ArrayList<String> addElements = new ArrayList<>();
		addElements.add("Zero");		//will be stored at its end, [0]
		addElements.add("One");			//will be stored at its end, [1]
		addElements.add("Three");		//will be stored at its end, [2]
		addElements.add(2, "Two");		//stored at [2]. current element in [2] will be dropped to [3]		

		System.out.println(addElements);
	}
}