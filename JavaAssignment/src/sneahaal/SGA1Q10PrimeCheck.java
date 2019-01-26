/**
 * Assignment 1 Q 10 - find sum of all prime number between user given range
 */

package sneahaal;

/**
 * 
 * @author Sneahaal Garge
 *
 */

public class SGA1Q10PrimeCheck {

	/**
	 * This method is a service method and checks if a number is prime or not
	 * and return boolean flag to the calling method
	 * 
	 * @param num
	 * @return boolean
	 */
	boolean primeCheck(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

}
