package arrayList;
import java.util.ArrayList;

public class addMultiElementsToArrList {

	public static void main(String[] args) {
		ArrayList<String> myArrList = new ArrayList<>();
		myArrList.add("One");
		myArrList.add("Two");
		
		ArrayList<String> yourArrList = new ArrayList<>();
		yourArrList.add("Three");
		yourArrList.add("Four");
		
		myArrList.addAll(1, yourArrList);	/*add elements of yourArrList to myArrList starting from 
											  index 1*/
//		myArrList.addAll(yourArrList);		
/*		if no index is stated, it will append all of the 
 * 		elements in the specified collection to the end of this list in the order in which 
 * 		they’re returned by the specified collection’s Iterator. */
		
		for (String element : myArrList){
			System.out.println(element);
		}
		
		System.out.println(myArrList+"\n"+ yourArrList);
/*		The elements of yourArrList aren’t removed from it. The objects that are stored in
 * 		yourArrList can now be referred to from myArrList
 */
		
	}

}
