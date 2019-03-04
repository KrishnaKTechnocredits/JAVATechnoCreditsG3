//Program to get sum of elements of an Array
package ankitaS;

import java.util.Scanner;

public class Assignment4_Q10 {

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

	int sumOfArrayElement(int array[]) { // method to sum elements of an array
		int sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum = sum + array[index];
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q10 Assignment4_Q10 = new Assignment4_Q10();
		int array1[] = Assignment4_Q10.arrayInputFromUser();
		int array2[] = Assignment4_Q10.arrayInputFromUser();
		int sum1 = Assignment4_Q10.sumOfArrayElement(array1);
		int sum2 = Assignment4_Q10.sumOfArrayElement(array2);
		System.out.println("Sum of array elements are : " + (sum1 + sum2));
	}

}
