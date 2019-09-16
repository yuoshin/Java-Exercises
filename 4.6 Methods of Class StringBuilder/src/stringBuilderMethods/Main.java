package stringBuilderMethods;

public class Main {

	public static void main(String[] args) {
		
		/*StringBuilder methods charAt(), indexOf(), substring() and length() works exactly like
		their String class counterparts*/
		
		//append()	append method allows you to add the requested data at the end of the String- Builder object
		StringBuilder appendObj = new StringBuilder();
		appendObj.append(true);
		appendObj.append(10);
		appendObj.append('v');
		appendObj.append(201.22);
		appendObj.append("Hello");
		System.out.println(appendObj);		//prints true10v201.22Hello
		
		//append() 2
		//You can append a complete char array, StringBuffer, or String or its subset as follows:
		StringBuilder appendObj2 = new StringBuilder();
		char[] appendArray = {'J','A','V','A','8'};
		appendObj2.append(appendArray, 0,3); //Starting with position 0, append 3 characters
		System.out.println(appendObj2);		//prints JAV
		
		//insert()	insert method enables you to insert the requested data at a particular position
		StringBuilder insertObj = new StringBuilder("Naine");
		insertObj.insert(2, 'd');
		System.out.println(insertObj);		//prints Nadine
		insertObj.insert(6, "Beautiful");
		System.out.println(insertObj);		//prints NadineBeautiful
		
		//insert() 2
		//You can also insert a complete char array, StringBuffer, or String or its subset, as follows:
		StringBuilder insertObj2 = new StringBuilder("Nadine");
		char[] insertChar = {'A','B','C'};
		insertObj2.insert(1,insertChar,0,2);	//insert at insertObj2 position 1, value insertChar from 0, 2 chars
		System.out.println(insertObj2);		//prints NABadine
		
		//delete()
		//delete() removes the characters in a substring of the specified StringBuilder
		StringBuilder deleteObj = new StringBuilder("Delete");
		deleteObj.delete(2,4);		//deletes characters from positions 2 to 4, EXCLUDING 4
		System.out.println(deleteObj);		//prints dete
		
		//deleteCharAt()
		//removes a single character
		StringBuilder deleteCharAtObj = new StringBuilder("DeleteCharAt");
		deleteCharAtObj.deleteCharAt(5);	//deletes char in position 5
		System.out.println(deleteCharAtObj);	//prints DeletCharAt
		
		//trim() method does not exist for StringBuilder class. Attempts to use it will not compile code
		
		//reverse()
		//reverses the sequence of characters in StringBuilder
		StringBuilder reverseObj = new StringBuilder("Reverse");
		System.out.println(reverseObj.reverse());	//prints esreveR
		
		//replace()
		//the replace method in the class StringBuilder replaces a sequence of characters, 
		//identified by their positions, with another String
		StringBuilder replaceObj = new StringBuilder("Replace");
		System.out.println(replaceObj.replace(2, 5, "Hello"));		//prints ReHelloce
		
		//substring()
		//Works like substring method in String class
		StringBuilder substringObj = new StringBuilder("Substring");
		System.out.println(substringObj.substring(2,6));	//prints bstr

		//subSequence()
		//Apart from using the method substring, you can also use the method subSequence 
		//to retrieve a subsequence of a StringBuilder object. This method returns objects of 
		//type CharSequence and doesn’t modify the existing value of a StringBuilder object
		StringBuilder subSequenceObj = new StringBuilder("Subsequence");
		System.out.println(subSequenceObj.subSequence(2, 7));	//prints bsequ
		System.out.println(subSequenceObj);		//prints Subsequence

	}

}
