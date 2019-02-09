/**
 * Assignment 3 - Section Classes & Objects - Q 1 - Create a Circle class with fields radius as float Initialize the radius through method .Also create separate method to calculate Area and Circumference of a Circle.
 * Create another class as ClientCircle and call the respective methods.
 */

package sneahaal;

/**
 * @author Sneahaal Garge
 */

import java.util.Scanner;

public class CircleClient {

	/**
	 * This is main method that creates object of Class Circle and calls its
	 * various methods
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		float area, peri;
		Scanner scObj = new Scanner(System.in);
		Circle c1 = new Circle();
		System.out.println("Enter the radius of the circle");
		float rad = scObj.nextFloat();
		c1.setRadius(rad);
		area = c1.areaCircle(rad);
		peri = c1.perimeterCircle(rad);
		System.out.println("Area of circle with radius - " + rad + " units is : " + area + " square units");
		System.out.println("Perimeter of circle with radius - " + rad + " units is : " + peri + " units");
		scObj.close();
	}

}
