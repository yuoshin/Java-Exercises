package creatingStringObj;

public class stringObjMain {

	public static void main(String[] args) {
		
		String str1 = new String();		//Created in heap
		String str2 = new String();		//Created in heap
		System.out.println(str1 == str2);	//this will print false
/*		The operator == compares the addresses of the objects referred to by the
 *		variables str1 and str2. Even though these String objects store the same sequence of
 *		characters, they refer to separate objects that are stored at separate locations.
 */
		System.out.println(str1.equals(str2));	//this will print true
		/*
		 * equals method will compare the exact value of the reference variable str1 and str2 therefore it will
		 * print true
		 */
		
		String str3 = "Yasin";		//Created in String constant pool which is part of heap
		String str4 = "Yasin";		//Created in String constant pool which is part of heap
		System.out.println(str3 == str4);	//this will print true
/*		In the case of variables str3 and str4, the objects are created and stored in a pool 
 * 		of String objects. Before creating a new object in the pool, Java first searches for 
 * 		an object with similar contents. When the following line of code executes  String str3 = "Yasin";
 * 		no String object with the value "Yasin" is found in the pool of String objects:
 * 		As a result, Java creates a String object with the value "Yasin" in the pool of String 
 * 		objects referred to by variable str3. When the following line of code executes, 
 * 		String str4 = "Yasin"; Java is able to find a String object with the value "Yasin" in 
 * 		the pool of String objects. Java doesn’t create a new String object in this case, 
 * 		and the variable str4 refers to the existing String object "Yasin". Both variables str3 and str4
 *		refer to the same String object in the pool of String objects.
 */ 	
		
		System.out.println("Good Morning");	//Created in String constant pool which is part of heap
//		You can also create a String object by enclosing a value within double quotes (")
		String str5 = "Good Morning";
		System.out.println(str5 == "Good Morning");		//this will print true
/*		These values are reused from the String constant pool if a matching value is found. If
 *		a matching value isn’t found, the JVM creates a String object with the specified value
 *		and places it in the String constant pool:
 */		
		
		String morning2 = new String("Morning");
		System.out.println("Morning" == morning2);	//will print false
/*		String objects that exist in the String constant pool and object references of String objects 
 * 		that don’t exist in the String constant pool don’t refer to the same String object, even if 
 * 		they define the same String value
*/		

	}

}
