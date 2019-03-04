/**
 * Assignment 3 - Section Classes & Objects - Q 1 - Create a Circle class with fields radius as float Initialize the radius through method .Also create separate method to calculate Area and Circumference of a Circle.
 * Create another class as ClientCircle and call the respective methods.
 */

package sneahaal;

/**
 * 
 * @author Sneahaal Garge
 *
 */

public class Circle {

	final static float pi = 3.14f;
	float radius;

	/**
	 * This method sets the class variable radius
	 * 
	 * @param radius
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * This method returns area of the circle
	 * 
	 * @param rad
	 * @return
	 */
	public float areaCircle(float rad) {
		return pi * rad * rad;

	}

	/**
	 * This method returns perimeter of the circle
	 * 
	 * @param rad
	 * @return
	 */
	public float perimeterCircle(float rad) {
		return 2 * pi * rad;

	}

}
