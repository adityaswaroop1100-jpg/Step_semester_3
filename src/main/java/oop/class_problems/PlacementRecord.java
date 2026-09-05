package oop.class_problems;

/**
 * M1. From Parallel Arrays to a Class
 * Represents a single student placement record.
 */
public class PlacementRecord {

    String studentName;
    String company;
    double packageLpa;

    // Constructor that sets all three fields
    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    // Instance method that prints one formatted line
    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {

        // Create three PlacementRecord objects and store in an array
        PlacementRecord[] records = {
            new PlacementRecord("Ravi",    "TCS",     4.5),
            new PlacementRecord("Anitha",  "Zoho",    6.2),
            new PlacementRecord("Karthik", "Infosys", 4.0)
        };

        // Print each record in a loop
        for (PlacementRecord record : records) {
            record.printRecord();
        }
    }
}
