package oop.assignment_problems;

/**
 * M5. Instance vs Static: Splitting a Class Correctly
 * Demonstrates correct use of instance fields, static fields,
 * and static methods that do NOT reference instance data.
 */
class Student {

    // Instance fields — unique per student
    String name;
    int attendance;

    // Static field — shared across ALL students
    static String collegeName = "SRM Institute of Science and Technology";

    // Static counter — increments every time a new Student is created
    static int studentCount = 0;

    // Constructor: sets instance fields and increments the shared counter
    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++; // shared counter — no instance reference needed
    }

    // Static method: prints college info — must NOT reference instance fields
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }

    public static void main(String[] args) {

        // Create two Student objects
        Student s1 = new Student("Ravi", 85);
        Student s2 = new Student("Anitha", 90);

        // Call static method via class name — not through an object
        Student.printCollegeInfo();
    }
}
