package oop.assignment_problems;

/**
 * A4. Static Block — Library Membership Card Setup
 * Demonstrates static block loading once across batch student card creation.
 */
public class MembershipCard {

    static String libraryName;
    static String validUntil;
    String studentName;

    // Static block runs exactly once upon class loading
    static {
        libraryName = "SRM Central Library";
        validUntil = "May 2027";
        System.out.println("Library info loaded");
    }

    public MembershipCard(String studentName) {
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        String[] names = {"Ananya", "Rohan", "Priya", "Arjun", "Sneha"};

        // Create membership card for each name
        for (String name : names) {
            new MembershipCard(name);
            System.out.println("Membership card issued: " + name);
        }
    }
}
