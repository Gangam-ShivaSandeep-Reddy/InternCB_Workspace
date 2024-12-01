package com.java.constructors;


public class ConstructorDemoMain {

	int i = 10; // Instance variable

	// Non-static method
	void main2() {
		System.out.println("Internal");
	}

	// Static method
	static void m1() {
		System.out.println("Static method m1 called");
	}

	// Main method
	public static void main(String[] args) {
		// Creating an object of ConstructorDemoMain and calling non-static method
		ConstructorDemoMain demoMain = new ConstructorDemoMain();
		demoMain.main2(); // Output: Internal

		// Creating an object of ConstructorDemo with parameterized constructor
		ConstructorDemo constructorDemo = new ConstructorDemo(10, 20);
		constructorDemo.display(); // Output: x: 10, y: 20

		// Calling static method from ConstructorDemoMain
		ConstructorDemoMain.m1(); // Output: Static method m1 called
	}
}

class ConstructorDemo {
	int x, y;

	// Parameterized constructor
	ConstructorDemo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Method to display values
	void display() {
		System.out.println("x: " + x + ", y: " + y);
	}
}
