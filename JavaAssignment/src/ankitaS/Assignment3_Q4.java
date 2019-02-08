package ankitaS;

import java.util.Scanner;

public class Assignment3_Q4 {
	Scanner scanner = new Scanner(System.in);

	int number1;
	int number2;
	int choice;

	void inputFromUser() { // method to take input from user
		System.out.println("Enter any two number");
		number1 = scanner.nextInt();
		number2 = scanner.nextInt();
		System.out.println("Choose which operation do you want to perform : ");
		System.out.println(
				"1.Addition \n2. Substraction \n3.Multiplication \n4.Division \nJust enter any number from 1 to 4");
		choice = scanner.nextInt();
	}

	int Calculator(int operation) { // method for different operation using
									// switch case
		int sum = 0;

		switch (choice) {

		case 1:
			sum = (number1 + number2);
			System.out.println("Output is : " + sum);
			break;
		case 2:
			sum = (number1 - number2);
			System.out.println("Output is : " + sum);
			break;
		case 3:
			sum = (number1 - number2);
			System.out.println("Output is : " + sum);
			break;
		case 4:
			sum = (number1 / number2);
			System.out.println("Output is : " + sum);
			break;
		default:
			System.out.println("enter a valid number");

		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3_Q4 Assignment3_Q4 = new Assignment3_Q4();
		Assignment3_Q4.inputFromUser();
		Assignment3_Q4.Calculator(Assignment3_Q4.choice);
	}

}
