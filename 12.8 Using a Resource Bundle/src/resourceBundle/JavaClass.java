package resourceBundle;

import java.util.*;

public class JavaClass {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("Zoo",Locale.getDefault());
		System.out.println(rb.getObject("hello"));
	}

}

class Zoo_en extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] { 
			{ "hello", "Hello" }, 
			{ "open", "The zoo is open" } 
		};
	}
}