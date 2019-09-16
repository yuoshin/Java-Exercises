package parsing;

import java.text.*;
import java.util.*;

public class ParsingMain {

	public static void main(String[] args) throws ParseException {
		
		/* Parsing numbers */
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		String s = "40.45";
		System.out.println(en.parse(s)); // 40.45
		System.out.println(fr.parse(s)); // 40
		
		/* Parsing currency */
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		double value = (Double) cf.parse(amt);
		System.out.println(value); 		// 92807.99

	}

}
