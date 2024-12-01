package com.javaOperatoors_Day_13;

public class OperatorsMainDemo {
	public static void main(String[] args) {
		int a = 61;
		int b = 30;
		int c = 75;

		System.out.println(a > b && !(a > c));
		System.out.println(a + b);
		System.out.println("post inc: " + (a++));
		System.out.println("pre inc: " + (++a));
		System.out.println(a);

		a += b;
		a -= b;
		System.out.println(a);

		// Demonstrating additional methods
		System.out.println("post dec: " + (a--));
		System.out.println("pre dec: " + (--a));
		System.out.println("post mul: " + postMultiply(a, b));
		System.out.println("pre mul: " + preMultiply(a, b));
		System.out.println("post div: " + postDivide(a, b));
		System.out.println("pre div: " + preDivide(a, b));
	}

	static int gtltqe(int a, int b) {
		return a + b;
	}

	static int add() {
		int c = 20, b = 30;
		return c;
	}

	static int postDecrement(int a) {
		return a--;
	}

	static int preDecrement(int a) {
		return --a;
	}

	static int postMultiply(int a, int b) {
		int result = a * b;
		a *= b;
		return result;
	}

	static int preMultiply(int a, int b) {
		a *= b;
		return a;
	}

	static int postDivide(int a, int b) {
		int result = a / b;
		a /= b;
		return result;
	}

	static int preDivide(int a, int b) {
		a /= b;
		return a;
	}
}




































/*
 * public class OperatorsMainDemo { public static void main(String[] args) {
 * 
 * int a= 61; int b= 30; int c =75;
 * 
 * System.out.println(a>b &&!(a>c));
 * 
 * System.out.println(a+b); System.out.println("post inc: " +(a++));
 * System.out.println("pre inc: " +(++a)); System.out.println(a);
 * 
 * a+=b; a-=b; System.out.println(a); } static int gtltqe(int a, int b) { // int
 * c = a+b; return a+b;
 * 
 * } static int add() { int c = 20,b = 30; return c;
 * 
 * }
 * 
 * }
 */