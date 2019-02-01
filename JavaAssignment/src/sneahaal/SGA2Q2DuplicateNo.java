/**
 * Assignment 2 Q 2 - Find duplicate number on Integer array
 */

package sneahaal;

/**
 * This program collect an integer array from User and then check for duplicate nos
 * @author Sneahaal Garge
 *
 */

import java.util.Scanner;

public class SGA2Q2DuplicateNo {

	/**
	 * This method asks User for no of inputs and then collects the input in Int
	 * Array and returns it
	 * 
	 * @return int[]
	 */
	static int[] getUserInputAsArray() {

		int totalNos = 0;
		Scanner scObj1 = new Scanner(System.in);
		System.out.println("Enter no of numbers you wish to input : ");
		totalNos = scObj1.nextInt();
		int[] inputArray = new int[totalNos];
		System.out.println("Start entering the nos : ");
		for (int arrayIndex = 0; arrayIndex < totalNos; arrayIndex++) {
			inputArray[arrayIndex] = scObj1.nextInt();
		}
		scObj1.close();
		return inputArray;
	}

	/**
	 * This method checks for duplicate nos in the array and prints output
	 * accordingly
	 * 
	 * @param userInput
	 */

	void checkDuplicateInArray(int[] userInput) {

		int[] workingArray = userInput;
		int[] duplicateNo = new int[userInput.length / 2];
		int duplicateArrayIndex = 0;
		int array1Index, array2Index;
		boolean flag = false;

		for (array1Index = 0; array1Index < userInput.length; array1Index++) {

			if (flag == true && checkNum(userInput[array1Index], duplicateNo))
				break;

			for (array2Index = 0; array2Index < workingArray.length; array2Index++) {

				if (userInput[array1Index] == workingArray[array2Index] && array1Index != array2Index) {

					flag = true;
					duplicateNo[duplicateArrayIndex] = userInput[array1Index];
					if (duplicateArrayIndex <= duplicateNo.length - 1) {
						duplicateArrayIndex++;
						break;
					}
				}
			}

		}

		if (flag == false) {
			System.out.println("There are no duplicates in user Input!");
		} else {
			System.out.println("Duplicate Nos in User Input are: ");
			for (int j = 0; j < duplicateArrayIndex; j++) {
				System.out.println(duplicateNo[j]);
			}

		}
	}

	/**
	 * This method checks if given number is part of the duplicate array
	 * 
	 * @param num
	 * @param duplicateArray
	 * @return
	 */
	boolean checkNum(int num, int[] duplicateArray) {

		for (int i = 0; i < duplicateArray.length; i++) {
			if (duplicateArray[i] == num) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] userInputArray = SGA2Q2DuplicateNo.getUserInputAsArray();
		new SGA2Q2DuplicateNo().checkDuplicateInArray(userInputArray);

	}
}
