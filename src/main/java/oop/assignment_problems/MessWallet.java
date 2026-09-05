package oop.assignment_problems;

/**
 * M2. Encapsulated Mess-Card Wallet
 * A hostel mess-card wallet that never goes negative,
 * with private balance and controlled access.
 */
class MessWallet {

    // Private field — cannot be accessed directly from outside
    private double balance;

    // Constructor: rejects negative opening balance
    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Negative opening balance provided. Starting at 0.");
            this.balance = 0;
        } else {
            this.balance = openingBalance;
        }
    }

    // Top-up: rejects non-positive amounts
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be greater than 0.");
        } else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    // Deduct: rejects if amount exceeds current balance
    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            balance -= amount;
        }
    }

    // Read-only access to balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        MessWallet wallet = new MessWallet(500);
        wallet.topUp(200);
        wallet.deduct(1000);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}
