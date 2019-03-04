/**
 * Assignment 3 - Section Classes & Object - Q 7 : Create a class called Employee, 
 * having 3 fields Employee Name, DeptId and Salary (input using scanner). 
 * Create 3 parameterized constructor for same.
 * Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) 
 * and print all the details of employee having max salary.
 */

package sneahaal;

/**
 * 
 * @author Sneahaal Garge
 *
 */

public class Employee {

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
	Employee(int eid, String ename, int esal) {

		this.empId = eid;
		this.empName = ename;
		this.empSal = esal;

	}

	/*
	 * This method displays the instance variables of the passed object
	 */
	static void displayEmpData(Employee e) {

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

	/**
	 * This method compares the salary of 2 employees passed to the method
	 * 
	 * @param e1
	 * @param e2
	 */
	static void compareEmpSal(Employee e1, Employee e2) {

		if (e1.empSal > e2.empSal)
			System.out.println("Employee " + e1.empName + " 's salary is geater than employee " + e2.empName);
		else if (e2.empSal > e1.empSal)
			System.out.println("Employee " + e2.empName + " 's salary is geater than employee " + e1.empName);
		else
			System.out.println("Employee " + e1.empName + " 's salary is same as employee " + e2.empName);

	}

}
