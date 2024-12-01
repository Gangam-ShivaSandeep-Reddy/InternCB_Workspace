package com.Statements_Day16;

public class ForBrNcontDemo {

	public static void main(String[] args) {

		for (int k = 0; k <= 2; k++) {
			for (int i = 0; i <= 10; i++) {

				if (i == 3) {
					continue; 
				}

				System.out.print(i + " "); 

				if (i == 8) {
					break;
				}
			}

			System.out.println(""); 

			System.out.println("K: " + k); 


			System.out.println("END"); 
		}
	}
}
