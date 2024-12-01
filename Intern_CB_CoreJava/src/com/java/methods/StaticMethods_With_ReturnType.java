package com.java.methods;

public class StaticMethods_With_ReturnType{

	// Static method with parameters and a return value
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Calling the static method and storing the return value
		int result = add(10, 20);

		
		System.out.println("The sum of 10 and 20 is: " + result);
	}
}
