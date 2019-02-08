package ankitaS;

import java.util.Scanner;

public class Assignment3_Q6 {
	Scanner scanner = new Scanner(System.in);

	int marks;

	void inputFromUser() { // method to take marks from user
		System.out.println("Enter marks of student :");
		marks = scanner.nextInt();
	}

	void marksCheck(int marks) { // method to find grade of marks
		this.marks = marks;
		int Case = 0;
		if (marks > 75 && marks < 100) {
			Case = 1;
		} else if (marks < 75 && marks > 50) {
			Case = 2;
		} else
			Case = 3;
		switch (Case) {

		case 1:

			System.out.println("Grade Distinction");

			break;
		case 2:

			System.out.println("Grade 1st Class");

			break;
		case 3:

			System.out.println("Grade Failed");

			break;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3_Q6 Assignment3_Q6 = new Assignment3_Q6();
		Assignment3_Q6.inputFromUser();
		Assignment3_Q6.marksCheck(Assignment3_Q6.marks);

	}

}
