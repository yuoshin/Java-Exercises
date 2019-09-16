package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> sortArrayList = new ArrayList<>();
		sortArrayList.add(34);
		sortArrayList.add(2);
		sortArrayList.add(55);
		sortArrayList.add(6);
		System.out.println("Before sorting: " + sortArrayList);		// [34, 2, 55, 6]
		Collections.sort(sortArrayList);
		System.out.println("After sorting: " + sortArrayList);		// [2, 6, 34, 55]
		
		/* 
		 * Sorting an ArrayList is very similar to sorting an array. You just use 
		 * a different Collections.sort() instead of Arrays.sort().
		 */
	}
}