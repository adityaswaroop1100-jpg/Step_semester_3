package oop.assignment_problems;

/**
 * M2. Encapsulated Payroll Account
 * Encapsulated payroll class preventing negative bonuses and direct salary manipulation.
 */
public class PayrollAccount {

    private double basicSalary;
    private double bonus;

    // Public constructor accepting opening basic salary
    public PayrollAccount(double openingBasicSalary) {
        if (openingBasicSalary < 0) {
            System.out.println("Warning: Negative opening salary provided. Starting at 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = openingBasicSalary;
        }
        this.bonus = 0;
    }

    // Credits bonus, rejects amount <= 0
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Bonus rejected: amount must be greater than 0.");
        } else {
            bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    // Deducts tax as a percentage from basicSalary
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Tax deduction rejected: percent must be between 0 and 100.");
        } else {
            basicSalary -= basicSalary * (percent / 100.0);
            System.out.println("Tax deducted: " + (int) percent + "%");
        }
    }

    // Read-only getter for net salary (basicSalary + bonus)
    public double getNetSalary() {
        return basicSalary + bonus;
    }

    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000);
        account.deductTax(10);
        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}
