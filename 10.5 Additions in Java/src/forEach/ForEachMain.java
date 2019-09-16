package forEach;

import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ForEachMain {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C");
		list.forEach(c->System.out.print(c + " "));		// A B C (Using lambda)
		list.forEach(System.out::print);				//ABC (Using method referencing)
	}
}
