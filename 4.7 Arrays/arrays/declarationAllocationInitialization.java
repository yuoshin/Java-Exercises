package arrays;

public class declarationAllocationInitialization {

	public static void main(String[] args) {
/*	There are 2 ways to do this. 
 * 
 * 		The first approach:
 * 		- Doesn’t use the keyword new to initialize an array
 *  	- Doesn’t specify the size of the array
 *  	- Uses a single pair of braces to define values for a one-dimensional 
 *  	  array and multiple pairs of braces to define a multidimensional array */
		
		int intArray[] = {0, 1};
		String[] strArray = {"Summer", "Winter"};
		int multiArray[][] = { {0, 1}, {3, 4, 5} };
		
/***********************************************************************************/		
		
/*		The 2nd approach:	
 * 		- the keyword new is used to initialize the array
 * 		- If you try to specify the size of an array with the second approach, the code won’t compile  */

		int intArray2[] = new int[]{0, 1};
		String[] strArray2 = new String[]{"Summer", "Winter"};
		int multiArray2[][] = new int[][]{ {0, 1}, {3, 4, 5}};
		
//		int intArray2[] = new int[2]{0, 1};							//won't compile
//		int multiArray2[][] = new int[2][]{ {0, 1}, {3, 4, 5}};		//won't compile
		
/***********************************************************************************/	

/*		When you combine an array declaration, allocation, and initialization in a single step, 
 * 		you can’t specify the size of the array. The size of the array is calculated by 
 * 		the number of values that are assigned to the array however if you declare and initialize an 
 * 		array using two separate lines of code, you’ll use the keyword new to initialize the values. */
		
		int intArray3[];
		intArray3 = new int[]{10, 20};
		
//		int intArray4[];
//		intArray4 = {0, 1};			//wont compile

	}

}
