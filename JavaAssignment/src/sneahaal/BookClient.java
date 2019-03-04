/**;
 * 
 * Assignment 3 - Class and Objects Q 5 - Create a class Book having 
 * Title, Book Publisher, Author with parameterized constructor using this keyword. 
 * Write a method to display the details of the Book and Test the class by creating objects.
 */

package sneahaal;

/**
 * 
 * @author Sneahaal Garge
 *
 */

import java.util.Scanner;

public class BookClient {

	/**
	 * Main method creates objects of Class Book that are initialized through
	 * parameterized constructor
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner scObj = new Scanner(System.in);
		String title, pub, author;
		System.out.println("***************Enter the book details for BOOK1************");
		System.out.println("Enter the Book Title : ");
		title = scObj.nextLine();
		System.out.println("Enter the Book Publisher : ");
		pub = scObj.nextLine();
		System.out.println("Enter the Book Author : ");
		author = scObj.nextLine();
		System.out.println("**************************************************");
		Book book1 = new Book(title, pub, author);
		System.out.println("***************Enter the book details for BOOK2************");
		System.out.println("Enter the Book Title : ");
		title = scObj.nextLine();
		System.out.println("Enter the Book Publisher : ");
		pub = scObj.nextLine();
		System.out.println("Enter the Book Author : ");
		author = scObj.nextLine();
		System.out.println("**************************************************");
		Book book2 = new Book(title, pub, author);
		System.out.println("*****************DISPLAY DETAILS********************");
		book1.displayBookDetails();
		book2.displayBookDetails();
		scObj.close();

	}

}
