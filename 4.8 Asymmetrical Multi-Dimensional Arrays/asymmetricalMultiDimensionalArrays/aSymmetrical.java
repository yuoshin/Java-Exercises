package asymmetricalMultiDimensionalArrays;

public class aSymmetrical {

	public static void main(String[] args) {
		String asymmetricalMulti[][] = new String[][] {{"A", "B"}, null, {"Yasin", "Maria", "Nadine"}};
		System.out.println("Value of asymmetricalMulti[0][0] = " + asymmetricalMulti[0][0]);	//prints A
		System.out.println("Value of asymmetricalMulti[0][1] = " + asymmetricalMulti[0][1]);	//prints B
/**********************************************************************************************/
//		System.out.println("Value of asymmetricalMulti[0][2] = " + asymmetricalMulti[0][2]);
//		System.out.println("Value of asymmetricalMulti[1][0] = " + asymmetricalMulti[1][0]);
//		System.out.println("Value of asymmetricalMulti[1][1] = " + asymmetricalMulti[1][1]);
//		System.out.println("Value of asymmetricalMulti[1][2] = " + asymmetricalMulti[1][2]);
/*		The following codes above are not valid as they are all null */
/*		An attempt to access any null elements will throw an exception */
/**********************************************************************************************/		

		System.out.println("Value of asymmetricalMulti[2][0] = " + asymmetricalMulti[2][0]);	//prints Yasin
		System.out.println("Value of asymmetricalMulti[2][1] = " + asymmetricalMulti[2][1]);	//prints Maria
		System.out.println("Value of asymmetricalMulti[2][2] = " + asymmetricalMulti[2][2]);	//prints Nadine

	}

}
