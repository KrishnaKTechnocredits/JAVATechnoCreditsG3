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

public class Bank {

	private String accNo;
	private String accName;
	private double accBalance;

	/**
	 * Constructor of the class that initializes class variables to default
	 * value
	 */
	Bank() {
		this.accNo = null;
		this.accName = null;
		this.accBalance = 0.0;
	}

	/**
	 * get method to get private variable value
	 * 
	 * @return
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * get method to get private variable value
	 * 
	 * @return
	 */
	public String getAccName() {
		return accName;
	}

	/**
	 * get method to get private variable value
	 * 
	 * @return
	 */
	public double getAccBalance() {
		return accBalance;
	}

	/**
	 * Method to set data for instance variables
	 * 
	 * @param accno
	 * @param accname
	 * @param bal
	 */
	public void insertData(String accno, String accname, Double bal) {

		this.accNo = accno;
		this.accName = accname;
		this.accBalance = bal;
	}

	/**
	 * This method will display account details
	 */
	public void displayDetails() {

		System.out.println("*****************************************");
		System.out.println("Account NO      :     " + this.getAccNo());
		System.out.println("Account Name    :     " + this.getAccName());
		System.out.println("Current Balance :     " + this.getAccBalance());
		System.out.println("*****************************************");
	}

	/**
	 * This method with dispaly the balance
	 */
	public void checkBalance() {

		System.out.println("*****************************************");
		System.out.println("Account NO      :     " + this.getAccNo());
		System.out.println("Account Name    :     " + this.getAccName());
		System.out.println("Current Balance :     " + this.getAccBalance());
		System.out.println("*****************************************");
	}

	/**
	 * This method will deposit amt and increment balance accordingly
	 * 
	 * @param amt
	 */
	public void deposit(double amt) {

		this.accBalance += amt;
		System.out.println("Amount of INR " + amt + "has been deposited!");
	}

	/**
	 * This method will withdraw amt and decrement balance accordingly
	 * 
	 * @param amt
	 */
	public void withdraw(double amt) {

		if (amt > this.accBalance) {
			System.out.println("Insufficent funds! Try a smaller amount!");
			return;
		} else {
			this.accBalance -= amt;
			System.out.println("Amount of INR " + amt + "has been withdrawn!");
		}

	}

}
