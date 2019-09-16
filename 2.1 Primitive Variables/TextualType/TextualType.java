package TextualType;

class charToUnicode{

	public static void main(String argsp[]){
		char c1 = 122;
		char c2 = '\u0122';
		//char c3 = -122;
		char c3 = (char)-122;
	  /*
	   *as above, char values are unsigned integer values, so if you try to assign a 
	   *negative number to one, the code will not compile. But you can forcefully assign a negative 
	   *number to a char by type casting it to char
	   */
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);	/*this will show the output of the preceding code 
		on a system that supports Unicode characters.*/
		System.out.println("c3 = " + c3);
		
	}
	
}