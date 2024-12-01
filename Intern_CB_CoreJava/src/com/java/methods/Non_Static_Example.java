package com.java.methods;

class Non_Static_Example {
	// Non-static method with parameters and no return type
	void displayMessage(String message) {
		System.out.println("Message: " + message);
	}

	// Non-static method with parameters and return type
	int addNumbers(int a, int b) {
		return a + b;
	}

	// Non-static method with no parameters and return type
	String greetUser() {
		return "Hello, Welcome!";
	}

	// Non-static method with no parameters and no return type
	void showInfo() {
		System.out.println("This is a simple Java program.");
	}

	public static void main(String[] args) {
		// Create an object of the Example class to call non-static methods
		Non_Static_Example example = new Non_Static_Example();

		// Calling a method with parameters and no return type
		example.displayMessage("Learning non-static methods!");

		// Calling a method with parameters and a return type
		int result = example.addNumbers(5, 10);
		System.out.println("Sum: " + result);

		// Calling a method with no parameters and a return type
		String greeting = example.greetUser();
		System.out.println(greeting);

		// Calling a method with no parameters and no return type
		example.showInfo();
	}
}
