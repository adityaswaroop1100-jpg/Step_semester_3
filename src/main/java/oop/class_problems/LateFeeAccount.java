package oop.class_problems;

/**
 * M3. Late Fees — Skip the On-Time Accounts
 * Demonstrates 'final' methods to lock calculation formulas,
 * and skips accounts with daysLate <= 0 in a single pass.
 */
public class LateFeeAccount {

    String regNo;
    double totalFee;

    public LateFeeAccount(String regNo, double totalFee) {
        this.regNo = regNo;
        this.totalFee = totalFee;
    }

    // Final method: locked against ever being overridden by a subclass
    public final double calculateLateFee(int daysLate) {
        // Late fee is 1% of total fee per day late
        return totalFee * (daysLate * 0.01);
    }

    // Final method: locked against overriding
    public final void printSummary(int daysLate) {
        if (daysLate <= 0) {
            System.out.println(regNo + " - On time, no late fee");
        } else {
            double lateFee = calculateLateFee(daysLate);
            System.out.println(regNo + " | Total Fee: Rs " + totalFee + " | Late Fee: Rs " + lateFee);
        }
    }

    public static void main(String[] args) {
        String[] regNos   = {"RA001", "RA002", "RA003", "RA004"};
        double[] totalFees = {200000, 150000, 180000, 220000};
        int[] daysLate     = {10, 0, -2, 5};

        // Process batch in a single pass
        for (int i = 0; i < regNos.length; i++) {
            LateFeeAccount account = new LateFeeAccount(regNos[i], totalFees[i]);
            account.printSummary(daysLate[i]);
        }
    }
}
