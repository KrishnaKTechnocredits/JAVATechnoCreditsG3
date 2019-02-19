
//Program to reverse any user given number
package ankitaS;

import java.util.Scanner;

public class Assignment4_Q5 {
	Scanner scanner = new Scanner(System.in);

	int InputFromUser() { // method to take input from user
		System.out.println("Enter any number");
		return scanner.nextInt();
	}

	String numberReverse(int number) { // method to get number in reverse order
		String Revnumber = "";
		while (number > 0) {
			int a = number % 10;
			number = number / 10;
			Revnumber = Revnumber + a;
		}
		return Revnumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q5 Assignment4_Q5 = new Assignment4_Q5();
		int number = Assignment4_Q5.InputFromUser();
		String numbeRev = Assignment4_Q5.numberReverse(number);
		System.out.println("Number in reverse is as : " + numbeRev);
	}

}
