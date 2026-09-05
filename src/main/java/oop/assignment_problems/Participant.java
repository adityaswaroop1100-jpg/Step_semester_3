package oop.assignment_problems;

/**
 * A1. Overloaded Constructors for Hackathon Registration
 * Uses this() constructor chaining to assign solo participants to "Unassigned".
 */
public class Participant {

    String name;
    String teamName;
    boolean registered;

    // Sets all three fields directly, with registered set to true
    public Participant(String name, String teamName) {
        this.name = name;
        this.teamName = teamName;
        this.registered = true;
    }

    // Constructor for solo entries, chains to 2-arg constructor with "Unassigned"
    public Participant(String name) {
        this(name, "Unassigned");
    }

    public void printStatus() {
        System.out.println(name + " | " + teamName + " | Registered: " + registered);
    }

    public static void main(String[] args) {
        String[] names = {"Ravi", "Meera", "Karthik", "Divya"};
        String[] teamNames = {"ByteBusters", "", "CodeCrafters", ""};

        // Process batch in a single pass with if-else
        for (int i = 0; i < names.length; i++) {
            Participant p;
            if (teamNames[i].isEmpty()) {
                p = new Participant(names[i]);
            } else {
                p = new Participant(names[i], teamNames[i]);
            }
            p.printStatus();
        }
    }
}
