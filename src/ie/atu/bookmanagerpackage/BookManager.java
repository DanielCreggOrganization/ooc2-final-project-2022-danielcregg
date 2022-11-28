package ie.atu.bookmanagerpackage;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

	// Instance Variable
	private List<Book> bookList;

	// Constructor
	public BookManager() {
		this.bookList = new ArrayList<>();
	}

	// Getters and Setters
	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	// Find book object by ID. Returns null if book is not found.
	public Book findBookObjectByID(String bookId) {
		// Search all student objects in the student list
		for (Book bookObject : bookList) {
			// Compare IDs to ID passed in
			if (bookId.equals(bookObject.getBookId())) {
				// If a match is found return the student object
				System.out.println("Student object with ID = " + bookId + " was found on list!");
				return bookObject;
			}
		}
		// If no match is found return null
		System.out.println("Book object with ID = " + bookId + " was NOT found on list!");
		return null;
	}

	// Returns true if student on list
	public boolean isOnList(String studentId) {
		return bookList.contains(findBookObjectByID(studentId));
	}

	// Add book to list
	public boolean addBookToList(String bookId, String author, int age, String title) {
		// Check student details are vaild and if student is NOT already on list
		if (Book.isValid(bookId, name, age) && !isOnList(bookId)) {
			// Create book object with valid details and add student to the list
			Book newBook = new Book(bookId, author, age, title);
			return this.bookList.add(newBook);
		}
		// If student details are invalid or if student is already on list return false
		System.out.println("Book with ID " + bookId + " could not be added to list!");
		return false;
	}

	// Remove book from list given studendID
	public boolean removeBookFromList(String bookId) {
		return bookList.remove(findBookObjectByID(bookId));
	}

}
