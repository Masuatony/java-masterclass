package org.java.springsecurity.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Linkedlist<S> {
//    Node head;

    public static void main(String[] args) {
//       LinkedList<String> places = new Linkedlist<>();

        var places = new LinkedList<String>();
        places.add("Mumbai");
        places.add(1,"nairobi");

//        places.addAll(new LinkedList<String>("uganda", "manga"));
//        places.addAll(0, "uganda", 1, "nairobi");
        System.out.println(places);
//        places.
        PrintIterator(places);
        addMoreElement(places);
//        removeElements(places);
//        System.out.println();
//        reverseLinkedList(places);
        printIterenity(places);

    }

    public static void PrintIterator(LinkedList<String> list ) {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(i + " " + list.get(i));
//        }
        String preTown = list.getFirst();
        for (String place : list) {

//            System.out.println("calling method");
            System.out.println(place);
            preTown = place;
        }
    }

    private static void addMoreElement(LinkedList<String> list) {
        list.add("Kampala");
        list.add("Johannesburg");
        list.addLast("nairobi");
        list.addFirst("Dar es Salaam");
//        System.out.print(list);
        for (String s : list){
            System.out.print(s);
        }
    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        // Queue/Deque poll methods
        String p1 = list.poll();  // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();  // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();  // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();  // removes first element
        System.out.println(p4 + " was removed");
    }

    private static void reverseLinkedList(LinkedList<String> list) {
        new ArrayList<>(list);
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
    }

    public static void printIterenity(LinkedList<String> list) {
        System.out.println("Trip starts" + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("From town " +previousTown + "to " + town); ;
            previousTown = town;
        }
        System.out.println("Trip ends" + list.getLast());
    }



}
