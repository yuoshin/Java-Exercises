package arrayList;
import java.util.ArrayList;
/* 		the clone method creates a new instance of the ArrayList object to 
 * 		be cloned. Its element references are copied, but the objects themselves are not. */

public class CloningArrayList {

	public static void main(String[] args) {
		ArrayList<StringBuilder> myArrList = new ArrayList<>();
		
		StringBuilder sb1 = new StringBuilder("Jan");
		StringBuilder sb2 = new StringBuilder("Feb");
		
		myArrList.add(sb1);		//stored in myArrList[0]
		myArrList.add(sb2);		//stored in myArrList[1]
		myArrList.add(sb2);		//stored in myArrList[2]
/*******************************************************************************/		
		ArrayList<StringBuilder> assignedArrList = myArrList;
//		assigns objects referred to by myArrList to assignedArrList
//		the for loop below confirms the contents of both myArrList and assignedArrList
		
		for(StringBuilder element : myArrList){
			System.out.println("Elements of myArrList = " + element);
		}
		for(StringBuilder element : assignedArrList){
			System.out.println("Elements of assignedArrList = " + element);
		}
/*******************************************************************************/		
		ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>)myArrList.clone();
//		assigns a copy of the object referred to by myArrList to clonedArrList. The
//		variables myArrList and clonedArrList refer to different objects.
		
		for(StringBuilder element : clonedArrList){
			System.out.println("Elements of clonedArrList = " + element);
		}
		
		System.out.println("Are the contents of myArrList and assignedArrList equal? " + 
		(myArrList == assignedArrList));
//		will print true because myArrList and assignedArrList refer to the same object		
		
		System.out.println("Are the contents of myArrList and clonedArrList equal? " + 
		(myArrList == clonedArrList));
//		will print false because myArrList and clonedArrList refer to separate objects, because the 
//		method clone creates and returns a new object of ArrayList (but with the same list members).
		
	}

}
