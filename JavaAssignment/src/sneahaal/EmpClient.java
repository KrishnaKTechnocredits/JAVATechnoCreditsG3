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
import java.util.Scanner;
public class EmpClient {
	
		/**
		 * Main method , used to get input from user and then calls methods from
		 * Emp Class
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
			Emp e1 = new Emp(id, name, sal);
			System.out.println("**************************************");

	 		System.out.println("Enter data for Second Employee : ");
			System.out.println("Enter Employee Id : ");
			id = scObj.nextInt();
			System.out.println("Enter Employee Name : ");
			name = scObj.next();
			System.out.println("Enter Employee Salary : ");
			sal = scObj.nextInt();
			Emp e2 = new Emp(id, name, sal);
			System.out.println("**************************************");

	 		System.out.println("Displaying the data for first Employee: ");
			Emp.displayEmpData(e1);
			System.out.println("**************************************");
			System.out.println("Displaying the data for second Employee: ");
			e2.displayEmpData();

	 		scObj.close();
	}

}
