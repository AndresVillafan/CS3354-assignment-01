# CS3354-assignment-01
Assignment 1: Building a grocery management system using parallel arrays. 
# Grocery Management System

## Project Description

The Grocery Management System is a Java program that manages grocery inventory using parallel arrays. The program stores grocery item names, prices, and stock quantities and allows the user to interact with the inventory through a menu.

## How the Program Works

The program uses three parallel arrays to store information about grocery items:

- `itemNames` stores the names of the grocery items.
- `itemPrices` stores the prices of the items.
- `itemStocks` stores the number of items currently in stock.

Each array uses the same index to represent the same grocery item. For example, the item at index 0 in all three arrays represents the same product.

When the program starts, the user is presented with a grocery menu. The user can choose to:

1. View the current inventory
2. Restock an item
3. Exit the program

When viewing the inventory, the program displays each item's name, price, and current stock. When restocking an item, the user enters the item's name and the amount they want to add. The program searches the inventory and updates the stock if the item is found.

## Features

- Display grocery inventory
- Display item prices and stock quantities
- Restock existing grocery items
- Search for an item while restocking
- Interactive menu
- Exit option
- Invalid menu choice handling
# Grocery Management System

## Project Description

The Grocery Management System is a Java program that manages grocery inventory using parallel arrays. The program stores grocery item names, prices, and stock quantities and allows the user to interact with the inventory through a menu.

## How the Program Works

The program uses three parallel arrays to store information about grocery items:

- `itemNames` stores the names of the grocery items.
- `itemPrices` stores the prices of the items.
- `itemStocks` stores the number of items currently in stock.

Each array uses the same index to represent the same grocery item. For example, the item at index 0 in all three arrays represents the same product.

When the program starts, the user is presented with a grocery menu. The user can choose to:

1. View the current inventory
2. Restock an item
3. Exit the program

When viewing the inventory, the program displays each item's name, price, and current stock. When restocking an item, the user enters the item's name and the amount they want to add. The program searches the inventory and updates the stock if the item is found.

## Features

- Display grocery inventory
- Display item prices and stock quantities
- Restock existing grocery items
- Search for an item while restocking
- Interactive menu
- Exit option
- Invalid menu choice handling


### UML section

+---------------------------+
|      GroceryManager       |
+---------------------------+
|                           |
+---------------------------+
| + main(String[] args)     |
| + printInventory(...)     |
| + restockItem(...)        |
+---------------------------+
