package com.CoreJava_Baic_Programs_Assignment1;

import java.util.Scanner;

public class Fibonacci_Sequence {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter the number of terms to print in the Fibonacci sequence: ");
		int terms = scanner.nextInt();

		// Initialize the first two terms of the Fibonacci sequence
		int firstTerm = 0;
		int secondTerm = 1;

		// Print the Fibonacci sequence up to the given number 
		System.out.print("Fibonacci sequence up to " + terms + " terms: ");

		for(int i = 1; i <= terms; i++) {
			System.out.print(firstTerm + " ");

			// Calculate the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

		scanner.close();
	}
}
