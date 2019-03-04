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

public class Square {

	float side;

	/**
	 * This constructor will initialize the object and set the side
	 * 
	 * @param side
	 */
	Square(float side) {

		this.side = side;
	}

	/**
	 * This method will calculate and print the sqaure area without taking
	 * parameter It will use the square side set as instance variable to
	 * calculate the area
	 */
	void areaSquare() {

		float area = this.side * this.side;
		System.out.println("Area of Sqaure with side " + this.side + " units is : " + area + " sq units");

	}

}
