package map;

import java.util.*;

public class MapMethods {

	public static void main(String[] args) {
		//HashMap: Not sorted
		Map<Integer,String> hashmap = new HashMap<>();
		hashmap.put(10, "Hi");
		hashmap.put(500, "Hello");
		hashmap.put(28, "Sup");
		System.out.println("Size of obj is: " + hashmap.size());			//Get size of map
		System.out.println("Value in key 500 is: " + hashmap.get(500));		//Get value of key 500
		System.out.println("Value in key 28 is: " + hashmap.get(28));		//Get value of key 28
		System.out.println("All keys: " + hashmap.keySet());				//Returns set of keys, unsorted
		System.out.println("All values: " + hashmap.values());				//Returns set of values, unsorted
		System.out.println("Remove key 10: " + hashmap.remove(10));			//Removes value "hi" from key 10
		System.out.println("All keys: " + hashmap.keySet());
		System.out.println("All values: " + hashmap.values());
		hashmap.clear();										//Removes all keys and values from map
		System.out.println(hashmap.keySet());					//Output: []
		System.out.println(hashmap.values());					//Output: []
		System.out.println("Is the map empty? " + hashmap.isEmpty());
		
		//TreeMap: Sorted
		TreeMap<Integer,String> treemap = new TreeMap<>();
		treemap.put(92, "Maria");
		treemap.put(60, "Nadine");
		treemap.put(73, "Camilia");
		System.out.println(treemap.keySet());	//[60, 73, 92]	//Sorted
		System.out.println(treemap.values());	//[Nadine, Camilia, Maria]	//Sorted
		
		//LinkedHashMap
		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(756, "Yo");
		linkedhashmap.put(547, "Yoo");
		System.out.println(linkedhashmap.keySet());	//[756, 547]
		System.out.println(linkedhashmap.values());	//[Yo, Yoo]
		linkedhashmap.remove(756);
		System.out.println(linkedhashmap.keySet());	//[547]
		System.out.println(linkedhashmap.values());	//[Yoo]
		linkedhashmap.put(756, "Yo");
		System.out.println(linkedhashmap.keySet());	//[547, 756]
		System.out.println(linkedhashmap.values());	//[Yoo, Yo]
		
	}
}