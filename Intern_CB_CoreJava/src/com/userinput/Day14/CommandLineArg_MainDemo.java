package com.userinput.Day14;

import java.util.Scanner;

public class CommandLineArg_MainDemo {
    public static void main(String[] args) {

        // Ensure there are at least three command-line arguments
        if (args.length < 3) {
            System.out.println("Please provide at least three command-line arguments.");
            return;
        }

        // Parsing command-line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Reading first input from the user
        System.out.println("Please enter input one:");
        int a1 = scanner.nextInt();
        System.out.println("a1 value: " + a1);

        // Reading second input from the user
        System.out.println("Please enter input two:");
        int a2 = scanner.nextInt();
        System.out.println("The sum of " + a1 + " + " + a2 + " = " + add(a1, a2));

        // Logical operation
        System.out.println("Logical operation (a > b && !(a > c)): " + (a > b && !(a > c)));

        // Arithmetic operations
        System.out.println("Sum of a and b: " + (a + b));

        // Increment operations
        System.out.println("Post increment of a: " + (a++));
        System.out.println("Pre increment of a: " + (++a));
        System.out.println("Final value of a: " + a);

        scanner.close(); // Closing the scanner to avoid resource leaks
    }

    // Method to add two integers
    private static int add(int a1, int a2) {
        return a1 + a2;
    }
}
