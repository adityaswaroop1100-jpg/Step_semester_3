package oop.assignment_problems;

/**
 * A2. this Keyword for Canteen Inventory — Batch Restock
 * Resolves naming clashes between parameters and fields using 'this'.
 */
public class Item {

    String itemName;
    int stock;

    // Constructor resolving clash using this
    public Item(String itemName, int stock) {
        this.itemName = itemName;
        this.stock = stock;
    }

    // Restock method resolving clash using this
    public void restock(int stock) {
        this.stock += stock;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item("Samosa", 15),
            new Item("Tea Powder", 40),
            new Item("Bread", 8),
            new Item("Biscuit Packs", 25)
        };

        // Restock 20 on every item and print in a single pass
        for (Item item : items) {
            item.restock(20);
            System.out.println(item.itemName + " | Final Stock: " + item.stock);
        }
    }
}
