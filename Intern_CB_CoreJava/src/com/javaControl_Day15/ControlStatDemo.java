package com.javaControl_Day15;

public class ControlStatDemo {

	public static void main(String[] args) {

		// Print a welcome message
		System.out.println("Hello CODEBEGUN");

		// String variable declaration
		String str = "Sandeep";
		System.out.println(str);

		// Integer variables declaration
		int a = 61, b = 30, c = 90;

		// Check if 'a' is even or odd
		if (a % 2 == 0) {
			System.out.println("A is an even number");
		} else {
			System.out.println("A is an odd number");
		}

		// Check if 'a' is positive or negative
		if (a > 0) {
			System.out.println("A is a positive number");
		} else {
			System.out.println("A is a negative number");
		}

		// Check if a number is prime
		int number = 17; // Example number
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("The given number is prime");
		} else {
			System.out.println("The given number is not prime");
		}

		// Find the largest among three numbers
		if (a > b && a > c) {
			System.out.println("A is the largest");
		} else if (b > c) {
			System.out.println("B is the largest");
		} else {
			System.out.println("C is the largest");
		}

		// Nested if to find the largest
		if (a > b) {
			if (a > c) {
				System.out.println("A is the largest (using nested if)");
			} else {
				System.out.println("C is the largest (inner else)");
			}
		} else if (b > c) {
			System.out.println("B is the largest (using nested if)");
		} else {
			System.out.println("C is the largest (outer else)");
		}
	}
}
