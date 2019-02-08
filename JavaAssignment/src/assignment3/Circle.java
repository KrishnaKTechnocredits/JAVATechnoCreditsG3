package assignment3;

import java.util.Scanner;
/*
 * Create a Circle class with fields radius as float Initialize the radius through method .
 * Also create separate method to calculate Area and Circumference of a Circle. 
 * Create another class as ClientCircle and call the respective methods
 */
public class Circle {
	
	float Radius= 6;
	float pi =3.14f;
	public void area()
	{
		float area = pi*Radius*Radius;
		System.out.println("Area of circle " + area);
		
	}
	public void circumstance()
	{
		float circumstance = 2*pi*Radius;
		System.out.println("Circumstance of circle :"+ circumstance);
	}

}
