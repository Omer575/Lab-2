package Lab2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Write a program that asks user for the number of males and the number of
		// females registered in a class. The program should display the percentage of
		// males and females in the class.

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of males in the class:");
		int numMalesInClass = scan.nextInt();

		System.out.println("Enter the number of females in the class:");
		int numFemalesInClass = scan.nextInt();

		percMalesAndFemalesInClass(numMalesInClass, numFemalesInClass);

	}

	public static void percMalesAndFemalesInClass(int males, int females) {

		int totalClass = males + females;

		int percMales, percFemales;

		percMales = (males * 100) / totalClass;

		percFemales =(females * 100) / totalClass;

		System.out.println("The percentage of males in class is: " + percMales + "%");
		System.out.println("The percentage of females in class is: " + percFemales + "%");

	}
}
