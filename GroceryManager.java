import java.util.Scanner;

/**
 * Grocery management system using parallel arrays.
 */

public class GroceryManager {

  /**
   * Prints current inventory of groceries along with prices and stock count of
   * each
   * 
   * @param names  Passed via main, array of names of items
   * @param prices Passed via main, array of prices of items
   * @param stocks Passed via main, array of stock count of items
   */

  public static void printInventory(String[] names, double[] prices, int[] stocks) {
    int arrLen = names.length;
    System.out.println("  ********  Store Inventory  ********");

    for (int i = 0; i < arrLen; i++) {

      if ((names[i] != null) && (prices[i] >= 0.01)) {
        if (names[i] != null)
          System.out.print("Item: " + names[i] + ", ");
        else
          System.out.print("Item: Unknown, ");

        if (prices[i] >= 0.01)
          System.out.print("Price: " + prices[i] + ", ");
        else
          System.out.print("Price: Unknown, ");

        System.out.println("Stock: " + stocks[i]);
      }
    }
  }

  /**
   * Allows user to update the amount of stock a given item has
   * 
   * @param names  Passed from main, list of items
   * @param stocks Passed from main, current amount of each item
   * @param target Passed from user, name of item user wants to change the stock
   *               of
   * @param amount Passed from user, the amount of stock the user would like to
   *               add to target item
   */
  public static void restockItem(String[] names, int[] stocks, String target, int amount) {
    for (int i = 0; i < names.length; i++) {
      if (names[i] != null && names[i].equals(target)) {
        int currentCount = stocks[i];
        stocks[i] += amount;
        System.out.println(
            "Successfully updated stock count for " + target + " from " + currentCount + " to " + stocks[i] + ".");
        return;
      }
    }
    System.out.println("Item not found.");
  }

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
      } else if (choice == 2) {
        System.out.print("Enter item name: ");
        String target = input.nextLine();

        System.out.print("Enter amount to add: ");
        int amount = input.nextInt();
        input.nextLine();

        restockItem(itemNames, itemStocks, target, amount);
      } else if (choice == 3) {
        System.out.println("Exiting program.");
        break;
      } else {
        System.out.println("Invalid choice.");
      }
    }

    input.close();
  }
}
