package subclassexception;

public class SubclassException {

	class CanNotHopException extends Exception {
	}
	
	/** 1 **/
	/*When a class overrides a method from a superclass or implements a method from an interface, it’s not allowed 
	 * to add new checked exceptions to the method signature. For example, this code isn’t allowed: */

	/*class Hopper {
		public void hop() {
		}
	}

	class Bunny extends Hopper {
		public void hop() throws CanNotHopException {
		} // DOES NOT COMPILE
	}*/

	/** 2 **/
	/* A subclass is allowed to declare fewer exceptions than the superclass or interface. This is
	legal because callers are already handling them. */

	class Hopper {
		public void hop() throws CanNotHopException {
		}
	}

	class Bunny extends Hopper {
		public void hop() {
		}
	}

	/** 3 **/
	/*Similarly, a class is allowed to declare a subclass of an exception type. The idea is the
	same. The superclass or interface has already taken care of a broader type.*/

	/*class Hopper {
		public void hop() throws Exception {
		}
	}

	class Bunny extends Hopper {
		public void hop() throws CanNotHopException {
		}
	}*/
}