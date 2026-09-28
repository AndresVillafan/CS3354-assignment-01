public static void printInventory(String[] names, double[] prices, int[] stocks){
    int arrLen = names.length;
    System.out.println("  ********  Store Inventory  ********");

    for (int i = 0; i < arrLen; i++){
        if ((names[i] != null) && (prices[i] >= 0.01)){
            if(names[i] != null)
                System.out.print("Item: " + names[i] + ", ");
            else System.out.print("Item: Unknown, ");

            if(prices[i] >= 0.01)
                System.out.print("Price: " + prices[i] + ", ");
            else System.out.print("Price: Unknown, ");

            System.out.println("Stock: " + stocks[i]);
        }
    }
}
