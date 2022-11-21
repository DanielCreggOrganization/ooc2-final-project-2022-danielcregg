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
        
        // This statement prints "Hello World" to the console.
        System.out.println("Hello World!");
        
        Book bookObject1 = new Book("B123456", "Rowling", 10, "Philly Stone");
        
        System.out.println(bookObject1.getAuthor());
        
    
    } // End main method
} // End Main class
