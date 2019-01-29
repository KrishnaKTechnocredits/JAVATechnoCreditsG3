//Q5 find second largest num from given array
package gayatri;

public class SecondLargestNum {

	void largenum() {
		int[] arr = { 2, 3, 12, 80, 15 };
		int max = arr[0];
		int secondmax = arr[0];
		for (int index = 0; index < arr.length; index++) 
			{
				if (arr[index] > max) {
				secondmax = max;
				max = arr[index];

			}

				else if (arr[index] > secondmax) {
				secondmax = arr[index];
			}

		}
			System.out.println("Value of largest number is : " + max);
			System.out.println("second largest number is : " + secondmax);
	}

	public static void main(String[] args) {
		SecondLargestNum s = new SecondLargestNum();
		s.largenum();
	}
}
