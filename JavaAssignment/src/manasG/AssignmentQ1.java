package manasG;


public class AssignmentQ1 {
	static int Ad, Sub, Mul, Div, Rem, num1 = 10, num2 = 5;

	static void m1() {
		Ad = num1 + num2;
		System.out.println("Additon of num1 and num2 is" + Ad);
	}

	static void m2() {
		Sub = num1 - num2;
		System.out.println("Subtraction of num1 and num2 is" + Sub);
	}

	static void m3() {
		Mul = num1 * num2;
		System.out.println("Multiplication of num1 and num2 is" + Mul);
	}

	static void m4() {
		Div = num1 / num2;
		System.out.println("Division of num1 and num2 is" + Div);
	}

	static void m5() {
		Rem = num1 % num2;
		System.out.println("Remainder of num1 and num2 is" + Rem);
	}

	public static void main(String[] args) {
		m1();
		m2();
		m3();
		m4();
		m5();
	}
}
