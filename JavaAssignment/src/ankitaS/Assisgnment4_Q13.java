
//program to check whether a number is Armstrong 
package ankitaS;

import java.util.Scanner;

public class Assisgnment4_Q13 {
	Scanner scanner = new Scanner(System.in);

	int InputFromUser() { // method to take input from user
		System.out.println("Enter any number");
		return scanner.nextInt();
	}

	int sumOfCubes(int number) { // method to return sum of cubes of number

		int sum = 0;
		while (number > 0) {
			int num1 = number % 10;
			sum = sum + (num1 * num1 * num1);
			number = number / 10;
		}

		return sum;

	}

	void checkArmstrong(int sum, int number) { // method to check whether a
												// number is Armstrong
		if (sum == number) {
			System.out.println(number + " is an Armstrong number");
		} else
			System.out.println(number + " is not an Armstrong number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assisgnment4_Q13 Assisgnment4_Q13 = new Assisgnment4_Q13();
		int number = Assisgnment4_Q13.InputFromUser();
		int sum = Assisgnment4_Q13.sumOfCubes(number);
		Assisgnment4_Q13.checkArmstrong(sum, number);

	}

}
