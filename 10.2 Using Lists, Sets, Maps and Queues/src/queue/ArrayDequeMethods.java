package queue;

import java.util.*;

public class ArrayDequeMethods {

	public static void main(String[] args) {
		/*ArrayDeque<String> queue = new ArrayDeque<>();
		
		queue.offer("1");			//Adds 1 to the queue. Output: 1
		queue.offer("2");			//Adds 2 to the queue. Output: 1 2
		System.out.println("Head of queue is: " + queue.peek());	//Shows the head of the queue which is 1		
		System.out.println("Head of queue, " + queue.poll() + ", removed");	//Shows and removes head of queue.
		
		for(String obj:queue) {
			System.out.print(obj + " ");
		}	//Output: 2
*/		
		ArrayDeque<String> stack = new ArrayDeque<>();
		
		stack.offer("1");			//Adds 1 to the queue. Output: 1
		stack.push("2");			//Adds 2 to the queue. Output: 2 1
		System.out.println("Head of queue is: " + stack.peek());	//Shows the head of the queue which is 2		
		System.out.println("Head of queue, " + stack.poll() + ", removed");	//Shows and removes head of queue.	
		
		for(String obj:stack) {
			System.out.print(obj + " ");
		}	//Output: 1
		
		
		

	}

}
