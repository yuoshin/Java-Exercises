package fileinput_fileoutput;

import java.io.*;

public class FileInputOutputMain {
	/* Note that the performance for this code, especially for large files, would not be particularly good because the 
	sample does not use any byte arrays. */
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source);
		OutputStream out = new FileOutputStream(destination)) {
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		/* Create Zoo.txt file in the directory ***C:\Users\yuosh\Java Exercises\14.3 Working with Streams***. 
		 * Upon running, ZooCopy will be created automatically*/
		File source = new File("Zoo.txt");
		File destination = new File("ZooCopy.txt");
		
		/*** Create in source folder
		File destination = new File("source/ZooCopy.txt"); ***/		
		/*** Create in Java Exercises folder, 1 level up 
		File destination = new File("../ZooCopy.txt"); ***/
		//If the destination file already exists, it will be overridden by this code
		copy(source, destination);
	}
}
