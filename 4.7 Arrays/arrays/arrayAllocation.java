package arrays;

public class arrayAllocation {
	public static void main(String args[]){
/************************************************************************************************/		
/*		Once allocated, all the array elements store their default values. Elements in an array 
 * 		that store objects default to null. Elements of an array that store primitive data 
 * 		types store 0 for integer types (byte, short, int, long), 0.0 for decimal types (float and double),
 * 		false for boolean, or /u0000 for char data. */
		
//		int intArray[];
//		String strArray[];
//		int multiArr[][];
			
//		intArray = new int[2];
//		strArray = new String[4];
//		multiArr = new int[2][3];	
/************************************************************************************************/
/*		The code won’t compile if you don’t specify the size of the array or if you place the array 
 * 		size on the left of the = sign*/
		
//		intArray = new int[];		//Won't compile. Array size missing.
//		intArray[2] = new int;		//Won't compile. Array size placed incorrectly.
/************************************************************************************************/
/*		The size of the array should evaluate to an int value */
		
//		intArray = new int[2.5];	//Won't compile
//		strArray = new String[2*5];	//Will compile as 2*5 evaluates to an int value.
//		int x = 10, y = 4;
//		strArray = new String[x*y];	//Will compile as x*y evaluates to an int value.
//		strArray = new String[Math.max(2, 3)];	//Math.max(2,3) returns an int value.
/************************************************************************************************/
/*		Take note of the following when allocating memory for multi-dimensional array elements:
 *		- It is okay to define the size in all the brackets or only in first square bracket.
 *		- The number of square brackets from defining and allocating must match.
 *		- The size in the first square bracket cannot be missing but present in the next few brackets. */
		
//		int[] multiArr[];
//		multiArr = new int[2][3];	//OK to compile
//		multiArr = new int[2][];	//OK to compile
		
//		multiArr = new int[];		//Won't compile. Non-matching square bracket
//		multiArr = new int[][3];	//Won't compile. First square bracket empty
		
	}
}
