package mainPackage;

/*		INTERFACE ARRAY TYPE		*/
/* If the type of an array is an interface, its elements are either null or objects 
 * that implement the relevant interface type. For example, for the interface MyInterface, 
 * the array interfaceArray can store references to objects of either the class MyClass1 or MyClass2:
 */

interface MyInterface {}
class MyClass1 implements MyInterface {}
class MyClass2 implements MyInterface {}
class interfaceTest {
		MyInterface[] interfaceArray = new MyInterface[]{new MyClass1(),null,new MyClass2()};
		}

/*		ABSTRACT ARRAY TYPE		*/
/* If the type of an array is an abstract class, its elements are either null or 
 * objects of concrete classes that extend the relevant abstract class. For example, for the abstract class
 * Vehicle, the array vehicleArray can store references to objects of either the class Car or Bus:
 */

abstract class Vehicle{}
class Car extends Vehicle {}
class Bus extends Vehicle {}
class abstractTest {
		Vehicle[] vehicleArray = { new Car(),new Bus(),null};		//null is a valid element
	}

/*		OBJECT ARRAY TYPE		*/
/* Because all classes extend the class java.lang.Object, elements of an array whose type 
 * is java.lang.Object can refer to any object. 
 */

interface MyInterface2 {}
class MyClass3 implements MyInterface {}
abstract class Vehicle2{}
class Car2 extends Vehicle2 {}
class objectTest {
		Object[] objArray = new Object[] {new MyClass1(),null,new Car(),new java.util.Date(),
		new String("name"),new Integer[7]};	/*Array element of type Object can refer to another array*/
	}