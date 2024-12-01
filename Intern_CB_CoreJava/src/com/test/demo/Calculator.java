package com.test.demo;
public class Calculator {

    // Non-static method without parameters and without return type
    public void greet() {
        System.out.println("Welcome to the Calculator Program!");
    }

    // Static method without parameters and without return type
    public static void instructions() {
        System.out.println("This program performs basic arithmetic operations.");
    }

    // Non-static method with parameters and with return type
    public int add(int a, int b) {
        return a + b;
    }

    // Static method with parameters and with return type
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Non-static method with parameters and with return type
    public int multiply(int a, int b) {
        return a * b;
    }

    // Static method with parameters and with return type
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        // Create an instance of Calculator to call non-static methods
        Calculator calc = new Calculator();

        // Call non-static method without parameters and without return type
        calc.greet();

        // Call static method without parameters and without return type
        Calculator.instructions();

        // Call non-static method with parameters and with return type
        int sum = calc.add(10, 5);
        System.out.println("Addition: 10 + 5 = " + sum);

        // Call static method with parameters and with return type
        int difference = Calculator.subtract(10, 5);
        System.out.println("Subtraction: 10 - 5 = " + difference);

        // Call non-static method with parameters and with return type
        int product = calc.multiply(10, 5);
        System.out.println("Multiplication: 10 * 5 = " + product);

        // Call static method with parameters and with return type
        double quotient = Calculator.divide(10, 5);
        System.out.println("Division: 10 / 5 = " + quotient);

        // Test division by zero
        double divisionByZero = Calculator.divide(10, 0);
        System.out.println("Division: 10 / 0 = " + divisionByZero);
    }
}
