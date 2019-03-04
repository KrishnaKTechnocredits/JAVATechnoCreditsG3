/**
 * Assignment 2 Q 4 - Largest and smallest number in unsorted array
 */

package sneahaal;

/**
 * This program accepts Integer Array from User and prints the max and Min of the two
 * @author Sneahaal
 *
 */
import java.util.Scanner;

public class SGA2Q4LargestSmallest {

	/**
	 * This method accepts a list of Integers from user
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
	 * This methos finds the maximum and minimum number in user given Integer
	 * List
	 * 
	 * @param userInput
	 */
	void largestSmallest(int[] userInput) {

		int max = userInput[0];
		int min = userInput[0];
		for (int arrayIndex = 1; arrayIndex < userInput.length; arrayIndex++) {

			if (userInput[arrayIndex] > max)
				max = userInput[arrayIndex];
			if (userInput[arrayIndex] < min)
				min = userInput[arrayIndex];
		}

		System.out.println("Maximum number in given series is : " + max);
		System.out.println("Minimum number in given series is : " + min);
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] userInputArray = SGA2Q4LargestSmallest.getUserInputAsArray();
		new SGA2Q4LargestSmallest().largestSmallest(userInputArray);

	}

}
