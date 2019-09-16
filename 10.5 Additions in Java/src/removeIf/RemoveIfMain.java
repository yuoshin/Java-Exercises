package removeIf;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Alphabet");
		list.add("Action");
		list.add("Ballin");
		System.out.println(list); 	// [Alphabet, Action, Ballin]
		list.removeIf(s->s.startsWith("A"));
		System.out.println(list);	//[Ballin]
	}

}
