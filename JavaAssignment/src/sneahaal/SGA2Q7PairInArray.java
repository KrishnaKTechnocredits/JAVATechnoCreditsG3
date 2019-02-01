/*
 * Assignment 2 Q 7 - Find all pairs on integer array whose sum is equal to given number
 */
package sneahaal;

/**
 * This program get User Inpt in form if Integer array and a number, 
 * then it finds the pairs in the Array that sum up to the given  number
 * @author Sneahaal
 *
 */

import java.util.Scanner;

public class SGA2Q7PairInArray {

	static int sumValue;
	static boolean pair = false;

	/**
	 * This method gets Number Array and the sumValue from the user
	 * 
	 * @return int[]
	 */
	static int[] getUserInput() {

		int totalNos = 0;
		Scanner scObj1 = new Scanner(System.in);
		System.out.println("Enter no of numbers you wish to input in the Array : ");
		totalNos = scObj1.nextInt();
		int[] inputArray = new int[totalNos];
		System.out.println("Start entering the nos : ");
		for (int arrayIndex = 0; arrayIndex < totalNos; arrayIndex++) {
			inputArray[arrayIndex] = scObj1.nextInt();
		}
		System.out.println("Enter the sum value : ");
		sumValue = scObj1.nextInt();
		scObj1.close();
		return inputArray;

	}

	/**
	 * This method finds the pair nos in Array adding up to give sum Value
	 * 
	 * @param userInput
	 */
	void pairInArray(int[] userInput) {

		int remainder;
		boolean status = false;
		for (int arrayIndex = 0; arrayIndex < userInput.length; arrayIndex++) {

			remainder = sumValue - userInput[arrayIndex];
			status = SGA2Q7PairInArray.checkNumber(remainder, userInput, arrayIndex);
			if (status == true) {
				System.out.println("Pair : (" + userInput[arrayIndex] + " , " + remainder + ")");
				pair = true;
			}
		}
		if (pair == false) {
			System.out.println("There are no Pairs adding up to given sumValue : " + sumValue);
		}

	}

	/**
	 * This method checks if remainder number is present in the User Array
	 * 
	 * @param int
	 * @param int[]
	 * @return boolean
	 */
	static boolean checkNumber(int num, int[] array, int index) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == num && i != index) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Main method of the program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int[] userInputArray = SGA2Q7PairInArray.getUserInput();
		new SGA2Q7PairInArray().pairInArray(userInputArray);

	}

}
