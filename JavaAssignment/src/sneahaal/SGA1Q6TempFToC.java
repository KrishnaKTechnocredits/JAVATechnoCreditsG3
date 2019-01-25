/**
 * Assignment 1 Q 6  - convert temperature from Fahrenheit to Celsius degree
 */

package sneahaal;

/**
 * Run the program with only 1 parameter which is tempertaure in Fahrenheit
 * 
 * @author Sneahaal
 *
 */
public class SGA1Q6TempFToC {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Incorrect number of Parameters! Try Again!");
		} else {
			System.out.println("Temperature of " + args[0] + " Fahrenheit in Celsius is : " + convertToCelsius(Float.parseFloat(args[0])));
		}
	}

	static float convertToCelsius(float tempF) {

		return (tempF - 32) * 5 / 9;
	}
}
