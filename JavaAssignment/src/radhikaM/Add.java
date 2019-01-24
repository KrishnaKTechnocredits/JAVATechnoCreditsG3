package radhikaM;

public class Add {

	public int division(int a, int b) {
		int division = a / b;
		return division;

	}

	public int substraction(int a, int b) {
		int substraction = a - b;
		return substraction;
	}

	public static void main(String args[]) {
		Add a = new Add();
		int sum = 0;
		sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println(sum);

		int mul = 0;
		mul = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
		System.out.println(mul);
		int div = a.division(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println("dividion " + div);

		int sub = a.substraction(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println("substraction "  + sub);


	}
}