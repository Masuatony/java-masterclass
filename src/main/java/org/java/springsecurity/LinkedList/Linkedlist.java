package org.java.springsecurity.LinkedList;

import java.util.LinkedList;

public class Linkedlist<S> {
//    Node head;

    public static void main(String[] args) {
//       LinkedList<String> places = new Linkedlist<>();

        var places = new LinkedList<String>();
        places.add("Mumbai");
        System.out.println(places);
//        places.
    }

    public static void PrintIterator(LinkedList<String> list ) {
        for (int i = 1; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }
    }
}
