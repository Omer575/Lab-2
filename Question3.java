package Lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Write a program that asks the user for a positive nonzero integer value. The
		// program should use a loop to get the sum of all the integers from 1 up to the
		// number entered
		Scanner scan = new Scanner(System.in);

		String enterMore = "Yes";
		int sum = 0;

		while (enterMore.equalsIgnoreCase("Yes")) {

			System.out.println("Enter a number:");
			int num = scan.nextInt();

			if (num > 0) {
				sum += num;
			}

			System.out.println("Do you want to enter another number: Yes or No?");
			enterMore = scan.next();

		}
		System.out.println("You total is : " + sum);
	}
}
