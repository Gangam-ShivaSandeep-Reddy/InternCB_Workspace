package com.CoreJava_Baic_Programs_Assignment1;

import java.util.Scanner;

public class Even_or_Odd_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter the Number: ");
		int num = scanner.nextInt();

		if(num%2 == 0) {
			System.out.println(num + " is Even ");
		}
		else {
			System.out.println(num + " is Odd!");
		}

	}

}
