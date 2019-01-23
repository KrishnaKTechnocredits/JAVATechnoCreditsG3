/**
 * Assignment 1 Q 5 - Program to compute simple interest
 */

package sneahaal;

/**
 * Run the Program with exactly 3 parameters in the order
 * principal,rateOfInterest,Time in years
 * 
 * @author Sneahaal
 *
 */

public class SgA1Q5SimpleInterest {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		double sInterest;
		if (args.length != 3) {
			System.out.println("Incorrect number of Parameters!Try Again!");
		} else {
			sInterest = (Double.parseDouble(args[0]) * Float.parseFloat(args[1]) * Float.parseFloat(args[2])) / 100;
			System.out.println("The Simple Interest on a sum of Rs " + args[0] + " @ ROI of " + args[1]
					+ "% for a period of " + args[2] + " years is : Rs " + sInterest);
		}
	}
}
