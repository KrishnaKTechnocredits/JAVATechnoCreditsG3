/**
 * Assignment 3 - Section Classes & Object - Q 7 : Create a class called Employee, 
 * having 3 fields Employee Name, DeptId and Salary (input using scanner). 
 * Create 3 parameterized constructor for same.
 * Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) 
 * and print all the details of employee having max salary.
 */

package sneahaal;

/**
 * @author Sneahaal Garge
 */

import java.util.Scanner;

public class EmployeeClient {

	/**
	 * Main method , used to get input from user and then calls methods from
	 * Employee Class
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int id, sal;
		String name;
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter data for first Employee : ");
		System.out.println("Enter Employee Id : ");
		id = scObj.nextInt();
		System.out.println("Enter Employee Name : ");
		name = scObj.next();
		System.out.println("Enter Employee Salary : ");
		sal = scObj.nextInt();
		Employee e1 = new Employee(id, name, sal);
		System.out.println("**************************************");

		System.out.println("Enter data for Second Employee : ");
		System.out.println("Enter Employee Id : ");
		id = scObj.nextInt();
		System.out.println("Enter Employee Name : ");
		name = scObj.next();
		System.out.println("Enter Employee Salary : ");
		sal = scObj.nextInt();
		Employee e2 = new Employee(id, name, sal);
		System.out.println("**************************************");

		System.out.println("Displaying the data for first Employee: ");
		Employee.displayEmpData(e1);
		System.out.println("**************************************");
		System.out.println("Displaying the data for second Employee: ");
		e2.displayEmpData();

		System.out.println("**************************************");
		Employee.compareEmpSal(e1, e2);
		System.out.println("**************************************");

		scObj.close();
	}

}
