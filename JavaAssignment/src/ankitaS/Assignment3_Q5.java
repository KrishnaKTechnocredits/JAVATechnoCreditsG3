package ankitaS;

import java.util.Scanner;

public class Assignment3_Q5 {
	Scanner scanner = new Scanner(System.in);

	int inputFromUser() { // method to take input from user

		System.out.println("Enter the number");
		int num = scanner.nextInt();
		return num;
	}

	String dayOfWeek(int num) { // method to find day of week

		String weekday;
		int number = num % 7;
		switch (number) {
		case 1:
			weekday = "Monday";
			break;
		case 2:
			weekday = "Tuesday";
			break;
		case 3:
			weekday = "Wednesday";
			break;
		case 4:
			weekday = "Thrusday";
			break;
		case 5:
			weekday = "Friday";
			break;
		case 6:
			weekday = "Saturday";
			break;
		case 0:
			weekday = "Sunday";
			break;
		default:
			weekday = "Invalid number";
			break;
		}
		// System.out.println(weekday);
		return weekday;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3_Q5 assignment3_Q5 = new Assignment3_Q5();
		int num = assignment3_Q5.inputFromUser();
		String day = assignment3_Q5.dayOfWeek(num);
		System.out.println("Day of week : " + day);
	}

}
