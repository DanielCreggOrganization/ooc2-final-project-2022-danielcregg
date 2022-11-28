/******************************************************************************
 *  Compilation:  javac Main.java
 *  Execution:    java Main
*
 *  Prints "Hello World!" to console.
*
 ******************************************************************************/
package ie.atu.bookmanagerpackage;

public class Main {  
    // This is the main method.
    public static void main(String[] args) {
        
        //Book bookObject1 = new Book("B123456", "Rowling", 10, "Philly Stone");
        
        //System.out.println(bookObject1.getAuthor());
        
        BookManager bookManagerObject1 = new BookManager();
        
        bookManagerObject1.addBookToList("B123457", "Tolkien", 12, "Lord of the Rings");
        
        System.out.println(bookManagerObject1.getBookList().get(0).getTitle());
    
    } // End main method
} // End Main class
