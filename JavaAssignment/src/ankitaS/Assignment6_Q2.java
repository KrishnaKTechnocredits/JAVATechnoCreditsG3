//Program to handle null pointer Exception

package ankitaS;

public class Assignment6_Q2 {

	void arrayOperation() { // method for iterating array

		int array[] = { 1, 2, 3, 4, 5, 6 };
		try {
			for (int index = 0; index <= array.length; index++) {

				System.out.println(array[index]);
			}
			System.out.println("array iterated");
		} catch (RuntimeException e) {
			System.out.println("Array index starts from 0. So this exception when array is iterated till length");
			System.out.println("you have completed catch block");
		}
	}

	/*
	 * void arrayOperation() { // method for iterating array
	 * 
	 * int array[] = { 1, 2, 3, 4, 5, 6 }; for (int index = 0; index <=
	 * array.length; index++) {
	 * 
	 * System.out.println(array[index]); } System.out.println("array iterated");
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6_Q2 Assignment6_Q2 = new Assignment6_Q2();
		Assignment6_Q2.arrayOperation();

	}

}
