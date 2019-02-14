package ankitaS;

import java.util.Scanner;

public class Assignment2_Q7 {
	Scanner scanner = new Scanner(System.in);

	void sumCheckfromArrayElement(int array[]) {
		boolean flag = true;
		System.out.println("Please enter sum ");

		int sum = scanner.nextInt();
		for (int array_index = 0; array_index < (2); array_index++) {

			for (int array_index2 = array_index + 1; array_index2 < 4; array_index2++) {

				if ((array[array_index] + array[array_index2]) == sum) {
					flag = false;
					System.out.println("Integers numbers whose sum are equal to value : " + sum);
					System.out.println("(" + array[array_index] + "," + array[array_index2] + ")");
				}

			}
		}
		if (flag == true)
			System.out.println("No such combinations found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFromUser input = new InputFromUser();
		Assignment2_Q7 assignment2_Q7 = new Assignment2_Q7();
		int array[] = input.InputArray();
		assignment2_Q7.sumCheckfromArrayElement(array);
	}

}
