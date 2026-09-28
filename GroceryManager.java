/**
 * Grocery management system using parallel arrays.
 */
public class GroceryManager {

  /**
   * Allows user to update the amount of stock a given item has
   * @param names Passed from main, list of items
   * @param stocks Passed from main, current amount of each item
   * @param target Passed from user, name of item user wants to change the stock of
   * @param amount Passed from user, the amount of stock the user would like to add to target item
   */
  public static void restockItem(String[] names, int[] stocks, String target, int amount) {
    for (int i = 0; i < names.length; i++) {
      if (names[i].equals(target)) {
        stocks[i] += amount;
        return;
      }
        System.out.println("Item not found.");
    }
  }

  public static void main(String[] args) {

    // Parallel arrays of size 10 to track grocery items
    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];

  }
}