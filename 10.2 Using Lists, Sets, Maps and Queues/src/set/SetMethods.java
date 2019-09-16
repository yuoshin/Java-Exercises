package set;

import java.util.*;

public class SetMethods {

	public static void main(String[] args) {
		Set<Integer> objHashSet = new HashSet<>();
		objHashSet.add(66);
		objHashSet.add(66); // not added as duplicate
		objHashSet.add(66); // not added as duplicate
		objHashSet.add(10);
		objHashSet.add(66); // not added as duplicate
		objHashSet.add(8);
		for (Integer hash : objHashSet) {
			System.out.print(hash + " "); // 66 8 10 (Not sorted)
		}

		Set<Integer> objTreeSet = new TreeSet<>();
		objTreeSet.add(66);
		objTreeSet.add(66); // not added as duplicate
		objTreeSet.add(66); // not added as duplicate
		objTreeSet.add(10);
		objTreeSet.add(66); // not added as duplicate
		objTreeSet.add(8);
		for (Integer tree : objTreeSet) {
			System.out.print(tree + " "); // 8 10 66 (Sorted)
		}
	}
}