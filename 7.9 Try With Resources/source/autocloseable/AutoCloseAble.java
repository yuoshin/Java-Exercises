package autocloseable;

public class AutoCloseAble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Turkey implements AutoCloseable{
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		try (Turkey t = new Turkey()) { 	// Will not compile unless class implements AutoCloseable
			System.out.println(t);
		}
	}
}