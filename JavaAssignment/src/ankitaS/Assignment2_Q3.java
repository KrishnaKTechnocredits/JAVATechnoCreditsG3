package ankitaS;

import java.util.Scanner;

public class Assignment2_Q3 {

	Scanner scanner = new Scanner(System.in);

	void NumberCheck(int array[]) {   //method to check whether number3 is present or not

		boolean flag = false;
		System.out.println("Enter the number you want to check ");
		int number = scanner.nextInt();
		for (int array_index = 0; array_index < array.length; array_index++) {

			if (array[array_index] == number) {
				System.out.println("This number is present");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("This number is not present");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFromUser input = new InputFromUser();
		int array[] = input.InputArray();
		Assignment2_Q3 assignment2_Q3 = new Assignment2_Q3();
		assignment2_Q3.NumberCheck(array);
	}

}
