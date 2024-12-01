package com.test.demo;

public class Pen {
	int price =50;
	String color ="Black";
	void write() {
		System.out.println("Pen writes");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Pen p = new Pen();
		p.write();
		p.write();

	}

}
