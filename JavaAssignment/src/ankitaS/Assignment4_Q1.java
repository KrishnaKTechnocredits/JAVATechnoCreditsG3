//program to find positive and negative integer and print sum
package ankitaS;

public class Assignment4_Q1 {

	void checkPositiveandNegativeInteger() { // method to seggerate positive and
												// negative number and get sum
		int array[] = { 5, 6, -9, 14, -25, 6, 7, -14 };
		// int pnum=0;
		int psum = 0;
		int nsum = 0;
		int pArray[] = new int[array.length];
		int nArray[] = new int[array.length];

		for (int array_index = 0, j = 0; array_index < array.length; array_index++, j++) {

			if (array[array_index] > 0) {
				pArray[j] = array[array_index];
				psum = psum + array[array_index];

			} else {
				nArray[j] = array[array_index];
				nsum = nsum + array[array_index];

			}
		}
		System.out.print("Positive number {");
		for (int index = 0; index < pArray.length; index++) {
			if (pArray[index] == 0)
				continue;
			System.out.print(pArray[index]);
			if (index < pArray.length - 1)
				System.out.print(",");
		}
		System.out.print("}");
		System.out.println(" ");
		System.out.print("Negative number {");
		for (int index = 0; index < nArray.length; index++) {
			if (nArray[index] == 0)
				continue;
			System.out.print(nArray[index]);
			if (index < nArray.length - 1)
				System.out.print(",");

		}
		System.out.print("}");
		System.out.println(" ");
		System.out.println("Sum of positive number " + psum);

		System.out.println("Sum of negative number " + nsum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q1 Assisgnment4_Q1 = new Assignment4_Q1();
		Assisgnment4_Q1.checkPositiveandNegativeInteger();

	}

}
