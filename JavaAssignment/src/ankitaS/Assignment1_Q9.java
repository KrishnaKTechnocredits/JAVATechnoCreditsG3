package ankitaS;

public class Assignment1_Q9 {
	void Swap(int a, int b) { // method to swap 2 variables
		System.out.println("Your numbers are : " + a + " and " + b);

		b = a + b;
		a = b - a;
		b = b - a;

		System.out.println("Your numbers ag=fter swap are : " + a + " and " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1_Q9 a = new Assignment1_Q9();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		a.Swap(num1, num2);
	}

}
