//program to find mismatch element between two array
package ankitaS;

public class Assignment2_Q8 {

	int indexValueofMismatchElement(int array1[], int array2[]) { // method to
																	// find
																	// index
																	// value of
																	// mismatch
																	// element
		int array_index = 0;
		boolean flag = true;
		if (array1.length == array2.length) {

			for (array_index = 0; array_index < array1.length; array_index++) {

				if (array1[array_index] != array2[array_index]) {
					flag = false;
					System.out.println("Values are not matching at index -> " + array_index);
					break;
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
		return array_index;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFromUser input = new InputFromUser();
		int array1[] = input.InputArray();
		int array2[] = input.InputArray();
		Assignment2_Q8 assignment2_Q8 = new Assignment2_Q8();
		int index = assignment2_Q8.indexValueofMismatchElement(array1, array2);

	}

}
