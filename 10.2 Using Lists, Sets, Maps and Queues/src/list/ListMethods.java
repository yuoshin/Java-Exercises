package list;

import java.util.*;

public class ListMethods {
	
	public static void main(String[] args) {
		LinkedList<Integer> obj = new LinkedList<>();
		obj.add(1);
		obj.add(5);
		System.out.println(obj);	//[1, 5]
		obj.add(0,7);				//add 7 in index 0
		System.out.println(obj);	//[7, 1, 5]
		obj.addLast(9);				//add 9 to last index
		obj.addFirst(87);			//add 87 to first index
		System.out.println(obj);	//[87, 7, 1, 5, 9]
		System.out.println(obj.lastIndexOf(5));		//returns index of value 5, which is 3
		obj.set(3, 99);				//adds 99 to index 3
		System.out.println(obj);	//[87, 7, 1, 99, 9]
		
		//Looping through a list using enhanced for loop
		for(Integer num:obj) {
			System.out.println(num);
		}
		
		//Looping through a list using listIterator
		ListIterator<Integer> loop = obj.listIterator();
		while(loop.hasNext()){
			System.out.println(loop.next());
		}
	}
}