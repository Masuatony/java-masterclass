package org.java.springsecurity.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReferencesArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] copiedArray = array;

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        array[0] = 0;

        System.out.println("Modified copied array: " + Arrays.toString(array));
        System.out.println("Original array remains unchanged: " + Arrays.toString(copiedArray));
    }
}
