/** Q1 - Write a Java program to print the sum (addition), multiply, subtract, 
 * divide and remainder of two numbers given by user.
 */

/**
 * @author - Sneahaal Garge
 */

package sneahaal;

public class SGA1Q1CalcArgs {

	/**
	 * this method returns Summation of two nos
	 * 
	 * @param num1
	 * @param num2
	 * @return int
	 */

	int sum(int num1, int num2) {
		return (num1 + num2);
	}

	/**
	 * this method returns difference between two nos
	 * 
	 * @param num1
	 * @param num2
	 * @return int
	 */

	int minus(int num1, int num2) {
		return (num1 - num2);
	}

	/**
	 * this method returns product of two nos
	 * 
	 * @param num1
	 * @param num2
	 * @return int
	 */
	int multiplication(int num1, int num2) {
		return (num1 * num2);
	}

	/**
	 * this method returns division quotient of two nos
	 * 
	 * @param num1
	 * @param num2
	 * @return int
	 */
	int division(int num1, int num2) {
		return (num1 / num2);
	}

	/**
	 * this method returns division remainder of two nos
	 * 
	 * @param num1
	 * @param num2
	 * @return int
	 */

	int modulo(int num1, int num2) {
		return (num1 % num2);
	}

}
