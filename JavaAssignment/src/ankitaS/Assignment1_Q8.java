package ankitaS;

public class Assignment1_Q8 {

	void Swap(int a, int b) { // method to swap two numbers
		System.out.println("Your numbers are : " + a + " " + b);
		int temp = a;
		a = b;
		b = temp;

		System.out.println("Your numbers after swap are : " + a + " " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1_Q8 s = new Assignment1_Q8();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		s.Swap(a, b);
	}

}
