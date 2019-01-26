/**
 * Assignment 1 Q 10 - find sum of all prime number between user given range
 */
package sneahaal;

/**
 * Run the program with exactly 2 parameters defining the range.
 * 
 * @author Sneahaal Garge
 *
 */

public class SGA1Q10SumOfPrime {

	public static void main(String[] args) {

		boolean status;
		int start, end, count, sum;

		if (args.length != 2) {
			System.out.println("Incorrect number of Parameters! Try Again!");
		} else {

			SGA1Q10PrimeCheck objPrimeCheck = new SGA1Q10PrimeCheck();
			System.out.println("Prime numbers in the range of " + args[0] + " to " + args[1] + " are : ");
			start = Integer.parseInt(args[0]);
			end = Integer.parseInt(args[1]);
			count = 0;
			sum = 0;

			if (start == 1) {
				start++;
			}

			for (int loopcnt = start; loopcnt <= end; loopcnt++) {
				status = objPrimeCheck.primeCheck(loopcnt);
				if (status == true) {
					//System.out.println(loopcnt);
					count++;
					sum = sum + loopcnt;
				}

			}

			System.out.println("Total Prime numbers in given range are: " + count);
			System.out.println("Sum of Prime numbers in given range are: " + sum);

		}

	}

}
