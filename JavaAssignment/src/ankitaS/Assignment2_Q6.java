//program to check equality of two array
package ankitaS;

public class Assignment2_Q6 {

	void CheckEqualityofArray(int array1[], int array2[]) { // method to check
															// equality of two
															// array
		boolean flag = true;
		if (array1.length == array2.length) {

			for (int array_index = 0; array_index < array1.length; array_index++) {

				if (array1[array_index] != array2[array_index]) {
					flag = false;

				}

			}
			if (flag == true) {
				System.out.println("Two array are equal");
			} else {
				System.out.println("Two array are not equal");
			}
		} else {
			System.out.println("Array length should be equal");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFromUser input = new InputFromUser();
		Assignment2_Q6 assignment2_Q6 = new Assignment2_Q6();
		System.out.println("Enter size and element of 2 array ");
		int array1[] = input.InputArray();
		int array2[] = input.InputArray();

		assignment2_Q6.CheckEqualityofArray(array1, array2);
	}

}
