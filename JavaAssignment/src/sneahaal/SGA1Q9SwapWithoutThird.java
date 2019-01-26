/**
 * Assignment 1 Q 9 - Swap 2 nos without using third variable
 */

package sneahaal;

/**
 * Run the Program with exactly 2 parameters you wish to swap
 * 
 * @author Sneahaal
 *
 */
public class SGA1Q9SwapWithoutThird {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int num1, num2;

		if (args.length != 2) {
			System.out.println("Incorrect number of parameters! Try Again!");
		} else {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			System.out.println("Original values provided by user in num1 and num2 are : " + num1 + " and " + num2
					+ " respectively");
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
			System.out
					.println("Values after swapping in num1 and num2 are : " + num1 + " and " + num2 + " respectively");

		}

	}
}
