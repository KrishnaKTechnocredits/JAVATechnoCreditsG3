package ankitaS;

public class Assignment1_Q4 {

	int AreaOfRectangle(int length, int breadth) {

		return length * breadth;

	}

	double AreaOfCircle(double radius) {

		return Math.PI * radius * radius;
	}

	int PerimeterOfRectangle(int length, int breadth) {

		int Perimeter = 2 * (length * breadth);
		return Perimeter;
	}

	double PerimeterOfCircle(double radius) {

		double Perimeter = 2 * Math.PI * radius;
		return Perimeter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment1_Q4 a = new Assignment1_Q4();
		double radius = Integer.parseInt(args[0]);

		int length = Integer.parseInt(args[1]);
		int breadth = Integer.parseInt(args[2]);

		System.out.println("Area of circle = " + a.AreaOfCircle(radius));
		System.out.println("Perimeter of circle = " + a.PerimeterOfCircle(radius));
		System.out.println("Area of rectangle = " + a.AreaOfRectangle(length, breadth));
		System.out.println("Perimeter of rectangle = " + a.PerimeterOfRectangle(length, breadth));
	}

}
