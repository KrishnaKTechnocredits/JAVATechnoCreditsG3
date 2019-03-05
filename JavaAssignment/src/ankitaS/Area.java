//over-loading concepts
package ankitaS;

import java.util.Scanner;

public class Area {
	double radius;
	int length;
	int breadth;
	Scanner scanner = new Scanner(System.in);

	void inputFromUser() { // method to take input from user
		System.out.println("Enter radius");
		this.radius = scanner.nextDouble();
		System.out.println("Enter length :: Please note side of square and lenth of rectangle will be same");
		this.length = scanner.nextInt();
		System.out.println("Enter breadth");
		this.breadth = scanner.nextInt();
		
	}

	double CalculateArea(double rad) { // method to calculate area of circle
										// :accepting 1 parameter
		rad = this.radius;
		double area = (Math.PI * rad * rad);
		return area;
	}

	double CalculateArea(int length, int breadth) { // method to calculate area
													// of rectangle :accepting 2
													// parameter
		length = this.length;
		breadth = this.breadth;
		double area = length * breadth;
		return area;
	}

	double CalculateArea(int side) { // method to calculate area of square
										// :accepting 1 parameter
		side = this.length;
		double area = side * side;
		return area;
	}

	double AreaOfRequired() {
		Area area = new Area();
		area.inputFromUser();
		double radius = area.radius;
		int length = area.length;
		int breadth = area.breadth;
		System.out.println(radius+" "+length);
		System.out.println(
				"Choose a case : What do you want to perform ?\n1.Area of Rectangle \n2.Area of square \n3.Area of Circle\nChoose any number from 1 2 or 3");
		int Case = scanner.nextInt();
		double actualArea = 0;
		switch (Case) {
		case 1:
			actualArea = area.CalculateArea(length,breadth);
			System.out.println("Area is : " + area.CalculateArea(length, breadth));
			break;
		case 2:
			actualArea = area.CalculateArea(length);
			System.out.println("Area is : " + area.CalculateArea(length));
			break;
		case 3:
			actualArea = area.CalculateArea(radius);
			System.out.println("Area is : " + area.CalculateArea(radius));
			break;
		default:
			System.out.println("Invalid input");
		}

		return actualArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area = new Area();
		area.inputFromUser();
		// double radius = area.radius;
		// int length = area.length;
		// int breadth = area.breadth;
		area.AreaOfRequired();

		// System.out.println("Area is : " + area.CalculateArea(length,
		// breadth));
		// // System.out.println("Area is : "+area.CalculateArea(length));
		// // System.out.println("Area is : "+area.CalculateArea(radius));
		// // area.CalculateArea(radius);
		// // CalculateArea(length, breadth);
	}

}
