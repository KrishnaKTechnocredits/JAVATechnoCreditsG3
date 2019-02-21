package ankitaS;

import java.util.Scanner;

public class Assignment4_Q9 {
	Scanner scanner = new Scanner(System.in);

	int[] arrayInputFromUser() // method to take input from user
	{
		System.out.println("enter length of array");
		int arrayLength = scanner.nextInt();
		int array[] = new int[arrayLength];
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter value");
			array[index] = scanner.nextInt();
		}
		return array;
	}

	float averageOfArrayElement(int array[]) { // method to get average of
												// element of array
		float length = array.length;
		float sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum = sum + array[index];
		}
		float Average = sum / length;
		return Average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q9 Assignment4_Q9 = new Assignment4_Q9();
		int array[] = Assignment4_Q9.arrayInputFromUser();
		System.out.println("Average of array element is : " + Assignment4_Q9.averageOfArrayElement(array));

	}

}
