/**
 * Assignment 3 - Section Classes & Object - Q 3 : Create Employee class and 
 * parameterized constructor with attributes empId , empName and salary.
 * Write a method to display the details of employees. 
 * Create a TestEmployee class to test Employee class functionality.
 */
package sneahaal;

/**
 * 
 * @author Sneahaal Garge
 *
 */
public class Emp {

	private int empId;
	private String empName;
	private int empSal;

	/*
	 * Constructor for Class Employee - 3 parameters
	 * 
	 * @param - int
	 * @param - String
	 * @param - int
	 */
	Emp(int eid, String ename, int esal) {

		this.empId = eid;
		this.empName = ename;
		this.empSal = esal;

	}

	/*
	 * This method displays the instance variables of the passed object
	 */
	static void displayEmpData(Emp e) {

		System.out.println("EmpId : " + e.empId);
		System.out.println("EmpName : " + e.empName);
		System.out.println("EmpSal : " + e.empSal);
	}

	/**
	 * This method displays the instance variables of the reference variable
	 * used to call the method
	 */
	void displayEmpData() {

		System.out.println("EmpId : " + this.empId);
		System.out.println("EmpName : " + this.empName);
		System.out.println("EmpSal : " + this.empSal);

	}

}
