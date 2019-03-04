package ankitaS;

import java.util.Scanner;

public class Assignment4_Q2 {
	Scanner scanner = new Scanner(System.in);

	String[] inputFromUser() { // method to take input string from user
		// System.out.println("Enter the number of string you want to enter");
		// int count=scanner.nextInt();
		String array[] = new String[4];

		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter a String");
			array[index] = scanner.nextLine();
		}
		return array;
	}

	void maxLengthString(String array[]) { // method to calculate length of
											// string and print string with max
											// length
		String temp = "";
		for (int index1 = 0; index1 < array.length; index1++) {

			for (int index2 = index1 + 1; index2 < array.length; index2++) {
				if (array[index1].length() < array[index2].length()) {
					temp = array[index2];
					array[index2] = array[index1];
					array[index1] = temp;

				}
			}
		}
		System.out.println("Max length string is : " + array[0]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q2 Assignment4_Q2 = new Assignment4_Q2();
		String array[] = Assignment4_Q2.inputFromUser();
		Assignment4_Q2.maxLengthString(array);

	}

}
