package ankitaS;

import java.util.Scanner;

public class Assignment2_Q1 {

	Scanner scanner = new Scanner(System.in);

	int[] InputArray() { // method to iput value in array
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();

		int array[] = new int[size - 1]; // since one number will be missing
		System.out.println("Enter value in array");
		for (int array_index = 0; array_index < array.length; array_index++) {
			array[array_index] = scanner.nextInt();
		}
		/*
		 * for(int i=0; i<array.length;i++){ System.out.println(array[i]); }
		 */
		return array;
	}

	int FindMissingNum(int array[]) { // method to find missing number

		int n = array.length + 1; // since one of the element is missing from
									// array

		int expectedSum = n * (n + 1) / 2;

		int ActualSum = 0;
		for (int array_index = 0; array_index < array.length; array_index++) {
			ActualSum += array[array_index];
		}

		int missingNum = expectedSum - ActualSum;
		return missingNum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2_Q1 missingNumber = new Assignment2_Q1();
		int[] num = missingNumber.InputArray();
		int answer = missingNumber.FindMissingNum(num);
		System.out.println("Missing number is : " + answer);
	}

}
