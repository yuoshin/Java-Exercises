package com.readline;

import java.io.*;

public class ReadLineMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Console console = System.console();
		if (console == null) {
			throw new RuntimeException("Console not available");
		} else {
			/**1: First way to read input from the user. Print the text using console, flush then read input using console.readLine*/
			/*console.writer().print("How excited are you about your trip?: ");
			console.flush();
			String excitementAnswer = console.readLine();
			
			console.writer().print("Please enter your name: ");
			console.flush();
			String name = console.readLine();
			
			console.writer().print("What is your age? ");
			console.flush();
			String age = console.readLine();*/			
			
			/**2: Second way to read input from the user. Print qn and read input using console readLine*/
			/*String excitementAnswer = console.readLine("How excited are you about your trip? ");
			String name = console.readLine("Please enter your name: ");
			String age = console.readLine("What is your age? ");*/
			
			/**3: Third way to read input from the user. Print qn using console,flush, then read input using BufferedReader*/
			BufferedReader reader = new BufferedReader(console.reader());
			console.writer().print("How excited are you about your trip?: ");
			console.flush();
			String excitementAnswer = reader.readLine();	//read using BufferedReader
			console.writer().print("Please enter your name: ");
			console.flush();
			String name = reader.readLine();
			
			console.writer().print("What is your age? ");
			console.flush();
			String age = reader.readLine();
			
			/**	OUTPUT	**/			
			console.writer().println();
			console.format("Your name is " + name);
			console.writer().println();
			console.format("Your age is " + age);
			console.writer().println();
			console.printf("Your excitement level is: " + excitementAnswer);
		}
	}
}