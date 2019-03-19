//Program to compel user to enter only integer value from 1 to 100.  Calculate sum , avg, max
package ankitaS;

import java.util.Scanner;

public class Assignment6_Q5 {
	Scanner scanner = new Scanner(System.in);

	void inputElements() {

		System.out.println("Hello!!\n You are supposed to enter any 5 number from 1 to 100");
		System.out.println("Based on requirement,count is 5 :");

		// int count = 5;
		int array[] = new int[5];
		try {
			for (int index = 1; index <= 5; index++) {
				System.out.println("Enter elements");
				int value = scanner.nextInt();
				if (value < 100)
					array[index] = value;

				else {
					System.out.println("Enter any value less than 100");

				}
			}

			// int n=array.length;
			int sum = 0;
			for (int index = 0; index < array.length; index++) {
				sum = sum + array[index];

			}
			System.out.println("Sum = " + sum);
			System.out.println("Average = " + (sum / array.length));
			int temp = 0;
			for (int i = 0; i < array.length; i++) {

				for (int j = i + 1; j < array.length; j++) {

					if (array[i] < array[j]) {
						temp = array[j];
						array[j] = array[i];
						array[i] = temp;

					}
				}
			}
			/*
			 * for(int i=0;i<array.length;i++){ System.out.println(array[i]); }
			 */

			System.out.println("Highest number = " + array[0]);
		} catch (Exception e) {
			System.out.println("Please try again and enter only integer value");
		}
		// return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6_Q5 Assignment6_Q5 = new Assignment6_Q5();
		Assignment6_Q5.inputElements();
		// Assignment6_Q5.integerOperation(array);
	}

}
