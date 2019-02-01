
//program to find mismatch element between two array and find the highest element among two.

package ankitaS;

public class Assignment2_Q10 {

	void ValueofMismatchElement(int array1[], int array2[]) { // method to find
																// mismatch and
																// compare two
																// element
		int array_index = 0;
		boolean flag = true;
		int count = 0;
		if (array1.length == array2.length) {

			for (array_index = 0; array_index < array1.length; array_index++) {

				if (array1[array_index] != array2[array_index]) {
					flag = false;
					count++;
					System.out.println("Values are not matching at index -> " + array_index);

					if (array1[array_index] > array2[array_index]) {

						System.out.println(" From " + "(" + array1[array_index] + "," + array2[array_index] + ") "
								+ "max value is " + array1[array_index]);
					} else {
						System.out.println(" From " + "(" + array1[array_index] + "," + array2[array_index] + ") "
								+ "max value is " + array2[array_index]);

					}
				}
			}

			if (flag == true) {
				System.out.println("Two array are equal");
			} else {
				System.out.println("Two array are not equal at times = " + count);
			}

		}

		else {
			System.out.println("Array length should be equal");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFromUser input = new InputFromUser();

		Assignment2_Q10 assignment2_Q10 = new Assignment2_Q10();
		int array1[] = input.InputArray();
		int array2[] = input.InputArray();
		assignment2_Q10.ValueofMismatchElement(array1, array2);
	}

}
