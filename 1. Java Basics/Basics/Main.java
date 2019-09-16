//Syntax for creating a class:	modifier class ClassName{}
package Basics;

public class Main {
	
	public static void main(String args[]){
		Main obj = new Main();	//to create new object of class Main
		obj.bye();		//calling of bye() method from main function
		
		MyName Name = new MyName();		//	to create new object of class MyName
		Name.hey();		//calling of hey() method from MyName class
		Name.name();	//calling of name() method from MyName class
	}
	
	public void bye(){
		System.out.println("Bye");
	}

}

