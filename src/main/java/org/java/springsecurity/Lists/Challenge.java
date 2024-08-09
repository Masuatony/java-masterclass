package org.java.springsecurity.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void printActions() {
        String text = """
                 Available actions:
                                               \s
                                0 - to shutdown
                                               \s
                                1 - to add item(s) to list (comma delimited list)
                                               \s
                                2 - to remove any items (comma delimited list)
                                               \s
                                Enter a number for which action you want to do:
                """;
        System.out.println(text + " ");
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) separated by comma delimited list: ");
        String[] items = scanner.nextLine().split("\\s+");
        String[] items1 = scanner.nextLine().split(",");
        for (String item : items1) {
            String trims = item.trim();
            if (groceries.indexOf(trims) < 0) {
                groceries.add(trims);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) separated by comma delimited list: ");
        String[] items = scanner.nextLine().split("\\s+");
        String[] items1 = scanner.nextLine().split(",");
        for (String item : items1) {
            String trims = item.trim();
            groceries.remove(trims);
        }
    }

}
