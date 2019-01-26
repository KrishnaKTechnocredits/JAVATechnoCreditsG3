package ankitaS;

public class Assignment1_Q1 {

	int Addition(int num1, int num2) { // method to perform addition

		return num1 + num2;
	}

	int Subtraction(int num3, int num4) { // method to perform subtraction

		return num3 - num4;
	}

	int Multiplication(int num5, int num6) { // method to perform multiplication

		return num5 * num6;
	}

	int Division(int num7, int num8) { // method to perform division

		return num7 / num8;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1_Q1 a = new Assignment1_Q1();
		System.out.println("Addition of two numbers = " + a.Addition(50, 50));
		System.out.println("Subtraction of two numbers = " + a.Subtraction(80, 40));
		System.out.println("Multiplication of two numbers = " + a.Multiplication(5, 4));
		System.out.println("Division of two numbers = " + a.Division(40, 8));

	}

}
