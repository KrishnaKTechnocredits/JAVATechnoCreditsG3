package gayatri;

public class Calculator {

	int sum(int x, int y)

	{
		int z = x + y;
		return z;
	}

	int sub(int x, int y) {
		int z = x - y;
		return z;
	}

	int mul(int x, int y) {
		int z = x * y;
		return z;

	}

	int div(int x, int y) {
		int z = x / y;
		return z;
	}

	int rem(int x, int y) {
		int z = x % y;
		return z;
	}

	public static void main(String[] args) {
		Calculator n = new Calculator();

		int sum = n.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		int sub = n.sub(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		int mul = n.mul(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		int div = n.div(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		int rem = n.rem(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		System.out.println("Sum is: " + sum);
		System.out.println("Div is: " + div);
		System.out.println("Mul is: " + mul);
		System.out.println("Sub is: " + sub);
		System.out.println("Rem is: " + rem);
		int total = sum + sub + div + mul + rem;

		System.out.println("Total is: " + total);
	}

}
