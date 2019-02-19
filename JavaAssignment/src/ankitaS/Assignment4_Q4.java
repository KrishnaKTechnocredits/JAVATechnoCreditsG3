//program to find sum of user given number
package ankitaS;

import java.util.Scanner;

public class Assignment4_Q4 {

	Scanner scanner = new Scanner(System.in);

	int InputFromUser() { // method to take input from user
		System.out.println("Enter any number : ");

		return scanner.nextInt();
	}

	int sumOfNumber(int number) { // method to get sum of number

		int sum = 0;
		while (number > 0) {

			int num1 = number % 10;
			sum = sum + num1;
			number = number / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q4 Assignment4_Q4 = new Assignment4_Q4();
		int number = Assignment4_Q4.InputFromUser();
		int sum = Assignment4_Q4.sumOfNumber(number);

		System.out.println("Sum of given number = " + sum);
	}

}
