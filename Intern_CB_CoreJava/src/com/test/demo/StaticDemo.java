package com.test.demo;

public class StaticDemo {

	static int a = 10;
	static int b = 10;
    static int c =20;
	//StaticDemo staticDemo = new StaticDemo();

	public static void main(String[] args) {
        int a=50;
		int b=100;
		int c=200;
		StaticDemo staticDemo = new StaticDemo();

		System.out.println("local test " +staticDemo.a );
        System.out.println("Global test "+a);
	
		System.out.println("Global test "+StaticDemo.b);
		System.out.println("local test "+b);

		System.out.println("Global test "+StaticDemo.c);
		System.out.println("local test "+c);	
	}

}
