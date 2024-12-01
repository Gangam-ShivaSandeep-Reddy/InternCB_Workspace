package com.java.constructors;

//Student class with both non-parameterized and parameterized constructors
class Student {
	// Instance variables
	String name;
	int rollNumber;

	// Non-parameterized constructor (default constructor)
	public Student() {
		name = "Unknown";
		rollNumber = 0;
	}

	// Parameterized constructor
	public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	// Method to display the student information
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	}

	public static void main(String[] args) {
		// Creating an object using the non-parameterized constructor
		Student student1 = new Student();
		student1.displayInfo();  // Displaying default values

		// Creating an object using the parameterized constructor
		Student student2 = new Student("Shiva", 101);
		student2.displayInfo();  
	}
}
