package replaceAll;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAllMain {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(10);
		System.out.println(list);	//[4, 8, 10]
		list.replaceAll(a->a*2);
		System.out.println(list);	//[8, 16, 20]

	}

}
