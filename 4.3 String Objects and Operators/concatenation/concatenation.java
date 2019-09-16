package concatenation;

public class concatenation {

	public static void main(String[] args) {
		
		String stringTest = "Yasin" + "Maria" + "Nadine";
		System.out.println(stringTest);	//prints YasinMariaNadine
		
		int numA = 56;
		int numB = 38;
		String name = "Nadine";
		System.out.println(numA + numB + name);	//prints 94Nadine
/*		The result above prints "94Nadine" instead of "5638Nadine" because the + operator can be 
 * 		used with the primitive values, and the expression numA + numB + name is evaluated from 
 * 		left to right. Here’s the sequence of steps executed by Java to evaluate the expression:
 •			- Adds operands numA and numB to get 94.
 •			- Concatenates 94 with Nadine to get 94Nadine.		*/
		
/*		To treat the numbers stored in variables numA and numB as String values, modify the 
 * 		expression as follows:		*/
			System.out.println("" + numA + numB + name);	//5638Nadine
/**********************************************************************************************/
/*		When you use += to concatenate String values, ensure that the variable you’re using has 
 * 		been initialized (and doesn’t contain null). 	*/
		
		String lang = "Java";
		lang += " is everywhere!";
		System.out.println(lang);	//prints Java is everywhere!
		
		String initializedToNull = null;
		initializedToNull += "Java";
		System.out.println(initializedToNull);		//nullJava	

	}
}
