package org.java.springsecurity.Lists;

import org.java.springsecurity.LinkedList.Linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

record Place1(String name, int distance) {
    @Override
    public String toString() {
        return String.format("Place{name='%s', distance=%d}", name, distance);
    }
}

public class Links {

    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();
        Place kenya = new Place("kenya", 123);
        places.add(kenya);
        Place uganda = new Place("uganda", 456);
        places.add(uganda);
        addPlace(places, kenya);
//        addPlace(places, adelaide);
        addPlace(places, new Place("adelaide", 1374));
        addPlace(places, new Place("Brisbane", 917));
        addPlace(places, new Place("Perth", 3923));
        addPlace(places, new Place("Alice Springs", 2771));
        addPlace(places, new Place("Darwin", 3972));
        addPlace(places, new Place("Melbourne", 877));

        var iterator = places.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println();
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final val: ");
                String menuItem = scanner.nextLine().toUpperCase().substring(0,1);
                switch (menuItem) {
                    case "F":
                        System.out.println("User going forward ");
                        if (!forward) {
                            forward = true;
                            if (iterator.hasNext()) iterator.next();
                        }
                        if (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                        break;
                    case "B":
                        System.out.println("User wants to go backwards");
                        if (forward) {           // Reversing Direction
                            forward = false;
                            if (iterator.hasPrevious()) {
                                iterator.previous();  // Adjust position backwards
                            }
                        }

                        if (iterator.hasPrevious()) {
                            System.out.println(iterator.previous());
                        }
                        break;

                    case "M":
                        printMenu();
                        break;

                    case "L":
                        System.out.println(places);
                        break;

                    default:
                        quitLoop = true;
                        break;

                }
            }

        }



    }

    public static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate place: " + place);
            return;
        }
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println( "Found duplicate place: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu() {

        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

}
