package resourceBundle;

import java.util.*;

public class PropertyFile {

	public static void main(String[] args) {
		Locale us = new Locale("en","US");
		Locale france = new Locale("fr","FR");
		printProperties(us);		//Hello The zoo is open
		System.out.println();
		printProperties(france);	//Bonjour Le zoo est ouvert
		System.out.println();
		getAllKeys(us);				//hello open
		System.out.println();
		getAllKeys(france);			//hello open

	}
	
	private static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}
	
	//Method to get all keys. Can use normal for loop and functional programming
	private static void getAllKeys(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		Set<String> keys = rb.keySet();
		//Using functional programming
		/*keys.stream().map(k -> k + " " + rb.getString(k))
		.forEach(System.out::println);*/
		//Using traditional for loop
		for(String key:keys) {
			System.out.println(key);
		}
		
	}

}
