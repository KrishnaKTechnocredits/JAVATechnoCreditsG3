//program to find second largest number
package ankitaS;

public class Assignment2_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputFromUser input = new InputFromUser();

		Assingmnet2_ArraySorting sortArray = new Assingmnet2_ArraySorting();

		int array[] = input.InputArray();
		sortArray.sortArray(array); // this method will give array sorted in
									// descending order
		System.out.println("Second largest numbers = " + array[1]);

	}

}
