package map;

import java.util.*;
import java.util.function.BiFunction;

public class NewJava8MapApis {

	public static void main(String[] args) {
		
		//putIfAbsent()
		Map<Integer, String> putifabsent = new HashMap<>();
		putifabsent.put(1, "Yasin");
		putifabsent.put(2, "Maria");
		putifabsent.put(3, "Nadine");
		putifabsent.put(4, "Camilia");
		putifabsent.put(5,null);
		System.out.println(putifabsent);				//{1=Yasin, 2=Maria, 3=Nadine, 4=Camilia, 5=null}
		putifabsent.putIfAbsent(3, "AnotherName");		//Wont be inserted as 3 already has an existing value
		putifabsent.putIfAbsent(5, "NameInserted");		//Will be inserted as 5 is null
		putifabsent.putIfAbsent(10, "Yasin");			//Will be inserted as new key
		System.out.println(putifabsent);				//{1=Yasin, 2=Maria, 3=Nadine, 4=Camilia, 5=NameInserted, 10=Yasin}
		
		//merge() and BiFunction()
		//mapper below will add the values only if they are longer in length than the current value
		BiFunction<String, String, String> mapper = (v1,v2) -> v1.length() > v2.length() ? v1:v2;
		Map<Integer,String> merge = new HashMap<>();
		merge.put(1, "Aeroplane");
		merge.put(2, "Bus");
		System.out.println(merge);				//{1=Aeroplane, 2=Bus}
		merge.merge(1, "Lorry", mapper);		//Wont be added as Aeroplane length is longer
		merge.merge(2, "Submarine", mapper);	//Will be added as Submarine length is longer
		System.out.println(merge);				//{1=Aeroplane, 2=Submarine}

	}

}
