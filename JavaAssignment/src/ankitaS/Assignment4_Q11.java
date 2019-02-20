package ankitaS;

import java.util.Scanner;

public class Assignment4_Q11 {

	Scanner scanner = new Scanner(System.in);

	int inputFromUser() {  //method to take input from user

		System.out.println("Enter any number");
		return scanner.nextInt();
	}

	int numberReverse(int number) { //method to get reverse of any number
		String numRev = "";
		while (number > 0) {
			int num1 = number % 10;
			numRev = numRev + num1;
			number = number / 10;
		}

		return Integer.parseInt(numRev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q11 Assignment4_Q11 = new Assignment4_Q11();
		int number = Assignment4_Q11.inputFromUser();
		int numRev = Assignment4_Q11.numberReverse(number);

		// System.out.println("Number is : "+number+"Rev number : "+numRev);
		if (numRev == number) {
			System.out.println("Number is Palindrome");
		} else
			System.out.println("Number is not Palindrome");
	}

}
