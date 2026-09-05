package oop.assignment_problems;

/**
 * M5. Instance vs Static: Splitting an Employee Class Correctly
 * Demonstrates proper use of instance fields, static fields,
 * and static methods accessing only static context.
 *
 * Provides CompanyEmployee as the primary class to avoid namespace collision
 * with M3's Employee class within the same package.
 */
public class CompanyEmployee {

    // Instance fields
    String empName;
    double salary;

    // Static fields shared across all employees
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    // Static method: prints shared company info without touching instance fields
    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        // Create three employee objects
        new CompanyEmployee("Amit", 45000);
        new CompanyEmployee("Priya", 52000);
        new CompanyEmployee("Rohan", 60000);

        // Call static method through class name, not through any object
        CompanyEmployee.printCompanyInfo();
    }
}
