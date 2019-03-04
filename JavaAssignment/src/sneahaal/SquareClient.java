/**
 * Assignment 3 - Section Classes and Objects Q 4 : Create a Square class with field side, 
 * one parameterized constructor which accept side value . 
 * Write a method to find the area of a square.
 *  Write a TestSquareClass to verify Square class functionality.
 *  NOTE : square method should not take any parameter, constructor 
 *  should set side value in instance variable and square method 
 *  should use that instance variable.(area=side*side)
 */
package sneahaal;

/**
 * 
 * @author Sneahaal Garge
 *
 */

import java.util.Scanner;

public class SquareClient {

	public static void main(String[] args) {

		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter the length of Sqaure side : ");
		float sqSide = scObj.nextFloat();
		Square sq = new Square(sqSide);
		sq.areaSquare();
		scObj.close();

	}

}
