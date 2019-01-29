//Q2.Duplicate number 
package gayatri;

import java.util.Scanner;

public class DuplicateNum{

	//Enter numbers like 1 2 4 3 3
	void number()
		{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("please enter numbers : ");
		for (int i = 0; i <= 4; i++)
		{
			num[i] = sc.nextInt();
		}
		int duplicate[] = new int[5];

		for (int index1 = 0;index1 <=num.length-1;index1++)
		for (int index2 =index1 + 1;index2<num.length;index2++)

			{
				if ((num[index1]) == num[index2])

				{
					System.out.println("duplicate found " + num[index1]);
				}

			}
	}

	public static void main(String[] args) {

		DuplicateNum d = new DuplicateNum();
		d.number();
	}
}
