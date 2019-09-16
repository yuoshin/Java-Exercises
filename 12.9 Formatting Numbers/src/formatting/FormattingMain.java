package formatting;

import java.text.*;
import java.util.*;

public class FormattingMain {

	public static void main(String[] args) {
		
		/* Formatting numbers */
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear /12;
		//Call the US NumberFormat instance
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		//Format the number to US
		System.out.println(us.format(attendeesPerMonth));	//266,666
		//Call the US NumberFormat instance
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		//Format the number to Germany
		System.out.println(g.format(attendeesPerMonth));	//266.666
		//Call the CANADA_FRENCH NumberFormat instance
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		//Format the number to CANADA_FRENCH
		System.out.println(ca.format(attendeesPerMonth));	//266 666
		
		/* Formatting Currency*/
		int price = 48;
		NumberFormat germany = NumberFormat.getCurrencyInstance();	//uses default locale
		System.out.println(germany.format(price));			//$48.00
		
	}

}
