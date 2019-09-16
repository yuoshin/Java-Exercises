package creatingFileObjects;

import java.io.File;

public class CreateFileObjMain {

	public static void main(String[] args) {
		// Common way to create file objects
		// Double backslash for path as backslash is a reserved character and must be escaped with another backslash within a String
		File file = new File("C:\\data\\zoo.txt");
		System.out.println(file.exists()); // false
		if (file.exists()) {
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Parent Path: " + file.getParent());
			if (file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("File LastModified: " + file.lastModified());
			} else {
				for (File subfile : file.listFiles()) {
					System.out.println("\t" + subfile.getName());
				}
			}
		}
		
		/*//If path pointed to a valid file, it will print something like this:
		 * File Exists: true
		 * Absolute Path: C:\data\zoo.txt
		 * Parent Path: C:\data
		 * Is Directory: false
		 * File size: 12382
		 * File LastModified: 1420070400000
		 */
		
		/*//If path pointed to a directory, it will print something like this:
		 * File Exists: true
		 * Absolute Path: C:\data
		 * Parent Path: C:\
		 * Is Directory: true
		 * employees.txt
		 * zoo.txt
		 * zoo-backup.txt
		 */		

		// Another constructor to create file objects
		File parent = new File("/home/folder");
		File child = new File(parent, "/folder2/text.txt");

	}

}
