//Q8 Swap Two numbers using third variable

package gayatri;

public class SwapUsingThirdVariable {
	void Swap(int first, int Second) {
		int Third = 0;
		Third = first;
		first = Second;
		Second = Third;
		System.out.println("Value of First is " + first);
		System.out.println("Value of Second is " + Second);

	}

	public static void main(String args[]) {
		SwapUsingThirdVariable S = new SwapUsingThirdVariable();
		S.Swap(4, 5);

	}
}
