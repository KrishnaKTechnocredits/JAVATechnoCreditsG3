/**
* Assignment 1 , Q 2 - WAP to print the details of Student As Roll No, Name and Marks 
* by taking input from the user.
*/

/**
 * Parameter sequence for running the file - Roll No , Name and Marks
 * 
 * @author Sneahaal Garge
 */

package sneahaal;

public class SGA1Q2Student {

	/**
	 * 
	 * @param args
	 * @return void
	 */

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Incorrect number of parameters given! Try again!");
		} else {
			System.out.println("Student Roll Number is : " + Integer.parseInt(args[0]));
			System.out.println("Student Name is : " + args[1]);
			System.out.println("Student Marks are : " + Integer.parseInt(args[2]));
		}

	}

}
