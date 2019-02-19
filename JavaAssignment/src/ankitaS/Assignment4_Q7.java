//fibonacci series
package ankitaS;

import java.util.Scanner;

public class Assignment4_Q7 {
	Scanner scanner = new Scanner(System.in);

	int InputFromUser() { // method to take input from user
		System.out.println("Enter any number");
		return scanner.nextInt();
	}

	int FibonacciSum(int number) { // method to find fibonacci sum
		int sum = 1;
		while (number > 0) {

			sum = sum * number;
			number = number - 1;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q7 Assignment4_Q7 = new Assignment4_Q7();
		int number = Assignment4_Q7.InputFromUser();
		int sum = Assignment4_Q7.FibonacciSum(number);
		System.out.println("Output = " + sum);
	}

}
