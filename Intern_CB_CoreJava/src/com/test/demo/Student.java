package com.test.demo;

public class Student {

	String name ="Arya";
	String qualification = "BTech";
	void study() {
		System.out.println(name+ " reads every day!");
	}
	void sleep() {
		System.out.println(name+ " sleeps 8 hours.");
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Student std = new Student();
		std.study();
		std.sleep();
		System.out.println("Main Ends!");
	}
}
