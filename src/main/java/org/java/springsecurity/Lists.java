package org.java.springsecurity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    String[] items = {"apples", "bananas", "milk", "eggs"};
    void displayList() {
        for (String item : items) {
            System.out.println(item);
        }
    }
    List<String> list = List.of(items);

    ArrayList<String> groceries = new ArrayList<>(list);


    //    System.out.println()

//    list.add(items)

    public static void main(String[] args) {
        Lists list = new Lists();
        list.displayList();
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list1 = List.of(items);


        ArrayList<String> groceries = new ArrayList<>(list1);
        groceries.add("apples");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("apples", "bananas", "milk", "eggs")
        );
        System.out.println(nextList);
//        groceries.addAll(Arrays.asList(items));


    }
}
