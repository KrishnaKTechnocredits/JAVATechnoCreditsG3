/** Q1 - Write a Java program to print the sum (addition), multiply, subtract, 
 * divide and remainder of two numbers given by user.
 */

/**
 * @author - Sneahaal Garge
 */

package sneahaal;

public class SGA1Q1CalcArgsClient {

	/**
	 * This method only calls the Service methods in SGA1Q1CalcArgs.java
	 * 
	 * @param args
	 * @return void
	 */

	public static void main(String[] args) {

		SGA1Q1CalcArgs calObj = new SGA1Q1CalcArgs();

		int sum = calObj.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		int sub = calObj.minus(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		int prod = calObj.multiplication(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		int div = calObj.division(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		int mod = calObj.modulo(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		System.out.println(
				" Sum for " + Integer.parseInt(args[0]) + " and " + Integer.parseInt(args[1]) + " is : " + sum);
		System.out.println(
				" Subtraction for " + Integer.parseInt(args[0]) + " and " + Integer.parseInt(args[1]) + " is : " + sub);
		System.out.println(" Multiplication for " + Integer.parseInt(args[0]) + " and " + Integer.parseInt(args[1])
				+ " is : " + prod);
		System.out.println(
				" Division for " + Integer.parseInt(args[0]) + " and " + Integer.parseInt(args[1]) + " is : " + div);
		System.out.println(
				" Modulo for " + Integer.parseInt(args[0]) + " and " + Integer.parseInt(args[1]) + " is : " + mod);

	}

}
