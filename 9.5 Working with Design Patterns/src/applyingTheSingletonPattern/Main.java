package applyingTheSingletonPattern;

/*
 * Singletons in Java are created as private static variables within the class, often with the name instance.
 * They are accessed via a single public static method, often named getInstance(), which returns the reference 
 * to the singleton object. 
 * Finally, all constructors in a singleton class are marked private, which ensures that no other class is 
 * capable of instantiating another version of the class.
 */

public class Main {
	public static void main(String[] args) {
	}
}

class HayStorage {
	
	private int quantity = 0;
	// constructor marked as private
	private HayStorage() {
	} 

	//	3 ways to instantiate singletons
	//		1: Regular way
	private static final HayStorage instance = new HayStorage();
	
	/*		2: Using static block (allows additional steps to be taken to set up the singleton 
	 * 		after it has been created)
	 * 		
	 * 		private static final HayStorage instance;
	 * 		static {
	 * 			instance = new HayStorage();
	 * 			// Perform additional steps
	 * 		}
	 */
	
	/*		3a: Using lazy instantiation (Not thread safe)
	 * 		
	 * 		private static HayStorage instance;
	 * 		public static HayStorage getInstance() {	//Not synchronized
	 * 			if(instance == null) {
	 * 				instance = new HayStorage(); // NOT THREAD-SAFE!
	 * 			}
	 * 			return instance;
	 * 		}
	 */
	
	/*
	 * 		3b: Using lazy instantiation (Thread safe)
	 * 
	 * 		private static HayStorage instance;
	 * 		public static synchronized HayStorage getInstance() {	//synchronized
	 * 			if(instance == null) {
	 * 				instance = new HayStorage();
	 * 			}
	 * 			return instance;
	 * 		}
	 */
	
	/*
	 * 		3c: Using Lazy Instantiation with Double-Checked Locking
	 * 
	 * 		The synchronized implementation of getInstance() above has the problem 
	 * 		that every single call to this method will require synchronization
	 * 		This solution is better than our previous version, as it performs the 
	 * 		synchronization step only when the singleton does not exist
	 * 
	 * 		private static volatile VisitorTicketTracker instance;
	 * 		public static VisitorTicketTracker getInstance() {
	 * 			if(instance == null) {
	 * 				synchronized(VisitorTicketTracker.class) {
	 * 					if(instance == null) {
	 * 						instance = new VisitorTicketTracker();
	 * 					}
	 * 				}
	 * 			}
	 * 		return instance;				
	 * 		}
	 */

	public static HayStorage getInstance() {
		return instance;
	}
	//Synchronized modifier prevents two processes from running the same method at the exact same time.
	public synchronized void addHay(int amount) {
		quantity += amount;
	}

	public synchronized boolean removeHay(int amount) {
		if (quantity < amount)
			return false;
		quantity -= amount;
		return true;
	}

	public synchronized int getHayQuantity() {
		return quantity;
	}
}

/*
 * A process that wants to use this singleton first calls getInstance() and then calls the 
 * appropriate public method
 */
class HorseTrainer {
	public boolean feedSheep(int numberOfHorses) {
		int amountNeeded = 5 * numberOfHorses;
		HayStorage hayStorage = HayStorage.getInstance();
		if (hayStorage.getHayQuantity() < amountNeeded) {
			hayStorage.addHay(amountNeeded + 10);
		}
		boolean fed = hayStorage.removeHay(amountNeeded);
		if (fed)
			System.out.println("Horses  have been fed");
		return fed;
	}
}


