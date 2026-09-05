package oop.class_problems;

/**
 * Plain FeeAccount representing day-scholar student accounts.
 */
class FeeAccount {
    String accountId;

    public FeeAccount(String accountId) {
        this.accountId = accountId;
    }
}

/**
 * HostelFeeAccount representing hostel student accounts with installment payments.
 */
class HostelFeeAccount extends FeeAccount {
    public HostelFeeAccount(String accountId) {
        super(accountId);
    }
}

/**
 * M5. Account Batch Payments
 * Demonstrates instanceof check to dispatch payment logic,
 * along with tracking batch counters.
 */
public class AccountBatchPayment {

    private int hostelCount = 0;
    private int dayScholarCount = 0;

    // Dispatches payment logic based on account runtime type
    public void processPayment(FeeAccount account, double amount) {
        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
            hostelCount++;
        } else if (account instanceof FeeAccount) {
            System.out.println("Paid in one go (day-scholar account)");
            dayScholarCount++;
        }
    }

    public void printBatchSummary() {
        System.out.println("Hostel accounts processed: " + hostelCount +
                           " | Day-scholar accounts processed: " + dayScholarCount);
    }

    public static void main(String[] args) {
        FeeAccount[] accounts = {
            new HostelFeeAccount("H-101"),
            new HostelFeeAccount("H-102"),
            new FeeAccount("D-201"),
            new FeeAccount("D-202")
        };

        double amount = 60000;
        AccountBatchPayment processor = new AccountBatchPayment();

        // Process batch
        for (FeeAccount account : accounts) {
            processor.processPayment(account, amount);
        }

        // Print final summary
        processor.printBatchSummary();
    }
}
