package printException;

public class PrintExceptionMain {

	public static void main(String[] args) {
		try {
			hop();
		} catch (Exception e) {
			System.out.println(e);	//what java prints by default; the exception type and message
			System.out.println(e.getMessage());	//just the message
			e.printStackTrace();	//the stack trace
		}
	}

	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}


/*The first line shows what Java prints out by default: the exception type and message. The
second line shows just the message. The rest shows a stack trace.*/