package arrays;

public class arrayInitialization {

	public static void main(String[] args) {
		
		int anArray[];			//declare array
		anArray = new int[3];	//allocate array
		
/*	After declaring and allocating an array, initializing can be done using 2 methods: for loop and 
 *  initializing the elements individually. */
		
//		for (int i=0; i<intArray.length; i++) {
//			intArray[i] = i + 5;
//			}	
		
//		intArray[0] = 10;
//		intArray[1] = 1870;
		
/************************************************************************************************/
		
/*	Like C++, use nested for loops to initialize multi-dimensional arrays or 
 *  you can also separately initialize the elements: */
		
/*		for (int i=0; i<multiArr.length; i++) {
			for (int j=0; j<multiArr[i].length; j++) {
				multiArr[i][j] = i + j;
			}
		}
		Note: multiArr.length equates to the length of multiArr[this value][]
		Note: multiArr.length[i] equates to the length of multiArr[][this value]
*/
		
/*		int[][] mulArr = new int[][] {{4,1},{8,0,5}};
		
		for(int a = 0;a < mulArr.length;a++) {
			for(int b = 0;b < mulArr[a].length;b++) {		
				System.out.println("mulArr["+a+"]["+b+"] = " + mulArr[a][b]);
			}
		}
		Note: mulArr.length equates to the length of mulArr[this value][]
		Note: mulArr.length[a] equates to the length of mulArr[][this value]
*/

//		multiArr[0][0] = 10;
//		multiArr[1][2] = 1210;
//		multiArr[0][1] = 110;
//		multiArr[0][2] = 1087;

	}
}
