package tryWithResources;

import java.io.*;
import java.nio.file.*;

public class TryWithResources {

	/*
	 * The new try-with-resources statement automatically closes all resources opened in the try clause.
	 * Parentheses are used to list those resources and semicolons are used to separate the declarations. 
	 * The resources created in the try clause are only in scope within the try block
	 */

	public void pathMethod(Path path1, Path path2)throws IOException {
		try (BufferedReader r = Files.newBufferedReader(path1); BufferedWriter w = Files.newBufferedWriter(path2)) {

		} //Resources are closed at this point
	}

	public static void main(String[] args) {

	}

}
