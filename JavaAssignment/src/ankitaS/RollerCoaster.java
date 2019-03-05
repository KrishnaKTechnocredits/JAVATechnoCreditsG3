//Program to check age Exception

package ankitaS;

import java.util.Scanner;

public class RollerCoaster {
	Scanner scanner = new Scanner(System.in);

	void RideValidation() throws AgeException { // method to check age
												// validation
		System.out.println("Enter your name");
		String name = scanner.next();
		System.out.println("Enter your age");

		int age = scanner.nextInt();
		if (age > 60 || age < 12) {

			throw new AgeException("You are not eligible", age);

		} else
			System.out.println("Welcome ! Have a great day ahead here");
	}

	public static void main(String[] args) {
		RollerCoaster RollerCoaster = new RollerCoaster();
		try {
			RollerCoaster.RideValidation();
		} catch (AgeException e) {
			System.out.println(e);
		}

	}
}
