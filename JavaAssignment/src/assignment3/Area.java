package assignment3;

import java.util.Scanner;
/*
 * Create a class Area to find area of Square, Rectangle and circle by creating area method. 
 * Using overloading concept.
 */

public class Area {
	
	void area(int l)
	{
		System.out.println("Area of square =" + l*l);
	}
	
	void area(int l, int w)
	{
		System.out.println("Area of Rectangle = " + l*w);
	}
	void area(float a, int r)
	{
		a = 3.14f;
		System.out.println("Area of circle =" + a*r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length :");
		int l = sc.nextInt();
		System.out.println("Please enter width :");
		int w = sc.nextInt();
		System.out.println("Please enter radius ");
		int r = sc.nextInt();
		float a =3.14f;
		Area ar = new Area();
		ar.area(l);
		ar.area(l, w);
		ar.area(a, r);

	}

}
