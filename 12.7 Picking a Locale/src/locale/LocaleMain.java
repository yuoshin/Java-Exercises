package locale;

import java.util.Locale;

public class LocaleMain {

	public static void main(String[] args) {
		
		/* 3 main ways to create a Locale */
		
		// First, the Locale class provides constants for some of the most commonly used locales
		System.out.println(Locale.GERMAN); 	// de
		System.out.println(Locale.GERMANY); // de_DE
		
		//The other two main ways of creating a Locale are to use the constructors.
		// You can pass just a language or both a language and country.
		System.out.println(new Locale("fr"));		 	// fr (french)
		System.out.println(new Locale("hi", "IN")); 	// hi_IN (hindi, India)
		
		//Another flexible method is to use Builder
		Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale l2 = new Locale.Builder().setRegion("US").setLanguage("en").build();
		
		System.out.println(l1 + " " + l2);
		

	}

}
