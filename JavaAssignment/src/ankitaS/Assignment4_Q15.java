package ankitaS;

import java.util.Scanner;

public class Assignment4_Q15 {
	Scanner scanner = new Scanner(System.in);

	String[] inputFromUser() // method to take input from user
	{
		System.out.println("Enter length of array");
		int arraylength = scanner.nextInt();
		String[] userArray = new String[arraylength];

		for (int index = 0; index < userArray.length; index++) {
			System.out.println("enter a string");
			userArray[index] = scanner.next();
		}
		return userArray;
	}

	void CalculateStringlength(String[] userArray) { // method to calculate
														// length of string and
														// check with user
														// defined count
		System.out.println("Enter count of letters for which you want to check");
		int count = scanner.nextInt();
		int[] lengthArray = new int[userArray.length];
		for (int index = 0; index < userArray.length; index++) {
			String[] lengthCount = userArray[index].split("");
			int lengthCountOfString = lengthCount.length;
			for (int index2 = 0; index2 < userArray.length; index2++) {
				lengthArray[index2] = lengthCountOfString;
			}
			if (lengthCountOfString >= count) {
				System.out.println("Output is : " + userArray[index]);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q15 Assignment4_Q15 = new Assignment4_Q15();
		String userArray[] = Assignment4_Q15.inputFromUser();
		Assignment4_Q15.CalculateStringlength(userArray);
	}

}
