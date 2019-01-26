/**
 *  Assignment 1 Q 7 - Convert seconds to hour, minute and seconds
 */

package sneahaal;

/**
 * Run the program passing only 1 parameter which is Total no of seconds
 * 
 * @author Sneahaal
 *
 */
public class SGA1Q7ConvertToSeconds {

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int input, hrs, min, sec;
		if (args.length != 1) {
			System.out.println("Incorrect number of parameters! Try Again!");
		} else {
			input = Integer.parseInt(args[0]);
			hrs = input / (60 * 60);
			input = input % (60 * 60);
			min = input / 60;
			sec = input % 60;
			System.out.println("The given input of " + args[0] + " seconds converted to Hrs:Min:Sec is : " + hrs + "Hr:"
					+ min + "Min:" + sec + "Sec");
		}

	}
}
