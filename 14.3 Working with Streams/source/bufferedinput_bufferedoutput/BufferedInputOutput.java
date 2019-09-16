package bufferedinput_bufferedoutput;

import java.io.*;

public class BufferedInputOutput {
	
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new BufferedInputStream(new FileInputStream(source));
		OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
			byte[] buffer = new byte[1024];
			int lengthRead;
			while ((lengthRead = in.read(buffer)) > 0) {
				out.write(buffer, 0, lengthRead);
				//flush() command to ensure that the written data actually makes it to disk before the next buffer of data is read
				out.flush();
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
