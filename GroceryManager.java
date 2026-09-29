import java.util.Scanner;

/**
 * Grocery management system using parallel arrays.
 */
public class GroceryManager {

    // printInventory method from Task 1 goes here
    // restockItem method from Task 2 goes here
    /**
     * Runs the grocery management menu and allows the user to
     * view inventory, restock an item, or exit the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Parallel arrays of size 10 to track grocery items
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Created inventory items for testing display and restock options.
        itemNames[0] = "Eggs";
        itemPrices[0] = 3.50;
        itemStocks[0] = 5;

        itemNames[1] = "Bread";
        itemPrices[1] = 5.00;
        itemStocks[1] = 10;

        itemNames[2] = "Milk";
        itemPrices[2] = 6.00;
        itemStocks[2] = 20;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n***** Grocery Menu *****");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);
            }
            else if (choice == 2) {
                System.out.print("Enter item name: ");
                String target = input.nextLine();

                System.out.print("Enter amount to add: ");
                int amount = input.nextInt();
                input.nextLine();

                restockItem(itemNames, itemStocks, target, amount);
            }
            else if (choice == 3) {
                System.out.println("Exiting program.");
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}

