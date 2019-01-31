/** Assignment 2 Q1 - Find the missing number in integer array of 1 to 10 
 * 
 */

package sneahaal;

/**
 * 
 * @author Sneahaal Garge
 *
 */

import java.util.Scanner;

public class SGA2Q1MissingNumber {

	/**
	 * This method collects input from user i.e 10 integer values in range of
	 * 1-10
	 * 
	 * @return int[]
	 */

	static int[] getTenNumbers() {

		Scanner scObj1 = new Scanner(System.in);
		int[] numberArray = new int[10];
		System.out.println("Enter 10 numbers in the range of 1 to 10 AND SKIP ONE NUMBER : ");
		for (int index = 0; index < numberArray.length; index++) {

			numberArray[index] = scObj1.nextInt();

		}
		scObj1.close();
		return numberArray;

	}

	/**
	 * This method will check missing numbers from 1-10 in user given input
	 * 
	 * @param inputNumArray
	 */
	void checkMissingNumber(int[] inputNumArray) {

		boolean flag = false;
		for (int checkNumber = 1; checkNumber <= 10; checkNumber++) {

			for (int index = 0; index < inputNumArray.length; index++) {
				if (inputNumArray[index] == checkNumber)
					break;
				if (index == (inputNumArray.length - 1)) {
					flag = true;
					System.out.println("Missing number is: " + checkNumber);
				}
			}

		}
		if (flag == false)
			System.out.println("There are no Missing numbers");
	}

	/**
	 * This is main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] userInput = new int[10];
		userInput = SGA2Q1MissingNumber.getTenNumbers();
		SGA2Q1MissingNumber missingNum = new SGA2Q1MissingNumber();
		missingNum.checkMissingNumber(userInput);
	}

}
