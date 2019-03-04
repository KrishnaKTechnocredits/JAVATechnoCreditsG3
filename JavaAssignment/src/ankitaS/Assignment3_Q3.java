package ankitaS;

import java.util.Scanner;

public class Assignment3_Q3 {
	Scanner scanner = new Scanner(System.in);
	int year;

	int inputFromUser() { // method to take input from user
		System.out.println("Enter any year ");
		year = scanner.nextInt();
		return year;
	}

	void leapYearCheck(int year) { // method for leap year check
		if (year % 4 == 0) {
			System.out.println("This is a Leap Year");
		} else
			System.out.println("This is not a Leap Year");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3_Q3 Assignment3_Q3 = new Assignment3_Q3();
		Assignment3_Q3.inputFromUser();
		Assignment3_Q3.leapYearCheck(Assignment3_Q3.year);
	}

}
