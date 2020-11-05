package Lab2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Write a program that computes the tax and tip on a restaurant bill. The
		// program should ask the user to enter the charge for the meal. The tax should
		// be 6.75 percent of the meal charge. The tip should be 20 percent of the total
		// after adding tax. Display the meal charge, tax amount, tip amount, and total
		// bill on the screen.

		final double tax = 0.0675;
		final double tip = 0.20;
		double taxAmount;
		double tipAmount;

		double mealCharge;
		double totalWithTax;
		double totalBill;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the charge for the meal");
		mealCharge = scan.nextDouble();

		taxAmount = mealCharge * tax;
		totalWithTax = mealCharge + taxAmount;
		tipAmount = totalWithTax * tip;
		totalBill = totalWithTax + tipAmount;

		System.out.println("Your meal charge is: $" + mealCharge);
		System.out.println("Your tax is: $" + taxAmount);
		System.out.println("Your tip is: $" + tipAmount);
		System.out.println("Your total bill will be: $" + totalBill);

	}
}
