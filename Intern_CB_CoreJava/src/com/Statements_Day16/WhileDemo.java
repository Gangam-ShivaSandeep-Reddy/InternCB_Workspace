package com.Statements_Day16;

public class WhileDemo {

	public static void main(String[] args) {

		int i = 0;
		while (true) {
			System.out.print(i + " ");
			i++;
			if (i == 3) {
				continue;
			}

			if (i == 2) {
				break;
			}
		}

		do {
			System.out.println(i + " do while ");
			i++;
		} while (i < 5);

		System.out.println("END");
	}
}

