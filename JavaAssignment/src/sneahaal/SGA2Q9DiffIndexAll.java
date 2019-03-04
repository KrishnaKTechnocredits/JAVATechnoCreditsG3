/*
 * Assignment 2 Q 9 - Find all differ index from given arrays
 */

package sneahaal;

/**
 * This program finds all the indies where the Array values differ 
 * @author Sneahaal Garge
 *
 */

import java.util.Scanner;

public class SGA2Q9DiffIndexAll {

	static int[] userInputArray1;
	static int[] userInputArray2;

	/**
	 * This method accepts a list of Integers from user
	 * 
	 * @return int[]
	 */

	static void get2UserInputAsArray() {

		int totalNos = 0;
		Scanner scObj1 = new Scanner(System.in);
		System.out.println("Enter array size you wish to input : ");
		totalNos = scObj1.nextInt();
		userInputArray1 = new int[totalNos];
		System.out.println("Start entering the nos for 1st Array: ");
		for (int arrayIndex = 0; arrayIndex < totalNos; arrayIndex++) {
			userInputArray1[arrayIndex] = scObj1.nextInt();
		}
		userInputArray2 = new int[totalNos];
		System.out.println("Start entering the nos for 2nd Array: ");
		for (int arrayIndex = 0; arrayIndex < totalNos; arrayIndex++) {
			userInputArray2[arrayIndex] = scObj1.nextInt();
		}
		scObj1.close();

	}

	/*
	 * This method checks if the arrays are equal
	 */

	void checkArrayEqual() {

		boolean flag = false;
		for (int arrayIndex = 0; arrayIndex < userInputArray1.length; arrayIndex++) {

			if (userInputArray1[arrayIndex] == userInputArray2[arrayIndex])
				continue;
			else {
				flag = true;
				System.out.println("Difference is observed at index : " + arrayIndex);
				System.out.println("Array1 Value : " + userInputArray1[arrayIndex]);
				System.out.println("Array2 Value : " + userInputArray2[arrayIndex]);

			}
		}
		if (flag == false)
			System.out.println("The Two arrays are equal");
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		SGA2Q9DiffIndexAll.get2UserInputAsArray();
		new SGA2Q9DiffIndexAll().checkArrayEqual();

	}
}
