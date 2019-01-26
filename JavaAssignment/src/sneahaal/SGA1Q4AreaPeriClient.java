/**
 * Assignment 1 Q 4 - Area and perimeter of Rectangle & Circle
 */

package sneahaal;

/**
 * 
 * @author Sneahaal
 *
 */

public class SGA1Q4AreaPeriClient {

	/**
	 * Pass exactly 3 parameters to main method, in the sequence
	 * rectangleLength, rectangleBreadth, circleRadius
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Incorrect number of Parameters! Try again");
		} else {
			SGA1Q4AreaPerimeter areaPeri = new SGA1Q4AreaPerimeter();
			System.out.println("The area of the rectangle with length = " + args[0] + " and breadth = " + args[1]
					+ " is : " + areaPeri.areaRect(Float.parseFloat(args[0]), Float.parseFloat(args[1])) + " sq units");
			System.out.println("The perimeter of the rectangle with length = " + args[0] + " and breadth = " + args[1]
					+ " is : " + areaPeri.periRect(Float.parseFloat(args[0]), Float.parseFloat(args[1])) + " units");
			System.out.println("The area of the circle with radius = " + args[2] + " is : "
					+ areaPeri.areaCircle(Float.parseFloat(args[2])) + " sq units");
			System.out.println("The perimeter of the circle with radius = " + args[2] + " is : "
					+ areaPeri.periCircle(Float.parseFloat(args[2])) + " units");
		}

	}

}
