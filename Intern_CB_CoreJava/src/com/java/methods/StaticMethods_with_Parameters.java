package com.java.methods;

public class StaticMethods_with_Parameters {

    // Static method with parameters
    public static void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to the world of Java!");
    }

    public static void main(String[] args) {
        // Calling the static method with a parameter
        greet("Methods");
    }
}
