package rethrowingExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RethrowingExceptions {
	
	public static void multiCatch() throws IOException,SQLException{
		System.err.println("Caught");
		throw new IOException();
		
	}

	/**Using multi catch. need to catch both exceptions**/
	/*public static void main(String[] args) {
		try {
			multiCatch();
		}catch(IOException | SQLException e) {	//multi catch
			e.getMessage();
		}
	}*/
	
	/**Using only Exception in catch clause**/
	public static void main(String[] args) {
		try {
			multiCatch();
		}catch(Exception e) {					//Only exception
			e.getMessage();
		}
	}

}
