package Lab2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// A bag of cookies holds 40 cookies. The calorie information on the bag claims
		// that there are 10 serving in the bag and that a serving equals 300 calories.
		// write a program that lets the user enter the number of cookies he or she
		// actually ate and then reports the number of total calories consumed.

		// 1 serving is equal to 4 cookies and contains 300 calories. Each cookie
		// contains 300/4= 75 calories
		Scanner scan = new Scanner(System.in);
		System.out.println("How many cookies did you eat?");
		int numCookiesAte = scan.nextInt();

		calReport(numCookiesAte);

	}

	public static void calReport(int n) {

		int repTotalCalAte = (10 * 300 / 40) * n;

		System.out.println("The number of " + n + " cookies you ate is equal to " + repTotalCalAte + " calories");
	}
}
