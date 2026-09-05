package oop.assignment_problems;

/**
 * M1. From Parallel Arrays to a Class — Library Inventory
 * Tracks library book inventory the OOP way.
 */
public class BookInventory {

    String title;
    String author;
    int copiesAvailable;

    // Constructor that sets all three fields
    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    // Instance method that prints one formatted line
    public void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }

    public static void main(String[] args) {

        // Create four BookInventory objects and store in an array
        BookInventory[] books = {
            new BookInventory("Clean Code",      "Robert C. Martin", 3),
            new BookInventory("Effective Java",   "Joshua Bloch",     5),
            new BookInventory("Refactoring",      "Martin Fowler",    0),
            new BookInventory("Design Patterns",  "GoF",              2)
        };

        // Print each entry in a loop
        for (BookInventory book : books) {
            book.printEntry();
        }
    }
}
