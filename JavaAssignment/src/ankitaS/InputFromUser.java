//this class has method to take input from user

package ankitaS;

import java.util.Scanner;

public class InputFromUser { // method to take input from user

	Scanner scanner = new Scanner(System.in);

	int[] InputArray() {
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();

		int array[] = new int[size]; // array for input
		System.out.println("Enter value in array");
		for (int array_index = 0; array_index < array.length; array_index++) {
			array[array_index] = scanner.nextInt();
		}

		return array;
	}
}
