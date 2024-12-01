package com.CoreJava_Baic_Programs_Assignment1;

public class Find_Largest_Number_in_an_Array {
	public class LargestNumberInArray {

		public static void main(String[] args) {
		
			int[] numbers = {1, 34, 78, 23, 56, 99, 12};

			int largest = numbers[0];

			for (int i = 1; i < numbers.length; i++) {
				if (numbers[i] > largest) {
					largest = numbers[i];
				}
			}

			System.out.println("The largest number in the array is: " + largest);
		}
	}
}
