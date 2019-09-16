package stringMethods;

public class Main {

	public static void main(String[] args) {
		
		//charAt()
		//retrieve a character at a specified index of a String
		String charAtObj = new String("CharAt");
		System.out.println(charAtObj.charAt(3));	//prints r
		
		//indexOf()
		/* Used to search a String for the occurrence of a char or a String. If the 
		specified char or String is found in the target String, this method returns the first 
		matching position; otherwise, it returns -1 */
		String indexOfObj = new String("IndexOf");
		System.out.println(indexOfObj.indexOf('e'));	//prints 3
		
		//indexOf() 2
		/* By default, the indexOf() method starts its search from the first char 
		of the target String. If you wish, you can also set the starting position */
		String indexOfObj2 = new String("ABCAB");
		System.out.println(indexOfObj2.indexOf('B', 2));	//Prints 4
		
		//length()
		//Used to retrieve the length of a string
		String lengthObj = new String("Length");
		System.out.println(lengthObj.length());		//Prints 6
		
		//substring()
		/* Comes in 2 flavours. The first returns a substring of a String from 
		the position you specify to the end of the String*/
		String substringObj = new String("Substring");
		System.out.println(substringObj.substring(4));		//prints tring
		System.out.println(substringObj.substring(2, 6));	//prints bstr
		
		//trim()
		/* method returns a new String by removing all the leading and 
		trailing white space (new lines, spaces, or tabs) in a String. */
		String trimObj = new String("     Tr  im   ");
		System.out.println(trimObj.trim());		//prints Tr  im
		
		//replace()
		/*method will return a new String by replacing all the occurrences of a char with another char
		and string with another string*/
		String replaceObj = new String("Replace");
		System.out.println(replaceObj.replace('e', 'o'));	//prints Roplaco
		System.out.println(replaceObj.replace("Rep", "Sup"));	//prints Suplace
		
		//method chaining
		/* Method chaining is evaluated from left to right
		Because String objects are immutable, their values won’t change if you 
		execute methods on them. You can, of course, reassign a value to a reference variable of type String. */
		String day = "SunDday";
		day.replace('D', 'Z').substring(3);
		System.out.println(day);	//prints SunDday
		day = day.replace('D', 'Z').substring(3);
		System.out.println(day);	//prints Zday


		

	}

}
