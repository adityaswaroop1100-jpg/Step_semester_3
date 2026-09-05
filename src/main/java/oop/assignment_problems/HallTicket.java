package oop.assignment_problems;

/**
 * M4. Reference Copies and a Shared Exam Hall Ticket
 * Demonstrates reference copying vs independent object creation and == identity checking.
 */
public class HallTicket {

    String studentName;
    int seatNumber;

    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {

        // Create one HallTicket object for Priya
        HallTicket priya = new HallTicket("Priya", 0);

        // Assign a second variable to point to the same object (reference copy)
        HallTicket copy = priya;

        // Change seatNumber through the second variable
        copy.seatNumber = 45;

        // Print value seen through the first variable and reference equality
        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));

        // Create a third, separate object with identical values
        HallTicket separate = new HallTicket("Priya", 45);
        System.out.println("separate == priya: " + (separate == priya));
    }
}
