package arrayList;
import java.util.ArrayList;		//this must be imported to use ArrayList
import java.util.List;			//this must be imported to use List

public class createArrayList {
	public static void main(String Args[]){
		ArrayList<String> myArrList = new ArrayList<String>();	//declare an ArrayList object
		ArrayList<String> myArrList2 = new ArrayList<>();	//Generic on the right omitted			
		List<Integer> myArrList3 = new ArrayList<>();	
		/* Polymorphic declaration. This will create a list of arraylists. Tested in OCP */
		/* ArrayList implements an interface called List. In other words, an ArrayList is a List.
		 * You can store an ArrayList in a List reference variable but not vice versa. 
		 * The reason is that List is an interface and interfaces can’t be instantiated.
		 */

	}
}