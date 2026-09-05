package oop.class_problems;

/**
 * M3. Overloaded Constructors for a Course
 * Supports theory-only and theory+lab courses via constructor chaining.
 */
public class Course {

    String code;
    String title;
    int credits;
    int labCredits;

    // 4-arg constructor: sets all fields directly
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // 3-arg constructor: theory-only, chains to 4-arg with labCredits = 0
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    // Returns total credits (theory + lab)
    public int totalCredits() {
        return credits + labCredits;
    }

    public static void main(String[] args) {
        Course theoryOnly = new Course("21CSC201J", "Data Structures", 4);
        Course withLab = new Course("21CSC205L", "DSA Lab", 3, 1);

        System.out.println(theoryOnly.code + " total credits: " + theoryOnly.totalCredits());
        System.out.println(withLab.code + " total credits: " + withLab.totalCredits());
    }
}
