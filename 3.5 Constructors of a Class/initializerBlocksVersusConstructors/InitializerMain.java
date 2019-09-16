package initializerBlocksVersusConstructors;
/*Initializer blocks are used to initialize the variables of anonymous classes. An anonymous 
 * class is a type of inner class (Inner classes won't be covered in the OCA exam). 
 * In the absence of a name, anonymous classes can’t define a constructor and rely on an 
 * initializer block to initialize their variables upon the creation of an object of their class.
 */
public class InitializerMain {
	
	public InitializerMain() {	
			System.out.println("Constructor");
		}	//end of constructor
	
	{	//Beginning of initializer block
		System.out.println("Initializer: Initializer block will execute first.");
	}	//end of initializer block

	public static void main(String[] args) {
		
		InitializerMain obj = new InitializerMain();	//notice that initializer will be executed first
	}
}
