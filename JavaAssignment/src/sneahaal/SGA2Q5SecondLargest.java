/**
 * Assignment 2 Q 5 - Find second largest element in an array of integers
 */
package sneahaal;

/**
 * This program finds the second largest number in user given input 
 * @author Sneahaal Garge
 *
 */
import java.util.Scanner;

public class SGA2Q5SecondLargest {

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
	 * This method finds the Second Largest number in user given Integer List
	 * 
	 * @param userInput
	 */
	void secondLargest(int[] userInput) {

		int max = userInput[0];
		int secondMax = userInput[0];

		for (int i = 1; i < userInput.length; i++) {

			if (userInput[i] > max) {
				secondMax = max;
				max = userInput[i];
			} else if (userInput[i] < max && userInput[i] > secondMax) {
				secondMax = userInput[i];
			} else if (max == secondMax) {
				secondMax = userInput[i];
			}

		}

		System.out.println("Second Largest number in given series is : " + secondMax);

	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] userInputArray = SGA2Q5SecondLargest.getUserInputAsArray();
		new SGA2Q5SecondLargest().secondLargest(userInputArray);

	}

}
