package com.CoreJava_Baic_Programs_Assignment1;

import java.util.Scanner;

public class Sum_Of_Two_Numbers {


	public static void main(String[] args) {
		// Scanner object to read input
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter the First Number: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter the Second Number: ");
		int number2 = scanner.nextInt();
		int sum = number1 + number2;

		System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);


		scanner.close();
	}
}



