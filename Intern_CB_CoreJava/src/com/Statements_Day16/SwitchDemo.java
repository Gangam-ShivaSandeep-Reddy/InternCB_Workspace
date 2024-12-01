package com.Statements_Day16;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the Month Number:");

		int input = scanner.nextInt();  

		switch (input) {
		case 1:
			System.out.println("JAN");
			break;

		case 2:
			System.out.println("FEB");
			break;

		case 3:
			System.out.println("MAR");
			break;

		case 4:
			System.out.println("APR");
			break;

		default:
			System.out.println("No Case Found");
		}
	}
}

