package ankitaS;

import java.util.Scanner;

public class Assignment2_Q4 {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFromUser input = new InputFromUser();
		int array[] = input.InputArray();
		Assingmnet2_ArraySorting a = new Assingmnet2_ArraySorting();
		a.sortArray(array);
		System.out.println("Highest number is = " + array[0]);
		System.out.println("Smallest number is = " + array[array.length - 1]);
	}

}
