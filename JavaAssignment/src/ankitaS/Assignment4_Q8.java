package ankitaS;

import java.util.Scanner;

public class Assignment4_Q8 {
	Scanner scanner = new Scanner(System.in);

	String inputFromUser() { // method to take input string from user
		System.out.println("Enter a String");
		return scanner.nextLine();
	}

	int vowelCheck(String string) { // method to calculate vowel count

		int count = 0;
		for (int index = 0; index < string.length(); index++) {

			if (string.charAt(index) == 'a' || string.charAt(index) == 'e' || string.charAt(index) == 'i'
					|| string.charAt(index) == 'o' || string.charAt(index) == 'u') {

				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q8 Assignment4_Q8 = new Assignment4_Q8();

		String string = Assignment4_Q8.inputFromUser();
		int vowelCount = Assignment4_Q8.vowelCheck(string);
		System.out.println("Vowel count = " + vowelCount);
	}

}
