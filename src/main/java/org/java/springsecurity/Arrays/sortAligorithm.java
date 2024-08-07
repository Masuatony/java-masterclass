package org.java.springsecurity.Arrays;

import java.util.Arrays;
import java.util.Random;

import static java.io.ObjectInputFilter.merge;

public class sortAligorithm {
    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap array[j+1] and array[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = bubbleSort(array);
//        System.out.println(Arrays.toString(sorted));
        int[] sortedArray = randomGenerator(10);
        System.out.println(Arrays.toString(quickSort(sortedArray)));
    }

    public static int[] insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            int temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
        }
        return array;
    }

//    public static int[] mergeSort(int[] array) {
//        if (array.length <= 1)
//            return array;
//
//        int mid = array.length / 2;
//        int[] left = Arrays.copyOfRange(array, 0, mid);
//        int[] right = Arrays.copyOfRange(array, mid, array.length);
//
//        return merge(mergeSort(left), mergeSort(right));
//    }

//    public static int[] quickSort(int[] array, int low, int high) {
//        if (low < high) {
//            int pi = partition(array, low, high);
//
//            quickSort(array, low, pi - 1);
//            quickSort(array, pi + 1, high);
//        }
//        return array;
//    }

    public static int[] quickSort(int[] array) {
        System.out.println("first time entry"+ Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,3);
        int temp;
        boolean flag = true;

        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] > sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("------>performing  " + Arrays.toString(sortedArray));
                }
            }
            System.out.println("----->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }

    private static int[] randomGenerator(int len) {
        Random rand = new Random();
        int[] array = new int[len];
        for(int i = 0; i < len; i++) {
            array[i] = rand.nextInt(100);
//            System.out.print(array[i] + " ");
        }
        return array;
    }
}
