package org.java.springsecurity.Arrays;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        System.out.println("Minimum element in the array: " + findMinimum(array));  // Output: 1
//        int[] array2 = readIntegers();
//        findMin(array2);

        int count = readInteger();
        int[] arrays = readElements(count);
        int min = findMin(arrays);
        System.out.println(min);
    }


    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        String input = scanner.nextLine();
        String[] splits = input.split(",");
        int[] array = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            array[i] = Integer.parseInt(splits[i].trim());
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println(min);
        return min;
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        return scanner.nextInt();
    }

    private static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
