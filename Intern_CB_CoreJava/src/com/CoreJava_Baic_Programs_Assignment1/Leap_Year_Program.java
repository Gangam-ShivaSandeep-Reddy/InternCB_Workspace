package com.CoreJava_Baic_Programs_Assignment1;

import java.util.Scanner;

public class Leap_Year_Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter A Year: ");
		int year = scanner.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is A Leap Year.");
		} else {
			System.out.println(year + " is Not A Leap Year.");
		}
	}
}

