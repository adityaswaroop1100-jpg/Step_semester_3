package oop.class_problems;

/**
 * M1. Library Book Cataloguing
 * Offers two constructors linked via this() chaining.
 * Defaults missing/empty ISBN to "PENDING".
 */
public class LibraryBook {

    String title;
    String isbn;
    boolean catalogued;

    // Two-argument constructor
    public LibraryBook(String title, String isbn) {
        this.title = title;
        if (isbn == null || isbn.trim().isEmpty()) {
            this.isbn = "PENDING";
        } else {
            this.isbn = isbn;
        }
        this.catalogued = true;
    }

    // Single-argument constructor chaining to 2-arg constructor
    public LibraryBook(String title) {
        this(title, "PENDING");
    }

    public void printStatus() {
        System.out.println(title + " | " + isbn + " | Catalogued: " + catalogued);
    }

    public static void main(String[] args) {
        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns  = {"978-0132350884", "", "9780451524935", ""};

        // Process batch in a single pass
        for (int i = 0; i < titles.length; i++) {
            LibraryBook book = new LibraryBook(titles[i], isbns[i]);
            book.printStatus();
        }
    }
}
