package testla;

import java.util.*;

class testlaMain {

	public static void main(String[] args) {
		printNumber(10);
	}

	public static void printNumber(int num) {
		if (num <= 0) {
			return;
		}else {
			printNumber(num-1);
			System.out.print(num + " ");
		}
	}

}
