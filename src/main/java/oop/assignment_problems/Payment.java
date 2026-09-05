package oop.assignment_problems;

/**
 * Base Payment class representing cash or generic payment.
 */
class CardPayment extends Payment {

    public double payWithProcessingFee(double amount) {
        double total = amount * 1.02; // 2% fee added
        System.out.println("Charged (card, incl. fee): Rs " + total);
        return total;
    }
}

/**
 * A5. instanceof Inside a Loop — Canteen Closing-Time Payment Dispatch
 * Dispatches payments via instanceof and tracks running total collected.
 */
public class Payment {

    public double pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
        return amount;
    }

    // Dispatches transaction based on runtime type
    public static double processTransaction(Payment payment, double amount) {
        if (payment instanceof CardPayment) {
            CardPayment cp = (CardPayment) payment;
            return cp.payWithProcessingFee(amount);
        } else {
            return payment.pay(amount);
        }
    }

    public static void main(String[] args) {
        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        double[] amounts = {100, 50, 200, 75, 120};
        double totalCollected = 0.0;

        for (int i = 0; i < payments.length; i++) {
            totalCollected += processTransaction(payments[i], amounts[i]);
        }

        System.out.println("Total Collected: Rs " + totalCollected);
    }
}
