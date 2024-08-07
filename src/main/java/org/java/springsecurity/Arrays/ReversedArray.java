package org.java.springsecurity.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = readIntegers();
//        reverse(array);
        reverseModern(array);
    }
    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static void reverse(int[] values) {
        int maxIndex = values.length - 1;
        int halfIndex = values.length / 2;

        for (int i = 0; i < halfIndex; i++) {
            int temp = values[i];
            values[i] = values[maxIndex - i];
            values[maxIndex - i] = temp;
            System.out.println("--->" + Arrays.toString(values));
        }
    }
    private static int[] reverseModern(int[] values) {
        int[] result = new int[values.length];
        int maxIndex = values.length - 1;
        for (int el: values) {
            result[maxIndex--] = el;
            System.out.println("----> " + Arrays.toString(values));
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

}
