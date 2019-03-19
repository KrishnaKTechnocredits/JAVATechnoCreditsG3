package ankitaS;

public class AgeException extends Exception {

	AgeException(String msg, int age) {
		super(msg);
		if (age > 60)
			System.out.println("Sorry Dear, You should have come before " + (age - 59) + " years");
		else if (age < 12)
			System.out.println("Sorry Dear, You should come after " + (12 - age) + " years");
	}
}
