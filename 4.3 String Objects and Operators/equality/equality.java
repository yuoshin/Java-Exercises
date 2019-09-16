package equality;

public class equality {

	public static void main(String[] args) {
		String refStr1 = new String("Yasin");
		String refStr2 = new String("Yasin");
		
		String poolStr1 = "Maria";		//string created and stored in String Constant Pool
		String poolStr2 = "Maria";

/*		The operator == compares whether the reference variables refer to the same objects, 
 * 		and the method equals compares the String values for equality	*/
		System.out.println(refStr1.equals(refStr2));	//prints true as equal comparison
		System.out.println(refStr1 == refStr2);			//prints false as pointing to different objects
		
		System.out.println(poolStr1.equals(poolStr2));		//prints true as equal comparison
		System.out.println(poolStr1 == poolStr2);			//prints true
		
/*		Even though comparing poolStr1 and poolStr2 using the operator == prints true, you should 
 * 		never use this operator for comparing String values. The variables var3 and var4 refer 
 * 		to the same String object created and shared in the pool of String objects. 
 * 		This operator won’t always return the value true, even if the two objects store the same String values
 */
		
	}

}
