package locale;

import java.util.Locale;

public class SetDefaultLocale {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());	// en_SG
		Locale locale = new Locale("fr");
		Locale.setDefault(locale); 					// change the default
		System.out.println(Locale.getDefault()); 	// fr
		
		/*
		 * the Locale changes only for that one Java program. It does not
		 * change any settings on your computer. It does not even change future programs.
		 */

	}

}
