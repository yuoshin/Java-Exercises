package arrays;

import java.util.Arrays;

public class SearchingArrays {

	public static void main(String[] args) {
		int[] searchArrays = {2,4,6,8};
/*4*/	System.out.println(Arrays.binarySearch(searchArrays, 2));	//0
/*5*/	System.out.println(Arrays.binarySearch(searchArrays, 4));	//1
/*6*/	System.out.println(Arrays.binarySearch(searchArrays, 1));	//-1
/*7*/	System.out.println(Arrays.binarySearch(searchArrays, 3));	//-2
/*8*/	System.out.println(Arrays.binarySearch(searchArrays, 9));	//-5
		
/* Take note of the fact that searchArrays is a sorted array. If it weren’t, the output given will 
 * be unpredictable. Line 4 searches for the index of 2. The answer is index 0. Line 5 searches
 * for the index of 4, which is 1. Line 6 searches for the index of 1. Although 1 isn’t in the list, 
 * the search can determine that it should be inserted at element 0 to preserve the sorted order. 
 * Since 0 already means something for array indexes, Java needs to subtract 1 to give us the answer of –1. 
 * Line 7 is similar. Although 3 isn’t in the list, it would need to be inserted at element 1 to 
 * preserve the sorted order. We negate and subtract 1 for consistency, getting –1 –1, which is –2. 
 * Finally, line 8 wants to tell us that 9 should be inserted at index 4. We again negate and 
 * subtract 1, getting –4 –1, which is –5.
 */
	}
}
