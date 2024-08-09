package org.java.springsecurity.Lists;

import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Dairy",1);
    }
    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class Grocery {
    public static void main(String[] args) {
        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("Milk");
        groceryItems[1] = new GroceryItem("apple", "PRODUCE", 6);
        groceryItems[2] = new GroceryItem("Bread");
        System.out.println(Arrays.toString(groceryItems));
    }
}
