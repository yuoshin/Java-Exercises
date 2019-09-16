package arrayList;
import java.util.ArrayList;

public class clearArrayListElements {

	public static void main(String[] args) {
		ArrayList<String> clearArrayList = new ArrayList<>();
		
		clearArrayList.add("Hello");
		clearArrayList.add("Goodbye");
		
		for(String value : clearArrayList){
			System.out.println(value);
		}
		
		clearArrayList.clear();			//clears all elements in the ArrayList
		
		for(String value : clearArrayList){
			System.out.println(value);
		}
		
		

	}

}
