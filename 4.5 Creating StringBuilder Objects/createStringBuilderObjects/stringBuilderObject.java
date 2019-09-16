package createStringBuilderObjects;

public class stringBuilderObject {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
/*		constructs a StringBuilder object with no characters in it and an initial capacity 
 * 		of 16 characters. */
		
		StringBuilder sb2 = new StringBuilder(sb1);
/*		constructs a StringBuilder object that contains the same set of characters 
 * 		as contained by the StringBuilder object passed to it. */
		
		StringBuilder sb3 = new StringBuilder(50);
/*		constructs a StringBuilder object with no characters and an initial capacity of 50 characters. */
		
		StringBuilder sb4 = new StringBuilder("Muhammad Yasin");
/*		constructs a StringBuilder object with an initial value as contained by the String object + 16. */
		
		System.out.println(sb4.reverse());
		
		
	}

}
