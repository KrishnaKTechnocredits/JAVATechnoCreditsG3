//Q4 WAP to find area and perimeter of rectangle and circle.

package gayatri;

public class AreaPerimeter {

	void Rectangle(int l, int w)

	{
		int Area = w * l;
		int Perimeter = (2 * (l + w));
		System.out.println("Area of Rectangle is : " + Area);
		System.out.println("Perimeter of Rectangle is : " + Perimeter);
	}

	void Circle(int r)

	{
		double pie = 3.14;
		double Area = pie * r * r;
		double Perimeter = 2 * pie * r;
		System.out.println("Area of Circle is : " + Area);
		System.out.println("Perimeter of Circle is : " + Perimeter);

	}

	public static void main(String args[]) {
		AreaPerimeter G = new AreaPerimeter();
		/*
		 * G.Rectangle(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		 * G.Circle(Integer.parseInt(args[2]));
		 */
		// OR
		G.Rectangle(4, 5);
		G.Circle(8);
	}

}
