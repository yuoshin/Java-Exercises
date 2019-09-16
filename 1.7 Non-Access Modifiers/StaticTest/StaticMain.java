package StaticTest;
public class StaticMain {

	public static void main(String[] args) {
		
		StaticVar testObj = new StaticVar();	//object of class declared but this is not the correct
		StaticVar testObj2 = new StaticVar();	//way to access static variable
		
/*		Note the prompts on lines 11, 12, 14 and 15. Even though you can use an object reference 
 * 		variable to access static members, it’s not advisable to do so. Because static members belong to a
 * 		class and not to individual objects, using object reference variables to access
 * 		static members may make them appear to belong to an object. The proper
 * 		way to access them is by using the class name.		
 */	
		testObj.varStatic = 10;
		System.out.println("Value of varStatic for testObj = " + testObj.varStatic);
		
		testObj2.varStatic++;	//value of static variable will be incremented
		System.out.println("Value of varStatic for testObj2 = " + testObj2.varStatic);
		
		StaticVar.varStatic++;	//correct way to access static members
		System.out.println("Value of varStatic = " + StaticVar.varStatic);
		
		System.out.println("Adding 20 to varStatic within println's parentheses = " 
		+ (StaticVar.varStatic + 20));
		
		System.out.println("Value of varStatic = " + StaticVar.varStatic + " (Notice how"
				+ " the value changes back to what it was before 20 was added");
	
	}

}
