/**
 * Assignment 3 Section Class & Objects Q 2 - Create Bank class with fields account_no, 
 * name and amount .Create the following methods: Make it menu Driven Program using switch.
 * Use Scanner class for taking inputs from User
 * a) insertData()… [To save account_no, name and amount given by user].
 * b) deposit()
 * c) withdraw()
 * d) checkBalance()
 * e) displayDetails()
 * Create BankClient class to test functionalities of Bank class.
 */
package sneahaal;

/**
 * 
 * @author Sneahaal Garge
 *
 */
import java.util.Scanner;

public class BankClient {

	static Bank b1 = new Bank();

	/**
	 * Main method used to get user input and accordingly execute methods from
	 * Class Bank.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scObj = new Scanner(System.in);
		int choice = 0;
		double amt = 0.0;

		while (choice != 6) {
			System.out.println("*****************************************");
			System.out.println("        WELCOME TO ABC BANK              ");
			System.out.println("*****************************************");
			System.out.println("               Menu                      ");
			System.out.println("*****************************************");
			System.out.println("1. INSERT DATA");
			System.out.println("2. DEPOSIT");
			System.out.println("3. WITHDRAW");
			System.out.println("4. CHECKBALANCE");
			System.out.println("5. DISPLAY DETAILS");
			System.out.println("6. EXIT");
			System.out.println("*****************************************");
			System.out.println("Enter your Choice : ");
			choice = scObj.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter Bank Account Number : ");
				String accno = scObj.next();
				System.out.println("Enter Bank Account Name : ");
				String accname = scObj.next();
				System.out.println("Enter Opening Balance : ");
				double bal = scObj.nextFloat();
				b1.insertData(accno, accname, bal);
				break;
			case 2:
				System.out.println("Enter Amount to be deposited : ");
				amt = scObj.nextFloat();
				if (amt < 0) {
					System.out.println("Invalid Input");
					break;
				} else
					b1.deposit(amt);
				break;
			case 3:
				System.out.println("Enter Amount to be deposited : ");
				amt = scObj.nextFloat();
				if (amt < 0) {
					System.out.println("Invalid Input");
					break;
				} else
					b1.withdraw(amt);
				break;
			case 4:
				b1.checkBalance();
				break;

			case 5:
				b1.displayDetails();
				break;
			case 6:
				break;
			default:
				System.out.println("invalid Input! try Again!");
				break;

			}
		}
		scObj.close();
	}

}
