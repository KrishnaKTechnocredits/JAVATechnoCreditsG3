/**
 *  Assignment 1 Q 4 - Area and perimeter of Rectangle & Circle
 */

package sneahaal;

/**
 * 
 * @author Sneahaal
 *
 */

public class SGA1Q4AreaPerimeter {

	/**
	 * This method returns the area of the Rectangle
	 * 
	 * @param length
	 * @param breadth
	 * @return float
	 */
	float areaRect(float length, float breadth) {
		return (length * breadth);
	}

	/**
	 * This method returns the Perimeter of the Rectangle
	 * 
	 * @param length
	 * @param breadth
	 * @return float
	 */
	float periRect(float length, float breadth) {
		return (2 * (length + breadth));
	}

	/**
	 * This method returns the Perimeter of the circle
	 * 
	 * @param radius
	 * @return float
	 */
	float periCircle(float radius) {
		return (2 * 3.14f * radius);
	}

	/**
	 * This method returns the area of the circle
	 * 
	 * @param radius
	 * @return float
	 */
	float areaCircle(float radius) {
		return (3.14f * radius * radius);
	}

}
