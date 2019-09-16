package interfaces;

interface BaseInterface1 {
	String getName();
}
interface BaseInterface2 {
	String getName();
}
interface MyInterface extends BaseInterface1, BaseInterface2 {}
//An interface uses the keyword EXTENDS when it implements another interface
/* Which of the getName methods will be inherited by the interface MyInterface? Will 
 * MyInterface inherit the getName method defined in BaseInterface1 or the one defined in BaseInterface2?
 */
class interfaceTest implements MyInterface{
	String name;
	public String getName(){
		System.out.println("Name is Yasin");
		return name;
/*	Because neither of the getName methods defined in BaseInterface1 and BaseInterface2 
 * define a method body the question of which of the methods MyInterface inherits is irrelevant. 
 * Interface MyInterface has access to a single getName method, which should be implemented 
 * by all the classes that implement MyInterface.
 */
	};
}
public class ImplementingMultipleInterfaces{
	public static void main(String[] args) {
		interfaceTest obj = new interfaceTest();
		obj.getName();
		
	}

}
