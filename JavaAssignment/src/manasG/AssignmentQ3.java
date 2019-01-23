
public class AssignmentQ3 {
	static int l, b, r;

	static void circle() {
		int Areac = (22 / 7) * r * r;
		int circumference = 2 * (22 / 7) * r;
		System.out.println("Area of a circle = " + Areac);
		System.out.println("circumference of a circle = " + circumference);

	}

	static void rectangle() {
		int Arear = l * b;
		int parameter = 2 * (l + b);
		System.out.println("Area of rectangle = " + Arear);
		System.out.println("Parameter of rectangle = " + parameter);
	}

	public static void main(String[] args) {
		l = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		r = Integer.parseInt(args[2]);

		circle();
		rectangle();
	}

}
