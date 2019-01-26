//Q9 Swap two numbers without using third variable

package gayatri;

public class SwapwithoutThird {

	void Swap(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Value of num1 is " + num1);
		System.out.println("Value of num2 is " + num2);
	}

	public static void main(String args[]) {
		SwapwithoutThird S = new SwapwithoutThird();
		S.Swap(8, 9);
	}
}
