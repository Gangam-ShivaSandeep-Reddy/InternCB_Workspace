package com.java.constructors;


public class ConstructorDemoExample {

	// Instance variables
	int input1;
	int input2;

	// Parameterized constructor
	ConstructorDemoExample(int input1, int input2) {
		this.input1 = input1;
		this.input2 = input2;
	}

	// Method to display the sum of input1 and input2
	void m1() {
		System.out.println(input1 + input2); // Output the sum of the two values
	}

	// Main method to test the ConstructorDemo class
	public static void main(String[] args) {
		// Creating an instance of ConstructorDemo using the parameterized constructor
		ConstructorDemoExample demo = new ConstructorDemoExample(11, 5);

		// Display the sum of input1 and input2 using method m1
		System.out.println("HELLO CONSTRUCTOR ::: ConstructorDemo :: ");
		demo.m1();  // Output: 16
	}
}
