package Programs;

import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int choice;
		do {

			System.out.println("Simple Calculator");
			System.out.println("**************************");
			System.out.println("Select an operation:");
			System.out.println("_______________________________________");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");

			 choice = scanner.nextInt();
			if (choice == 5) {
				System.out.println("Exiting the program. Goodbye!");
				break;
			}

			System.out.print("Enter First Number: ");
			double num1 = scanner.nextDouble();
			System.out.print("Enter Second Number: ");
			double num2 = scanner.nextDouble();

			double result = 0;
			switch (choice) {
			case 1: // Addition
				result = num1 + num2;
				System.out.println("Result: " + result);
				break;
			case 2: // Subtraction
				result = num1 - num2;
				System.out.println("Result: " + result);
				break;
			case 3: // Multiplication
				result = num1 * num2;
				System.out.println("Result: " + result);
				break;
			case 4: // Division
				if (num2 != 0) {
					result = num1 / num2;
					System.out.println("Result: " + result);
				} else {
					System.out.println("Division by zero is not allowed.");
				}
				break;
			default:
				System.out.println("Invalid choice! Please select a valid operation.");
			}
		} while (choice != 5); 

	}
}
