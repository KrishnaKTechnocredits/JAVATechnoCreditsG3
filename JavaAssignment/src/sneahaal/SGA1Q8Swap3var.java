/**
 * Assignment 1 Q 8 - Swap two numbers using the third variable
 */

package sneahaal;

/**
 * Run the Program using exactly 2 parameters whose values are to be swapped
 * 
 * @author Sneahaal
 *
 */

public class SGA1Q8Swap3var {

	/**
	 * This method directly swaps the nos given by user using a third variable
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int num1, num2, num3;

		if (args.length != 2) {
			System.out.println("Incorrect number of Parameters! Try again!");
		} else {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			num3 = num1;
			num1 = num2;
			num2 = num3;
			System.out.println("The numbers originally contained in variables num1 and num2 are : " + args[0] + " and "
					+ args[1] + " respectively");
			System.out.println("The numbers contained in variables num1 and num2 after swapping are : " + num1 + " and "
					+ num2 + " respectively");
		}

	}

}
