//Program to check whether a word is Palindrome or not
package ankitaS;

import java.util.Scanner;

public class Assignment4_Q12 {

	Scanner scanner = new Scanner(System.in);

	String inputFromUser() {// method to take input from user
		System.out.println("Enter a string");
		String name = scanner.next();
		return name;
	}

	void checkPalindrome(String name) { // method to check whether a string is
										// Palindrome
		String rev = "";
		for (int i = (name.length() - 1); i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		if (name.equals(rev)) {
			System.out.println(name + " is Palindrome");
		} else {
			System.out.println(name + " is not Palindrome");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4_Q12 Assignment4_Q12 = new Assignment4_Q12();
		String name = Assignment4_Q12.inputFromUser();
		Assignment4_Q12.checkPalindrome(name);
	}

}
