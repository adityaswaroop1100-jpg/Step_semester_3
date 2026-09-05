package oop.class_problems;

/**
 * M2. Payroll Batch Bonus Round
 * Resolves genuine field/parameter naming clashes using 'this'.
 * Applies raise across an entire employee array in a single pass.
 */
public class Employee {

    String empId;
    double salary;

    // Constructor resolving field/parameter clash using this
    public Employee(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    // raiseSalary resolving clash between instance field 'salary' and parameter 'salary'
    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public void printFinalSalary() {
        System.out.println(this.empId + " | Final Salary: Rs " + this.salary);
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("E-101", 40000),
            new Employee("E-102", 55000),
            new Employee("E-103", 62000),
            new Employee("E-104", 48000)
        };

        double bonus = 5000;

        // Apply bonus and print in a single pass
        for (Employee emp : employees) {
            emp.raiseSalary(bonus);
            emp.printFinalSalary();
        }
    }
}
