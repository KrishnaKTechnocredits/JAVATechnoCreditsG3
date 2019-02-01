
//program to find duplicate number

package ankitaS;

public class Assignment2_q2 {

	int duplicateNumber(int array[]) { // method to find duplicate number
		int temp = 0;

		for (int array_index = 0; array_index < array.length; array_index++) {

			for (int a_index = array_index + 1; a_index < array.length; a_index++) {
				if (array[array_index] == array[a_index]) {

					temp = array[array_index];
					System.out.println("Duplicate Number is : " + temp);
				}
			}
		}

		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFromUser input = new InputFromUser(); // created object of class
													// InputFromUser
		int array[] = input.InputArray();
		Assignment2_q2 assignment2_q2 = new Assignment2_q2();
		assignment2_q2.duplicateNumber(array);
	}

}
