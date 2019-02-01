/**
 * Find max value at differed index
 */

package sneahaal;

/**
 * This program finds the maximum of the two values at the differed Index
 * @author Sneahaal Garge
 *
 */

import java.util.Scanner;

public class SGA2Q10DiffIndexAllMax {

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
	 * This method checks if the arrays are equal and prints the indices at
	 * which values are different along with the max value
	 */

	void checkArrayEqual() {

		boolean flag = false;
		int max;
		for (int arrayIndex = 0; arrayIndex < userInputArray1.length; arrayIndex++) {

			if (userInputArray1[arrayIndex] == userInputArray2[arrayIndex])
				continue;
			else {
				flag = true;
				System.out.println("Difference is observed at index : " + arrayIndex);
				if (userInputArray1[arrayIndex] > userInputArray2[arrayIndex])
					max = userInputArray1[arrayIndex];
				else
					max = userInputArray2[arrayIndex];
				System.out.println("(" + userInputArray1[arrayIndex] + "," + userInputArray2[arrayIndex]
						+ ") : Max value is : " + max);
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

		SGA2Q10DiffIndexAllMax.get2UserInputAsArray();
		new SGA2Q10DiffIndexAllMax().checkArrayEqual();

	}

}
