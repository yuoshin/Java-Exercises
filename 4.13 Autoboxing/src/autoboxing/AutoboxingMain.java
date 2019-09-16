package autoboxing;

import java.util.ArrayList;

public class AutoboxingMain {

	public static void main(String[] args) {
		ArrayList<Double> autoboxingObj = new ArrayList<>();
		autoboxingObj.add(50.5);				// [50.5]	
		autoboxingObj.add(new Double(60));		// [50.5, 60.0]
		autoboxingObj.remove(50.5);	 			// [60.0]
		double first = autoboxingObj.get(0); 	// 60.0
		
		/* Line 9 autoboxes the double primitive into a Double object and adds that to the List.
		 * Line 10 shows that you can still write code the long way and pass in a wrapper object.
		 * Line 11 again autoboxes into the wrapper object and passes it to remove(). 
		 * Line 12 retrieves the Double and unboxes it into a double primitive. */
		
		/* UNBOXING A NULL */
		ArrayList<Integer> heights = new ArrayList<>();
		heights.add(null);
		int h = heights.get(0); 		// throws NullPointerException
		
		/* On line 21, we add a null to the list. This is legal because a null reference can be 
		 * assigned to any reference variable. 
		 * On line 22, we try to unbox that null to an int primitive. This is a problem. 
		 * Java tries to get the int value of null. Since calling any method on null gives 
		 * a NullPointerException, that is just what we get. Be careful when you see null in relation 
		 * to autoboxing. */

	}
}
