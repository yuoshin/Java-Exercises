package arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		//Sorting integers
		int[] sortArray = new int[] {34,55,2,19};
		Arrays.sort(sortArray);
		/*for(int i=0;i<sortArray.length;i++) {
			System.out.println("sortArray["+i+"] = "+sortArray[i]);
		}*/
		for(int arr:sortArray) {
			System.out.println(arr);
		}
		// Output will be: 2,19,34,55
		
/***************************************************************************************/
		//Sorting Strings
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings)
		System.out.print(string + " ");
		//Output will be: 10 100 9
	}

}
