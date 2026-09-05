package oop.assignment_problems;

/**
 * M4. Reference Copies and a Shared ID Card
 * Demonstrates reference copying vs new object creation,
 * and == operator for object identity.
 */
class IdCard {

    String name;
    int booksIssued;

    // Constructor
    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {

        // Original object for Ravi
        IdCard ravi = new IdCard("Ravi", 0);

        // duplicate is a reference copy — points to the SAME object
        IdCard duplicate = ravi;

        // Changing via duplicate also changes ravi (same object)
        duplicate.booksIssued = 3;

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        // A separate object with identical field values
        IdCard separate = new IdCard("Ravi", 3);
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}
