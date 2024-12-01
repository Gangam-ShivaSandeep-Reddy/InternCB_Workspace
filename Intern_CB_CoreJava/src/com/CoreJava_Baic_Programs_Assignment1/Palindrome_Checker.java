package com.CoreJava_Baic_Programs_Assignment1;

import java.util.Scanner;

public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

       
        char[] charArray = original.toCharArray();
        String reversed = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }

        // Check if the original string equals the reversed string
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }

    }
}
