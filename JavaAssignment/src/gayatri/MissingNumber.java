//Q1.Missing number in integer array

package gayatri;

import java.util.Scanner;

public class MissingNumber {
	void test()
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int[] num = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

		for (int Index = 0; Index < num.length; Index++)
		{
			sum += (num[Index]);//sum of all num of arrays
		}
		
		System.out.println("Sum is " + sum);
		int total = ((num.length * (num.length + 1)) / 2);
		System.out.println("Total of arr is " + total);
		int MissingNum = (sum - total);
		System.out.println("Missing number is " + MissingNum);

	}

		public static void main(String[] args) {
		
		MissingNumber m = new MissingNumber();
		m.test();
	}

}