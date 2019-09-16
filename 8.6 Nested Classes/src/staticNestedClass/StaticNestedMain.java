package staticNestedClass;

public class StaticNestedMain {

	static class Nested {
		private int price = 5;
	}

	public static void main(String[] args) {
		Nested newObj = new Nested();	/*Since the class is static, you don’t need an instance of 
		StaticNestedMain to use it */		
		System.out.println(newObj.price);
	}
}