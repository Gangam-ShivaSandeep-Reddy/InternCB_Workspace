package com.test.demo;

public class MethodsExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        m1(a, b);

        //  instance to call non-static methods
        MethodsExample example = new MethodsExample();
        example.nonStaticMethodWithoutParameter();
        example.nonStaticMethodWithParameter(30);
    }

    // Static method without parameter
    private static void staticMethodWithoutParameter() {
        System.out.println("Static method without parameter called.");
    }

    // Static method with parameter
    private static void staticMethodWithParameter(int a, int b) {
        int c = 100;
        int d = 200;
        System.out.println("Static method with parameter called. Values: " + a + ", " + b);
        System.out.println("int variable: " + c);
        System.out.println("int variable: " + d);
    }

    // Static method call inside another static method
    private static void m1(int a, int b) {
        int c = 150;
        int d = 250;

        staticMethodWithParameter(c, d);

        System.out.println("int variable: " + a);
        System.out.println("int variable: " + b);
        System.out.println("int variable: " + c);
        System.out.println("int variable: " + d);
    }

    // Non-static method without parameter
    public void nonStaticMethodWithoutParameter() {
        System.out.println("Non-static method without parameter called.");
    }

    // Non-static method with parameter
    public void nonStaticMethodWithParameter(int number) {
        int e = 50;
        int f = 75;

        System.out.println("Non-static method with parameter called. Value: " + number);
        System.out.println("int variable: " + e);
        System.out.println("int variable: " + f);
    }
}
