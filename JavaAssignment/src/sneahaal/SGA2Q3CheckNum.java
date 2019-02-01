/**
 * Assignment 2 Q 3 - Check if array contains a number
 */
package sneahaal;

/**
 * This program accepts 2 inputs from user
 * 1. Number Array
 * 2. Number to be searched in the Array
 * @author Sneahaal Garge
 */
import java.util.Scanner;

public class SGA2Q3CheckNum {

	static int searchNum;

	/**
	 * This method gets Number Array and Number to be searched from the user
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
		System.out.println("Enter the number you wish to search : ");
		searchNum = scObj1.nextInt();
		scObj1.close();
		return inputArray;

	}

	/**
	 * This method checks if Search number is present in the User Array
	 * 
	 * @param num
	 * @param userArray
	 * @return boolean
	 */
	boolean checkNum(int num, int[] userArray) {

		for (int i = 0; i < userArray.length; i++) {
			if (userArray[i] == num) {
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

		int[] userInputArray = SGA2Q3CheckNum.getUserInput();
		boolean checkStatus = new SGA2Q3CheckNum().checkNum(searchNum, userInputArray);
		if (checkStatus == true)
			System.out.println("Number: " + searchNum + " is present in Array");
		else
			System.out.println("Number: " + searchNum + " is NOT PRESENT in Array");
	}

}
