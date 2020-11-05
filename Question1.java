package Lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// Write a program with a loop that lets the user enter a series of integer
		// numbers. After all the numbers have been entered, the program should display
		// the largest and smallest numbers entered.

		String yesOrNo = "1";

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first number:");
		int smallestNum = scan.nextInt();
		int biggestNum = smallestNum;

		while (yesOrNo.equals("1")) {

			System.out.println("Enter your next number:");
			int nextNum = scan.nextInt();

			if (nextNum > biggestNum) {
				biggestNum = nextNum;
			}

			System.out.println("Do you want to enter another number: 0-No, 1-Yes");
			yesOrNo = scan.next();
		}

		System.out.println("Smallest number is: " + smallestNum);
		System.out.println("Largest number is: " + biggestNum);
	}
}
