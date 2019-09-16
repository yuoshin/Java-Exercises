package abstractClasses;
/*  - You can never create objects of an abstract class.
    - A base class can be defined as an abstract class, even if it doesn’t define any abstract methods.
	- An abstract class may or may not define any abstract methods.
	- A derived class should implement all the abstract methods of its base class. If it doesn’t, 
	  it must be defined as an abstract derived class  
	- You can use variables of an abstract base class to refer to objects of its derived class.
*/

public class AbstractClasses {
	public static void main(String Args[]){	
		programmer newObj = new programmer();		//programmer object created
		newObj.getName("Yasin");	//prints Name of programmer: Yasin
		newObj.showName("Maria");	//prints Name is: Maria
		
//		admin newAdmin = new admin();	//error if you try to instantiate an object from abstract class
		
	}
}

abstract class employee{		//abstract class creation
	String name;
	abstract void getName(String empName);	//abstract method created
	abstract void test();					//abstract method created
	void showName(String name){		//non-abstract method able to be created in an abstract class
		this.name = name;
		System.out.println("Name is: " + this.name);
	}
}

class programmer extends employee{
	void getName(String a){		//abstract method used. take note of signature
		System.out.println("Name of programmer: " + a);
	}
	void test(){				//abstract method used. take note of signature	
		
	}
}

abstract class admin extends employee{	//derived class of employee however does not implement the 
	void getMonth(int a){				//getName() and test() method therefore must be declared as abstract as well
		System.out.println("The month is: " + a);
	}
}