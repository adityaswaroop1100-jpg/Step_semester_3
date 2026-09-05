package oop.class_problems;

/**
 * M4. One-Time College Setup, Many Students
 * Demonstrates static initialization block running exactly once
 * regardless of how many student objects are instantiated.
 */
public class SrmStudent {

    String name;
    static String collegeName;
    static String academicYear;

    // Static initialization block — runs once when the class is loaded
    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2026-2027";
        System.out.println("College info loaded");
    }

    public SrmStudent(String name) {
        this.name = name;
        System.out.println("Student record created: " + name);
    }

    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"};

        // Create batch of students in a loop
        for (String name : names) {
            new SrmStudent(name);
        }
    }
}
