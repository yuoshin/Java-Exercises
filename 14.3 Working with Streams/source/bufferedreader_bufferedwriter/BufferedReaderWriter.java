package bufferedreader_bufferedwriter;

import java.io.*;
import java.util.*;

public class BufferedReaderWriter {
	public static List<String> readFile(File source) throws IOException {
		List<String> data = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
			String s;
			while ((s = reader.readLine()) != null) {
				data.add(s);
			}
		}
		return data;
	}

	public static void writeFile(List<String> data, File destination) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
			for (String s : data) {
				writer.write(s);
				writer.newLine();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		/* Create Zoo2.txt file in the directory ***C:\Users\yuosh\Java Exercises\14.3 Working with Streams***. 
		 * Upon running, Zoo2Copy will be created automatically*/
		File source = new File("Zoo2.txt");
		File destination = new File("Zoo2Copy.txt");
		
		/*** Create in source folder
		File destination = new File("source/ZooCopy.txt"); ***/		
		/*** Create in Java Exercises folder, 1 level up 
		File destination = new File("../ZooCopy.txt"); ***/
		
		List<String> data = readFile(source);
		for (String record : data) {
			System.out.println(record);
		}
		writeFile(data, destination);
	}
}