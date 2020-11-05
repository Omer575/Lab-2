package Lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
//		 Write a program that will ask the user to enter the amount of a purchase. The
//		 program should then compute the state and county tax sales tax. Assume the
//		 state sales tax is 4 percent and the county sales tax is 2 percent. The
//		 program should display the amount of the purchase , the state sales tax, the
//		 county sales tax, the total sales tax, and the total of the sale (which is
//		 the sum of the amount of purchase plus the total sales tax)

		double amountPurchase;
		double taxAmountState;
		double taxAmountCounty;
		double totalSalesTax;
		double totalOfTheSale;

		final double stateSalesTax = 0.04;
		final double countySalesTax = 0.02;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of a purchase");
		amountPurchase = scan.nextDouble();

		taxAmountState = amountPurchase * stateSalesTax;
		taxAmountCounty = amountPurchase * countySalesTax;
		totalSalesTax = taxAmountState + taxAmountCounty;
		totalOfTheSale = amountPurchase + totalSalesTax;

		System.out.println("Amount of the purchase: $" + amountPurchase);
		System.out.println("The state sales tax: $" + taxAmountState);
		System.out.println("Total of sales tax: $" + totalSalesTax);
		System.out.println("Total of the sale with all sales tax : $" + totalOfTheSale);
	}
}
