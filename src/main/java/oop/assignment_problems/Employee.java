package oop.assignment_problems;

/**
 * M3. Overloaded Constructors for an Employee
 * Supports permanent employees and interns via constructor chaining with this(...).
 */
public class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    // Constructor for permanent employees
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Constructor for interns: chains to 3-arg constructor with salary = 0, then sets isIntern = true
    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    // Prints all four fields on one line
    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }

    public static void main(String[] args) {
        Employee permanent = new Employee("E-101", "Divya", 65000);
        Employee intern = new Employee("E-102", "Arjun");

        permanent.printProfile();
        intern.printProfile();
    }
}
