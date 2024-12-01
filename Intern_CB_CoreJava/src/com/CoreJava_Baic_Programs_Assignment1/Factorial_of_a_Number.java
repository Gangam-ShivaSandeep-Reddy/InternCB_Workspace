package com.CoreJava_Baic_Programs_Assignment1;

import java.util.Scanner;

public class Factorial_of_a_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to calculate its factorial: ");
		int num = scanner.nextInt();

		int factorial = 1;

		//  the factorial using a for loop
		for (int i = 1; i <= num; i++) {
			factorial *= i; // Multiply factorial by the current loop counter i
		}


		System.out.println("The factorial of " + num + " is: " + factorial);


		scanner.close();
	}
}



