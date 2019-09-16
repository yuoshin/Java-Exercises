package wrapper;

import com.sun.glass.ui.TouchInputSupport;

public class WrapperMain {

	public static void main(String[] args) {
		
		/* Convert String to int primitive */
		String intString = "32";
		int StringToInt = Integer.parseInt(intString);			// converts a String to an int primitive
		System.out.println(StringToInt);
		
		/* Convert String to double primitive */
		String doubleString = "3.14";
		double StringToDouble = Double.parseDouble(doubleString);	// converts a String to a double primitive
		System.out.println(StringToDouble);
		
		/* Convert String to float primitive */
		String floatString = "3.14";
		float StringToFloat = Float.parseFloat(floatString);	// converts a String to a float primitive
		System.out.println(StringToFloat);
		
		/* Convert String to Integer wrapper class */
		Integer wrapper	 = Integer.valueOf("123");		// converts a String to an Integer wrapper class
		
		/** 
		 * if the String passed in is not valid for the given type, Java throws an exception. 
		 * Letters and dots are not valid for an integer value
		 */
		//int bad1 = Integer.parseInt("a");				// throws NumberFormatException
		//Integer bad2 = Integer.valueOf("123.45"); 		// throws NumberFormatException

		
	}

}
