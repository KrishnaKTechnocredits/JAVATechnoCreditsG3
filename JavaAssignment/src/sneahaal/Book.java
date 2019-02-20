/**
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

public class Book {

	private String bookTitle, bookPublisher, bookAuthor;

	/**
	 * This is constructor used to set the private instance variables using this
	 * 
	 * @param title
	 * @param pub
	 * @param author
	 */
	Book(String title, String pub, String author) {

		this.bookTitle = title;
		this.bookPublisher = pub;
		this.bookAuthor = author;

	}

	/**
	 * This method is used to dispaly the set instance variables for the Book
	 * Class Object.
	 */
	public void displayBookDetails() {

		System.out.println("*********************************************");
		System.out.println("Book Title        :     " + bookTitle);
		System.out.println("Book Publisher    :     " + bookPublisher);
		System.out.println("Book Author       :     " + bookAuthor);
		System.out.println("*********************************************");

	}

}
