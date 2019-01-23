
public class AssignmentQ6 {
	static int fahrenheit;

	static void FtoC() {
		int Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("When Converted to Celsius = " + Celsius);
	}

	public static void main(String[] args) {
		fahrenheit = Integer.parseInt(args[0]);

		FtoC();
	}
}
