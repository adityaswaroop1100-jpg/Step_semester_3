package oop.assignment_problems;

/**
 * A3. final Method — Parking Overstay Fine Calculator
 * Locks the fine calculation and receipt printing against subclass overrides.
 */
public class ParkingTicket {

    String vehicleNo;
    double ratePerMinute;

    public ParkingTicket(String vehicleNo, double ratePerMinute) {
        this.vehicleNo = vehicleNo;
        this.ratePerMinute = ratePerMinute;
    }

    // Final method: cannot be overridden by any subclass
    public final double calculateFine(int overstayMinutes) {
        return overstayMinutes * ratePerMinute;
    }

    // Final method: prints receipt
    public final void printReceipt(int overstayMinutes) {
        System.out.println(vehicleNo + " - Fine: Rs " + calculateFine(overstayMinutes));
    }

    public static void main(String[] args) {
        String[] vehicleNos = {"TN09AB1234", "TN22CD5678", "TN09EF9012", "TN10GH3456"};
        double[] rates      = {2, 2, 3, 2};
        int[] overstayMins  = {15, 0, -5, 8};

        // Process batch with if-else
        for (int i = 0; i < vehicleNos.length; i++) {
            ParkingTicket ticket = new ParkingTicket(vehicleNos[i], rates[i]);
            if (overstayMins[i] > 0) {
                ticket.printReceipt(overstayMins[i]);
            } else {
                System.out.println(vehicleNos[i] + " - No fine, within allotted time");
            }
        }
    }
}
