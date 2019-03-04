/**
 * Assignment 3 - Classes and Objects - Create a class Addition and write add method for:
* a) add two integers
* b) add two decimal
* c) add two String
 */
package sneahaal;

/**
 * 
 * @author Sneahaal Garge
 *
 */

import java.util.Scanner;

public class Addition {

	int addInt(int x, int y) {

		return x + y;

	}

	double addDecimal(double x, double y) {

		return x + y;

	}

	String addString(String x, String y) {

		return x + y;

	}

	public static void main(String[] args) {

		Scanner scObj = new Scanner(System.in);
		Scanner scObj1 = new Scanner(System.in);
		System.out.println("Enter Integer 1 : ");
		int num1 = scObj.nextInt();
		System.out.println("Enter Integer 2 : ");
		int num2 = scObj.nextInt();
		System.out.println("******* SUMMATION OF THE TWO INTEGERS*******");
		int sum = new Addition().addInt(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("*********************************************");

		System.out.println("Enter Decimal 1 : ");
		double deci1 = scObj.nextDouble();
		System.out.println("Enter Decimal 2 : ");
		double deci2 = scObj.nextDouble();
		System.out.println("******* SUMMATION OF THE TWO DECIMALS*******");
		double deciSum = new Addition().addDecimal(deci1, deci2);
		System.out.println(deci1 + " + " + deci2 + " = " + deciSum);
		System.out.println("*********************************************");

		System.out.println("Enter String 1 : ");
		String str1 = scObj1.nextLine();
		System.out.println("Enter String 2 : ");
		String str2 = scObj1.nextLine();
		System.out.println("******* SUMMATION OF THE TWO STRINGS*******");
		String strSum = new Addition().addString(str1, str2);
		System.out.println(str1 + " + " + str2 + " = " + strSum);
		System.out.println("*********************************************");

		scObj.close();
		scObj1.close();

	}

}
