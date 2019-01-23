/**
 * Assignment 1 Q3 - Program to find the square and cube of a number
 */

package sneahaal;

/**
 * Pass only 1 number while running the program.
 * 
 * @author Sneahaal Garge
 *
 */

public class SGA1Q3SquareCube {

	/**
	 * This is main method that calls the square and cube methods in same class
	 * and displays the Square and cube for User given number
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Incorrect number of Paramaters! Try again!");
		} else {
			System.out.println("Square of " + args[0] + " is : " + square(Long.parseLong(args[0])));
			System.out.println("Cube of " + args[0] + " is : " + cube(Long.parseLong(args[0])));
		}

	}

	/**
	 * 
	 * @param num
	 * @return long
	 */
	static long square(long num) {
		return (num * num);
	}

	/**
	 * 
	 * @param num
	 * @return long
	 */
	static long cube(long num) {
		return (num * num * num);
	}
}
