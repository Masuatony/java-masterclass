package org.java.springsecurity.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerClass {
    private static void groceryList(ArrayList<String> groceryItems) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter: %n 1 to shutdown, %n 2 to add item(S) to the list,  OR %n 3 to remove an item (s) from the list and 3: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            System.out.println("Goodbye!");
        } else if (choice == 2) {
            System.out.println("List grocery items to add (comma separated)");
            String inputItems = scanner.nextLine();
            System.out.println("The list: " + inputItems);
            if (inputItems.isEmpty()) {
                System.out.println("No items to add.");
                return;
            }
            String[] items = inputItems.split(",");
            for (String item : items) {
                if(groceryItems.contains(item)) {
                    System.out.println("Item already exists: " + item);
                    continue;
                }
                groceryItems.add(item);
            }
            System.out.println("Grocery list: " + groceryItems);
        } else if (choice == 3) {
            System.out.println("List grocery items to remove (comma separated)");
            String inputItems = scanner.nextLine();
            String[] items = inputItems.split(",");
            for (String item : items) {
                if(groceryItems.contains(item)) {
                    groceryItems.removeAll(List.of(item));
                } else {
                    System.out.println("Item does not exist: " + item);
                }
            }
            System.out.println("Grocery list after removal: " + groceryItems);
        }
    }

    private static void grocery(ArrayList<String> groceryItems) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 1) {
            System.out.printf("Enter: %n 1 to shutdown, %n 2 to add item(s) to the list, OR %n 3 to remove item(s) from the list: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Goodbye!");
            } else if (choice == 2) {
                System.out.println("List grocery items to add (comma separated):");
                String inputItems = scanner.nextLine();
                if (inputItems.isEmpty()) {
                    System.out.println("No items to add.");
                    continue;
                }
                String[] items = inputItems.split(",");
                for (String item : items) {
                    item = item.trim();  // Trim any leading/trailing whitespace
                    if (groceryItems.contains(item)) {
                        System.out.println("Item already exists: " + item);
                    } else {
                        groceryItems.add(item);
                    }
                }
                System.out.println("Grocery list: " + groceryItems);
            } else if (choice == 3) {
                System.out.println("List grocery items to remove (comma separated):");
                String inputItems = scanner.nextLine();
                if (inputItems.isEmpty()) {
                    System.out.println("No items to remove.");
                    continue;
                }
                String[] items = inputItems.split(",");
                for (String item : items) {
                    item = item.trim();  // Trim any leading/trailing whitespace
                    if (groceryItems.contains(item)) {
                        groceryItems.remove(item);
                    } else {
                        System.out.println("Item does not exist: " + item);
                    }
                }
                System.out.println("Grocery list after removal: " + groceryItems);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> groceryItems = new ArrayList<>();
//        ScannerClass.groceryList(groceryItems);
        ScannerClass.grocery(groceryItems);
    }
}
