package com.test.demo;

public class DemoClass {

	public static void main(String[] args) {
		int a = 50;
		int b = 100;
		m1(a,b);
	}

	private static void m1(int a, int b) {
		int c = 150;
		int d = 200;

		m2(c,d);

		System.out.println("int variable : "+a);
		System.out.println("int variable : "+b);
		System.out.println("int variable : "+c);
		System.out.println("int variable : "+d);

	}

	static void m2(int a, int b) {
		int c = 250;
		int d = 300;

		System.out.println("int variable : "+a);
		System.out.println("int variable : "+b);
		System.out.println("int variable : "+c);
		System.out.println("int variable : "+d);
	}

}
