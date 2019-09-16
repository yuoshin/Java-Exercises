package switchCase;
/* A switch statement can define multiple case labels within its switch block, but only a 
 * single default label. The default label executes when no matching value is found in the 
 * case labels. A break statement is used to exit a switch statement, after the code 
 * completes its execution for a matching case.
 */

public class SwitchCase {
	public static void main(String args[]){
		int a = 70;
		switch(a){
		case 10: System.out.println("Value is 10");
		break;
		case 20: System.out.println("Value is 20");
		break;
		case 30: System.out.println("Value is 30");
		break;
		case 40: System.out.println("Value is 40");
		break;
		case 50: System.out.println("Value is 50");
		break;
		
		default: System.out.println("Unknown value");
		break;		
			
		}
	}

}
