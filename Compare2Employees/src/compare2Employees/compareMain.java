package compare2Employees;
import java.lang.*;
import java.util.*;

public class compareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	//Compare based on person ID
	public class Person implements Comparable {
	    private int person_id;
	    private String name;
	    
	    /**
	     * Compare current person with specified person
	     * return zero if person_id for both person is same 
	     * return negative if current person_id is less than specified one
	     * return positive if specified person_id is greater than specified one
	     */
	    @Override 
	    public int compareTo(Object o) {
	        Person p = (Person) o; 
	        return this.person_id - p.person_id;
	    }
	}
	
	/**
	 * Comparator implementation which sorts Person objects on person_id field
	 */
	
	/*public class SortByPerson_ID implements Comparator{
	    public int compare(Object o1, Object o2) {
	        Person p1 = (Person) o;
	        Person p2 = (Person) o; 
	        return p1.getPersonId() - p2.getPersonId();
	    }
	} */
}