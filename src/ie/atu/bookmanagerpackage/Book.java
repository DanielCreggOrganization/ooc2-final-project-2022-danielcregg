package ie.atu.bookmanagerpackage;

public class Book {
	
	// Instance Variables
	private String bookId;
	private String author;
	private int age;
	private String title;
	
	// Constructor
	public Book(String bookId, String author, int age, String title) {
		this.bookId = bookId;
		this.author = author;
		this.age = age;
		this.title = title;
	}

	// Getters and Setters
	public String getBookId() {
		return bookId;
	}
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
