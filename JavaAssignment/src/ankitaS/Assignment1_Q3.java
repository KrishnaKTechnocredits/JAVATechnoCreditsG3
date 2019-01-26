package ankitaS;

public class Assignment1_Q3 {

	int SquareOfNumber(int num1) { // method to calculate square of a number

		return num1 * num1;
	}

	int CubeOfNumber(int num2) { // method to calculate cube of number

		return num2 * num2 * num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1_Q3 a = new Assignment1_Q3();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("Square of Number = " + a.SquareOfNumber(num1));
		System.out.println("Cube of Number = " + a.CubeOfNumber(num2));
	}

}
