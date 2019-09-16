package arrayList;

import java.util.ArrayList;

public class Equals {

	public static void main(String[] args) {
		ArrayList<Integer> equalsObj1 = new ArrayList<>();
		ArrayList<Integer> equalsObj2 = new ArrayList<>();
		ArrayList<Integer> equalsObj3 = new ArrayList<>();
		
		equalsObj1.add(1);
		equalsObj1.add(2);
		System.out.println(equalsObj1); //[1, 2]
		equalsObj2.add(1);
		equalsObj2.add(2);
		System.out.println(equalsObj2);	//[1, 2]
		equalsObj3.add(2);
		equalsObj3.add(1);
		System.out.println(equalsObj3);	//[2, 1]
		
		System.out.println(equalsObj1.equals(equalsObj2));	//prints true
		System.out.println(equalsObj1.equals(equalsObj3));	//prints false

	}

}
