package oop.class_problems;

/**
 * M4. Reference Copies and a Shared ID Card
 * Demonstrates reference copying vs new object creation,
 * and == operator for object identity.
 */
public class IdCard {

    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {
        IdCard ravi = new IdCard("Ravi", 0);
        IdCard duplicate = ravi;
        duplicate.booksIssued = 3;

        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        IdCard separate = new IdCard("Ravi", 3);
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}
