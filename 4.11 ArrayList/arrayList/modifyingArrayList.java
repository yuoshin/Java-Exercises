package arrayList;
import java.util.ArrayList;

public class modifyingArrayList {

	public static void main(String[] args) {
//		2 ways to modify ArrayList
/*******************************************************************************/
//		1: Replacing an existing element in ArrayList		
		ArrayList<String> modifyArrayList = new ArrayList<>();
		modifyArrayList.add("One");
		modifyArrayList.add("Two");
		modifyArrayList.add("Three");
				
		for (String element : modifyArrayList){
			System.out.println("Before modifying using Set Method: " + element);
		}	//Output: One, Two, Three
		modifyArrayList.set(1, "One and a half");
//		Replace element "Two" at index  1 with "One and a half"
		
		for (String element : modifyArrayList){
			System.out.println("After modifying using Set Method: " + element);
		}	//Output: One, One and a half, Three
/*******************************************************************************/
//		2: Modifying all of its existing values
		ArrayList<StringBuilder> modArrListStrBldr = new ArrayList<>();
		modArrListStrBldr.add(new StringBuilder("One"));	//Notice how the "add" method is used here
		modArrListStrBldr.add(new StringBuilder("Two"));	//Notice how the "add" method is used here
		modArrListStrBldr.add(new StringBuilder("Three"));	//Notice how the "add" method is used here
/*		modArrListStrBldr.add("Four");	//Java will throw an error if you do this because we're adding 
 * 		StringBuilder objects and not String */
		
/*		OR you can create the StringBuilder objects separately first like this */
//		StringBuilder sb1 = new StringBuilder("One");
//		StringBuilder sb2 = new StringBuilder("Two");
//		StringBuilder sb3 = new StringBuilder("Three");				
//		modArrListStrBldr.add(sb1);	
//		modArrListStrBldr.add(sb2);	
//		modArrListStrBldr.add(sb3);
		
		for (StringBuilder element : modArrListStrBldr){
			element.append(element.length());
//			accesses all the elements of modArrListStrBldr and modifies the element value by appending 			
// 			its length to it. */
		}
		for (StringBuilder element : modArrListStrBldr){
			System.out.println(element);
		}	//Output: One3, Two3, Three5
/*******************************************************************************/
	}
}
