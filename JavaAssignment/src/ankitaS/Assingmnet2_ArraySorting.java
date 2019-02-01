
//this class contains method to sort array in descending order
package ankitaS;

public class Assingmnet2_ArraySorting {

	int[] sortArray(int array[]) { // method to sort array in descending order
		int size = array.length;
		int temp;
		// int sortArray[]= new int[size];
		for (int i = 0; i < size; i++) {

			for (int j = (i + 1); j < size; j++) {

				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}
		System.out.println("elements in descending order");
		for (int array_index = 0; array_index < size; array_index++) {

			System.out.println(array[array_index]);
		}
		return array;
	}

}
